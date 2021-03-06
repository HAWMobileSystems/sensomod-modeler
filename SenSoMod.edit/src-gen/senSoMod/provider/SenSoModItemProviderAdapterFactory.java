/**
 */
package senSoMod.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import senSoMod.util.SenSoModAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SenSoModItemProviderAdapterFactory extends SenSoModAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SenSoModItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.Modell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModellItemProvider modellItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.Modell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModellAdapter() {
		if (modellItemProvider == null) {
			modellItemProvider = new ModellItemProvider(this);
		}

		return modellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.PhysicalSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalSensorItemProvider physicalSensorItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.PhysicalSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhysicalSensorAdapter() {
		if (physicalSensorItemProvider == null) {
			physicalSensorItemProvider = new PhysicalSensorItemProvider(this);
		}

		return physicalSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.VirtualSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualSensorItemProvider virtualSensorItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.VirtualSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualSensorAdapter() {
		if (virtualSensorItemProvider == null) {
			virtualSensorItemProvider = new VirtualSensorItemProvider(this);
		}

		return virtualSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.ComputedSensor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputedSensorItemProvider computedSensorItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.ComputedSensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComputedSensorAdapter() {
		if (computedSensorItemProvider == null) {
			computedSensorItemProvider = new ComputedSensorItemProvider(this);
		}

		return computedSensorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.ContextDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextDescriptionItemProvider contextDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.ContextDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextDescriptionAdapter() {
		if (contextDescriptionItemProvider == null) {
			contextDescriptionItemProvider = new ContextDescriptionItemProvider(this);
		}

		return contextDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.DecisionLogic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionLogicItemProvider decisionLogicItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.DecisionLogic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecisionLogicAdapter() {
		if (decisionLogicItemProvider == null) {
			decisionLogicItemProvider = new DecisionLogicItemProvider(this);
		}

		return decisionLogicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.Output} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputItemProvider outputItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputAdapter() {
		if (outputItemProvider == null) {
			outputItemProvider = new OutputItemProvider(this);
		}

		return outputItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.Element} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementItemProvider elementItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementAdapter() {
		if (elementItemProvider == null) {
			elementItemProvider = new ElementItemProvider(this);
		}

		return elementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.ContextExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextExpressionItemProvider contextExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.ContextExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextExpressionAdapter() {
		if (contextExpressionItemProvider == null) {
			contextExpressionItemProvider = new ContextExpressionItemProvider(this);
		}

		return contextExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.Type} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeItemProvider typeItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeAdapter() {
		if (typeItemProvider == null) {
			typeItemProvider = new TypeItemProvider(this);
		}

		return typeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link senSoMod.EnumElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumElementItemProvider enumElementItemProvider;

	/**
	 * This creates an adapter for a {@link senSoMod.EnumElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumElementAdapter() {
		if (enumElementItemProvider == null) {
			enumElementItemProvider = new EnumElementItemProvider(this);
		}

		return enumElementItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (modellItemProvider != null)
			modellItemProvider.dispose();
		if (physicalSensorItemProvider != null)
			physicalSensorItemProvider.dispose();
		if (virtualSensorItemProvider != null)
			virtualSensorItemProvider.dispose();
		if (computedSensorItemProvider != null)
			computedSensorItemProvider.dispose();
		if (contextDescriptionItemProvider != null)
			contextDescriptionItemProvider.dispose();
		if (contextItemProvider != null)
			contextItemProvider.dispose();
		if (decisionLogicItemProvider != null)
			decisionLogicItemProvider.dispose();
		if (outputItemProvider != null)
			outputItemProvider.dispose();
		if (elementItemProvider != null)
			elementItemProvider.dispose();
		if (contextExpressionItemProvider != null)
			contextExpressionItemProvider.dispose();
		if (typeItemProvider != null)
			typeItemProvider.dispose();
		if (enumElementItemProvider != null)
			enumElementItemProvider.dispose();
	}

}
