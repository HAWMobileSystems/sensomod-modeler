/**
 */
package ePKModeler.impl;

import ePKModeler.EPKModelerPackage;
import ePKModeler.Ereignis;
import ePKModeler.Funktion;
import ePKModeler.Kontrollflusselement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kontrollflusselement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ePKModeler.impl.KontrollflusselementImpl#getName <em>Name</em>}</li>
 *   <li>{@link ePKModeler.impl.KontrollflusselementImpl#getFunktion <em>Funktion</em>}</li>
 *   <li>{@link ePKModeler.impl.KontrollflusselementImpl#getEreignis <em>Ereignis</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KontrollflusselementImpl extends MinimalEObjectImpl.Container implements Kontrollflusselement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunktion() <em>Funktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunktion()
	 * @generated
	 * @ordered
	 */
	protected Funktion funktion;

	/**
	 * The cached value of the '{@link #getEreignis() <em>Ereignis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEreignis()
	 * @generated
	 * @ordered
	 */
	protected Ereignis ereignis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontrollflusselementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EPKModelerPackage.Literals.KONTROLLFLUSSELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPKModelerPackage.KONTROLLFLUSSELEMENT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funktion getFunktion() {
		if (funktion != null && funktion.eIsProxy()) {
			InternalEObject oldFunktion = (InternalEObject) funktion;
			funktion = (Funktion) eResolveProxy(oldFunktion);
			if (funktion != oldFunktion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION, oldFunktion, funktion));
			}
		}
		return funktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Funktion basicGetFunktion() {
		return funktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunktion(Funktion newFunktion) {
		Funktion oldFunktion = funktion;
		funktion = newFunktion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION,
					oldFunktion, funktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ereignis getEreignis() {
		if (ereignis != null && ereignis.eIsProxy()) {
			InternalEObject oldEreignis = (InternalEObject) ereignis;
			ereignis = (Ereignis) eResolveProxy(oldEreignis);
			if (ereignis != oldEreignis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS, oldEreignis, ereignis));
			}
		}
		return ereignis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ereignis basicGetEreignis() {
		return ereignis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEreignis(Ereignis newEreignis) {
		Ereignis oldEreignis = ereignis;
		ereignis = newEreignis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS,
					oldEreignis, ereignis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__NAME:
			return getName();
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION:
			if (resolve)
				return getFunktion();
			return basicGetFunktion();
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS:
			if (resolve)
				return getEreignis();
			return basicGetEreignis();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__NAME:
			setName((String) newValue);
			return;
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION:
			setFunktion((Funktion) newValue);
			return;
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS:
			setEreignis((Ereignis) newValue);
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
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION:
			setFunktion((Funktion) null);
			return;
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS:
			setEreignis((Ereignis) null);
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
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__FUNKTION:
			return funktion != null;
		case EPKModelerPackage.KONTROLLFLUSSELEMENT__EREIGNIS:
			return ereignis != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //KontrollflusselementImpl
