/**
 */
package senSoMod;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.EnumElement#getName <em>Name</em>}</li>
 *   <li>{@link senSoMod.EnumElement#getValuesCommaSep <em>Values Comma Sep</em>}</li>
 * </ul>
 *
 * @see senSoMod.SenSoModPackage#getEnumElement()
 * @model annotation="http://www.obeo.fr/dsl/dnc/archetype archetype='Role'"
 * @generated
 */
public interface EnumElement extends EObject {
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
	 * @see senSoMod.SenSoModPackage#getEnumElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link senSoMod.EnumElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Values Comma Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values Comma Sep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values Comma Sep</em>' attribute.
	 * @see #setValuesCommaSep(String)
	 * @see senSoMod.SenSoModPackage#getEnumElement_ValuesCommaSep()
	 * @model
	 * @generated
	 */
	String getValuesCommaSep();

	/**
	 * Sets the value of the '{@link senSoMod.EnumElement#getValuesCommaSep <em>Values Comma Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values Comma Sep</em>' attribute.
	 * @see #getValuesCommaSep()
	 * @generated
	 */
	void setValuesCommaSep(String value);

} // EnumElement
