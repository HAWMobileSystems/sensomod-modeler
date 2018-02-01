/**
 */
package ePKModeler.util;

import ePKModeler.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ePKModeler.EPKModelerPackage
 * @generated
 */
public class EPKModelerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EPKModelerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPKModelerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EPKModelerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPKModelerSwitch<Adapter> modelSwitch = new EPKModelerSwitch<Adapter>() {
		@Override
		public Adapter caseKontrollflusselement(Kontrollflusselement object) {
			return createKontrollflusselementAdapter();
		}

		@Override
		public Adapter caseFunktion(Funktion object) {
			return createFunktionAdapter();
		}

		@Override
		public Adapter caseEreignis(Ereignis object) {
			return createEreignisAdapter();
		}

		@Override
		public Adapter caseModell(Modell object) {
			return createModellAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ePKModeler.Kontrollflusselement <em>Kontrollflusselement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ePKModeler.Kontrollflusselement
	 * @generated
	 */
	public Adapter createKontrollflusselementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ePKModeler.Funktion <em>Funktion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ePKModeler.Funktion
	 * @generated
	 */
	public Adapter createFunktionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ePKModeler.Ereignis <em>Ereignis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ePKModeler.Ereignis
	 * @generated
	 */
	public Adapter createEreignisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ePKModeler.Modell <em>Modell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ePKModeler.Modell
	 * @generated
	 */
	public Adapter createModellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EPKModelerAdapterFactory
