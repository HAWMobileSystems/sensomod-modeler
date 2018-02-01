/**
 */
package senSoMod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import senSoMod.ContextDescription;
import senSoMod.ContextExpression;
import senSoMod.SenSoModPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.impl.ContextDescriptionImpl#getContextexpression <em>Contextexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextDescriptionImpl extends NodeImpl implements ContextDescription {
	/**
	 * The cached value of the '{@link #getContextexpression() <em>Contextexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextexpression()
	 * @generated
	 * @ordered
	 */
	protected ContextExpression contextexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SenSoModPackage.Literals.CONTEXT_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextExpression getContextexpression() {
		return contextexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextexpression(ContextExpression newContextexpression, NotificationChain msgs) {
		ContextExpression oldContextexpression = contextexpression;
		contextexpression = newContextexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION, oldContextexpression, newContextexpression);
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
	public void setContextexpression(ContextExpression newContextexpression) {
		if (newContextexpression != contextexpression) {
			NotificationChain msgs = null;
			if (contextexpression != null)
				msgs = ((InternalEObject) contextexpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION, null, msgs);
			if (newContextexpression != null)
				msgs = ((InternalEObject) newContextexpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION, null, msgs);
			msgs = basicSetContextexpression(newContextexpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION, newContextexpression,
					newContextexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION:
			return basicSetContextexpression(null, msgs);
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
		case SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION:
			return getContextexpression();
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
		case SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION:
			setContextexpression((ContextExpression) newValue);
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
		case SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION:
			setContextexpression((ContextExpression) null);
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
		case SenSoModPackage.CONTEXT_DESCRIPTION__CONTEXTEXPRESSION:
			return contextexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextDescriptionImpl
