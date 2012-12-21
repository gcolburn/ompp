/**
 */
package omp.ompp.cdo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see omp.ompp.cdo.OMPPCdoPackage
 * @generated
 */
public interface OMPPCdoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OMPPCdoFactory eINSTANCE = omp.ompp.cdo.impl.OMPPCdoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>CDO Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Client</em>'.
	 * @generated
	 */
	CDOClient createCDOClient();

	
	/**
	 * Returns a new object of class '<em>CDO Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Client</em>'.
	 * @generated NOT
	 */
	CDOClient createCDOClient( String name, String uri, String repositoryName, String resourceName);
	
	/**
	 * Returns a new object of class '<em>CDO Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Server</em>'.
	 * @generated
	 */
	CDOServer createCDOServer();

	/**
	 * Returns a new object of class '<em>CDO Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CDO Server</em>'.
	 * @generated NOT
	 */
	CDOServer createCDOServer( String repositoryName, String resourceName );
	
	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OMPPCdoPackage getOMPPCdoPackage();

} //OMPPCdoFactory
