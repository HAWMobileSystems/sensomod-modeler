/**
 */
package senSoMod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.ContextDescription#getContextexpression <em>Contextexpression</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getContextDescription()
 * @model
 * @generated
 */
public interface ContextDescription extends Node {
	/**
	 * Returns the value of the '<em><b>Contextexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextexpression</em>' containment reference.
	 * @see #setContextexpression(ContextExpression)
	 * @see senSoMod.SenSoModPackage#getContextDescription_Contextexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ContextExpression getContextexpression();

	/**
	 * Sets the value of the '{@link senSoMod.ContextDescription#getContextexpression <em>Contextexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextexpression</em>' containment reference.
	 * @see #getContextexpression()
	 * @generated
	 */
	void setContextexpression(ContextExpression value);

} // ContextDescription
