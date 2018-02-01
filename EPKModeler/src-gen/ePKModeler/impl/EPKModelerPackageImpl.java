/**
 */
package ePKModeler.impl;

import ePKModeler.EPKModelerFactory;
import ePKModeler.EPKModelerPackage;
import ePKModeler.Ereignis;
import ePKModeler.Funktion;
import ePKModeler.Kontrollflusselement;
import ePKModeler.Modell;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EPKModelerPackageImpl extends EPackageImpl implements EPKModelerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kontrollflusselementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funktionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ereignisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modellEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ePKModeler.EPKModelerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EPKModelerPackageImpl() {
		super(eNS_URI, EPKModelerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EPKModelerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EPKModelerPackage init() {
		if (isInited)
			return (EPKModelerPackage) EPackage.Registry.INSTANCE.getEPackage(EPKModelerPackage.eNS_URI);

		// Obtain or create and register package
		EPKModelerPackageImpl theEPKModelerPackage = (EPKModelerPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EPKModelerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EPKModelerPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEPKModelerPackage.createPackageContents();

		// Initialize created meta-data
		theEPKModelerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEPKModelerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EPKModelerPackage.eNS_URI, theEPKModelerPackage);
		return theEPKModelerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKontrollflusselement() {
		return kontrollflusselementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKontrollflusselement_Name() {
		return (EAttribute) kontrollflusselementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKontrollflusselement_Funktion() {
		return (EReference) kontrollflusselementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKontrollflusselement_Ereignis() {
		return (EReference) kontrollflusselementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunktion() {
		return funktionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEreignis() {
		return ereignisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModell() {
		return modellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModell_Kontrollflusselement() {
		return (EReference) modellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPKModelerFactory getEPKModelerFactory() {
		return (EPKModelerFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		kontrollflusselementEClass = createEClass(KONTROLLFLUSSELEMENT);
		createEAttribute(kontrollflusselementEClass, KONTROLLFLUSSELEMENT__NAME);
		createEReference(kontrollflusselementEClass, KONTROLLFLUSSELEMENT__FUNKTION);
		createEReference(kontrollflusselementEClass, KONTROLLFLUSSELEMENT__EREIGNIS);

		funktionEClass = createEClass(FUNKTION);

		ereignisEClass = createEClass(EREIGNIS);

		modellEClass = createEClass(MODELL);
		createEReference(modellEClass, MODELL__KONTROLLFLUSSELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		funktionEClass.getESuperTypes().add(this.getKontrollflusselement());
		ereignisEClass.getESuperTypes().add(this.getKontrollflusselement());

		// Initialize classes, features, and operations; add parameters
		initEClass(kontrollflusselementEClass, Kontrollflusselement.class, "Kontrollflusselement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKontrollflusselement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				Kontrollflusselement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontrollflusselement_Funktion(), this.getFunktion(), null, "funktion", null, 0, 1,
				Kontrollflusselement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKontrollflusselement_Ereignis(), this.getEreignis(), null, "ereignis", null, 0, 1,
				Kontrollflusselement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funktionEClass, Funktion.class, "Funktion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ereignisEClass, Ereignis.class, "Ereignis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modellEClass, Modell.class, "Modell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModell_Kontrollflusselement(), this.getKontrollflusselement(), null, "kontrollflusselement",
				null, 0, -1, Modell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EPKModelerPackageImpl
