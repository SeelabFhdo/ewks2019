/**
 */
package de.fhdo.ewks.ml_example;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ewks.ml_example.Structure#getName <em>Name</em>}</li>
 *   <li>{@link de.fhdo.ewks.ml_example.Structure#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.fhdo.ewks.ml_example.Structure#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends EObject {
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
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getStructure_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Structure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ewks.ml_example.Attribute}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ewks.ml_example.Attribute#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getStructure_Attributes()
	 * @see de.fhdo.ewks.ml_example.Attribute#getStructure
	 * @model opposite="structure" containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ewks.ml_example.Context#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see #setContext(Context)
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getStructure_Context()
	 * @see de.fhdo.ewks.ml_example.Context#getStructures
	 * @model opposite="structures" transient="false"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Structure#getContext <em>Context</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' container reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean checkName();

} // Structure
