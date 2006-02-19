/*==========================================================================*\
 |  _SubmissionFileComment.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to SubmissionFileComment.java instead.
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
 * SubmissionFileComment.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _SubmissionFileComment
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _SubmissionFileComment object.
     */
    public _SubmissionFileComment()
    {
        super();
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String CATEGORY_NO_KEY = "categoryNo";
    public static final String DEDUCTION_KEY = "deduction";
    public static final String FILE_NAME_KEY = "fileName";
    public static final String GROUP_NAME_KEY = "groupName";
    public static final String LIMIT_EXCEEDED_KEY = "limitExceeded";
    public static final String LINE_NO_KEY = "lineNo";
    public static final String MESSAGE_KEY = "message";
    public static final String TO_NO_KEY = "toNo";
    // To-one relationships ---
    public static final String AUTHOR_KEY = "author";
    public static final String SUBMISSION_FILE_STATS_KEY = "submissionFileStats";
    // To-many relationships ---
    public static final String ENTITY_NAME = "SubmissionFileComment";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>categoryNo</code> value.
     * @return the value of the attribute
     */
    public byte categoryNo()
    {
        Number result =
            (Number)storedValueForKey( "categoryNo" );
        return ( result == null )
            ? 0
            : result.byteValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>categoryNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setCategoryNo( byte value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        takeStoredValueForKey( actual, "categoryNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>categoryNo</code> value.
     * @return the value of the attribute
     */
    public Number categoryNoRaw()
    {
        return (Number)storedValueForKey( "categoryNo" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>categoryNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setCategoryNoRaw( Number value )
    {
        takeStoredValueForKey( value, "categoryNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>deduction</code> value.
     * @return the value of the attribute
     */
    public double deduction()
    {
        Number result =
            (Number)storedValueForKey( "deduction" );
        return ( result == null )
            ? 0.0
            : result.doubleValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>deduction</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setDeduction( double value )
    {
        Number actual =
            new Double( value );
        takeStoredValueForKey( actual, "deduction" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>deduction</code> value.
     * @return the value of the attribute
     */
    public Number deductionRaw()
    {
        return (Number)storedValueForKey( "deduction" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>deduction</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setDeductionRaw( Number value )
    {
        takeStoredValueForKey( value, "deduction" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>fileName</code> value.
     * @return the value of the attribute
     */
    public String fileName()
    {
        return (String)storedValueForKey( "fileName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>fileName</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setFileName( String value )
    {
        takeStoredValueForKey( value, "fileName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>groupName</code> value.
     * @return the value of the attribute
     */
    public String groupName()
    {
        return (String)storedValueForKey( "groupName" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>groupName</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setGroupName( String value )
    {
        takeStoredValueForKey( value, "groupName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>limitExceeded</code> value.
     * @return the value of the attribute
     */
    public boolean limitExceeded()
    {
        Number result =
            (Number)storedValueForKey( "limitExceeded" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>limitExceeded</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setLimitExceeded( boolean value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value ? 1 : 0 );
        takeStoredValueForKey( actual, "limitExceeded" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>limitExceeded</code> value.
     * @return the value of the attribute
     */
    public Number limitExceededRaw()
    {
        return (Number)storedValueForKey( "limitExceeded" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>limitExceeded</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setLimitExceededRaw( Number value )
    {
        takeStoredValueForKey( value, "limitExceeded" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>lineNo</code> value.
     * @return the value of the attribute
     */
    public int lineNo()
    {
        Number result =
            (Number)storedValueForKey( "lineNo" );
        return ( result == null )
            ? 0
            : result.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>lineNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setLineNo( int value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        takeStoredValueForKey( actual, "lineNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>lineNo</code> value.
     * @return the value of the attribute
     */
    public Number lineNoRaw()
    {
        return (Number)storedValueForKey( "lineNo" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>lineNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setLineNoRaw( Number value )
    {
        takeStoredValueForKey( value, "lineNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>message</code> value.
     * @return the value of the attribute
     */
    public String message()
    {
        return (String)storedValueForKey( "message" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>message</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setMessage( String value )
    {
        takeStoredValueForKey( value, "message" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>toNo</code> value.
     * @return the value of the attribute
     */
    public byte toNo()
    {
        Number result =
            (Number)storedValueForKey( "toNo" );
        return ( result == null )
            ? 0
            : result.byteValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>toNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setToNo( byte value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        takeStoredValueForKey( actual, "toNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>toNo</code> value.
     * @return the value of the attribute
     */
    public Number toNoRaw()
    {
        return (Number)storedValueForKey( "toNo" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>toNo</code>
     * property.
     * 
     * @param value The new value for this property
     */
    public void setToNoRaw( Number value )
    {
        takeStoredValueForKey( value, "toNo" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>author</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.core.User author()
    {
        return (net.sf.webcat.core.User)storedValueForKey( "author" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship (DO NOT USE--instead, use
     * <code>setAuthorRelationship()</code>.
     * This method is provided for WebObjects use.
     * 
     * @param value The new entity to relate to
     */
    public void setAuthor( net.sf.webcat.core.User value )
    {
        takeStoredValueForKey( value, "author" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     * 
     * @param value The new entity to relate to
     */
    public void setAuthorRelationship(
        net.sf.webcat.core.User value )
    {
        if ( value == null )
        {
            net.sf.webcat.core.User object = author();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "author" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "author" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>submissionFileStats</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.SubmissionFileStats submissionFileStats()
    {
        return (net.sf.webcat.grader.SubmissionFileStats)storedValueForKey( "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionFileStatsRelationship()</code>.
     * This method is provided for WebObjects use.
     * 
     * @param value The new entity to relate to
     */
    public void setSubmissionFileStats( net.sf.webcat.grader.SubmissionFileStats value )
    {
        takeStoredValueForKey( value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>authenticationDomain</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     * 
     * @param value The new entity to relate to
     */
    public void setSubmissionFileStatsRelationship(
        net.sf.webcat.grader.SubmissionFileStats value )
    {
        if ( value == null )
        {
            net.sf.webcat.grader.SubmissionFileStats object = submissionFileStats();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "submissionFileStats" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "submissionFileStats" );
        }
    }


}
