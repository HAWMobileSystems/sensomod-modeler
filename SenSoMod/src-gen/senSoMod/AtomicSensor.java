/**
 */
package senSoMod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.AtomicSensor#getComputedsensor <em>Computedsensor</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getAtomicSensor()
 * @model abstract="true"
 * @generated
 */
public interface AtomicSensor extends Sensor {
	/**
	 * Returns the value of the '<em><b>Computedsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computedsensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computedsensor</em>' reference.
	 * @see #setComputedsensor(ComputedSensor)
	 * @see senSoMod.SenSoModPackage#getAtomicSensor_Computedsensor()
	 * @model
	 * @generated
	 */
	ComputedSensor getComputedsensor();

	/**
	 * Sets the value of the '{@link senSoMod.AtomicSensor#getComputedsensor <em>Computedsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computedsensor</em>' reference.
	 * @see #getComputedsensor()
	 * @generated
	 */
	void setComputedsensor(ComputedSensor value);

} // AtomicSensor
