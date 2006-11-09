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
import com.webobjects.foundation.*;

import java.util.*;

import er.extensions.*;

import org.apache.log4j.*;
import net.sf.webcat.*;
import net.sf.webcat.core.*;

// -------------------------------------------------------------------------
/**
 *  The main "control panel" page for plugins in the Plug-ins
 *  tab.
 *
 *  @author  stedwar2
 *  @version $Id$
 */
public class PluginManagerPage
extends WCComponent
{
    //~ Constructors ..........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new page object.
     * 
     * @param context The context to use
     */
    public PluginManagerPage( WOContext context )
    {
        super( context );
    }


    //~ KVC Attributes (must be public) .......................................

    public int               index;
    public ScriptFile        plugin;
    public WODisplayGroup    publishedPluginGroup;
    public WODisplayGroup    unpublishedPluginGroup;
    public WODisplayGroup    personalPluginGroup;
    public NSArray           newPlugins;
    public NSData            uploadedData;
    public String            uploadedName;
    public FeatureDescriptor feature;
    public String            providerURL;

    public static final String TERSE_DESCRIPTIONS_KEY =
        "tersePluginDescriptions";

    
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    public void appendToResponse( WOResponse response, WOContext context )
    {
        terse = null;
        publishedPluginGroup.fetch();
        if ( wcSession().user().hasAdminPrivileges() )
        {
            unpublishedPluginGroup.fetch();
        }
        else
        {
            personalPluginGroup.queryBindings().setObjectForKey(
                wcSession().user(),
                "user"
            );
            personalPluginGroup.fetch();
        }
        if ( newPlugins == null )
        {
            for ( Iterator i = FeatureProvider.providers().iterator();
                  i.hasNext(); )
            {
                ( (FeatureProvider)i.next() ).refresh();
            }
            newPlugins = newPlugins();
        }
        super.appendToResponse( response, context );
    }


    // ----------------------------------------------------------
    /**
     * Get the current servlet adaptor, if one is available.
     * @return the servlet adaptor, or null when none is available
     */
    public net.sf.webcat.WCServletAdaptor adaptor()
    {
        return net.sf.webcat.WCServletAdaptor.getInstance();
    }


    // ----------------------------------------------------------
    /**
     * Determine if there is a download site.
     * @return true if a download url is defined
     */
    public boolean canDownload()
    {
        return plugin.descriptor().getProperty( "provider.url" ) != null;
    }


    // ----------------------------------------------------------
    /**
     * Download the latest version of the current subsystem for updating
     * on restart.
     * @return null to refresh the current page
     */
    public WOComponent download()
    {
        clearErrors();
        String msg = plugin.installUpdate();
        possibleErrorMessage( msg );
        if ( msg == null )
        {
            wcSession().commitLocalChanges();
        }
        else
        {
            wcSession().cancelLocalChanges();
        }
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Download a new subsystem for installation on restart.
     * @return null to refresh the current page
     */
    public WOComponent downloadNew()
    {
        clearErrors();
        String msg =
            ScriptFile.installOrUpdate( wcSession().user(), feature, false );
        possibleErrorMessage( msg );
        if ( msg == null )
        {
            wcSession().commitLocalChanges();
        }
        else
        {
            wcSession().cancelLocalChanges();
        }
        newPlugins = null;
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Scan the specified provider URL.
     * @return null to refresh the current page
     */
    public WOComponent scanNow()
    {
        clearErrors();
        if ( providerURL == null || providerURL.equals( "" ) )
        {
            errorMessage( "Please specify a provider URL first." );
        }
        else
        {
            if ( FeatureProvider.getProvider( providerURL ) == null )
            {
                errorMessage( "Cannot read feature provider information from "
                    + " specified URL: '" + providerURL + "'." );
            }
        }

        // Erase cache of new subsystems so it will be recalculated now
        newPlugins = null;

        // refresh page
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Determine whether this user has permissions to edit the current plug-in.
     * @return true if the current plug-in can be edited by the current user
     */
    public boolean canEditPlugin()
    {
        User user = wcSession().user();
        return user.hasAdminPrivileges() || user == plugin.author();
    }


    // ----------------------------------------------------------
    /**
     * Edit the selected plug-in's configuration settings.
     * @return the subsystem's edit page
     */
    public WOComponent edit()
    {
        EditPluginGlobalsPage newPage = (EditPluginGlobalsPage)
            pageWithName( EditPluginGlobalsPage.class.getName() );
        newPage.nextPage = this;
        newPage.plugin = plugin;
        return newPage;
    }


    // ----------------------------------------------------------
    /**
     * Browse or edit the selected plug-in's files.  Administrators can
     * edit all plug-ins.  Otherwise, users can only edit plug-ins they
     * have authored, and can only browse others.
     * @return the subsystem's edit page
     */
    public WOComponent editFiles()
    {
        EditScriptFilesPage newPage = (EditScriptFilesPage)
            pageWithName( EditScriptFilesPage.class.getName() );
        newPage.nextPage = this;
        newPage.scriptFile = plugin;
        newPage.hideNextAndBack( true );        
        newPage.isEditable = wcSession().user().hasAdminPrivileges() ||
            wcSession().user().equals( plugin.author() );
        return newPage;
    }


    // ----------------------------------------------------------
    /**
     * Toggle the
     * {@link net.sf.webcat.WCServletAdaptor#willUpdateAutomatically()}
     * attribute.
     * @return null to refresh the current page
     */
    public WOComponent toggleAutoUpdates()
    {
        boolean option = Application.configurationProperties()
            .booleanForKey( ScriptFile.NO_AUTO_UPDATE_KEY );
        Application.configurationProperties().put(
            ScriptFile.NO_AUTO_UPDATE_KEY, option ? "false" : "true" );
        Application.configurationProperties().attemptToSave();
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Toggle the
     * {@link net.sf.webcat.WCServletAdaptor#willUpdateAutomatically()}
     * attribute.
     * @return null to refresh the current page
     */
    public WOComponent toggleAutoInstalls()
    {
        boolean option = Application.configurationProperties()
            .booleanForKey( ScriptFile.NO_AUTO_INSTALL_KEY );
        Application.configurationProperties().put(
            ScriptFile.NO_AUTO_INSTALL_KEY, option ? "false" : "true" );
        Application.configurationProperties().attemptToSave();
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Upload a new plug-in.
     * @return null to refresh the page
     */
    public WOComponent upload()
    {
        if ( errors == null )
        {
            errors = new NSMutableDictionary();
        }
        if ( uploadedName == null || uploadedData == null )
        {
            errorMessage( "Please select a file to upload." );
            return null;
        }
        ScriptFile.createNewScriptFile(
            wcSession().localContext(),
            wcSession().user(),
            uploadedName,
            uploadedData,
            false,
            true,
            errors
        );
        wcSession().commitLocalChanges();
        uploadedName = null;
        uploadedData = null;
        newPlugins = null;
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Publish/unpublish a plug-in by togglinh its isPublished attribute.
     * @return null to refresh the page
     */
    public WOComponent togglePublished()
    {
        plugin.setIsPublished( !plugin.isPublished() );
        wcSession().commitLocalChanges();
        return null;
    }
    

    // ----------------------------------------------------------
    /**
     * Force a fresh reload of the script's config.plist file to pick up
     * any changes (i.e., new attributes, new default values, etc.).
     * @return null, to force this page to reload in the browser when the
     *         action completes
     */
    public WOComponent reloadScriptDefinition()
    {
        clearErrors();
        String errMsg = plugin.initializeConfigAttributes();
        if ( errMsg != null )
        {
            cancelLocalChanges();
            errorMessage( errMsg );
        }
        else
        {
            wcSession().commitLocalChanges();
        }
        return null;
    }


    // ----------------------------------------------------------
    /**
     * Toggle whether or not the user wants verbose descriptions of subsystems
     * to be shown or hidden.  The setting is stored in the user's preferences
     * under the key specified by the VERBOSE_DESCRIPTIONS_KEY, and will be
     * permanently saved the next time the session's local changes are saved.
     */
    public void toggleVerboseDescriptions()
    {
        boolean verboseDescriptions = ERXValueUtilities.booleanValue(
            wcSession().userPreferences.objectForKey(
                TERSE_DESCRIPTIONS_KEY ) );
        verboseDescriptions = !verboseDescriptions;
        wcSession().userPreferences.setObjectForKey(
            Boolean.valueOf( verboseDescriptions ), TERSE_DESCRIPTIONS_KEY );
        wcSession().commitLocalChanges();
    }


    // ----------------------------------------------------------
    /**
     * Look up the user's preferences and determine whether or not to show
     * verbose subsystem descriptions in this component.
     * @return true if verbose descriptions should be hidden, or false if
     * they should be shown
     */
    public Boolean terse()
    {
        if ( terse == null )
        {
            terse = ERXValueUtilities.booleanValue(
                wcSession().userPreferences.objectForKey(
                    TERSE_DESCRIPTIONS_KEY ) )
                ? Boolean.TRUE : Boolean.FALSE;
        }
        return terse;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the history URL for the current installed plug-in.
     * @return The history URL, or null if none is defined
     */
    public String pluginHistoryUrl()
    {
        String result = plugin.descriptor().getProperty( "history.url" );
        log.debug( "pluginHistoryUrl() = " + result );
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the information URL for the current installed plug-in.
     * @return The information URL, or null if none is defined
     */
    public String pluginInfoUrl()
    {
        String result = plugin.descriptor().getProperty( "info.url" );
        log.debug( "pluginInfoUrl() = " + result );
        return result;
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the history URL for the current uninstalled plug-in.
     * @return The history URL, or null if none is defined
     */
    public String featureHistoryUrl()
    {
        return feature.getProperty( "history.url" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the information URL for the current uninstalled plug-in.
     * @return The information URL, or null if none is defined
     */
    public String featureInfoUrl()
    {
        return feature.getProperty( "info.url" );
    }


    // ----------------------------------------------------------
    /**
     * Retrieve the information URL for the current uninstalled plug-in.
     * @return The information URL, or null if none is defined
     */
    public String featureDisplayableName()
    {
        return feature.getProperty( "displayableName" );
    }


    // ----------------------------------------------------------
    /**
     * Calculate the current set of plugins that are available from
     * all registered providers, but that are not yet installed.  This
     * method assumes that the private <code>subsystems</code> data member
     * has already been initialized with a list of currently installed
     * subsystems.
     * @return an array of feature descriptors for available uninstalled
     *         subsystems
     */
    public NSArray newPlugins()
    {
        Collection availablePlugins = new HashSet();
        for ( Iterator i = FeatureProvider.providers().iterator();
              i.hasNext(); )
        {
            FeatureProvider provider = (FeatureProvider)i.next();
            if ( provider != null )
            {
                availablePlugins.addAll( provider.plugins() );
            }
        }
        NSArray exclude = publishedPluginGroup.displayedObjects();
        if ( exclude != null )
        {
            for ( int i = 0; i < exclude.count(); i++ )
            {
                ScriptFile s = (ScriptFile)exclude.objectAtIndex( i );
                FeatureDescriptor fd = s.descriptor().providerVersion();
                if ( fd != null )
                {
                    availablePlugins.remove( fd );
                }
            }
        }
        exclude = unpublishedPluginGroup.displayedObjects();
        if ( exclude != null )
        {
            for ( int i = 0; i < exclude.count(); i++ )
            {
                ScriptFile s = (ScriptFile)exclude.objectAtIndex( i );
                FeatureDescriptor fd = s.descriptor().providerVersion();
                if ( fd != null )
                {
                    availablePlugins.remove( fd );
                }
            }
        }
        exclude = personalPluginGroup.displayedObjects();
        if ( exclude != null )
        {
            for ( int i = 0; i < exclude.count(); i++ )
            {
                ScriptFile s = (ScriptFile)exclude.objectAtIndex( i );
                FeatureDescriptor fd = s.descriptor().providerVersion();
                if ( fd != null )
                {
                    availablePlugins.remove( fd );
                }
            }
        }
        return new NSArray( availablePlugins.toArray() );
    }


    //~ Instance/static variables .............................................
    private Boolean terse;
    static Logger log = Logger.getLogger( PluginManagerPage.class );
}
