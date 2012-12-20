/**
 */
package org.ompp.organization.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ompp.organization.model.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.ompp.organization.model.Parameter#getLatexString <em>Latex String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ompp.organization.model.ModelPackage#getParameter()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Parameter extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ompp.organization.model.ModelPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Latex String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latex String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latex String</em>' attribute.
	 * @see #setLatexString(String)
	 * @see org.ompp.organization.model.ModelPackage#getParameter_LatexString()
	 * @model
	 * @generated
	 */
	String getLatexString();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.Parameter#getLatexString <em>Latex String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latex String</em>' attribute.
	 * @see #getLatexString()
	 * @generated
	 */
	void setLatexString(String value);

} // Parameter
