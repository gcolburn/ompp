package org.ompp.cdo.hsqldb;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.IDBStore;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.hsqldb.HSQLDBDataSource;

public class HSQLDBStoreFactory {

	@Inject
	@Preference( value = "database", nodePath = "org.ompp.cdo.hsqldb")
	String database;
	
	@Inject
	@Preference( value = "databaseName", nodePath = "org.ompp.cdo.hsqldb")
	String databaseName;
	
	@Inject
	@Preference( value = "url", nodePath = "org.ompp.cdo.hsqldb")
	String url;
	
	@Inject
	@Preference( value = "properties", nodePath = "org.ompp.cdo.hsqldb")
	Properties properties;
	
	@Inject
	@Preference( value = "user", nodePath = "org.ompp.cdo.hsqldb")
	String user;
	
	@Inject
	@Preference( value = "password", nodePath = "org.ompp.cdo.hsqldb")
	String password;
	
	public IStore createStore() {
		if (properties == null ) {
			properties = new Properties();
		}
		return createStore(database, databaseName, url, properties, user, password);
	}
	
	public IStore createStore(String database, String databaseName, String url, Properties properties, String user, String password) {
		Map<String,String> props = new HashMap<String,String>();
		props.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true");
		props.put(IMappingStrategy.PROP_FORCE_NAMES_WITH_ID, "true");
		props.put(IMappingStrategy.PROP_MAX_TABLE_NAME_LENGTH,"64");
		
		HSQLDBDataSource myDataSource = new HSQLDBDataSource();

		myDataSource.setDatabase(database);
		myDataSource.setDatabaseName(databaseName);
		myDataSource.setUrl(url);
		myDataSource.setProperties(properties);
		myDataSource.setUser(user);
		myDataSource.setPassword(password);

		IMappingStrategy mappingStrategy = CDODBUtil.createMappingStrategy( "horizontal" );
		mappingStrategy.setProperties(props);
		
		IDBStore store = CDODBUtil.createStore( mappingStrategy,
				DBUtil.getDBAdapter("hsqldb"),
				DBUtil.createConnectionProvider( myDataSource ));
		mappingStrategy.setStore( store );
		
		return store;
	}
}
