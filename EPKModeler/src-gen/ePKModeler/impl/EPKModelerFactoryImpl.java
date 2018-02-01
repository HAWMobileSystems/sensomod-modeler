/**
 */
package ePKModeler.impl;

import ePKModeler.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EPKModelerFactoryImpl extends EFactoryImpl implements EPKModelerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EPKModelerFactory init() {
		try {
			EPKModelerFactory theEPKModelerFactory = (EPKModelerFactory) EPackage.Registry.INSTANCE
					.getEFactory(EPKModelerPackage.eNS_URI);
			if (theEPKModelerFactory != null) {
				return theEPKModelerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EPKModelerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPKModelerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EPKModelerPackage.FUNKTION:
			return createFunktion();
		case EPKModelerPackage.EREIGNIS:
			return createEreignis();
		case EPKModelerPackage.MODELL:
			return createModell();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funktion createFunktion() {
		FunktionImpl funktion = new FunktionImpl();
		return funktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ereignis createEreignis() {
		EreignisImpl ereignis = new EreignisImpl();
		return ereignis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modell createModell() {
		ModellImpl modell = new ModellImpl();
		return modell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPKModelerPackage getEPKModelerPackage() {
		return (EPKModelerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EPKModelerPackage getPackage() {
		return EPKModelerPackage.eINSTANCE;
	}

} //EPKModelerFactoryImpl
