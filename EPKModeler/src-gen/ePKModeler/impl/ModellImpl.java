/**
 */
package ePKModeler.impl;

import ePKModeler.EPKModelerPackage;
import ePKModeler.Kontrollflusselement;
import ePKModeler.Modell;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ePKModeler.impl.ModellImpl#getKontrollflusselement <em>Kontrollflusselement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModellImpl extends MinimalEObjectImpl.Container implements Modell {
	/**
	 * The cached value of the '{@link #getKontrollflusselement() <em>Kontrollflusselement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontrollflusselement()
	 * @generated
	 * @ordered
	 */
	protected EList<Kontrollflusselement> kontrollflusselement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPKModelerPackage.Literals.MODELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Kontrollflusselement> getKontrollflusselement() {
		if (kontrollflusselement == null) {
			kontrollflusselement = new EObjectContainmentEList<Kontrollflusselement>(Kontrollflusselement.class, this,
					EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT);
		}
		return kontrollflusselement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT:
			return ((InternalEList<?>) getKontrollflusselement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT:
			return getKontrollflusselement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT:
			getKontrollflusselement().clear();
			getKontrollflusselement().addAll((Collection<? extends Kontrollflusselement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT:
			getKontrollflusselement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EPKModelerPackage.MODELL__KONTROLLFLUSSELEMENT:
			return kontrollflusselement != null && !kontrollflusselement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModellImpl
