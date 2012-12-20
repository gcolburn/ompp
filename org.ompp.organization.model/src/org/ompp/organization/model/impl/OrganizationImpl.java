/**
 */
package org.ompp.organization.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.ompp.organization.model.Equipment;
import org.ompp.organization.model.ModelPackage;
import org.ompp.organization.model.Organization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ompp.organization.model.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ompp.organization.model.impl.OrganizationImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link org.ompp.organization.model.impl.OrganizationImpl#getSubOrganizations <em>Sub Organizations</em>}</li>
 *   <li>{@link org.ompp.organization.model.impl.OrganizationImpl#getEquipment <em>Equipment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends CDOObjectImpl implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ORGANIZATION;
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
		return (String)eGet(ModelPackage.Literals.ORGANIZATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ModelPackage.Literals.ORGANIZATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return (String)eGet(ModelPackage.Literals.ORGANIZATION__SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		eSet(ModelPackage.Literals.ORGANIZATION__SHORT_NAME, newShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Organization> getSubOrganizations() {
		return (EList<Organization>)eGet(ModelPackage.Literals.ORGANIZATION__SUB_ORGANIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Equipment> getEquipment() {
		return (EList<Equipment>)eGet(ModelPackage.Literals.ORGANIZATION__EQUIPMENT, true);
	}

} //OrganizationImpl
