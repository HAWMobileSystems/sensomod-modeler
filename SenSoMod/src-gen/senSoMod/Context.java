/**
 */
package senSoMod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.Context#getContextdescription <em>Contextdescription</em>}</li>
 *   <li>{@link senSoMod.Context#getDecisionlogic <em>Decisionlogic</em>}</li>
 *   <li>{@link senSoMod.Context#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends Node {
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
	 * @see senSoMod.SenSoModPackage#getContext_Output()
	 * @model containment="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link senSoMod.Context#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

	/**
	 * Returns the value of the '<em><b>Contextdescription</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextdescription</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextdescription</em>' reference.
	 * @see #setContextdescription(ContextDescription)
	 * @see senSoMod.SenSoModPackage#getContext_Contextdescription()
	 * @model
	 * @generated
	 */
	ContextDescription getContextdescription();

	/**
	 * Sets the value of the '{@link senSoMod.Context#getContextdescription <em>Contextdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextdescription</em>' reference.
	 * @see #getContextdescription()
	 * @generated
	 */
	void setContextdescription(ContextDescription value);

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
	 * @see senSoMod.SenSoModPackage#getContext_Decisionlogic()
	 * @model containment="true"
	 * @generated
	 */
	DecisionLogic getDecisionlogic();

	/**
	 * Sets the value of the '{@link senSoMod.Context#getDecisionlogic <em>Decisionlogic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decisionlogic</em>' containment reference.
	 * @see #getDecisionlogic()
	 * @generated
	 */
	void setDecisionlogic(DecisionLogic value);

} // Context
