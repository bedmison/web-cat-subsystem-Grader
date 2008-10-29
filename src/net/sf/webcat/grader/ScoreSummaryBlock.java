/*==========================================================================*\
 |  $Id$
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2008 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package net.sf.webcat.grader;

import com.webobjects.appserver.*;
import er.extensions.foundation.ERXValueUtilities;
import net.sf.webcat.core.*;
import net.sf.webcat.grader.graphs.*;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 *  Renders a descriptive table containing a submission result's basic
 *  identifying information.  An optional submission file stats object,
 *  if present, will be used to present file-specific data.
 *
 *  @author  Stephen Edwards
 *  @version $Id$
 */
public class ScoreSummaryBlock
    extends GraderComponent
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Default constructor.
     * @param context The page's context
     */
    public ScoreSummaryBlock( WOContext context )
    {
        super( context );
    }


    //~ KVC Attributes (must be public) .......................................

    public boolean          allowScoreEdit   = false;
    public boolean          includeSeparator = true;
    public Submission       submission;
    public SubmissionResult result;
    public int              rowNumber;

    public static final String showGraphsKey = "FinalReportShowGraphs";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    public void appendToResponse( WOResponse response, WOContext context )
    {
        rowNumber = 0;
        result = submission.result();
        super.appendToResponse( response, context );
    }


    // ----------------------------------------------------------
    public boolean hasTAGrade()
    {
        return submission.assignmentOffering().assignment()
            .submissionProfile().taPoints() > 0.0
            || (result != null
                && result.taScoreRaw() != null
                && result.taScore() != 0.0)
            || allowScoreEdit;
    }


    // ----------------------------------------------------------
    public Object taScore()
    {
        return ( result.status() == Status.CHECK )
            ? result.taScoreRaw()
            : null;
    }


    // ----------------------------------------------------------
    public String taMeter()
    {
        Number taPossibleNum = submission.assignmentOffering()
            .assignment().submissionProfile().taPointsRaw();
        double taPossible = ( taPossibleNum == null )
            ? 1.0 : taPossibleNum.doubleValue();
        Number taPtsNum = result.taScoreRaw();
        if ( taPtsNum == null ||
             ( !allowScoreEdit && result.status() != Status.CHECK ) )
        {
            return "&lt;Awaiting TA&gt;";
        }
        double taPts = taPtsNum.doubleValue();
        return FinalReportPage.meter( taPts / taPossible );
    }


    // ----------------------------------------------------------
    public String toolMeter()
    {
        Number toolPossibleNum = submission.assignmentOffering()
            .assignment().submissionProfile().toolPointsRaw();
        double toolPossible = ( toolPossibleNum == null )
            ? 1.0 : toolPossibleNum.doubleValue();
        double toolPts = result.toolScore();
        return FinalReportPage.meter( toolPts / toolPossible );
    }


    // ----------------------------------------------------------
    public String correctnessMeter()
    {
        double possible = submission.assignmentOffering()
            .assignment().submissionProfile().correctnessPoints();
        double pts = result.correctnessScore();
        return FinalReportPage.meter( pts / possible );
    }


    // ----------------------------------------------------------
    public String finalMeter()
    {
        double possible = submission.assignmentOffering()
            .assignment().submissionProfile().availablePoints();
        double pts = result.finalScore();
        return FinalReportPage.meter( pts / possible );
    }


    // ----------------------------------------------------------
    public WOComponent toggleShowGraphs()
    {
        boolean showGraphs = ERXValueUtilities.booleanValue(
            user().preferences().objectForKey( showGraphsKey ) );
        log.debug( "toggleShowGraphs: was " + showGraphs );
        showGraphs = !showGraphs;
        user().preferences().setObjectForKey(
            Boolean.valueOf( showGraphs ), showGraphsKey );
        user().savePreferences();
        return context().page();
    }


    // ----------------------------------------------------------
    public SubmissionResultDataset correctnessToolsDataset()
    {
        if ( correctnessToolsDataset == null )
        {
            correctnessToolsDataset = new SubmissionResultDataset(
                SubmissionResult.objectsForUser(
                    localContext(),
                    submission.assignmentOffering(),
                    result.submission().user() ),
                SubmissionResultDataset.TESTING_AND_STATIC_TOOLS_SCORE_SERIES );
        }
        return correctnessToolsDataset;
    }


    //~ Instance/static variables .............................................

    private SubmissionResultDataset correctnessToolsDataset;

    static Logger log = Logger.getLogger( ScoreSummaryBlock.class );
}
