/*==========================================================================*\
 |  $Id$
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2009 Virginia Tech
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

package org.webcat.grader.messaging;

import java.io.File;
import org.webcat.core.Application;
import org.webcat.core.User;
import org.webcat.core.messaging.Message;
import org.webcat.core.messaging.SysAdminMessage;
import org.webcat.grader.Submission;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;

//-------------------------------------------------------------------------
/**
 * A message that is sent to course instructors when there is an error parsing
 * the code markup in a submission.
 *
 * @author Tony Allevato
 * @author  latest changes by: $Author$
 * @version $Revision$ $Date$
 */
public class GraderMarkupParseError extends SysAdminMessage
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    public GraderMarkupParseError(Submission submission, int location,
            Exception exception, WOContext context, File markupFile,
            String detail)
    {
        this.submission = submission;
        this.location = location;
        this.exception = exception;
        this.context = context;
        this.markupFile = markupFile;
        this.detail = detail;
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Called by the subsystem init() to register the message.
     */
    public static void register()
    {
        Message.registerMessage(
                GraderMarkupParseError.class,
                "Grader",
                "Error Parsing Grader Markup",
                false,
                User.INSTRUCTOR_PRIVILEGES);
    }


    // ----------------------------------------------------------
    @Override
    public String fullBody()
    {
        return shortBody();
    }


    // ----------------------------------------------------------
    @Override
    public String shortBody()
    {
        StringBuffer body = new StringBuffer();

        body.append(messageForLocation());
        body.append("\n\n");

        if (exception != null)
        {
            body.append("Exception details:\n\n");
            body.append(Application.wcApplication()
                .informationForExceptionInContext(exception, null, context));
            body.append("\n\n");
        }

        if (detail != null)
        {
            body.append(detail);
        }

        return body.toString();
    }


    // ----------------------------------------------------------
    private String messageForLocation()
    {
        switch (location)
        {
        case LOCATION_SUBMISSION_FILE_STATS:
            return "This is an automatic message from the Web-CAT server.  An "
                + "exception was caught while\nattempting to read "
                + "the raw HTML stored in the file:\n\n"
                + markupFile.getPath()
                + "\n\nThis error may be due to errors in the HTML "
                + "generated by the grading script.";

        case LOCATION_EDIT_FILE_COMMENTS:
            return "This is an automatic message from the Web-CAT server.  An "
                + "exception was caught while\nattempting to read "
                + "comments edited by a user in the file:\n\n"
                + markupFile.getPath()
                + "\n\nThe raw XML follows the exception details.";

        default:
            return "";
        }
    }


    // ----------------------------------------------------------
    @Override
    public String title()
    {
        switch (location)
        {
        case LOCATION_SUBMISSION_FILE_STATS:
            return "Exception in SubmissionFileStats";

        case LOCATION_EDIT_FILE_COMMENTS:
            return "Exception in EditFileComments";

        default:
            return "";
        }
    }


    // ----------------------------------------------------------
    @Override
    public NSArray<User> users()
    {
        return submission.assignmentOffering().courseOffering().instructors();
    }


    //~ Static/instance variables .............................................

    public static final int LOCATION_EDIT_FILE_COMMENTS = 0;
    public static final int LOCATION_SUBMISSION_FILE_STATS = 1;

    private Submission submission;
    private int location;
    private Exception exception;
    private WOContext context;
    private File markupFile;
    private String detail;
}
