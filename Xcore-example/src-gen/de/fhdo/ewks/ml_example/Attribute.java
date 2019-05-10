/**
 */
package de.fhdo.ewks.ml_example;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ewks.ml_example.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link de.fhdo.ewks.ml_example.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link de.fhdo.ewks.ml_example.Attribute#getStructure <em>Structure</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getAttribute_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.fhdo.ewks.ml_example.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.fhdo.ewks.ml_example.Type
	 * @see #setType(Type)
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getAttribute_Type()
	 * @model unique="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.fhdo.ewks.ml_example.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ewks.ml_example.Structure#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' container reference.
	 * @see #setStructure(Structure)
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getAttribute_Structure()
	 * @see de.fhdo.ewks.ml_example.Structure#getAttributes
	 * @model opposite="attributes" transient="false"
	 * @generated
	 */
	Structure getStructure();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Attribute#getStructure <em>Structure</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' container reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Structure value);

} // Attribute
