/**
 */
package senSoMod;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.Modell#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getModell()
 * @model
 * @generated
 */
public interface Modell extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link senSoMod.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see senSoMod.SenSoModPackage#getModell_Node()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNode();

} // Modell
