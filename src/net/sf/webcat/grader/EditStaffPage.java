/*==========================================================================*\
 |  $Id$
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU General Public License as published by
 |  the Free Software Foundation; either version 2 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU General Public License
 |  along with Web-CAT; if not, write to the Free Software
 |  Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA
 |
 |  Project manager: Stephen Edwards <edwards@cs.vt.edu>
 |  Virginia Tech CS Dept, 660 McBryde Hall (0106), Blacksburg, VA 24061 USA
\*==========================================================================*/

package net.sf.webcat.grader;

import com.webobjects.appserver.*;
import com.webobjects.eoaccess.*;
import com.webobjects.foundation.*;
import er.extensions.ERXConstant;
import net.sf.webcat.core.*;

import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * Allow the user to add/remove lab or program assignment partners on
 * this assignment (who will also be able to see the submission and its
 * results).
 *
 * @author Stephen Edwards
 * @version $Id$
 */
public class EditStaffPage
    extends GraderComponent
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Default constructor.
     * @param context The page's context
     */
    public EditStaffPage( WOContext context )
    {
        super( context );
    }


    //~ KVC Attributes (must be public) .......................................

    public WODisplayGroup      staffDisplayGroup;
    public WODisplayGroup      potentialDisplayGroup;
    public User                user;
    public int                 index;
    public boolean             editInstructors = true;
    public String              sideStepTitle;


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    public void appendToResponse( WOResponse response, WOContext context )
    {
        sideStepTitle = "Edit course "
            + ( editInstructors
                    ? "instructor"
                    : "TA" )
            + " list";
        staffDisplayGroup.setMasterObject( wcSession().courseOffering() );
        staffDisplayGroup.setDetailKey( editInstructors
                        ? CourseOffering.INSTRUCTORS_KEY
                        : CourseOffering.TAS_KEY );
        staffDisplayGroup.fetch();
        log.debug( "current size = " + potentialDisplayGroup.numberOfObjectsPerBatch()
                   + " current index = " + potentialDisplayGroup.currentBatchIndex() );
        oldBatchSize  = potentialDisplayGroup.numberOfObjectsPerBatch();
        oldBatchIndex = potentialDisplayGroup.currentBatchIndex();
        potentialDisplayGroup.queryBindings().setObjectForKey(
                        ERXConstant.integerForInt( editInstructors
                                        ? User.INSTRUCTOR_PRIVILEGES
                                        : User.STUDENT_PRIVILEGES ),
                        "accessLevel" );
        potentialDisplayGroup.qualifyDataSource();
        potentialDisplayGroup.fetch();
        potentialDisplayGroup.setNumberOfObjectsPerBatch( oldBatchSize );
        potentialDisplayGroup.setCurrentBatchIndex( oldBatchIndex );
        super.appendToResponse( response, context );
        log.debug( "old size = " + oldBatchSize
                   + " old index = " + oldBatchIndex );
    }


    // ----------------------------------------------------------
    public boolean isStaff()
    {
        return staffDisplayGroup.allObjects().containsObject( user );
    }


    // ----------------------------------------------------------
    public String userRole()
    {
        return editInstructors ? "Instructor" : "TA";
    }


    // ----------------------------------------------------------
    public WOComponent addStaff()
    {
        if ( editInstructors )
        {
            wcSession().courseOffering().addToInstructorsRelationship(
                            user );
        }
        else
        {
            if ( user.accessLevel() < User.GTA_PRIVILEGES )
            {
                user.setAccessLevel( User.GTA_PRIVILEGES );
            }
            wcSession().courseOffering().addToTAsRelationship( user );
        }
        return null;
    }


    // ----------------------------------------------------------
    public WOComponent removeStaff()
    {
        if ( editInstructors )
        {
            wcSession().courseOffering().removeFromInstructorsRelationship(
                            user );
        }
        else
        {
            wcSession().courseOffering().removeFromTAsRelationship(
                            user );
        }
        return null;
    }


    // ----------------------------------------------------------
    public WOComponent defaultAction()
    {
        log.debug( "defaultAction()" );
        log.debug( "old size = " + oldBatchSize
                   + " old index = " + oldBatchIndex );
        log.debug( "new size = " + potentialDisplayGroup.numberOfObjectsPerBatch()
                   + " new index = " + potentialDisplayGroup.currentBatchIndex() );
        if ( oldBatchSize != potentialDisplayGroup.numberOfObjectsPerBatch()
             || oldBatchIndex != potentialDisplayGroup.currentBatchIndex() )
        {
            return null;
        }
        else
        {
            return super.defaultAction();
        }
    }


    //~ Instance/static variables .............................................

    protected int oldBatchSize;
    protected int oldBatchIndex;

    static Logger log = Logger.getLogger( EditStaffPage.class );
}