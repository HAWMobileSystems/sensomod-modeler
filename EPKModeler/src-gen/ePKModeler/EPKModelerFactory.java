/**
 */
package ePKModeler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ePKModeler.EPKModelerPackage
 * @generated
 */
public interface EPKModelerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EPKModelerFactory eINSTANCE = ePKModeler.impl.EPKModelerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Funktion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funktion</em>'.
	 * @generated
	 */
	Funktion createFunktion();

	/**
	 * Returns a new object of class '<em>Ereignis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ereignis</em>'.
	 * @generated
	 */
	Ereignis createEreignis();

	/**
	 * Returns a new object of class '<em>Modell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modell</em>'.
	 * @generated
	 */
	Modell createModell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EPKModelerPackage getEPKModelerPackage();

} //EPKModelerFactory
