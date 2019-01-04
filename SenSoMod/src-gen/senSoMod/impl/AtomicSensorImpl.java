/**
 */
package senSoMod.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
	 * The cached value of the '{@link #getComputedsensor() <em>Computedsensor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedsensor()
	 * @generated
	 * @ordered
	 */
	protected EList<ComputedSensor> computedsensor;

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
	public EList<ComputedSensor> getComputedsensor() {
		if (computedsensor == null) {
			computedsensor = new EObjectResolvingEList<ComputedSensor>(ComputedSensor.class, this,
					SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR);
		}
		return computedsensor;
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
			return getComputedsensor();
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
		case SenSoModPackage.ATOMIC_SENSOR__COMPUTEDSENSOR:
			getComputedsensor().clear();
			getComputedsensor().addAll((Collection<? extends ComputedSensor>) newValue);
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
			getComputedsensor().clear();
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
			return computedsensor != null && !computedsensor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AtomicSensorImpl
