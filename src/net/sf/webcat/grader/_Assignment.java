/*==========================================================================*\
 |  _Assignment.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to Assignment.java instead.
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
 * Assignment.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _Assignment
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _Assignment object.
     */
    public _Assignment()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * _Assignment object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @return The newly created object
     */
    public static Assignment create(
        EOEditingContext editingContext
        )
    {
        Assignment eoObject = (Assignment)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _Assignment.ENTITY_NAME);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static Assignment localInstance(
        EOEditingContext editingContext, Assignment eo)
    {
        return (eo == null)
            ? null
            : (Assignment)EOUtilities.localInstanceOfObject(
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
    public static Assignment forId(
        EOEditingContext ec, int id )
    {
        Assignment obj = null;
        if (id > 0)
        {
            NSArray results = EOUtilities.objectsMatchingKeyAndValue( ec,
                ENTITY_NAME, "id", new Integer( id ) );
            if ( results != null && results.count() > 0 )
            {
                obj = (Assignment)results.objectAtIndex( 0 );
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
    public static Assignment forId(
        EOEditingContext ec, String id )
    {
        return forId( ec, er.extensions.ERXValueUtilities.intValue( id ) );
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String FILE_UPLOAD_MESSAGE_KEY = "fileUploadMessage";
    public static final String MOODLE_ID_KEY = "moodleId";
    public static final String NAME_KEY = "name";
    public static final String SHORT_DESCRIPTION_KEY = "shortDescription";
    public static final String URL_KEY = "url";
    // To-one relationships ---
    public static final String AUTHOR_KEY = "author";
    public static final String GRADING_CRITERIA_KEY = "gradingCriteria";
    public static final String SUBMISSION_PROFILE_KEY = "submissionProfile";
    // To-many relationships ---
    public static final String OFFERINGS_KEY = "offerings";
    public static final String STEPS_KEY = "steps";
    // Fetch specifications ---
    public static final String NEIGHBOR_ASSIGNMENTS_FSPEC = "neighborAssignments";
    public static final String REUSE_IN_COURSE_FSPEC = "reuseInCourse";
    public static final String ENTITY_NAME = "Assignment";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public Assignment localInstance(EOEditingContext editingContext)
    {
        return (Assignment)EOUtilities.localInstanceOfObject(
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
            return er.extensions.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>fileUploadMessage</code> value.
     * @return the value of the attribute
     */
    public String fileUploadMessage()
    {
        return (String)storedValueForKey( "fileUploadMessage" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>fileUploadMessage</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setFileUploadMessage( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setFileUploadMessage("
                + value + "): was " + fileUploadMessage() );
        }
        takeStoredValueForKey( value, "fileUploadMessage" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>moodleId</code> value.
     * @return the value of the attribute
     */
    public Number moodleId()
    {
        return (Number)storedValueForKey( "moodleId" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>moodleId</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setMoodleId( Number value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setMoodleId("
                + value + "): was " + moodleId() );
        }
        takeStoredValueForKey( value, "moodleId" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>name</code> value.
     * @return the value of the attribute
     */
    public String name()
    {
        return (String)storedValueForKey( "name" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>name</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setName( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setName("
                + value + "): was " + name() );
        }
        takeStoredValueForKey( value, "name" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>shortDescription</code> value.
     * @return the value of the attribute
     */
    public String shortDescription()
    {
        return (String)storedValueForKey( "shortDescription" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>shortDescription</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setShortDescription( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setShortDescription("
                + value + "): was " + shortDescription() );
        }
        takeStoredValueForKey( value, "shortDescription" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>url</code> value.
     * @return the value of the attribute
     */
    public String url()
    {
        return (String)storedValueForKey( "url" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>url</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setUrl( String value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setUrl("
                + value + "): was " + url() );
        }
        takeStoredValueForKey( value, "url" );
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
     * Set the entity pointed to by the <code>author</code>
     * relationship (DO NOT USE--instead, use
     * <code>setAuthorRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setAuthor( net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAuthor("
                + value + "): was " + author() );
        }
        takeStoredValueForKey( value, "author" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>author</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setAuthorRelationship(
        net.sf.webcat.core.User value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAuthorRelationship("
                + value + "): was " + author() );
        }
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
     * Retrieve the entity pointed to by the <code>gradingCriteria</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.GradingCriteria gradingCriteria()
    {
        return (net.sf.webcat.grader.GradingCriteria)storedValueForKey( "gradingCriteria" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>gradingCriteria</code>
     * relationship (DO NOT USE--instead, use
     * <code>setGradingCriteriaRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setGradingCriteria( net.sf.webcat.grader.GradingCriteria value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setGradingCriteria("
                + value + "): was " + gradingCriteria() );
        }
        takeStoredValueForKey( value, "gradingCriteria" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>gradingCriteria</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setGradingCriteriaRelationship(
        net.sf.webcat.grader.GradingCriteria value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setGradingCriteriaRelationship("
                + value + "): was " + gradingCriteria() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.GradingCriteria object = gradingCriteria();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "gradingCriteria" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "gradingCriteria" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>submissionProfile</code>
     * relationship.
     * @return the entity in the relationship
     */
    public net.sf.webcat.grader.SubmissionProfile submissionProfile()
    {
        return (net.sf.webcat.grader.SubmissionProfile)storedValueForKey( "submissionProfile" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submissionProfile</code>
     * relationship (DO NOT USE--instead, use
     * <code>setSubmissionProfileRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionProfile( net.sf.webcat.grader.SubmissionProfile value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionProfile("
                + value + "): was " + submissionProfile() );
        }
        takeStoredValueForKey( value, "submissionProfile" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>submissionProfile</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setSubmissionProfileRelationship(
        net.sf.webcat.grader.SubmissionProfile value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionProfileRelationship("
                + value + "): was " + submissionProfile() );
        }
        if ( value == null )
        {
            net.sf.webcat.grader.SubmissionProfile object = submissionProfile();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "submissionProfile" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "submissionProfile" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>offerings</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    public NSArray offerings()
    {
        return (NSArray)storedValueForKey( "offerings" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>offerings</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setOfferings( NSMutableArray value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setOfferings("
                + value + "): was " + offerings() );
        }
        takeStoredValueForKey( value, "offerings" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>offerings</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToOfferingsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToOfferings( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToOfferings("
                + value + "): was " + offerings() );
        }
        NSMutableArray array = (NSMutableArray)offerings();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>offerings</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromOfferingsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromOfferings( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "RemoveFromOfferings("
                + value + "): was " + offerings() );
        }
        NSMutableArray array = (NSMutableArray)offerings();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>offerings</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToOfferingsRelationship( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToOfferingsRelationship("
                + value + "): was " + offerings() );
        }
        addObjectToBothSidesOfRelationshipWithKey(
            value, "offerings" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>offerings</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromOfferingsRelationship( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "removeFromOfferingsRelationship("
                + value + "): was " + offerings() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "offerings" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>offerings</code> relationship.
     *
     * @return The new entity
     */
    public net.sf.webcat.grader.AssignmentOffering createOfferingsRelationship()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "createOfferingsRelationship()" );
        }
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "AssignmentOffering" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "offerings" );
        return (net.sf.webcat.grader.AssignmentOffering)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>offerings</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteOfferingsRelationship( net.sf.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteOfferingsRelationship("
                + value + "): was " + offerings() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "offerings" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>offerings</code> relationship.
     */
    public void deleteAllOfferingsRelationships()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteAllOfferingsRelationships(): was "
                + offerings() );
        }
        Enumeration objects = offerings().objectEnumerator();
        while ( objects.hasMoreElements() )
            deleteOfferingsRelationship(
                (net.sf.webcat.grader.AssignmentOffering)objects.nextElement() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>steps</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    public NSArray steps()
    {
        return (NSArray)storedValueForKey( "steps" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>steps</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setSteps( NSMutableArray value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSteps("
                + value + "): was " + steps() );
        }
        takeStoredValueForKey( value, "steps" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>steps</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToStepsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToSteps( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToSteps("
                + value + "): was " + steps() );
        }
        NSMutableArray array = (NSMutableArray)steps();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>steps</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromStepsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSteps( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "RemoveFromSteps("
                + value + "): was " + steps() );
        }
        NSMutableArray array = (NSMutableArray)steps();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>steps</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToStepsRelationship( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "addToStepsRelationship("
                + value + "): was " + steps() );
        }
        addObjectToBothSidesOfRelationshipWithKey(
            value, "steps" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>steps</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromStepsRelationship( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "removeFromStepsRelationship("
                + value + "): was " + steps() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "steps" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>steps</code> relationship.
     *
     * @return The new entity
     */
    public net.sf.webcat.grader.Step createStepsRelationship()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "createStepsRelationship()" );
        }
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "Step" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "steps" );
        return (net.sf.webcat.grader.Step)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>steps</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteStepsRelationship( net.sf.webcat.grader.Step value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteStepsRelationship("
                + value + "): was " + steps() );
        }
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "steps" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>steps</code> relationship.
     */
    public void deleteAllStepsRelationships()
    {
        if (log.isDebugEnabled())
        {
            log.debug( "deleteAllStepsRelationships(): was "
                + steps() );
        }
        Enumeration objects = steps().objectEnumerator();
        while ( objects.hasMoreElements() )
            deleteStepsRelationship(
                (net.sf.webcat.grader.Step)objects.nextElement() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>NeighborAssignments</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param courseOfferingBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForNeighborAssignments(
            EOEditingContext context,
            net.sf.webcat.core.CourseOffering courseOfferingBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "neighborAssignments", "Assignment" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( courseOfferingBinding != null )
            bindings.setObjectForKey( courseOfferingBinding,
                                      "courseOffering" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray result = context.objectsWithFetchSpecification( spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForNeighborAssignments(ec"
            
                + ", " + courseOfferingBinding
                + "): " + result );
        }
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>ReuseInCourse</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param courseBinding fetch spec parameter
     * @param courseOfferingBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForReuseInCourse(
            EOEditingContext context,
            net.sf.webcat.core.Course courseBinding,
            net.sf.webcat.core.CourseOffering courseOfferingBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "reuseInCourse", "Assignment" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( courseBinding != null )
            bindings.setObjectForKey( courseBinding,
                                      "course" );
        if ( courseOfferingBinding != null )
            bindings.setObjectForKey( courseOfferingBinding,
                                      "courseOffering" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        NSArray result = context.objectsWithFetchSpecification( spec );
        if (log.isDebugEnabled())
        {
            log.debug( "objectsForReuseInCourse(ec"
            
                + ", " + courseBinding
                + ", " + courseOfferingBinding
                + "): " + result );
        }
        return result;
    }


    //~ Instance/static variables .............................................

    static Logger log = Logger.getLogger( Assignment.class );
}
