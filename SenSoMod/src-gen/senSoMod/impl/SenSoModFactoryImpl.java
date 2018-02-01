/**
 */
package senSoMod.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import senSoMod.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SenSoModFactoryImpl extends EFactoryImpl implements SenSoModFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SenSoModFactory init() {
		try {
			SenSoModFactory theSenSoModFactory = (SenSoModFactory) EPackage.Registry.INSTANCE
					.getEFactory(SenSoModPackage.eNS_URI);
			if (theSenSoModFactory != null) {
				return theSenSoModFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SenSoModFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenSoModFactoryImpl() {
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
		case SenSoModPackage.MODELL:
			return createModell();
		case SenSoModPackage.PHYSICAL_SENSOR:
			return createPhysicalSensor();
		case SenSoModPackage.VIRTUAL_SENSOR:
			return createVirtualSensor();
		case SenSoModPackage.COMPUTED_SENSOR:
			return createComputedSensor();
		case SenSoModPackage.CONTEXT_DESCRIPTION:
			return createContextDescription();
		case SenSoModPackage.CONTEXT:
			return createContext();
		case SenSoModPackage.DECISION_LOGIC:
			return createDecisionLogic();
		case SenSoModPackage.OUTPUT:
			return createOutput();
		case SenSoModPackage.ELEMENT:
			return createElement();
		case SenSoModPackage.CONTEXT_EXPRESSION:
			return createContextExpression();
		case SenSoModPackage.TYPE:
			return createType();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public PhysicalSensor createPhysicalSensor() {
		PhysicalSensorImpl physicalSensor = new PhysicalSensorImpl();
		return physicalSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualSensor createVirtualSensor() {
		VirtualSensorImpl virtualSensor = new VirtualSensorImpl();
		return virtualSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputedSensor createComputedSensor() {
		ComputedSensorImpl computedSensor = new ComputedSensorImpl();
		return computedSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextDescription createContextDescription() {
		ContextDescriptionImpl contextDescription = new ContextDescriptionImpl();
		return contextDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionLogic createDecisionLogic() {
		DecisionLogicImpl decisionLogic = new DecisionLogicImpl();
		return decisionLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextExpression createContextExpression() {
		ContextExpressionImpl contextExpression = new ContextExpressionImpl();
		return contextExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenSoModPackage getSenSoModPackage() {
		return (SenSoModPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SenSoModPackage getPackage() {
		return SenSoModPackage.eINSTANCE;
	}

} //SenSoModFactoryImpl
