/**
 */
package senSoMod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.Sensor#getContext <em>Context</em>}</li>
 *   <li>{@link senSoMod.Sensor#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link senSoMod.Sensor#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getSensor()
 * @model abstract="true"
 * @generated
 */
public interface Sensor extends Node {
	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see senSoMod.SenSoModPackage#getSensor_Output()
	 * @model containment="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link senSoMod.Sensor#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see senSoMod.SenSoModPackage#getSensor_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link senSoMod.Sensor#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link senSoMod.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see senSoMod.SenSoModPackage#getSensor_Context()
	 * @model
	 * @generated
	 */
	EList<Context> getContext();

} // Sensor
