/*==========================================================================*\
 |  _SubmissionResult.java
 |*-------------------------------------------------------------------------*|
 |  Created by eogenerator
 |  DO NOT EDIT.  Make changes to SubmissionResult.java instead.
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
 * SubmissionResult.java.
 *
 * @author Generated by eogenerator
 * @version version suppressed to control auto-generation
 */
public abstract class _SubmissionResult
    extends er.extensions.ERXGenericRecord
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new _SubmissionResult object.
     */
    public _SubmissionResult()
    {
        super();
    }


    //~ Constants (for key names) .............................................

    // Attributes ---
    public static final String COMMENT_FORMAT_KEY = "commentFormat";
    public static final String COMMENTS_KEY = "comments";
    public static final String CORRECTNESS_SCORE_KEY = "correctnessScore";
    public static final String IS_MOST_RECENT_KEY = "isMostRecent";
    public static final String STAT_ELEMENTS_LABEL_KEY = "statElementsLabel";
    public static final String STATUS_KEY = "status";
    public static final String TA_SCORE_KEY = "taScore";
    public static final String TOOL_SCORE_KEY = "toolScore";
    // To-one relationships ---
    // To-many relationships ---
    public static final String RESULT_FILES_KEY = "resultFiles";
    public static final String SUBMISSION_FILE_STATS_KEY = "submissionFileStats";
    public static final String SUBMISSIONS_KEY = "submissions";
    // Fetch specifications ---
    public static final String MOST_RECENT_BY_DATE_FSPEC = "mostRecentByDate";
    public static final String MOST_RECENT_SUBMISSION_FSPEC = "mostRecentSubmission";
    public static final String MOST_RECENT_SUBMISSIONS_FSPEC = "mostRecentSubmissions";
    public static final String MOST_RECENT_SUBMISSIONS_BY_NUMBER_FSPEC = "mostRecentSubmissionsByNumber";
    public static final String USER_FSPEC = "user";
    public static final String ENTITY_NAME = "SubmissionResult";


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>commentFormat</code> value.
     * @return the value of the attribute
     */
    public byte commentFormat()
    {
        Number result =
            (Number)storedValueForKey( "commentFormat" );
        return ( result == null )
            ? 0
            : result.byteValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>commentFormat</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCommentFormat( byte value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        setCommentFormatRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>commentFormat</code> value.
     * @return the value of the attribute
     */
    public Number commentFormatRaw()
    {
        return (Number)storedValueForKey( "commentFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>commentFormat</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCommentFormatRaw( Number value )
    {
        takeStoredValueForKey( value, "commentFormat" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>comments</code> value.
     * @return the value of the attribute
     */
    public String comments()
    {
        return (String)storedValueForKey( "comments" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>comments</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setComments( String value )
    {
        takeStoredValueForKey( value, "comments" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>correctnessScore</code> value.
     * @return the value of the attribute
     */
    public double correctnessScore()
    {
        Number result =
            (Number)storedValueForKey( "correctnessScore" );
        return ( result == null )
            ? 0.0
            : result.doubleValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>correctnessScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCorrectnessScore( double value )
    {
        Number actual =
            new Double( value );
        setCorrectnessScoreRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>correctnessScore</code> value.
     * @return the value of the attribute
     */
    public Number correctnessScoreRaw()
    {
        return (Number)storedValueForKey( "correctnessScore" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>correctnessScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setCorrectnessScoreRaw( Number value )
    {
        takeStoredValueForKey( value, "correctnessScore" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isMostRecent</code> value.
     * @return the value of the attribute
     */
    public boolean isMostRecent()
    {
        Number result =
            (Number)storedValueForKey( "isMostRecent" );
        return ( result == null )
            ? false
            : ( result.intValue() > 0 );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isMostRecent</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsMostRecent( boolean value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value ? 1 : 0 );
        setIsMostRecentRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>isMostRecent</code> value.
     * @return the value of the attribute
     */
    public Number isMostRecentRaw()
    {
        return (Number)storedValueForKey( "isMostRecent" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>isMostRecent</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setIsMostRecentRaw( Number value )
    {
        takeStoredValueForKey( value, "isMostRecent" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>statElementsLabel</code> value.
     * @return the value of the attribute
     */
    public String statElementsLabel()
    {
        return (String)storedValueForKey( "statElementsLabel" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>statElementsLabel</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setStatElementsLabel( String value )
    {
        takeStoredValueForKey( value, "statElementsLabel" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>status</code> value.
     * @return the value of the attribute
     */
    public byte status()
    {
        Number result =
            (Number)storedValueForKey( "status" );
        return ( result == null )
            ? net.sf.webcat.core.Status.TO_DO
            : result.byteValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>status</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setStatus( byte value )
    {
        Number actual =
            er.extensions.ERXConstant.integerForInt( value );
        setStatusRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>status</code> value.
     * @return the value of the attribute
     */
    public Number statusRaw()
    {
        return (Number)storedValueForKey( "status" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>status</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setStatusRaw( Number value )
    {
        takeStoredValueForKey( value, "status" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>taScore</code> value.
     * @return the value of the attribute
     */
    public double taScore()
    {
        Number result =
            (Number)storedValueForKey( "taScore" );
        return ( result == null )
            ? 0.0
            : result.doubleValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>taScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTaScore( double value )
    {
        Number actual =
            new Double( value );
        setTaScoreRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>taScore</code> value.
     * @return the value of the attribute
     */
    public Number taScoreRaw()
    {
        return (Number)storedValueForKey( "taScore" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>taScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setTaScoreRaw( Number value )
    {
        takeStoredValueForKey( value, "taScore" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>toolScore</code> value.
     * @return the value of the attribute
     */
    public double toolScore()
    {
        Number result =
            (Number)storedValueForKey( "toolScore" );
        return ( result == null )
            ? 0.0
            : result.doubleValue();
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>toolScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setToolScore( double value )
    {
        Number actual =
            new Double( value );
        setToolScoreRaw( actual );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve this object's <code>toolScore</code> value.
     * @return the value of the attribute
     */
    public Number toolScoreRaw()
    {
        return (Number)storedValueForKey( "toolScore" );
    }


    // ----------------------------------------------------------
    /**
     * Change the value of this object's <code>toolScore</code>
     * property.
     *
     * @param value The new value for this property
     */
    public void setToolScoreRaw( Number value )
    {
        takeStoredValueForKey( value, "toolScore" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>MostRecentByDate</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForMostRecentByDate(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "mostRecentByDate", "SubmissionResult" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( assignmentOfferingBinding != null )
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        if ( userBinding != null )
            bindings.setObjectForKey( userBinding,
                                      "user" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        return context.objectsWithFetchSpecification( spec );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>MostRecentSubmission</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForMostRecentSubmission(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "mostRecentSubmission", "SubmissionResult" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( assignmentOfferingBinding != null )
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        if ( userBinding != null )
            bindings.setObjectForKey( userBinding,
                                      "user" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        return context.objectsWithFetchSpecification( spec );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>MostRecentSubmissions</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForMostRecentSubmissions(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "mostRecentSubmissions", "SubmissionResult" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( assignmentOfferingBinding != null )
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        return context.objectsWithFetchSpecification( spec );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>MostRecentSubmissionsByNumber</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForMostRecentSubmissionsByNumber(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "mostRecentSubmissionsByNumber", "SubmissionResult" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( assignmentOfferingBinding != null )
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        return context.objectsWithFetchSpecification( spec );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve object according to the <code>User</code>
     * fetch specification.
     *
     * @param context The editing context to use
     * @param assignmentOfferingBinding fetch spec parameter
     * @param userBinding fetch spec parameter
     * @return an NSArray of the entities retrieved
     */
    public static NSArray objectsForUser(
            EOEditingContext context,
            net.sf.webcat.grader.AssignmentOffering assignmentOfferingBinding,
            net.sf.webcat.core.User userBinding
        )
    {
        EOFetchSpecification spec = EOFetchSpecification
            .fetchSpecificationNamed( "user", "SubmissionResult" );

        NSMutableDictionary bindings = new NSMutableDictionary();

        if ( assignmentOfferingBinding != null )
            bindings.setObjectForKey( assignmentOfferingBinding,
                                      "assignmentOffering" );
        if ( userBinding != null )
            bindings.setObjectForKey( userBinding,
                                      "user" );
        spec = spec.fetchSpecificationWithQualifierBindings( bindings );

        return context.objectsWithFetchSpecification( spec );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>resultFiles</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    public NSArray resultFiles()
    {
        return (NSArray)storedValueForKey( "resultFiles" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>resultFiles</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setResultFiles( NSMutableArray value )
    {
        takeStoredValueForKey( value, "resultFiles" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>resultFiles</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToResultFilesRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToResultFiles( net.sf.webcat.grader.ResultFile value )
    {
        NSMutableArray array = (NSMutableArray)resultFiles();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>resultFiles</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromResultFilesRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromResultFiles( net.sf.webcat.grader.ResultFile value )
    {
        NSMutableArray array = (NSMutableArray)resultFiles();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>resultFiles</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToResultFilesRelationship( net.sf.webcat.grader.ResultFile value )
    {
        addObjectToBothSidesOfRelationshipWithKey(
            value, "resultFiles" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>resultFiles</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromResultFilesRelationship( net.sf.webcat.grader.ResultFile value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "resultFiles" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>resultFiles</code> relationship.
     *
     * @return The new entity
     */
    public net.sf.webcat.grader.ResultFile createResultFilesRelationship()
    {
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "ResultFile" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "resultFiles" );
        return (net.sf.webcat.grader.ResultFile)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity that is a member of the
     * <code>resultFiles</code> relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void deleteResultFilesRelationship( net.sf.webcat.grader.ResultFile value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "resultFiles" );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>resultFiles</code> relationship.
     */
    public void deleteAllResultFilesRelationships()
    {
        Enumeration objects = resultFiles().objectEnumerator();
        while ( objects.hasMoreElements() )
            deleteResultFilesRelationship(
                (net.sf.webcat.grader.ResultFile)objects.nextElement() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>submissionFileStats</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    public NSArray submissionFileStats()
    {
        return (NSArray)storedValueForKey( "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>submissionFileStats</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setSubmissionFileStats( NSMutableArray value )
    {
        takeStoredValueForKey( value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>submissionFileStats</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToSubmissionFileStatsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToSubmissionFileStats( net.sf.webcat.grader.SubmissionFileStats value )
    {
        NSMutableArray array = (NSMutableArray)submissionFileStats();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>submissionFileStats</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromSubmissionFileStatsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSubmissionFileStats( net.sf.webcat.grader.SubmissionFileStats value )
    {
        NSMutableArray array = (NSMutableArray)submissionFileStats();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>submissionFileStats</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToSubmissionFileStatsRelationship( net.sf.webcat.grader.SubmissionFileStats value )
    {
        addObjectToBothSidesOfRelationshipWithKey(
            value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>submissionFileStats</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSubmissionFileStatsRelationship( net.sf.webcat.grader.SubmissionFileStats value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>submissionFileStats</code> relationship.
     *
     * @return The new entity
     */
    public net.sf.webcat.grader.SubmissionFileStats createSubmissionFileStatsRelationship()
    {
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "SubmissionFileStats" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "submissionFileStats" );
        return (net.sf.webcat.grader.SubmissionFileStats)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity that is a member of the
     * <code>submissionFileStats</code> relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void deleteSubmissionFileStatsRelationship( net.sf.webcat.grader.SubmissionFileStats value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "submissionFileStats" );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>submissionFileStats</code> relationship.
     */
    public void deleteAllSubmissionFileStatsRelationships()
    {
        Enumeration objects = submissionFileStats().objectEnumerator();
        while ( objects.hasMoreElements() )
            deleteSubmissionFileStatsRelationship(
                (net.sf.webcat.grader.SubmissionFileStats)objects.nextElement() );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the entities pointed to by the <code>submissions</code>
     * relationship.
     * @return an NSArray of the entities in the relationship
     */
    public NSArray submissions()
    {
        return (NSArray)storedValueForKey( "submissions" );
    }


    // ----------------------------------------------------------
    /**
     * Replace the list of entities pointed to by the
     * <code>submissions</code> relationship.
     *
     * @param value The new set of entities to relate to
     */
    public void setSubmissions( NSMutableArray value )
    {
        takeStoredValueForKey( value, "submissions" );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>submissions</code>
     * relationship (DO NOT USE--instead, use
     * <code>addToSubmissionsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The new entity to relate to
     */
    public void addToSubmissions( net.sf.webcat.grader.Submission value )
    {
        NSMutableArray array = (NSMutableArray)submissions();
        willChange();
        array.addObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>submissions</code>
     * relationship (DO NOT USE--instead, use
     * <code>removeFromSubmissionsRelationship()</code>.
     * This method is provided for WebObjects use.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSubmissions( net.sf.webcat.grader.Submission value )
    {
        NSMutableArray array = (NSMutableArray)submissions();
        willChange();
        array.removeObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Add a new entity to the <code>submissions</code>
     * relationship.
     *
     * @param value The new entity to relate to
     */
    public void addToSubmissionsRelationship( net.sf.webcat.grader.Submission value )
    {
        addObjectToBothSidesOfRelationshipWithKey(
            value, "submissions" );
    }


    // ----------------------------------------------------------
    /**
     * Remove a specific entity from the <code>submissions</code>
     * relationship.
     *
     * @param value The entity to remove from the relationship
     */
    public void removeFromSubmissionsRelationship( net.sf.webcat.grader.Submission value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "submissions" );
    }


    // ----------------------------------------------------------
    /**
     * Create a brand new object that is a member of the
     * <code>submissions</code> relationship.
     *
     * @return The new entity
     */
    public net.sf.webcat.grader.Submission createSubmissionsRelationship()
    {
        EOClassDescription eoClassDesc = EOClassDescription
            .classDescriptionForEntityName( "Submission" );
        EOEnterpriseObject eoObject = eoClassDesc
            .createInstanceWithEditingContext( editingContext(), null );
        editingContext().insertObject( eoObject );
        addObjectToBothSidesOfRelationshipWithKey(
            eoObject, "submissions" );
        return (net.sf.webcat.grader.Submission)eoObject;
    }


    // ----------------------------------------------------------
    /**
     * Remove and then delete a specific entity that is a member of the
     * <code>submissions</code> relationship.
     *
     * @param value The entity to remove from the relationship and then delete
     */
    public void deleteSubmissionsRelationship( net.sf.webcat.grader.Submission value )
    {
        removeObjectFromBothSidesOfRelationshipWithKey(
            value, "submissions" );
        editingContext().deleteObject( value );
    }


    // ----------------------------------------------------------
    /**
     * Remove (and then delete, if owned) all entities that are members of the
     * <code>submissions</code> relationship.
     */
    public void deleteAllSubmissionsRelationships()
    {
        Enumeration objects = submissions().objectEnumerator();
        while ( objects.hasMoreElements() )
            deleteSubmissionsRelationship(
                (net.sf.webcat.grader.Submission)objects.nextElement() );
    }


}
