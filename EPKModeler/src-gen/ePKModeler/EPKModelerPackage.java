/**
 */
package ePKModeler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ePKModeler.EPKModelerFactory
 * @model kind="package"
 * @generated
 */
public interface EPKModelerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ePKModeler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ePKModeler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ePKModeler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EPKModelerPackage eINSTANCE = ePKModeler.impl.EPKModelerPackageImpl.init();

	/**
	 * The meta object id for the '{@link ePKModeler.impl.KontrollflusselementImpl <em>Kontrollflusselement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ePKModeler.impl.KontrollflusselementImpl
	 * @see ePKModeler.impl.EPKModelerPackageImpl#getKontrollflusselement()
	 * @generated
	 */
	int KONTROLLFLUSSELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTROLLFLUSSELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTROLLFLUSSELEMENT__FUNKTION = 1;

	/**
	 * The feature id for the '<em><b>Ereignis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTROLLFLUSSELEMENT__EREIGNIS = 2;

	/**
	 * The number of structural features of the '<em>Kontrollflusselement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTROLLFLUSSELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kontrollflusselement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTROLLFLUSSELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ePKModeler.impl.FunktionImpl <em>Funktion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ePKModeler.impl.FunktionImpl
	 * @see ePKModeler.impl.EPKModelerPackageImpl#getFunktion()
	 * @generated
	 */
	int FUNKTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION__NAME = KONTROLLFLUSSELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION__FUNKTION = KONTROLLFLUSSELEMENT__FUNKTION;

	/**
	 * The feature id for the '<em><b>Ereignis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION__EREIGNIS = KONTROLLFLUSSELEMENT__EREIGNIS;

	/**
	 * The number of structural features of the '<em>Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_FEATURE_COUNT = KONTROLLFLUSSELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Funktion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNKTION_OPERATION_COUNT = KONTROLLFLUSSELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ePKModeler.impl.EreignisImpl <em>Ereignis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ePKModeler.impl.EreignisImpl
	 * @see ePKModeler.impl.EPKModelerPackageImpl#getEreignis()
	 * @generated
	 */
	int EREIGNIS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREIGNIS__NAME = KONTROLLFLUSSELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Funktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREIGNIS__FUNKTION = KONTROLLFLUSSELEMENT__FUNKTION;

	/**
	 * The feature id for the '<em><b>Ereignis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREIGNIS__EREIGNIS = KONTROLLFLUSSELEMENT__EREIGNIS;

	/**
	 * The number of structural features of the '<em>Ereignis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREIGNIS_FEATURE_COUNT = KONTROLLFLUSSELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ereignis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EREIGNIS_OPERATION_COUNT = KONTROLLFLUSSELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ePKModeler.impl.ModellImpl <em>Modell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ePKModeler.impl.ModellImpl
	 * @see ePKModeler.impl.EPKModelerPackageImpl#getModell()
	 * @generated
	 */
	int MODELL = 3;

	/**
	 * The feature id for the '<em><b>Kontrollflusselement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL__KONTROLLFLUSSELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Modell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ePKModeler.Kontrollflusselement <em>Kontrollflusselement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontrollflusselement</em>'.
	 * @see ePKModeler.Kontrollflusselement
	 * @generated
	 */
	EClass getKontrollflusselement();

	/**
	 * Returns the meta object for the attribute '{@link ePKModeler.Kontrollflusselement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ePKModeler.Kontrollflusselement#getName()
	 * @see #getKontrollflusselement()
	 * @generated
	 */
	EAttribute getKontrollflusselement_Name();

	/**
	 * Returns the meta object for the reference '{@link ePKModeler.Kontrollflusselement#getFunktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Funktion</em>'.
	 * @see ePKModeler.Kontrollflusselement#getFunktion()
	 * @see #getKontrollflusselement()
	 * @generated
	 */
	EReference getKontrollflusselement_Funktion();

	/**
	 * Returns the meta object for the reference '{@link ePKModeler.Kontrollflusselement#getEreignis <em>Ereignis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ereignis</em>'.
	 * @see ePKModeler.Kontrollflusselement#getEreignis()
	 * @see #getKontrollflusselement()
	 * @generated
	 */
	EReference getKontrollflusselement_Ereignis();

	/**
	 * Returns the meta object for class '{@link ePKModeler.Funktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funktion</em>'.
	 * @see ePKModeler.Funktion
	 * @generated
	 */
	EClass getFunktion();

	/**
	 * Returns the meta object for class '{@link ePKModeler.Ereignis <em>Ereignis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ereignis</em>'.
	 * @see ePKModeler.Ereignis
	 * @generated
	 */
	EClass getEreignis();

	/**
	 * Returns the meta object for class '{@link ePKModeler.Modell <em>Modell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modell</em>'.
	 * @see ePKModeler.Modell
	 * @generated
	 */
	EClass getModell();

	/**
	 * Returns the meta object for the containment reference list '{@link ePKModeler.Modell#getKontrollflusselement <em>Kontrollflusselement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontrollflusselement</em>'.
	 * @see ePKModeler.Modell#getKontrollflusselement()
	 * @see #getModell()
	 * @generated
	 */
	EReference getModell_Kontrollflusselement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EPKModelerFactory getEPKModelerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ePKModeler.impl.KontrollflusselementImpl <em>Kontrollflusselement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ePKModeler.impl.KontrollflusselementImpl
		 * @see ePKModeler.impl.EPKModelerPackageImpl#getKontrollflusselement()
		 * @generated
		 */
		EClass KONTROLLFLUSSELEMENT = eINSTANCE.getKontrollflusselement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTROLLFLUSSELEMENT__NAME = eINSTANCE.getKontrollflusselement_Name();

		/**
		 * The meta object literal for the '<em><b>Funktion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTROLLFLUSSELEMENT__FUNKTION = eINSTANCE.getKontrollflusselement_Funktion();

		/**
		 * The meta object literal for the '<em><b>Ereignis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTROLLFLUSSELEMENT__EREIGNIS = eINSTANCE.getKontrollflusselement_Ereignis();

		/**
		 * The meta object literal for the '{@link ePKModeler.impl.FunktionImpl <em>Funktion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ePKModeler.impl.FunktionImpl
		 * @see ePKModeler.impl.EPKModelerPackageImpl#getFunktion()
		 * @generated
		 */
		EClass FUNKTION = eINSTANCE.getFunktion();

		/**
		 * The meta object literal for the '{@link ePKModeler.impl.EreignisImpl <em>Ereignis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ePKModeler.impl.EreignisImpl
		 * @see ePKModeler.impl.EPKModelerPackageImpl#getEreignis()
		 * @generated
		 */
		EClass EREIGNIS = eINSTANCE.getEreignis();

		/**
		 * The meta object literal for the '{@link ePKModeler.impl.ModellImpl <em>Modell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ePKModeler.impl.ModellImpl
		 * @see ePKModeler.impl.EPKModelerPackageImpl#getModell()
		 * @generated
		 */
		EClass MODELL = eINSTANCE.getModell();

		/**
		 * The meta object literal for the '<em><b>Kontrollflusselement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELL__KONTROLLFLUSSELEMENT = eINSTANCE.getModell_Kontrollflusselement();

	}

} //EPKModelerPackage
