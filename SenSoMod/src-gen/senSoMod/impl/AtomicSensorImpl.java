/**
 */
package senSoMod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import senSoMod.AtomicSensor;
import senSoMod.ComputedSensor;
import senSoMod.SenSoModPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.impl.AtomicSensorImpl#getComputedsensor <em>Computedsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtomicSensorImpl extends SensorImpl implements AtomicSensor {
	/**
	 * The cached value of the '{@link #getComputedsensor() <em>Computedsensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedsensor()
	 * @generated
	 * @ordered
	 */
	protected ComputedSensor computedsensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SenSoModPackage.Literals.ATOMIC_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedSensor getComputedsensor() {
		if (computedsensor != null && computedsensor.eIsProxy()) {
			InternalEObject oldComputedsensor = (InternalEObject) computedsensor;
			computedsensor = (ComputedSensor) eResolveProxy(oldComputedsensor);
			if (computedsensor != oldComputedsensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR, oldComputedsensor, computedsensor));
			}
		}
		return computedsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedSensor basicGetComputedsensor() {
		return computedsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputedsensor(ComputedSensor newComputedsensor) {
		ComputedSensor oldComputedsensor = computedsensor;
		computedsensor = newComputedsensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR,
					oldComputedsensor, computedsensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR:
			if (resolve)
				return getComputedsensor();
			return basicGetComputedsensor();
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
		case SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR:
			setComputedsensor((ComputedSensor) newValue);
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
		case SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR:
			setComputedsensor((ComputedSensor) null);
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
		case SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR:
			return computedsensor != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicSensorImpl
