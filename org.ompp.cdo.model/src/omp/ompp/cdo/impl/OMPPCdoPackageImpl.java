/**
 */
package omp.ompp.cdo.impl;

import omp.ompp.cdo.CDOClient;
import omp.ompp.cdo.CDOServer;
import omp.ompp.cdo.OMPPCdoFactory;
import omp.ompp.cdo.OMPPCdoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OMPPCdoPackageImpl extends EPackageImpl implements OMPPCdoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdoServerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see omp.ompp.cdo.OMPPCdoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OMPPCdoPackageImpl() {
		super(eNS_URI, OMPPCdoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OMPPCdoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OMPPCdoPackage init() {
		if (isInited) return (OMPPCdoPackage)EPackage.Registry.INSTANCE.getEPackage(OMPPCdoPackage.eNS_URI);

		// Obtain or create and register package
		OMPPCdoPackageImpl theOMPPCdoPackage = (OMPPCdoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OMPPCdoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OMPPCdoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOMPPCdoPackage.createPackageContents();

		// Initialize created meta-data
		theOMPPCdoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOMPPCdoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OMPPCdoPackage.eNS_URI, theOMPPCdoPackage);
		return theOMPPCdoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDOClient() {
		return cdoClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOClient_Name() {
		return (EAttribute)cdoClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOClient_Description() {
		return (EAttribute)cdoClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOClient_Uri() {
		return (EAttribute)cdoClientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOClient_RepositoryName() {
		return (EAttribute)cdoClientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOClient_ResourceName() {
		return (EAttribute)cdoClientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDOServer() {
		return cdoServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOServer_Port() {
		return (EAttribute)cdoServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOServer_RepositoryName() {
		return (EAttribute)cdoServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDOServer_ResourceName() {
		return (EAttribute)cdoServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMPPCdoFactory getOMPPCdoFactory() {
		return (OMPPCdoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cdoClientEClass = createEClass(CDO_CLIENT);
		createEAttribute(cdoClientEClass, CDO_CLIENT__NAME);
		createEAttribute(cdoClientEClass, CDO_CLIENT__DESCRIPTION);
		createEAttribute(cdoClientEClass, CDO_CLIENT__URI);
		createEAttribute(cdoClientEClass, CDO_CLIENT__REPOSITORY_NAME);
		createEAttribute(cdoClientEClass, CDO_CLIENT__RESOURCE_NAME);

		cdoServerEClass = createEClass(CDO_SERVER);
		createEAttribute(cdoServerEClass, CDO_SERVER__PORT);
		createEAttribute(cdoServerEClass, CDO_SERVER__REPOSITORY_NAME);
		createEAttribute(cdoServerEClass, CDO_SERVER__RESOURCE_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(cdoClientEClass, CDOClient.class, "CDOClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDOClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, CDOClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOClient_Description(), ecorePackage.getEString(), "description", null, 0, 1, CDOClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOClient_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, CDOClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOClient_RepositoryName(), ecorePackage.getEString(), "repositoryName", null, 0, 1, CDOClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOClient_ResourceName(), ecorePackage.getEString(), "resourceName", null, 0, 1, CDOClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdoServerEClass, CDOServer.class, "CDOServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDOServer_Port(), ecorePackage.getEInt(), "port", null, 0, 1, CDOServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOServer_RepositoryName(), ecorePackage.getEString(), "repositoryName", null, 0, 1, CDOServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCDOServer_ResourceName(), ecorePackage.getEString(), "resourceName", null, 0, 1, CDOServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OMPPCdoPackageImpl
