/*==========================================================================*\
 |  _EnergyBarEvent.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to EnergyBarEvent.java instead.
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2006-2012 Virginia Tech
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

package org.webcat.grader;

import com.webobjects.eoaccess.*;
import com.webobjects.eocontrol.*;
import com.webobjects.foundation.*;
import er.extensions.eof.ERXEOControlUtilities;
import er.extensions.eof.ERXKey;
import org.apache.log4j.Logger;
import org.webcat.core.EOBasedKeyGenerator;
import org.webcat.woextensions.WCFetchSpecification;

// -------------------------------------------------------------------------
/**
 * An automatically generated EOGenericRecord subclass.  DO NOT EDIT.
 * To change, use EOModeler, or make additions in
 * EnergyBarEvent.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _EnergyBarEvent
    extends org.webcat.core.EOBase
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _EnergyBarEvent object.
     */
    public _EnergyBarEvent()
    {
        super();
    }


    // ----------------------------------------------------------
    /**
     * A static factory method for creating a new
     * EnergyBarEvent object given required
     * attributes and relationships.
     * @param editingContext The context in which the new object will be
     * inserted
     * @param chargeValue
     * @param timeValue
     * @param typeValue
     * @param energyBarValue
     * @return The newly created object
     */
    public static EnergyBarEvent create(
        EOEditingContext editingContext,
        int chargeValue,
        NSTimestamp timeValue,
        int typeValue,
        org.webcat.grader.EnergyBar energyBarValue
        )
    {
        EnergyBarEvent eoObject = (EnergyBarEvent)
            EOUtilities.createAndInsertInstance(
                editingContext,
                _EnergyBarEvent.ENTITY_NAME);
        eoObject.setCharge(chargeValue);
        eoObject.setTime(timeValue);
        eoObject.setType(typeValue);
        eoObject.setEnergyBarRelationship(energyBarValue);
        return eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Get a local instance of the given object in another editing context.
     * @param editingContext The target editing context
     * @param eo The object to import
     * @return An instance of the given object in the target editing context
     */
    public static EnergyBarEvent localInstance(
        EOEditingContext editingContext, EnergyBarEvent eo)
    {
        return (eo == null)
            ? null
            : (EnergyBarEvent)EOUtilities.localInstanceOfObject(
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
    public static EnergyBarEvent forId(
        EOEditingContext ec, int id)
    {
        EnergyBarEvent obj = null;
        if (id > 0)
        {
            NSArray<EnergyBarEvent> objects =
                objectsMatchingValues(ec, "id", new Integer(id));
            if (objects != null && objects.count() > 0)
            {
                obj = objects.objectAtIndex(0);
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
    public static EnergyBarEvent forId(
        EOEditingContext ec, String id)
    {
        return forId(ec, er.extensions.foundation.ERXValueUtilities.intValue(id));
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String CHARGE_KEY = "charge";
    public static final ERXKey<Integer> charge =
        new ERXKey<Integer>(CHARGE_KEY);
    public static final String TIME_KEY = "time";
    public static final ERXKey<NSTimestamp> time =
        new ERXKey<NSTimestamp>(TIME_KEY);
    public static final String TIME_OF_NEXT_CHARGE_KEY = "timeOfNextCharge";
    public static final ERXKey<NSTimestamp> timeOfNextCharge =
        new ERXKey<NSTimestamp>(TIME_OF_NEXT_CHARGE_KEY);
    public static final String TYPE_KEY = "type";
    public static final ERXKey<Integer> type =
        new ERXKey<Integer>(TYPE_KEY);
    // To-one relationships ---
    public static final String ASSIGNMENT_OFFERING_KEY = "assignmentOffering";
    public static final ERXKey<org.webcat.grader.AssignmentOffering> assignmentOffering =
        new ERXKey<org.webcat.grader.AssignmentOffering>(ASSIGNMENT_OFFERING_KEY);
    public static final String ENERGY_BAR_KEY = "energyBar";
    public static final ERXKey<org.webcat.grader.EnergyBar> energyBar =
        new ERXKey<org.webcat.grader.EnergyBar>(ENERGY_BAR_KEY);
    public static final String SUBMISSION_KEY = "submission";
    public static final ERXKey<org.webcat.grader.Submission> submission =
        new ERXKey<org.webcat.grader.Submission>(SUBMISSION_KEY);
    // To-many relationships ---
    // Fetch specifications ---
    public static final String ENTITY_NAME = "EnergyBarEvent";

    public transient final EOBasedKeyGenerator generateKey =
        new EOBasedKeyGenerator(this);


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Get a local instance of this object in another editing context.
     * @param editingContext The target editing context
     * @return An instance of this object in the target editing context
     */
    public EnergyBarEvent localInstance(EOEditingContext editingContext)
    {
        return (EnergyBarEvent)EOUtilities.localInstanceOfObject(
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
            editingContext().committedSnapshotForObject(this));
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
                editingContext() , this).objectForKey("id");
        }
        catch (Exception e)
        {
            return er.extensions.eof.ERXConstant.ZeroInteger;
        }
    }

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>charge</code> value.
     * @return the value of the attribute
     */
    public int charge()
    {
        Integer returnValue =
            (Integer)storedValueForKey( "charge" );
        return ( returnValue == null )
            ? 0
            : returnValue.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>charge</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCharge( int value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setCharge("
                + value + "): was " + charge() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value );
            setChargeRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>charge</code> value.
     * @return the value of the attribute
     */
    public Integer chargeRaw()
    {
        return (Integer)storedValueForKey( "charge" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>charge</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setChargeRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setChargeRaw("
                + value + "): was " + chargeRaw() );
        }
        takeStoredValueForKey( value, "charge" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>time</code> value.
     * @return the value of the attribute
     */
    public NSTimestamp time()
    {
        return (NSTimestamp)storedValueForKey( "time" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>time</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTime( NSTimestamp value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTime("
                + value + "): was " + time() );
        }
        takeStoredValueForKey( value, "time" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>timeOfNextCharge</code> value.
     * @return the value of the attribute
     */
    public NSTimestamp timeOfNextCharge()
    {
        return (NSTimestamp)storedValueForKey( "timeOfNextCharge" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>timeOfNextCharge</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTimeOfNextCharge( NSTimestamp value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTimeOfNextCharge("
                + value + "): was " + timeOfNextCharge() );
        }
        takeStoredValueForKey( value, "timeOfNextCharge" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>type</code> value.
     * @return the value of the attribute
     */
    public int type()
    {
        Integer returnValue =
            (Integer)storedValueForKey( "type" );
        return ( returnValue == null )
            ? 0
            : returnValue.intValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>type</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setType( int value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setType("
                + value + "): was " + type() );
        }
        Integer actual =
            er.extensions.eof.ERXConstant.integerForInt( value );
            setTypeRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>type</code> value.
     * @return the value of the attribute
     */
    public Integer typeRaw()
    {
        return (Integer)storedValueForKey( "type" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>type</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTypeRaw( Integer value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setTypeRaw("
                + value + "): was " + typeRaw() );
        }
        takeStoredValueForKey( value, "type" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>assignmentOffering</code>
     * relationship.
     * @return the entity in the relationship
     */
    public org.webcat.grader.AssignmentOffering assignmentOffering()
    {
        return (org.webcat.grader.AssignmentOffering)storedValueForKey( "assignmentOffering" );
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
    public void setAssignmentOffering( org.webcat.grader.AssignmentOffering value )
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
        org.webcat.grader.AssignmentOffering value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setAssignmentOfferingRelationship("
                + value + "): was " + assignmentOffering() );
        }
        if ( value == null )
        {
            org.webcat.grader.AssignmentOffering object = assignmentOffering();
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
     * Retrieve the entity pointed to by the <code>energyBar</code>
     * relationship.
     * @return the entity in the relationship
     */
    public org.webcat.grader.EnergyBar energyBar()
    {
        return (org.webcat.grader.EnergyBar)storedValueForKey( "energyBar" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>energyBar</code>
     * relationship (DO NOT USE--instead, use
     * <code>setEnergyBarRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void setEnergyBar( org.webcat.grader.EnergyBar value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setEnergyBar("
                + value + "): was " + energyBar() );
        }
        takeStoredValueForKey( value, "energyBar" );
    }


    // ----------------------------------------------------------
    /**
     * Set the entity pointed to by the <code>energyBar</code>
     * relationship.  This method is a type-safe version of
     * <code>addObjectToBothSidesOfRelationshipWithKey()</code>.
     *
     * @param value The new entity to relate to
     */
    public void setEnergyBarRelationship(
        org.webcat.grader.EnergyBar value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setEnergyBarRelationship("
                + value + "): was " + energyBar() );
        }
        if ( value == null )
        {
            org.webcat.grader.EnergyBar object = energyBar();
            if ( object != null )
                removeObjectFromBothSidesOfRelationshipWithKey( object, "energyBar" );
        }
        else
        {
            addObjectToBothSidesOfRelationshipWithKey( value, "energyBar" );
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entity pointed to by the <code>submission</code>
     * relationship.
     * @return the entity in the relationship
     */
    public org.webcat.grader.Submission submission()
    {
        return (org.webcat.grader.Submission)storedValueForKey( "submission" );
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
    public void setSubmission( org.webcat.grader.Submission value )
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
        org.webcat.grader.Submission value )
    {
        if (log.isDebugEnabled())
        {
            log.debug( "setSubmissionRelationship("
                + value + "): was " + submission() );
        }
        if ( value == null )
        {
            org.webcat.grader.Submission object = submission();
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
     * Retrieve objects using a fetch specification.
     *
     * @param context The editing context to use
     * @param fspec The fetch specification to use
     *
     * @return an NSArray of the entities retrieved
     */
    @SuppressWarnings("unchecked")
    public static NSArray<EnergyBarEvent> objectsWithFetchSpecification(
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
    public static NSArray<EnergyBarEvent> allObjects(
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
    public static NSArray<EnergyBarEvent> objectsMatchingQualifier(
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
    public static NSArray<EnergyBarEvent> objectsMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        WCFetchSpecification<EnergyBarEvent> fspec =
            new WCFetchSpecification<EnergyBarEvent>(
                ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        return objectsWithFetchSpecification(context, fspec);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a qualifier, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     * @param sortOrderings the sort orderings
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static EnergyBarEvent firstObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier,
        NSArray<EOSortOrdering> sortOrderings)
    {
        WCFetchSpecification<EnergyBarEvent> fspec =
            new WCFetchSpecification<EnergyBarEvent>(
                ENTITY_NAME, qualifier, sortOrderings);
        fspec.setUsesDistinct(true);
        fspec.setFetchLimit(1);
        NSArray<EnergyBarEvent> objects =
            objectsWithFetchSpecification(context, fspec);
        return (objects.size() > 0)
            ? objects.get(0)
            : null;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return the single entity that was retrieved
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static EnergyBarEvent uniqueObjectMatchingQualifier(
        EOEditingContext context,
        EOQualifier qualifier) throws EOUtilities.MoreThanOneException
    {
        NSArray<EnergyBarEvent> objects =
            objectsMatchingQualifier(context, qualifier);
        if (objects.size() > 1)
        {
            String msg = "fetching EnergyBarEvent";
            try
            {
                if (qualifier != null)
                {
                    msg += " where " + qualifier;
                }
                msg += ", result = " + objects;
            }
            catch (Exception e)
            {
                log.error("Exception building MoreThanOneException message, "
                    + "contents so far: " + msg, e);
            }
            throw new EOUtilities.MoreThanOneException(msg);
        }
        return (objects.size() > 0)
            ? objects.get(0)
            : null;
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
    public static NSArray<EnergyBarEvent> objectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value "
                + "corresponding to every key that was passed. Args = "
                + java.util.Arrays.toString(keysAndValues));
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (key == null)
            {
                throw new IllegalArgumentException(
                    "Found null where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }
            else if (!(key instanceof String))
            {
                throw new IllegalArgumentException(
                    "Found a " + key.getClass().getName() + " [" + key + "]"
                    + " where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }

            valueDictionary.setObjectForKey(value, (String)key);
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
    public static NSArray<EnergyBarEvent> objectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return EOUtilities.objectsMatchingValues(context, ENTITY_NAME,
            keysAndValues);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static EnergyBarEvent firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value "
                + "corresponding to every key that was passed. Args = "
                + java.util.Arrays.toString(keysAndValues));
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (key == null)
            {
                throw new IllegalArgumentException(
                    "Found null where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }
            else if (!(key instanceof String))
            {
                throw new IllegalArgumentException(
                    "Found a " + key.getClass().getName() + " [" + key + "]"
                    + " where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }

            valueDictionary.setObjectForKey(value, (String)key);
        }

        return firstObjectMatchingValues(
            context, sortOrderings, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieves the first object that matches a set of keys and values, when
     * sorted with the specified sort orderings.
     *
     * @param context The editing context to use
     * @param sortOrderings the sort orderings
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the first entity that was retrieved, or null if there was none
     */
    public static EnergyBarEvent firstObjectMatchingValues(
        EOEditingContext context,
        NSArray<EOSortOrdering> sortOrderings,
        NSDictionary<String, Object> keysAndValues)
    {
        WCFetchSpecification<EnergyBarEvent> fspec =
            new WCFetchSpecification<EnergyBarEvent>(
                ENTITY_NAME,
                EOQualifier.qualifierToMatchAllValues(keysAndValues),
                sortOrderings);
        fspec.setFetchLimit(1);

        NSArray<EnergyBarEvent> objects =
            objectsWithFetchSpecification( context, fspec );

        if ( objects.count() == 0 )
        {
            return null;
        }
        else
        {
            return objects.objectAtIndex(0);
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve a single object using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static EnergyBarEvent uniqueObjectMatchingValues(
        EOEditingContext context,
        Object... keysAndValues) throws EOUtilities.MoreThanOneException
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value "
                + "corresponding to every key that was passed. Args = "
                + java.util.Arrays.toString(keysAndValues));
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (key == null)
            {
                throw new IllegalArgumentException(
                    "Found null where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }
            else if (!(key instanceof String))
            {
                throw new IllegalArgumentException(
                    "Found a " + key.getClass().getName() + " [" + key + "]"
                    + " where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }

            valueDictionary.setObjectForKey(value, (String)key);
        }

        return uniqueObjectMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve an object using a dictionary of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the single entity that was retrieved, or null if there was none
     *
     * @throws EOUtilities.MoreThanOneException
     *     if there is more than one matching object
     */
    public static EnergyBarEvent uniqueObjectMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
        throws EOUtilities.MoreThanOneException
    {
        try
        {
            return (EnergyBarEvent)EOUtilities.objectMatchingValues(
                context, ENTITY_NAME, keysAndValues);
        }
        catch (EOObjectNotAvailableException e)
        {
            return null;
        }
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of all objects of this type.
     *
     * @param context The editing context to use
     *
     * @return the count of all objects
     */
    public static int countOfAllObjects(EOEditingContext context)
    {
        return countOfObjectsMatchingQualifier(context, null);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects that match a qualifier.
     *
     * @param context The editing context to use
     * @param qualifier The qualifier to use
     *
     * @return the count of objects matching the qualifier
     */
    public static int countOfObjectsMatchingQualifier(
        EOEditingContext context, EOQualifier qualifier)
    {
        return ERXEOControlUtilities.objectCountWithQualifier(
                context, ENTITY_NAME, qualifier);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects using a list of keys and values to match.
     *
     * @param context The editing context to use
     * @param keysAndValues a list of keys and values to match, alternating
     *     "key", "value", "key", "value"...
     *
     * @return the count of objects that match the specified values
     */
    public static int countOfObjectsMatchingValues(
        EOEditingContext context,
        Object... keysAndValues)
    {
        if (keysAndValues.length % 2 != 0)
        {
            throw new IllegalArgumentException("There should a value "
                + "corresponding to every key that was passed. Args = "
                + java.util.Arrays.toString(keysAndValues));
        }

        NSMutableDictionary<String, Object> valueDictionary =
            new NSMutableDictionary<String, Object>();

        for (int i = 0; i < keysAndValues.length; i += 2)
        {
            Object key = keysAndValues[i];
            Object value = keysAndValues[i + 1];

            if (key == null)
            {
                throw new IllegalArgumentException(
                    "Found null where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }
            else if (!(key instanceof String))
            {
                throw new IllegalArgumentException(
                    "Found a " + key.getClass().getName() + " [" + key + "]"
                    + " where a String key was expected, arguments = "
                    + java.util.Arrays.toString(keysAndValues));
            }

            valueDictionary.setObjectForKey(value, (String)key);
        }

        return countOfObjectsMatchingValues(context, valueDictionary);
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the count of objects using a dictionary of keys and values to
     * match.
     *
     * @param context The editing context to use
     * @param keysAndValues a dictionary of keys and values to match
     *
     * @return the count of objects that matched the specified values
     */
    public static int countOfObjectsMatchingValues(
        EOEditingContext context,
        NSDictionary<String, Object> keysAndValues)
    {
        return countOfObjectsMatchingQualifier(context,
                EOQualifier.qualifierToMatchAllValues(keysAndValues));
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

    static Logger log = Logger.getLogger(EnergyBarEvent.class);
}
