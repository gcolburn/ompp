/**
 */
package omp.ompp.cdo;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.server.IStore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDO Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link omp.ompp.cdo.CDOServer#getPort <em>Port</em>}</li>
 *   <li>{@link omp.ompp.cdo.CDOServer#getRepositoryName <em>Repository Name</em>}</li>
 *   <li>{@link omp.ompp.cdo.CDOServer#getResourceName <em>Resource Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see omp.ompp.cdo.OMPPCdoPackage#getCDOServer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface CDOServer extends CDOObject {
	
	public CDONet4jSession getSession(IStore store);
	
	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see omp.ompp.cdo.OMPPCdoPackage#getCDOServer_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link omp.ompp.cdo.CDOServer#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Repository Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Name</em>' attribute.
	 * @see #setRepositoryName(String)
	 * @see omp.ompp.cdo.OMPPCdoPackage#getCDOServer_RepositoryName()
	 * @model
	 * @generated
	 */
	String getRepositoryName();

	/**
	 * Sets the value of the '{@link omp.ompp.cdo.CDOServer#getRepositoryName <em>Repository Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Name</em>' attribute.
	 * @see #getRepositoryName()
	 * @generated
	 */
	void setRepositoryName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see omp.ompp.cdo.OMPPCdoPackage#getCDOServer_ResourceName()
	 * @model
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link omp.ompp.cdo.CDOServer#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

} // CDOServer
