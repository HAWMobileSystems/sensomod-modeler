/**
 */
package senSoMod.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import senSoMod.ComputedSensor;
import senSoMod.DecisionLogic;
import senSoMod.SenSoModPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computed Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.impl.ComputedSensorImpl#getDecisionlogic <em>Decisionlogic</em>}</li>
 *   <li>{@link senSoMod.impl.ComputedSensorImpl#getComputedsensor <em>Computedsensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputedSensorImpl extends SensorImpl implements ComputedSensor {
	/**
	 * The cached value of the '{@link #getDecisionlogic() <em>Decisionlogic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionlogic()
	 * @generated
	 * @ordered
	 */
	protected DecisionLogic decisionlogic;

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
	protected ComputedSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SenSoModPackage.Literals.COMPUTED_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionLogic getDecisionlogic() {
		return decisionlogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionlogic(DecisionLogic newDecisionlogic, NotificationChain msgs) {
		DecisionLogic oldDecisionlogic = decisionlogic;
		decisionlogic = newDecisionlogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC, oldDecisionlogic, newDecisionlogic);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionlogic(DecisionLogic newDecisionlogic) {
		if (newDecisionlogic != decisionlogic) {
			NotificationChain msgs = null;
			if (decisionlogic != null)
				msgs = ((InternalEObject) decisionlogic).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC, null, msgs);
			if (newDecisionlogic != null)
				msgs = ((InternalEObject) newDecisionlogic).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC, null, msgs);
			msgs = basicSetDecisionlogic(newDecisionlogic, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC,
					newDecisionlogic, newDecisionlogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComputedSensor> getComputedsensor() {
		if (computedsensor == null) {
			computedsensor = new EObjectResolvingEList<ComputedSensor>(ComputedSensor.class, this,
					SenSoModPackage.COMPUTED_SENSOR__COMPUTEDSENSOR);
		}
		return computedsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC:
			return basicSetDecisionlogic(null, msgs);
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
		case SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC:
			return getDecisionlogic();
		case SenSoModPackage.COMPUTED_SENSOR__COMPUTEDSENSOR:
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
		case SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC:
			setDecisionlogic((DecisionLogic) newValue);
			return;
		case SenSoModPackage.COMPUTED_SENSOR__COMPUTEDSENSOR:
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
		case SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC:
			setDecisionlogic((DecisionLogic) null);
			return;
		case SenSoModPackage.COMPUTED_SENSOR__COMPUTEDSENSOR:
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
		case SenSoModPackage.COMPUTED_SENSOR__DECISIONLOGIC:
			return decisionlogic != null;
		case SenSoModPackage.COMPUTED_SENSOR__COMPUTEDSENSOR:
			return computedsensor != null && !computedsensor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComputedSensorImpl
