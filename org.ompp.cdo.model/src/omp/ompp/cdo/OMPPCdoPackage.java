/**
 */
package omp.ompp.cdo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see omp.ompp.cdo.OMPPCdoFactory
 * @model kind="package"
 * @generated
 */
public interface OMPPCdoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ompp.org/cdo";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.ompp.cdo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMPPCdoPackage eINSTANCE = omp.ompp.cdo.impl.OMPPCdoPackageImpl.init();

	/**
	 * The meta object id for the '{@link omp.ompp.cdo.impl.CDOClientImpl <em>CDO Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omp.ompp.cdo.impl.CDOClientImpl
	 * @see omp.ompp.cdo.impl.OMPPCdoPackageImpl#getCDOClient()
	 * @generated
	 */
	int CDO_CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT__URI = 2;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT__REPOSITORY_NAME = 3;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT__RESOURCE_NAME = 4;

	/**
	 * The number of structural features of the '<em>CDO Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_CLIENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link omp.ompp.cdo.impl.CDOServerImpl <em>CDO Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omp.ompp.cdo.impl.CDOServerImpl
	 * @see omp.ompp.cdo.impl.OMPPCdoPackageImpl#getCDOServer()
	 * @generated
	 */
	int CDO_SERVER = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER__PORT = 0;

	/**
	 * The feature id for the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER__REPOSITORY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER__RESOURCE_NAME = 2;

	/**
	 * The number of structural features of the '<em>CDO Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDO_SERVER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link omp.ompp.cdo.CDOClient <em>CDO Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Client</em>'.
	 * @see omp.ompp.cdo.CDOClient
	 * @generated
	 */
	EClass getCDOClient();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOClient#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see omp.ompp.cdo.CDOClient#getName()
	 * @see #getCDOClient()
	 * @generated
	 */
	EAttribute getCDOClient_Name();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOClient#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see omp.ompp.cdo.CDOClient#getDescription()
	 * @see #getCDOClient()
	 * @generated
	 */
	EAttribute getCDOClient_Description();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOClient#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see omp.ompp.cdo.CDOClient#getUri()
	 * @see #getCDOClient()
	 * @generated
	 */
	EAttribute getCDOClient_Uri();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOClient#getRepositoryName <em>Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name</em>'.
	 * @see omp.ompp.cdo.CDOClient#getRepositoryName()
	 * @see #getCDOClient()
	 * @generated
	 */
	EAttribute getCDOClient_RepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOClient#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see omp.ompp.cdo.CDOClient#getResourceName()
	 * @see #getCDOClient()
	 * @generated
	 */
	EAttribute getCDOClient_ResourceName();

	/**
	 * Returns the meta object for class '{@link omp.ompp.cdo.CDOServer <em>CDO Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CDO Server</em>'.
	 * @see omp.ompp.cdo.CDOServer
	 * @generated
	 */
	EClass getCDOServer();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOServer#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see omp.ompp.cdo.CDOServer#getPort()
	 * @see #getCDOServer()
	 * @generated
	 */
	EAttribute getCDOServer_Port();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOServer#getRepositoryName <em>Repository Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name</em>'.
	 * @see omp.ompp.cdo.CDOServer#getRepositoryName()
	 * @see #getCDOServer()
	 * @generated
	 */
	EAttribute getCDOServer_RepositoryName();

	/**
	 * Returns the meta object for the attribute '{@link omp.ompp.cdo.CDOServer#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see omp.ompp.cdo.CDOServer#getResourceName()
	 * @see #getCDOServer()
	 * @generated
	 */
	EAttribute getCDOServer_ResourceName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OMPPCdoFactory getOMPPCdoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link omp.ompp.cdo.impl.CDOClientImpl <em>CDO Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omp.ompp.cdo.impl.CDOClientImpl
		 * @see omp.ompp.cdo.impl.OMPPCdoPackageImpl#getCDOClient()
		 * @generated
		 */
		EClass CDO_CLIENT = eINSTANCE.getCDOClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_CLIENT__NAME = eINSTANCE.getCDOClient_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_CLIENT__DESCRIPTION = eINSTANCE.getCDOClient_Description();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_CLIENT__URI = eINSTANCE.getCDOClient_Uri();

		/**
		 * The meta object literal for the '<em><b>Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_CLIENT__REPOSITORY_NAME = eINSTANCE.getCDOClient_RepositoryName();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_CLIENT__RESOURCE_NAME = eINSTANCE.getCDOClient_ResourceName();

		/**
		 * The meta object literal for the '{@link omp.ompp.cdo.impl.CDOServerImpl <em>CDO Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omp.ompp.cdo.impl.CDOServerImpl
		 * @see omp.ompp.cdo.impl.OMPPCdoPackageImpl#getCDOServer()
		 * @generated
		 */
		EClass CDO_SERVER = eINSTANCE.getCDOServer();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_SERVER__PORT = eINSTANCE.getCDOServer_Port();

		/**
		 * The meta object literal for the '<em><b>Repository Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_SERVER__REPOSITORY_NAME = eINSTANCE.getCDOServer_RepositoryName();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDO_SERVER__RESOURCE_NAME = eINSTANCE.getCDOServer_ResourceName();

	}

} //OMPPCdoPackage
