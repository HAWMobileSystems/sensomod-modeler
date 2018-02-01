/**
 */
package senSoMod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import senSoMod.Context;
import senSoMod.ContextDescription;
import senSoMod.DecisionLogic;
import senSoMod.Output;
import senSoMod.SenSoModPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.impl.ContextImpl#getContextdescription <em>Contextdescription</em>}</li>
 *   <li>{@link senSoMod.impl.ContextImpl#getDecisionlogic <em>Decisionlogic</em>}</li>
 *   <li>{@link senSoMod.impl.ContextImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends NodeImpl implements Context {
	/**
	 * The cached value of the '{@link #getContextdescription() <em>Contextdescription</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextdescription()
	 * @generated
	 * @ordered
	 */
	protected ContextDescription contextdescription;

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
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Output output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SenSoModPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Output newOutput, NotificationChain msgs) {
		Output oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SenSoModPackage.CONTEXT__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(Output newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.CONTEXT__OUTPUT, newOutput,
					newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SenSoModPackage.CONTEXT__DECISIONLOGIC:
			return basicSetDecisionlogic(null, msgs);
		case SenSoModPackage.CONTEXT__OUTPUT:
			return basicSetOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDescription getContextdescription() {
		if (contextdescription != null && contextdescription.eIsProxy()) {
			InternalEObject oldContextdescription = (InternalEObject) contextdescription;
			contextdescription = (ContextDescription) eResolveProxy(oldContextdescription);
			if (contextdescription != oldContextdescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION, oldContextdescription, contextdescription));
			}
		}
		return contextdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDescription basicGetContextdescription() {
		return contextdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextdescription(ContextDescription newContextdescription) {
		ContextDescription oldContextdescription = contextdescription;
		contextdescription = newContextdescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION,
					oldContextdescription, contextdescription));
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
					SenSoModPackage.CONTEXT__DECISIONLOGIC, oldDecisionlogic, newDecisionlogic);
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
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT__DECISIONLOGIC, null, msgs);
			if (newDecisionlogic != null)
				msgs = ((InternalEObject) newDecisionlogic).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SenSoModPackage.CONTEXT__DECISIONLOGIC, null, msgs);
			msgs = basicSetDecisionlogic(newDecisionlogic, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.CONTEXT__DECISIONLOGIC,
					newDecisionlogic, newDecisionlogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION:
			if (resolve)
				return getContextdescription();
			return basicGetContextdescription();
		case SenSoModPackage.CONTEXT__DECISIONLOGIC:
			return getDecisionlogic();
		case SenSoModPackage.CONTEXT__OUTPUT:
			return getOutput();
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
		case SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION:
			setContextdescription((ContextDescription) newValue);
			return;
		case SenSoModPackage.CONTEXT__DECISIONLOGIC:
			setDecisionlogic((DecisionLogic) newValue);
			return;
		case SenSoModPackage.CONTEXT__OUTPUT:
			setOutput((Output) newValue);
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
		case SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION:
			setContextdescription((ContextDescription) null);
			return;
		case SenSoModPackage.CONTEXT__DECISIONLOGIC:
			setDecisionlogic((DecisionLogic) null);
			return;
		case SenSoModPackage.CONTEXT__OUTPUT:
			setOutput((Output) null);
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
		case SenSoModPackage.CONTEXT__CONTEXTDESCRIPTION:
			return contextdescription != null;
		case SenSoModPackage.CONTEXT__DECISIONLOGIC:
			return decisionlogic != null;
		case SenSoModPackage.CONTEXT__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //ContextImpl
