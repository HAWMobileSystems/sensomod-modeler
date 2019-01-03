/**
 */
package senSoMod.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import senSoMod.EnumElement;
import senSoMod.SenSoModPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link senSoMod.impl.EnumElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link senSoMod.impl.EnumElementImpl#getValuesCommaSep <em>Values Comma Sep</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumElementImpl extends MinimalEObjectImpl.Container implements EnumElement {
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
	 * The default value of the '{@link #getValuesCommaSep() <em>Values Comma Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCommaSep()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUES_COMMA_SEP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValuesCommaSep() <em>Values Comma Sep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuesCommaSep()
	 * @generated
	 * @ordered
	 */
	protected String valuesCommaSep = VALUES_COMMA_SEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SenSoModPackage.Literals.ENUM_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.ENUM_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValuesCommaSep() {
		return valuesCommaSep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuesCommaSep(String newValuesCommaSep) {
		String oldValuesCommaSep = valuesCommaSep;
		valuesCommaSep = newValuesCommaSep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SenSoModPackage.ENUM_ELEMENT__VALUES_COMMA_SEP,
					oldValuesCommaSep, valuesCommaSep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SenSoModPackage.ENUM_ELEMENT__NAME:
			return getName();
		case SenSoModPackage.ENUM_ELEMENT__VALUES_COMMA_SEP:
			return getValuesCommaSep();
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
		case SenSoModPackage.ENUM_ELEMENT__NAME:
			setName((String) newValue);
			return;
		case SenSoModPackage.ENUM_ELEMENT__VALUES_COMMA_SEP:
			setValuesCommaSep((String) newValue);
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
		case SenSoModPackage.ENUM_ELEMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SenSoModPackage.ENUM_ELEMENT__VALUES_COMMA_SEP:
			setValuesCommaSep(VALUES_COMMA_SEP_EDEFAULT);
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
		case SenSoModPackage.ENUM_ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SenSoModPackage.ENUM_ELEMENT__VALUES_COMMA_SEP:
			return VALUES_COMMA_SEP_EDEFAULT == null ? valuesCommaSep != null
					: !VALUES_COMMA_SEP_EDEFAULT.equals(valuesCommaSep);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", valuesCommaSep: ");
		result.append(valuesCommaSep);
		result.append(')');
		return result.toString();
	}

} //EnumElementImpl
