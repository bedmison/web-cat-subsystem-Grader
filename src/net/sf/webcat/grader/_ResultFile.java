/*==========================================================================*\
 |  _ResultFile.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to ResultFile.java instead.
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

package net.sf.webcat.grader;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import er.extensions.eof.ERXKey;
import java.util.Enumeration;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * ResultFile.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _ResultFile
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _ResultFile object.
     */
    public _ResultFile()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * ResultFile object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @return The newly created object
     */
    public static ResultFile create(
        EOEditingContext editingContext
        )
    {
        ResultFile eoObject = (ResultFile)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _ResultFile.ENTITY_NAME);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static ResultFile localInstance(
        EOEditingContext editingContext, ResultFile eo)
    {
        return (eo == null)
            ? null
            : (ResultFile)EOUtilities.localInstanceOfObject(
                editingContext, eo);
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static ResultFile forId(
        EOEditingContext ec, int id )
    {
        ResultFile obj = null;
        if (id > 0)
        {
            NSArray<ResultFile> results =
                objectsMatchingValues(ec, "id", new Integer(id));
            if (results != null && results.count() > 0)
            {
                obj = results.objectAtIndex(0);
            }
        }
        return obj;
    }


    // ----------------------------------------------------------
    /**
     * Look up an object by id number.  Assumes the editing
     * context is appropriately locked.
     * @param ec The editing context to use
     * @param id The id to look up
     * @return The object, or null if no such id exists
     */
    public static ResultFile forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.foundation.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String FILE_NAME_KEY = "fileName";
    public static final ERXKey<String> fileName =
        new ERXKey<String>(FILE_NAME_KEY);
    public static final String LABEL_KEY = "label";
    public static final ERXKey<String> label =
        new ERXKey<String>(LABEL_KEY);
    public static final String MIME_TYPE_KEY = "mimeType";
    public static final ERXKey<String> mimeType =
        new ERXKey<String>(MIME_TYPE_KEY);
    // To-one relationships ---
    public static final String SUBMISSION_RESULT_KEY = "submissionResult";
    public static final ERXKey<net.sf.webcat.grader.SubmissionResult> submissionResult =
        new ERXKey<net.sf.webcat.grader.SubmissionResult>(SUBMISSION_RESULT_KEY);
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ENTITY_NAME = "ResultFile";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public ResultFile localInstance(EOEditingContext editingContext)
    {
        return (ResultFile)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    @SuppressWarnings("unchecked")
    public NSDictionary<String, Object> changedProperties()
    {
        return changesFromSnapshot(
            editingContext().committedSnapshotForObject(this) );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>id</code> value.
     * @return the value of the attribute
     */
    public Number id()
    {
        try
        {
            return (Number)EOUtilities.primaryKeyForObject(
                editingContext() , this ).objectForKey( "id" );
        }
        catch (Exception e)
        {
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
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
        if (log.isDebugEnabled())
        {
            log.debug( "setFileName("
                + value + "): was " + fileName() );
        }
        takeStoredValueForKey( value, "fileName" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>label</code> value.
     * @return the value of the attribute
     */
    public String label()
    {
        return (String)storedValueForKey( "label" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>label</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setLabel( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setLabel("
                + value + "): was " + label() );
        }
        takeStoredValueForKey( value, "label" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>mimeType</code> value.
     * @return the value of the attribute
     */
    public String mimeType()
    {
        return (String)storedValueForKey( "mimeType" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>mimeType</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMimeType( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMimeType("
                + value + "): was " + mimeType() );
        }
        takeStoredValueForKey( value, "mimeType" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>submissionResult</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.SubmissionResult submissionResult()
    {
        return (net.sf.webcat.grader.SubmissionResult)storedValueForKey( "submissionResult" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submissionResult</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionResultRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionResult( net.sf.webcat.grader.SubmissionResult value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionResult("
                + value + "): was " + submissionResult() );
        }
        takeStoredValueForKey( value, "submissionResult" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submissionResult</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionResultRelationship(
        net.sf.webcat.grader.SubmissionResult value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionResultRelationship("
                + value + "): was " + submissionResult() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.SubmissionResult object = submissionResult();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "submissionResult" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "submissionResult" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a fetch specification.
     *
     * @param context The editing context to use
     * @param fspec The fetch specification to use
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<ResultFile> objectsWithFetchSpecification(
        EOEditingContext context,
        EOFetchSpecification fspec)
    {
        return context.objectsWithFetchSpecification(fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<ResultFile> allObjects(
        EOEditingContext context)
    {
        return objectsMatchingQualifier(context, null, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<ResultFile> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier)
    {
        return objectsMatchingQualifier(context, qualifier, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a qualifier and sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings The sort orderings to use
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<ResultFile> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        EOFetchSpecification fspec = new EOFetchSpecification(
            ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        return objectsWithFetchSpecification(context, fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return an NSArray of the entities retrieved
     */
    public static NSArray<ResultFile> objectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve objects using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<ResultFile> objectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return EOUtilities.objectsMatchingValues(context, ENTITY_NAME,
            keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the single entity that was retrieved
     *
     * @throws EOObjectNotAvailableException
     *     if there is no matching object
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static ResultFile objectMatchingValues(
        EOEditingContext context,
        Object... keysAndValues) throws EOObjectNotAvailableException,
                                        EOUtilities.MoreThanOneException
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value " +
                "corresponding to every key that was passed.");
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (!(key instanceof String))
            {
                throw new IllegalArgumentException("Keys should be strings.");
            }

            valueDictionary.setObjectForKey(value, key);
        }

        return objectMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve an object using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the single entity that was retrieved
     *
     * @throws EOObjectNotAvailableException
     *     if there is no matching object
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static ResultFile objectMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
        throws EOObjectNotAvailableException,
               EOUtilities.MoreThanOneException
    {
        return (ResultFile)EOUtilities.objectMatchingValues(
            context, ENTITY_NAME, keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Produce a string representation of this object.  This implementation
     * calls UserPresentableDescription(), which uses WebObjects' internal
     * mechanism to print out the visible fields of this object.  Normally,
     * subclasses would override userPresentableDescription() to change
     * the way the object is printed.
     *
     * @return A string representation of the object's value
     */
    public String toString()
    {
        return userPresentableDescription();
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( ResultFile.class );
}
