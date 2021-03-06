/*==========================================================================*\
 |  $Id$
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2018 Virginia Tech
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


package org.webcat.grader.lti;

import org.apache.log4j.Logger;
import org.webcat.core.CourseOffering;
import org.webcat.core.User;
import org.webcat.core.lti.LTILaunchRequest;
import org.webcat.grader.AssignmentOffering;
import com.webobjects.appserver.WOContext;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

//-------------------------------------------------------------------------
/**
 * TODO: describe this type.
 *
 * @author  Stephen Edwards
 */
public class GraderLTILaunchRequest
    extends LTILaunchRequest
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    public GraderLTILaunchRequest(WOContext context, EOEditingContext ec)
    {
        super(context, ec);
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    public boolean hasAssignmentId()
    {
        // Doesn't look for resource_link_id, since that is also present
        // for navigation launches, not just assignment provider launches
        return get(EXT_LTI_ASSIGNMENT_ID) != null
          || get(CUSTOM_CANVAS_ASSIGNMENT_ID) != null;
    }


    // ----------------------------------------------------------
    public NSArray<AssignmentOffering> assignmentOfferings()
    {
        String primaryId = get(EXT_LTI_ASSIGNMENT_ID);
        if (primaryId == null)
        {
            primaryId = get(RESOURCE_LINK_ID);
        }
        NSArray<AssignmentOffering> result = AssignmentOffering
            .objectsMatchingQualifier(ec,
            AssignmentOffering.lmsAssignmentId.is(primaryId));
        if (result.count() == 0)
        {
            String customId = get(CUSTOM_CANVAS_ASSIGNMENT_ID);
            if (customId != null)
            {
                result = AssignmentOffering.objectsMatchingQualifier(ec,
                    AssignmentOffering.lmsAssignmentId.is(customId));
            }
            customId = get(RESOURCE_LINK_ID);
            if (result.count() == 0
                && customId != null
                && !primaryId.equals(customId))
            {
                result = AssignmentOffering.objectsMatchingQualifier(ec,
                    AssignmentOffering.lmsAssignmentId.is(customId));
            }
            if (result.count() > 0)
            {
                // Update all matching assignment ids to the proper value
                boolean needsSave = false;
                for (AssignmentOffering ao : result)
                {
                    if (!primaryId.equals(ao.lmsAssignmentId()))
                    {
                        ao.setLmsAssignmentId(primaryId);
                        needsSave = true;
                    }
                }
                if (needsSave)
                {
                    ec.saveChanges();
                }
            }
        }
        log.debug("assignmentOfferings() = " + result);
        return result;
    }


    // ----------------------------------------------------------
    public NSArray<AssignmentOffering> filterAssignmentsForCourses(
        NSArray<CourseOffering> courses,
        NSArray<AssignmentOffering> assignments)
    {
        if (assignments.count() > 0 && courses != null)
        {
            NSMutableArray<AssignmentOffering> filtered =
                new NSMutableArray<AssignmentOffering>();
            for (AssignmentOffering ao : assignments)
            {
                if (courses.contains(ao.courseOffering()))
                {
                    filtered.add(ao);
                }
            }
            return filtered;
        }
        return assignments;
    }


    // ----------------------------------------------------------
    public NSArray<AssignmentOffering> filterAssignmentsForUser(
        User aUser,
        NSArray<AssignmentOffering> assignments)
    {
        if (aUser != null)
        {
            NSMutableArray<AssignmentOffering> filtered =
                new NSMutableArray<AssignmentOffering>();
            for (AssignmentOffering ao : assignments)
            {
                if (aUser.hasAdminPrivileges()
                    || ao.courseOffering().students().contains(aUser)
                    || ao.courseOffering().isStaff(aUser))
                {
                    filtered.add(ao);
                }
            }
            return filtered;
        }
        return assignments;
    }


    //~ Instance/static fields ................................................

    static Logger log = Logger.getLogger(GraderLTILaunchRequest.class);
}
