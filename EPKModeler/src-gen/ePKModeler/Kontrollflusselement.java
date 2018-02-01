/**
 */
package ePKModeler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kontrollflusselement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ePKModeler.Kontrollflusselement#getName <em>Name</em>}</li>
 *   <li>{@link ePKModeler.Kontrollflusselement#getFunktion <em>Funktion</em>}</li>
 *   <li>{@link ePKModeler.Kontrollflusselement#getEreignis <em>Ereignis</em>}</li>
 * </ul>
 *
 * @see ePKModeler.EPKModelerPackage#getKontrollflusselement()
 * @model abstract="true"
 * @generated
 */
public interface Kontrollflusselement extends EObject {
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
	 * @see ePKModeler.EPKModelerPackage#getKontrollflusselement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ePKModeler.Kontrollflusselement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funktion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funktion</em>' reference.
	 * @see #setFunktion(Funktion)
	 * @see ePKModeler.EPKModelerPackage#getKontrollflusselement_Funktion()
	 * @model
	 * @generated
	 */
	Funktion getFunktion();

	/**
	 * Sets the value of the '{@link ePKModeler.Kontrollflusselement#getFunktion <em>Funktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funktion</em>' reference.
	 * @see #getFunktion()
	 * @generated
	 */
	void setFunktion(Funktion value);

	/**
	 * Returns the value of the '<em><b>Ereignis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ereignis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ereignis</em>' reference.
	 * @see #setEreignis(Ereignis)
	 * @see ePKModeler.EPKModelerPackage#getKontrollflusselement_Ereignis()
	 * @model
	 * @generated
	 */
	Ereignis getEreignis();

	/**
	 * Sets the value of the '{@link ePKModeler.Kontrollflusselement#getEreignis <em>Ereignis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ereignis</em>' reference.
	 * @see #getEreignis()
	 * @generated
	 */
	void setEreignis(Ereignis value);

} // Kontrollflusselement
