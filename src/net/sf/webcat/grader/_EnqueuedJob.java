/*==========================================================================*\
 |  _EnqueuedJob.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to EnqueuedJob.java instead.
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

import com.webobjects.foundation.*;
import com.webobjects.eocontrol.*;
import java.util.Enumeration;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * EnqueuedJob.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _EnqueuedJob
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _EnqueuedJob object.
     */
    public _EnqueuedJob()
    {
        super();
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String DISCARDED_KEY = "discarded";
    public static final String PAUSED_KEY = "paused";
    public static final String QUEUE_TIME_KEY = "queueTime";
    public static final String REGRADING_KEY = "regrading";
    // To-one relationships ---
    public static final String SUBMISSION_KEY = "submission";
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ENTITY_NAME = "EnqueuedJob";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>discarded</code> value.
     * @return the value of the attribute
     */
    public boolean discarded()
    {
        Number result =
            (Number)storedValueForKey( "discarded" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>discarded</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDiscarded( boolean value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value ? 1 : 0 );
        takeStoredValueForKey( actual, "discarded" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>discarded</code> value.
     * @return the value of the attribute
     */
    public Number discardedRaw()
    {
        return (Number)storedValueForKey( "discarded" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>discarded</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setDiscardedRaw( Number value )
    {
        takeStoredValueForKey( value, "discarded" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>paused</code> value.
     * @return the value of the attribute
     */
    public boolean paused()
    {
        Number result =
            (Number)storedValueForKey( "paused" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>paused</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setPaused( boolean value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value ? 1 : 0 );
        takeStoredValueForKey( actual, "paused" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>paused</code> value.
     * @return the value of the attribute
     */
    public Number pausedRaw()
    {
        return (Number)storedValueForKey( "paused" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>paused</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setPausedRaw( Number value )
    {
        takeStoredValueForKey( value, "paused" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>queueTime</code> value.
     * @return the value of the attribute
     */
    public NSTimestamp queueTime()
    {
        return (NSTimestamp)storedValueForKey( "queueTime" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>queueTime</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setQueueTime( NSTimestamp value )
    {
        takeStoredValueForKey( value, "queueTime" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>regrading</code> value.
     * @return the value of the attribute
     */
    public boolean regrading()
    {
        Number result =
            (Number)storedValueForKey( "regrading" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>regrading</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setRegrading( boolean value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value ? 1 : 0 );
        takeStoredValueForKey( actual, "regrading" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>regrading</code> value.
     * @return the value of the attribute
     */
    public Number regradingRaw()
    {
        return (Number)storedValueForKey( "regrading" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>regrading</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setRegradingRaw( Number value )
    {
        takeStoredValueForKey( value, "regrading" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>submission</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.Submission submission()
    {
        return (net.sf.webcat.grader.Submission)storedValueForKey( "submission" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setSubmission( net.sf.webcat.grader.Submission value )
    {
        takeStoredValueForKey( value, "submission" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionRelationship(
        net.sf.webcat.grader.Submission value )
    {
        if ( value == null )
        {
            net.sf.webcat.grader.Submission object = submission();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "submission" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "submission" );
        }
    }


}
