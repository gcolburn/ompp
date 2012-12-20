/**
 */
package org.ompp.organization.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ompp.organization.model.DoubleParameter#getValue <em>Value</em>}</li>
 *   <li>{@link org.ompp.organization.model.DoubleParameter#getUnits <em>Units</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ompp.organization.model.ModelPackage#getDoubleParameter()
 * @model
 * @generated
 */
public interface DoubleParameter extends Parameter {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.ompp.organization.model.ModelPackage#getDoubleParameter_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.DoubleParameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.ompp.organization.model.ModelPackage#getDoubleParameter_Units()
	 * @model
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.ompp.organization.model.DoubleParameter#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

} // DoubleParameter
