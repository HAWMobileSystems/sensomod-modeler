/**
 */
package senSoMod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see senSoMod.SenSoModFactory
 * @model kind="package"
 * @generated
 */
public interface SenSoModPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "senSoMod";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/senSoMod";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "senSoMod";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SenSoModPackage eINSTANCE = senSoMod.impl.SenSoModPackageImpl.init();

	/**
	 * The meta object id for the '{@link senSoMod.impl.ModellImpl <em>Modell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ModellImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getModell()
	 * @generated
	 */
	int MODELL = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL__NODE = 0;

	/**
	 * The number of structural features of the '<em>Modell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Modell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.NodeImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.SensorImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTEXT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MULTIPLE = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__OUTPUT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.AtomicSensorImpl <em>Atomic Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.AtomicSensorImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getAtomicSensor()
	 * @generated
	 */
	int ATOMIC_SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__DESCRIPTION = SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__CONTEXT = SENSOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__MULTIPLE = SENSOR__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__OUTPUT = SENSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Computedsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR__COMPUTEDSENSOR = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Atomic Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.PhysicalSensorImpl <em>Physical Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.PhysicalSensorImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getPhysicalSensor()
	 * @generated
	 */
	int PHYSICAL_SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__NAME = ATOMIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__DESCRIPTION = ATOMIC_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__CONTEXT = ATOMIC_SENSOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__MULTIPLE = ATOMIC_SENSOR__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__OUTPUT = ATOMIC_SENSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Computedsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR__COMPUTEDSENSOR = ATOMIC_SENSOR__COMPUTEDSENSOR;

	/**
	 * The number of structural features of the '<em>Physical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR_FEATURE_COUNT = ATOMIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Physical Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_SENSOR_OPERATION_COUNT = ATOMIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.VirtualSensorImpl <em>Virtual Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.VirtualSensorImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getVirtualSensor()
	 * @generated
	 */
	int VIRTUAL_SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__NAME = ATOMIC_SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__DESCRIPTION = ATOMIC_SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__CONTEXT = ATOMIC_SENSOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__MULTIPLE = ATOMIC_SENSOR__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__OUTPUT = ATOMIC_SENSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Computedsensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR__COMPUTEDSENSOR = ATOMIC_SENSOR__COMPUTEDSENSOR;

	/**
	 * The number of structural features of the '<em>Virtual Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR_FEATURE_COUNT = ATOMIC_SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Virtual Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_SENSOR_OPERATION_COUNT = ATOMIC_SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.ComputedSensorImpl <em>Computed Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ComputedSensorImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getComputedSensor()
	 * @generated
	 */
	int COMPUTED_SENSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__DESCRIPTION = SENSOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__CONTEXT = SENSOR__CONTEXT;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__MULTIPLE = SENSOR__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__OUTPUT = SENSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Decisionlogic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR__DECISIONLOGIC = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Computed Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Computed Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTED_SENSOR_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.ContextDescriptionImpl <em>Context Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ContextDescriptionImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getContextDescription()
	 * @generated
	 */
	int CONTEXT_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contextexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION__CONTEXTEXPRESSION = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Context Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DESCRIPTION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ContextImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contextdescription</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXTDESCRIPTION = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decisionlogic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DECISIONLOGIC = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__OUTPUT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.DecisionLogicImpl <em>Decision Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.DecisionLogicImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getDecisionLogic()
	 * @generated
	 */
	int DECISION_LOGIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_LOGIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Decision Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_LOGIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Decision Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_LOGIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.OutputImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ElementImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.ContextExpressionImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getContextExpression()
	 * @generated
	 */
	int CONTEXT_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Context Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Context Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.TypeImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 13;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Enumelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ENUMELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link senSoMod.impl.EnumElementImpl <em>Enum Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see senSoMod.impl.EnumElementImpl
	 * @see senSoMod.impl.SenSoModPackageImpl#getEnumElement()
	 * @generated
	 */
	int ENUM_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Values Comma Sep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT__VALUES_COMMA_SEP = 1;

	/**
	 * The number of structural features of the '<em>Enum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link senSoMod.Modell <em>Modell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modell</em>'.
	 * @see senSoMod.Modell
	 * @generated
	 */
	EClass getModell();

	/**
	 * Returns the meta object for the containment reference list '{@link senSoMod.Modell#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node</em>'.
	 * @see senSoMod.Modell#getNode()
	 * @see #getModell()
	 * @generated
	 */
	EReference getModell_Node();

	/**
	 * Returns the meta object for class '{@link senSoMod.PhysicalSensor <em>Physical Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Sensor</em>'.
	 * @see senSoMod.PhysicalSensor
	 * @generated
	 */
	EClass getPhysicalSensor();

	/**
	 * Returns the meta object for class '{@link senSoMod.VirtualSensor <em>Virtual Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Sensor</em>'.
	 * @see senSoMod.VirtualSensor
	 * @generated
	 */
	EClass getVirtualSensor();

	/**
	 * Returns the meta object for class '{@link senSoMod.AtomicSensor <em>Atomic Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Sensor</em>'.
	 * @see senSoMod.AtomicSensor
	 * @generated
	 */
	EClass getAtomicSensor();

	/**
	 * Returns the meta object for the reference '{@link senSoMod.AtomicSensor#getComputedsensor <em>Computedsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Computedsensor</em>'.
	 * @see senSoMod.AtomicSensor#getComputedsensor()
	 * @see #getAtomicSensor()
	 * @generated
	 */
	EReference getAtomicSensor_Computedsensor();

	/**
	 * Returns the meta object for class '{@link senSoMod.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see senSoMod.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference '{@link senSoMod.Sensor#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see senSoMod.Sensor#getOutput()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Output();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Sensor#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see senSoMod.Sensor#isMultiple()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Multiple();

	/**
	 * Returns the meta object for the reference list '{@link senSoMod.Sensor#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see senSoMod.Sensor#getContext()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Context();

	/**
	 * Returns the meta object for class '{@link senSoMod.ComputedSensor <em>Computed Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computed Sensor</em>'.
	 * @see senSoMod.ComputedSensor
	 * @generated
	 */
	EClass getComputedSensor();

	/**
	 * Returns the meta object for the containment reference '{@link senSoMod.ComputedSensor#getDecisionlogic <em>Decisionlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decisionlogic</em>'.
	 * @see senSoMod.ComputedSensor#getDecisionlogic()
	 * @see #getComputedSensor()
	 * @generated
	 */
	EReference getComputedSensor_Decisionlogic();

	/**
	 * Returns the meta object for class '{@link senSoMod.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see senSoMod.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Node#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see senSoMod.Node#getDescription()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Description();

	/**
	 * Returns the meta object for class '{@link senSoMod.ContextDescription <em>Context Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Description</em>'.
	 * @see senSoMod.ContextDescription
	 * @generated
	 */
	EClass getContextDescription();

	/**
	 * Returns the meta object for the containment reference '{@link senSoMod.ContextDescription#getContextexpression <em>Contextexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contextexpression</em>'.
	 * @see senSoMod.ContextDescription#getContextexpression()
	 * @see #getContextDescription()
	 * @generated
	 */
	EReference getContextDescription_Contextexpression();

	/**
	 * Returns the meta object for class '{@link senSoMod.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see senSoMod.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference '{@link senSoMod.Context#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see senSoMod.Context#getOutput()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Output();

	/**
	 * Returns the meta object for class '{@link senSoMod.DecisionLogic <em>Decision Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Logic</em>'.
	 * @see senSoMod.DecisionLogic
	 * @generated
	 */
	EClass getDecisionLogic();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.DecisionLogic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.DecisionLogic#getName()
	 * @see #getDecisionLogic()
	 * @generated
	 */
	EAttribute getDecisionLogic_Name();

	/**
	 * Returns the meta object for class '{@link senSoMod.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see senSoMod.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link senSoMod.Output#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see senSoMod.Output#getType()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Type();

	/**
	 * Returns the meta object for class '{@link senSoMod.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see senSoMod.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see senSoMod.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Type();

	/**
	 * Returns the meta object for class '{@link senSoMod.ContextExpression <em>Context Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Expression</em>'.
	 * @see senSoMod.ContextExpression
	 * @generated
	 */
	EClass getContextExpression();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.ContextExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.ContextExpression#getName()
	 * @see #getContextExpression()
	 * @generated
	 */
	EAttribute getContextExpression_Name();

	/**
	 * Returns the meta object for class '{@link senSoMod.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see senSoMod.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the containment reference list '{@link senSoMod.Type#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see senSoMod.Type#getElement()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Element();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.Type#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see senSoMod.Type#getType()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link senSoMod.Type#getEnumelement <em>Enumelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumelement</em>'.
	 * @see senSoMod.Type#getEnumelement()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Enumelement();

	/**
	 * Returns the meta object for class '{@link senSoMod.EnumElement <em>Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Element</em>'.
	 * @see senSoMod.EnumElement
	 * @generated
	 */
	EClass getEnumElement();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.EnumElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see senSoMod.EnumElement#getName()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link senSoMod.EnumElement#getValuesCommaSep <em>Values Comma Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Values Comma Sep</em>'.
	 * @see senSoMod.EnumElement#getValuesCommaSep()
	 * @see #getEnumElement()
	 * @generated
	 */
	EAttribute getEnumElement_ValuesCommaSep();

	/**
	 * Returns the meta object for the reference list '{@link senSoMod.Context#getContextdescription <em>Contextdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contextdescription</em>'.
	 * @see senSoMod.Context#getContextdescription()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Contextdescription();

	/**
	 * Returns the meta object for the containment reference '{@link senSoMod.Context#getDecisionlogic <em>Decisionlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decisionlogic</em>'.
	 * @see senSoMod.Context#getDecisionlogic()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Decisionlogic();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SenSoModFactory getSenSoModFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link senSoMod.impl.ModellImpl <em>Modell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ModellImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getModell()
		 * @generated
		 */
		EClass MODELL = eINSTANCE.getModell();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODELL__NODE = eINSTANCE.getModell_Node();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.PhysicalSensorImpl <em>Physical Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.PhysicalSensorImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getPhysicalSensor()
		 * @generated
		 */
		EClass PHYSICAL_SENSOR = eINSTANCE.getPhysicalSensor();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.VirtualSensorImpl <em>Virtual Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.VirtualSensorImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getVirtualSensor()
		 * @generated
		 */
		EClass VIRTUAL_SENSOR = eINSTANCE.getVirtualSensor();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.AtomicSensorImpl <em>Atomic Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.AtomicSensorImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getAtomicSensor()
		 * @generated
		 */
		EClass ATOMIC_SENSOR = eINSTANCE.getAtomicSensor();

		/**
		 * The meta object literal for the '<em><b>Computedsensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_SENSOR__COMPUTEDSENSOR = eINSTANCE.getAtomicSensor_Computedsensor();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.SensorImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__OUTPUT = eINSTANCE.getSensor_Output();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MULTIPLE = eINSTANCE.getSensor_Multiple();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CONTEXT = eINSTANCE.getSensor_Context();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.ComputedSensorImpl <em>Computed Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ComputedSensorImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getComputedSensor()
		 * @generated
		 */
		EClass COMPUTED_SENSOR = eINSTANCE.getComputedSensor();

		/**
		 * The meta object literal for the '<em><b>Decisionlogic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTED_SENSOR__DECISIONLOGIC = eINSTANCE.getComputedSensor_Decisionlogic();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.NodeImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DESCRIPTION = eINSTANCE.getNode_Description();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.ContextDescriptionImpl <em>Context Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ContextDescriptionImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getContextDescription()
		 * @generated
		 */
		EClass CONTEXT_DESCRIPTION = eINSTANCE.getContextDescription();

		/**
		 * The meta object literal for the '<em><b>Contextexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT_DESCRIPTION__CONTEXTEXPRESSION = eINSTANCE.getContextDescription_Contextexpression();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ContextImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__OUTPUT = eINSTANCE.getContext_Output();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.DecisionLogicImpl <em>Decision Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.DecisionLogicImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getDecisionLogic()
		 * @generated
		 */
		EClass DECISION_LOGIC = eINSTANCE.getDecisionLogic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_LOGIC__NAME = eINSTANCE.getDecisionLogic_Name();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.OutputImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TYPE = eINSTANCE.getOutput_Type();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ElementImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.ContextExpressionImpl <em>Context Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.ContextExpressionImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getContextExpression()
		 * @generated
		 */
		EClass CONTEXT_EXPRESSION = eINSTANCE.getContextExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_EXPRESSION__NAME = eINSTANCE.getContextExpression_Name();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.TypeImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ELEMENT = eINSTANCE.getType_Element();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__TYPE = eINSTANCE.getType_Type();

		/**
		 * The meta object literal for the '<em><b>Enumelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__ENUMELEMENT = eINSTANCE.getType_Enumelement();

		/**
		 * The meta object literal for the '{@link senSoMod.impl.EnumElementImpl <em>Enum Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see senSoMod.impl.EnumElementImpl
		 * @see senSoMod.impl.SenSoModPackageImpl#getEnumElement()
		 * @generated
		 */
		EClass ENUM_ELEMENT = eINSTANCE.getEnumElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ELEMENT__NAME = eINSTANCE.getEnumElement_Name();

		/**
		 * The meta object literal for the '<em><b>Values Comma Sep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_ELEMENT__VALUES_COMMA_SEP = eINSTANCE.getEnumElement_ValuesCommaSep();

		/**
		 * The meta object literal for the '<em><b>Contextdescription</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXTDESCRIPTION = eINSTANCE.getContext_Contextdescription();

		/**
		 * The meta object literal for the '<em><b>Decisionlogic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__DECISIONLOGIC = eINSTANCE.getContext_Decisionlogic();

	}

} //SenSoModPackage
