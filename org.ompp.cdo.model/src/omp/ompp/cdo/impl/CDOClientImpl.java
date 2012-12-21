/**
 */
package omp.ompp.cdo.impl;

import omp.ompp.cdo.CDOClient;
import omp.ompp.cdo.OMPPCdoPackage;

import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.FactoryNotFoundException;
import org.eclipse.net4j.util.container.IPluginContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDO Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link omp.ompp.cdo.impl.CDOClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOClientImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOClientImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOClientImpl#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link omp.ompp.cdo.impl.CDOClientImpl#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CDOClientImpl extends CDOObjectImpl implements CDOClient {
	protected IConnector connector = null;
	protected CDONet4jSession session = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected CDOClientImpl() {
		super();
		this.setUri("tcp://localhost:2036");
	}

	protected CDOClientImpl( String uri ) {
		this.setUri( uri );
	}

	protected IConnector getConnection() {
		if( connector == null ) {
			try {
				connector = Net4jUtil.getConnector(IPluginContainer.INSTANCE, getUri() );
			} catch (Exception e ) {
				System.out.println( "Unable to connect to server!\n" + e.getMessage() );
				e.printStackTrace();
			}
		}
		
		return connector;
	}

	public CDONet4jSession getSession(String repositoryName )  throws FactoryNotFoundException {
		if( session == null ) {
			CDONet4jSessionConfiguration c = CDONet4jUtil.createNet4jSessionConfiguration();
			c.setConnector(connector);
			c.setRepositoryName( repositoryName );
			c.setActivateOnOpen(true);
			session = c.openNet4jSession();
		}

		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OMPPCdoPackage.Literals.CDO_CLIENT;
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
	public String getName() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_CLIENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(OMPPCdoPackage.Literals.CDO_CLIENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_CLIENT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(OMPPCdoPackage.Literals.CDO_CLIENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_CLIENT__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		eSet(OMPPCdoPackage.Literals.CDO_CLIENT__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryName() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_CLIENT__REPOSITORY_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryName(String newRepositoryName) {
		eSet(OMPPCdoPackage.Literals.CDO_CLIENT__REPOSITORY_NAME, newRepositoryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return (String)eGet(OMPPCdoPackage.Literals.CDO_CLIENT__RESOURCE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		eSet(OMPPCdoPackage.Literals.CDO_CLIENT__RESOURCE_NAME, newResourceName);
	}

} //CDOClientImpl
