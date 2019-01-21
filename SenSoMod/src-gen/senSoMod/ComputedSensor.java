/**
 */
package senSoMod;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.ComputedSensor#getDecisionlogic <em>Decisionlogic</em>}</li>
 *   <li>{@link senSoMod.ComputedSensor#getComputedsensor <em>Computedsensor</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getComputedSensor()
 * @model
 * @generated
 */
public interface ComputedSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Decisionlogic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decisionlogic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decisionlogic</em>' containment reference.
	 * @see #setDecisionlogic(DecisionLogic)
	 * @see senSoMod.SenSoModPackage#getComputedSensor_Decisionlogic()
	 * @model containment="true"
	 * @generated
	 */
	DecisionLogic getDecisionlogic();

	/**
	 * Sets the value of the '{@link senSoMod.ComputedSensor#getDecisionlogic <em>Decisionlogic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decisionlogic</em>' containment reference.
	 * @see #getDecisionlogic()
	 * @generated
	 */
	void setDecisionlogic(DecisionLogic value);

	/**
	 * Returns the value of the '<em><b>Computedsensor</b></em>' reference list.
	 * The list contents are of type {@link senSoMod.ComputedSensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computedsensor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computedsensor</em>' reference list.
	 * @see senSoMod.SenSoModPackage#getComputedSensor_Computedsensor()
	 * @model
	 * @generated
	 */
	EList<ComputedSensor> getComputedsensor();

} // ComputedSensor
