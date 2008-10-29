/*==========================================================================*\
 |  _GraderPrefs.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to GraderPrefs.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2008 Virginia Tech
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
import java.util.Enumeration;
import org.apache.log4j.Logger;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * GraderPrefs.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _GraderPrefs
    extends er.extensions.eof.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _GraderPrefs object.
     */
    public _GraderPrefs()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * _GraderPrefs object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @return The newly created object
     */
    public static GraderPrefs create(
        EOEditingContext editingContext
        )
    {
        GraderPrefs eoObject = (GraderPrefs)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _GraderPrefs.ENTITY_NAME);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static GraderPrefs localInstance(
        EOEditingContext editingContext, GraderPrefs eo)
    {
        return (eo == null)
            ? null
            : (GraderPrefs)EOUtilities.localInstanceOfObject(
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
    public static GraderPrefs forId(
        EOEditingContext ec, int id )
    {
        GraderPrefs obj = null;
        if (id > 0)
        {
            NSArray results = EOUtilities.objectsMatchingKeyAndValue( ec,
                ENTITY_NAME, "id", new Integer( id ) );
            if ( results != null && results.count() > 0 )
            {
                obj = (GraderPrefs)results.objectAtIndex( 0 );
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
    public static GraderPrefs forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.foundation.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String COMMENT_HISTORY_KEY = "commentHistory";
    // To-one relationships ---
    public static final String ASSIGNMENT_OFFERING_KEY = "assignmentOffering";
    public static final String STEP_KEY = "step";
    public static final String SUBMISSION_KEY = "submission";
    public static final String SUBMISSION_FILE_STATS_KEY = "submissionFileStats";
    public static final String USER_KEY = "user";
    // To-many relationships ---
    // Fetch specifications ---
    public static final String USER_FSPEC = "user";
    public static final String ENTITY_NAME = "GraderPrefs";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public GraderPrefs localInstance(EOEditingContext editingContext)
    {
        return (GraderPrefs)EOUtilities.localInstanceOfObject(
            editingContext, this);
    }


    // ----------------------------------------------------------
    /**
     * Get a list of changes between this object's current state and the
     * last committed version.
     * @return a dictionary of the changes that have not yet been committed
     */
    public NSDictionary changedProperties()
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
     * Retrieve this object's <code>commentHistory</code> value.
     * @return the value of the attribute
     */
    public String commentHistory()
    {
        return (String)storedValueForKey( "commentHistory" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>commentHistory</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCommentHistory( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setCommentHistory("
                + value + "): was " + commentHistory() );
        }
        takeStoredValueForKey( value, "commentHistory" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>assignmentOffering</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.AssignmentOffering assignmentOffering()
    {
        return (net.sf.webcat.grader.AssignmentOffering)storedValueForKey( "assignmentOffering" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>assignmentOffering</code>
     * relationship (DO NOT USE--instead, use
     * <code>setAssignmentOfferingRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setAssignmentOffering( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAssignmentOffering("
                + value + "): was " + assignmentOffering() );
        }
        takeStoredValueForKey( value, "assignmentOffering" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>assignmentOffering</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setAssignmentOfferingRelationship(
        net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAssignmentOfferingRelationship("
                + value + "): was " + assignmentOffering() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.AssignmentOffering object = assignmentOffering();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "assignmentOffering" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "assignmentOffering" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>step</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.Step step()
    {
        return (net.sf.webcat.grader.Step)storedValueForKey( "step" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>step</code>
     * relationship (DO NOT USE--instead, use
     * <code>setStepRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setStep( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setStep("
                + value + "): was " + step() );
        }
        takeStoredValueForKey( value, "step" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>step</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setStepRelationship(
        net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setStepRelationship("
                + value + "): was " + step() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.Step object = step();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "step" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "step" );
        }
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
     * Set the entity pointed to by the <code>submission</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setSubmission( net.sf.webcat.grader.Submission value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmission("
                + value + "): was " + submission() );
        }
        takeStoredValueForKey( value, "submission" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submission</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionRelationship(
        net.sf.webcat.grader.Submission value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionRelationship("
                + value + "): was " + submission() );
        }
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
     * Set the entity pointed to by the <code>submissionFileStats</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionFileStatsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionFileStats( net.sf.webcat.grader.SubmissionFileStats value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionFileStats("
                + value + "): was " + submissionFileStats() );
        }
        takeStoredValueForKey( value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submissionFileStats</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionFileStatsRelationship(
        net.sf.webcat.grader.SubmissionFileStats value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionFileStatsRelationship("
                + value + "): was " + submissionFileStats() );
        }
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


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>user</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.core.User user()
    {
        return (net.sf.webcat.core.User)storedValueForKey( "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship (DO NOT USE--instead, use
     * <code>setUserRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setUser( net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUser("
                + value + "): was " + user() );
        }
        takeStoredValueForKey( value, "user" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>user</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setUserRelationship(
        net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUserRelationship("
                + value + "): was " + user() );
        }
        if ( value == null )
        {
            net.sf.webcat.core.User object = user();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "user" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "user" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>User</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<GraderPrefs> objectsForUser(
            EOEditingContext context,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "user", "GraderPrefs" );

        NSMutableDictionary<String, Object> bindings =
            new NSMutableDictionary<String, Object>();

        if ( userBinding != null )
        {
            bindings.setObjectForKey( userBinding,
                                      "user" );
        }
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray result = context.objectsWithFetchSpecification( spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForUser(ec"
                + ", " + userBinding
                + "): " + result );
        }
        return result;
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( GraderPrefs.class );
}
