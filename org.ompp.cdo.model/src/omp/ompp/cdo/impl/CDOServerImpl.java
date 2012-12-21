/**
 */
package omp.ompp.cdo.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import omp.ompp.cdo.CDOServer;
import omp.ompp.cdo.OMPPCdoPackage;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.IRepository.Props;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.container.IPluginContainer;
import org.eclipse.net4j.util.om.OMPlatform;
import org.eclipse.net4j.util.om.log.PrintLogHandler;
import org.eclipse.net4j.util.om.trace.PrintTraceHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDO Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link omp.ompp.cdo.impl.CDOServerImpl#getPort <em>Port</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOServerImpl#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOServerImpl#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOServerImpl extends CDOObjectImpl implements CDOServer {
	private IAcceptor acceptor = null;
	private IConnector connector = null;
	private IRepository repository = null;
	private CDOResource resource = null;
	private CDONet4jSession session = null;
	private CDOTransaction transaction = null;
	private IManagedContainer container = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CDOServerImpl() {
		super();
		setPort( 2036 );
		setRepositoryName("root");
		setResourceName("res1");
	}
	
	protected CDOServerImpl( String repositoryName, String resourceName ) {
		setPort( 2036 );
		setRepositoryName( repositoryName );
		setResourceName( resourceName );
	}

	public CDONet4jSession getSession() {
		return getSession( createMemStore() );
	}
	
	public CDONet4jSession getSession(IStore store) {
		OMPlatform.INSTANCE.setDebugging(true);
	    OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
	    OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);
	    
		if( session == null ) {
			container = IPluginContainer.INSTANCE;
			
			// Initialize Acceptor
			if ( acceptor == null )
				acceptor = TCPUtil.getAcceptor(container, "0.0.0.0:2036");
				//acceptor = JVMUtil.getAcceptor(container, "default");
			 
			// Initialize Connector
			getConnector();
			
			// Initialize Repository
			if( repository == null ) {
				repository = createRepository(store);
				CDOServerUtil.addRepository( container, repository );
			}

			CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
			config.setRepositoryName( getRepositoryName() );
			config.setConnector( connector );

			// Create session and resource
			try {
				session = config.openNet4jSession();
				getResource().save(null);
				getTransaction().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return session;
	}
	
	public IConnector getConnector() {
		// Initialize Conector
		if( connector == null ) {
			connector = TCPUtil.getConnector( IPluginContainer.INSTANCE, "localhost");
			//connector = JVMUtil.getConnector(IPluginContainer.INSTANCE, "default");
		}
		
		return connector;
	}
	
	public void closeSession() {
		
		if( session != null )
			session.close();
		
		getConnector().close();
	}
	
	public CDONet4jSession getSession( String repositoryName ) {
		CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		config.setRepositoryName( repositoryName );
		config.setConnector( getConnector() );

		return config.openNet4jSession();
	}
	
	public CDOTransaction getTransaction() {
		if( transaction == null ) {
			transaction = getSession().openTransaction();
		}
		
		return transaction;
	}
	
	public CDOResource getResource() {
		if( resource == null ) {
			resource = getTransaction().getOrCreateResource( getResourceName() );
		}
		
		return resource;
	}
	
	private IRepository createRepository(IStore store) {
		Map<String,String> props = new HashMap<String,String>();
		props.put(Props.SUPPORTING_AUDITS, "true");
//		props.put(Props.VERIFYING_REVISIONS, "false");
		
		IRepository repo = CDOServerUtil.createRepository( getRepositoryName(), store, props );
		
		return repo;
	}
	
	public void addRepository( IRepository repository ) {
		CDOServerUtil.addRepository( container, repository );
	}

//  Discouraged. Create store in separate plugin!
//	private IStore createMySQLStore() {
//		Map<String,String> props = new HashMap<String,String>();
//		props.put(IMappingStrategy.PROP_QUALIFIED_NAMES, "true");
//		props.put(IMappingStrategy.PROP_FORCE_NAMES_WITH_ID, "true");
//		props.put(IMappingStrategy.PROP_MAX_TABLE_NAME_LENGTH,"64");
//		
//		MysqlDataSource myDataSource = new MysqlDataSource();
//		myDataSource.setUser( userName );
//		myDataSource.setPassword( password );
//		myDataSource.setAutoReconnect( true );
//		myDataSource.setDatabaseName( databaseName );
//		myDataSource.setPort( Integer.valueOf(port) );
//		myDataSource.setServerName( dbServerName );
//		myDataSource.setUrl( "jdbc:mysql://" + dbServerName + ":" + port + "/" + databaseName );
//		
//
//		IMappingStrategy mappingStrategy = CDODBUtil.createMappingStrategy( "horizontal" );
//		mappingStrategy.setProperties(props);
//		
//		IDBStore store = CDODBUtil.createStore( mappingStrategy,
//				DBUtil.getDBAdapter("mysql"),
//				DBUtil.createConnectionProvider( myDataSource ));
//		mappingStrategy.setStore( store );
//		
//		return store;
//	}
	
	private IStore createMemStore() {
		IStore store = org.eclipse.emf.cdo.server.mem.MEMStoreUtil.createMEMStore();
		return store;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPPCdoPackage.Literals.CDO_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return (Integer)eGet(OMPPCdoPackage.Literals.CDO_SERVER__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		eSet(OMPPCdoPackage.Literals.CDO_SERVER__PORT, newPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryName() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_SERVER__REPOSITORY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryName(String newRepositoryName) {
		eSet(OMPPCdoPackage.Literals.CDO_SERVER__REPOSITORY_NAME, newRepositoryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_SERVER__RESOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		eSet(OMPPCdoPackage.Literals.CDO_SERVER__RESOURCE_NAME, newResourceName);
	}

} //CDOServerImpl
