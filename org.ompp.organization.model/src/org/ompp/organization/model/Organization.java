/**
 */
package org.ompp.organization.model;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ompp.organization.model.Organization#getName <em>Name</em>}</li>
 *   <li>{@link org.ompp.organization.model.Organization#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.ompp.organization.model.Organization#getSubOrganizations <em>Sub Organizations</em>}</li>
 *   <li>{@link org.ompp.organization.model.Organization#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ompp.organization.model.ModelPackage#getOrganization()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Organization extends CDOObject {
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
	 * @see org.ompp.organization.model.ModelPackage#getOrganization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.Organization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see org.ompp.organization.model.ModelPackage#getOrganization_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.Organization#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Sub Organizations</b></em>' reference list.
	 * The list contents are of type {@link org.ompp.organization.model.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Organizations</em>' reference list.
	 * @see org.ompp.organization.model.ModelPackage#getOrganization_SubOrganizations()
	 * @model
	 * @generated
	 */
	EList<Organization> getSubOrganizations();

	/**
	 * Returns the value of the '<em><b>Equipment</b></em>' reference list.
	 * The list contents are of type {@link org.ompp.organization.model.Equipment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipment</em>' reference list.
	 * @see org.ompp.organization.model.ModelPackage#getOrganization_Equipment()
	 * @model
	 * @generated
	 */
	EList<Equipment> getEquipment();

} // Organization
