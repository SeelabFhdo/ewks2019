/**
 */
package de.fhdo.ewks.ml_example;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ewks.ml_example.Context#getName <em>Name</em>}</li>
 *   <li>{@link de.fhdo.ewks.ml_example.Context#getStructures <em>Structures</em>}</li>
 * </ul>
 *
 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
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
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getContext_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.fhdo.ewks.ml_example.Context#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link de.fhdo.ewks.ml_example.Structure}.
	 * It is bidirectional and its opposite is '{@link de.fhdo.ewks.ml_example.Structure#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see de.fhdo.ewks.ml_example.Ml_examplePackage#getContext_Structures()
	 * @see de.fhdo.ewks.ml_example.Structure#getContext
	 * @model opposite="context" containment="true" required="true"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	int checkUniqueStructures();

} // Context
