/**
 */
package senSoMod;

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

} // ComputedSensor
