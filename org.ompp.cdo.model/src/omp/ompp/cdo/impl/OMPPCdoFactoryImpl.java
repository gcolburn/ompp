/**
 */
package omp.ompp.cdo.impl;

import omp.ompp.cdo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMPPCdoFactoryImpl extends EFactoryImpl implements OMPPCdoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OMPPCdoFactory init() {
		try {
			OMPPCdoFactory theOMPPCdoFactory = (OMPPCdoFactory)EPackage.Registry.INSTANCE.getEFactory("http://ompp.org/cdo"); 
			if (theOMPPCdoFactory != null) {
				return theOMPPCdoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OMPPCdoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMPPCdoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OMPPCdoPackage.CDO_CLIENT: return (EObject)createCDOClient();
			case OMPPCdoPackage.CDO_SERVER: return (EObject)createCDOServer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOClient createCDOClient() {
		CDOClientImpl cdoClient = new CDOClientImpl();
		return cdoClient;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param repositoryName 
	 * @param resourceName 
	 * @generated NOT
	 */
	public CDOClient createCDOClient( String name, String uri, String repositoryName, String resourceName) {
		CDOClientImpl cdoClient = new CDOClientImpl();
		cdoClient.setName( name );
		cdoClient.setUri( uri );
		cdoClient.setRepositoryName( repositoryName );
		cdoClient.setResourceName( resourceName );
		return cdoClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDOServer createCDOServer() {
		CDOServerImpl cdoServer = new CDOServerImpl();
		return cdoServer;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CDOServer createCDOServer( String repositoryName, String resourceName ) {
		CDOServerImpl cdoServer = new CDOServerImpl( repositoryName, resourceName );
		return cdoServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMPPCdoPackage getOMPPCdoPackage() {
		return (OMPPCdoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OMPPCdoPackage getPackage() {
		return OMPPCdoPackage.eINSTANCE;
	}

} //OMPPCdoFactoryImpl
