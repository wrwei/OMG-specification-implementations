/**
 */
package action_argumentation.provider;

import action_argumentation.util.Action_argumentationAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Action_argumentationItemProviderAdapterFactory extends Action_argumentationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public Action_argumentationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.ArgumentationActionPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationActionPackageItemProvider argumentationActionPackageItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.ArgumentationActionPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentationActionPackageAdapter() {
		if (argumentationActionPackageItemProvider == null) {
			argumentationActionPackageItemProvider = new ArgumentationActionPackageItemProvider(this);
		}

		return argumentationActionPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArgumentPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArgumentPackageItemProvider createArgumentPackageItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArgumentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArgumentPackageAdapter() {
		if (createArgumentPackageItemProvider == null) {
			createArgumentPackageItemProvider = new CreateArgumentPackageItemProvider(this);
		}

		return createArgumentPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArgumentPackageInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArgumentPackageInterfaceItemProvider createArgumentPackageInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArgumentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArgumentPackageInterfaceAdapter() {
		if (createArgumentPackageInterfaceItemProvider == null) {
			createArgumentPackageInterfaceItemProvider = new CreateArgumentPackageInterfaceItemProvider(this);
		}

		return createArgumentPackageInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArgumentPackageBinding} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArgumentPackageBindingItemProvider createArgumentPackageBindingItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArgumentPackageBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArgumentPackageBindingAdapter() {
		if (createArgumentPackageBindingItemProvider == null) {
			createArgumentPackageBindingItemProvider = new CreateArgumentPackageBindingItemProvider(this);
		}

		return createArgumentPackageBindingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArgumentPackageGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArgumentPackageGroupItemProvider createArgumentPackageGroupItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArgumentPackageGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArgumentPackageGroupAdapter() {
		if (createArgumentPackageGroupItemProvider == null) {
			createArgumentPackageGroupItemProvider = new CreateArgumentPackageGroupItemProvider(this);
		}

		return createArgumentPackageGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateArgumentationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateArgumentationElementItemProvider updateArgumentationElementItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateArgumentationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateArgumentationElementAdapter() {
		if (updateArgumentationElementItemProvider == null) {
			updateArgumentationElementItemProvider = new UpdateArgumentationElementItemProvider(this);
		}

		return updateArgumentationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeleteArgumentationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteArgumentationElementItemProvider deleteArgumentationElementItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeleteArgumentationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteArgumentationElementAdapter() {
		if (deleteArgumentationElementItemProvider == null) {
			deleteArgumentationElementItemProvider = new DeleteArgumentationElementItemProvider(this);
		}

		return deleteArgumentationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArtifactReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArtifactReferenceItemProvider createArtifactReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArtifactReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArtifactReferenceAdapter() {
		if (createArtifactReferenceItemProvider == null) {
			createArtifactReferenceItemProvider = new CreateArtifactReferenceItemProvider(this);
		}

		return createArtifactReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.ReferToArtifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferToArtifactItemProvider referToArtifactItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.ReferToArtifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferToArtifactAdapter() {
		if (referToArtifactItemProvider == null) {
			referToArtifactItemProvider = new ReferToArtifactItemProvider(this);
		}

		return referToArtifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareAsserted} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareAssertedItemProvider declareAssertedItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareAsserted}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareAssertedAdapter() {
		if (declareAssertedItemProvider == null) {
			declareAssertedItemProvider = new DeclareAssertedItemProvider(this);
		}

		return declareAssertedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareNeedsSupport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareNeedsSupportItemProvider declareNeedsSupportItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareNeedsSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareNeedsSupportAdapter() {
		if (declareNeedsSupportItemProvider == null) {
			declareNeedsSupportItemProvider = new DeclareNeedsSupportItemProvider(this);
		}

		return declareNeedsSupportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareAssumed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareAssumedItemProvider declareAssumedItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareAssumed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareAssumedAdapter() {
		if (declareAssumedItemProvider == null) {
			declareAssumedItemProvider = new DeclareAssumedItemProvider(this);
		}

		return declareAssumedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareAxiomatic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareAxiomaticItemProvider declareAxiomaticItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareAxiomatic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareAxiomaticAdapter() {
		if (declareAxiomaticItemProvider == null) {
			declareAxiomaticItemProvider = new DeclareAxiomaticItemProvider(this);
		}

		return declareAxiomaticItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareDefeated} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareDefeatedItemProvider declareDefeatedItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareDefeated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareDefeatedAdapter() {
		if (declareDefeatedItemProvider == null) {
			declareDefeatedItemProvider = new DeclareDefeatedItemProvider(this);
		}

		return declareDefeatedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.DeclareAsCited} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclareAsCitedItemProvider declareAsCitedItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.DeclareAsCited}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclareAsCitedAdapter() {
		if (declareAsCitedItemProvider == null) {
			declareAsCitedItemProvider = new DeclareAsCitedItemProvider(this);
		}

		return declareAsCitedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.MakeClaim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeClaimItemProvider makeClaimItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.MakeClaim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMakeClaimAdapter() {
		if (makeClaimItemProvider == null) {
			makeClaimItemProvider = new MakeClaimItemProvider(this);
		}

		return makeClaimItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateArgumentReasoning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateArgumentReasoningItemProvider createArgumentReasoningItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateArgumentReasoning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateArgumentReasoningAdapter() {
		if (createArgumentReasoningItemProvider == null) {
			createArgumentReasoningItemProvider = new CreateArgumentReasoningItemProvider(this);
		}

		return createArgumentReasoningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateAssertedContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAssertedContextItemProvider createAssertedContextItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateAssertedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateAssertedContextAdapter() {
		if (createAssertedContextItemProvider == null) {
			createAssertedContextItemProvider = new CreateAssertedContextItemProvider(this);
		}

		return createAssertedContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateAssertedEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAssertedEvidenceItemProvider createAssertedEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateAssertedEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateAssertedEvidenceAdapter() {
		if (createAssertedEvidenceItemProvider == null) {
			createAssertedEvidenceItemProvider = new CreateAssertedEvidenceItemProvider(this);
		}

		return createAssertedEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateAssertedInference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAssertedInferenceItemProvider createAssertedInferenceItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateAssertedInference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateAssertedInferenceAdapter() {
		if (createAssertedInferenceItemProvider == null) {
			createAssertedInferenceItemProvider = new CreateAssertedInferenceItemProvider(this);
		}

		return createAssertedInferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateAssertedArtifactContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAssertedArtifactContextItemProvider createAssertedArtifactContextItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateAssertedArtifactContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateAssertedArtifactContextAdapter() {
		if (createAssertedArtifactContextItemProvider == null) {
			createAssertedArtifactContextItemProvider = new CreateAssertedArtifactContextItemProvider(this);
		}

		return createAssertedArtifactContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.CreateAssertedArtifactSupport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateAssertedArtifactSupportItemProvider createAssertedArtifactSupportItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.CreateAssertedArtifactSupport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreateAssertedArtifactSupportAdapter() {
		if (createAssertedArtifactSupportItemProvider == null) {
			createAssertedArtifactSupportItemProvider = new CreateAssertedArtifactSupportItemProvider(this);
		}

		return createAssertedArtifactSupportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateReasoning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateReasoningItemProvider updateReasoningItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateReasoning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateReasoningAdapter() {
		if (updateReasoningItemProvider == null) {
			updateReasoningItemProvider = new UpdateReasoningItemProvider(this);
		}

		return updateReasoningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateMetaClaim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateMetaClaimItemProvider updateMetaClaimItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateMetaClaim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateMetaClaimAdapter() {
		if (updateMetaClaimItemProvider == null) {
			updateMetaClaimItemProvider = new UpdateMetaClaimItemProvider(this);
		}

		return updateMetaClaimItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateAssertedRelationshipSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAssertedRelationshipSourceItemProvider updateAssertedRelationshipSourceItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateAssertedRelationshipSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateAssertedRelationshipSourceAdapter() {
		if (updateAssertedRelationshipSourceItemProvider == null) {
			updateAssertedRelationshipSourceItemProvider = new UpdateAssertedRelationshipSourceItemProvider(this);
		}

		return updateAssertedRelationshipSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateAssertedRelationshipTarget} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateAssertedRelationshipTargetItemProvider updateAssertedRelationshipTargetItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateAssertedRelationshipTarget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateAssertedRelationshipTargetAdapter() {
		if (updateAssertedRelationshipTargetItemProvider == null) {
			updateAssertedRelationshipTargetItemProvider = new UpdateAssertedRelationshipTargetItemProvider(this);
		}

		return updateAssertedRelationshipTargetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_argumentation.UpdateIsCounterAssertedRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateIsCounterAssertedRelationshipItemProvider updateIsCounterAssertedRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link action_argumentation.UpdateIsCounterAssertedRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateIsCounterAssertedRelationshipAdapter() {
		if (updateIsCounterAssertedRelationshipItemProvider == null) {
			updateIsCounterAssertedRelationshipItemProvider = new UpdateIsCounterAssertedRelationshipItemProvider(this);
		}

		return updateIsCounterAssertedRelationshipItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
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
		if (argumentationActionPackageItemProvider != null) argumentationActionPackageItemProvider.dispose();
		if (createArgumentPackageItemProvider != null) createArgumentPackageItemProvider.dispose();
		if (createArgumentPackageInterfaceItemProvider != null) createArgumentPackageInterfaceItemProvider.dispose();
		if (createArgumentPackageBindingItemProvider != null) createArgumentPackageBindingItemProvider.dispose();
		if (createArgumentPackageGroupItemProvider != null) createArgumentPackageGroupItemProvider.dispose();
		if (updateArgumentationElementItemProvider != null) updateArgumentationElementItemProvider.dispose();
		if (deleteArgumentationElementItemProvider != null) deleteArgumentationElementItemProvider.dispose();
		if (createArtifactReferenceItemProvider != null) createArtifactReferenceItemProvider.dispose();
		if (referToArtifactItemProvider != null) referToArtifactItemProvider.dispose();
		if (declareAssertedItemProvider != null) declareAssertedItemProvider.dispose();
		if (declareNeedsSupportItemProvider != null) declareNeedsSupportItemProvider.dispose();
		if (declareAssumedItemProvider != null) declareAssumedItemProvider.dispose();
		if (declareAxiomaticItemProvider != null) declareAxiomaticItemProvider.dispose();
		if (declareDefeatedItemProvider != null) declareDefeatedItemProvider.dispose();
		if (declareAsCitedItemProvider != null) declareAsCitedItemProvider.dispose();
		if (makeClaimItemProvider != null) makeClaimItemProvider.dispose();
		if (createArgumentReasoningItemProvider != null) createArgumentReasoningItemProvider.dispose();
		if (createAssertedContextItemProvider != null) createAssertedContextItemProvider.dispose();
		if (createAssertedEvidenceItemProvider != null) createAssertedEvidenceItemProvider.dispose();
		if (createAssertedInferenceItemProvider != null) createAssertedInferenceItemProvider.dispose();
		if (createAssertedArtifactContextItemProvider != null) createAssertedArtifactContextItemProvider.dispose();
		if (createAssertedArtifactSupportItemProvider != null) createAssertedArtifactSupportItemProvider.dispose();
		if (updateReasoningItemProvider != null) updateReasoningItemProvider.dispose();
		if (updateMetaClaimItemProvider != null) updateMetaClaimItemProvider.dispose();
		if (updateAssertedRelationshipSourceItemProvider != null) updateAssertedRelationshipSourceItemProvider.dispose();
		if (updateAssertedRelationshipTargetItemProvider != null) updateAssertedRelationshipTargetItemProvider.dispose();
		if (updateIsCounterAssertedRelationshipItemProvider != null) updateIsCounterAssertedRelationshipItemProvider.dispose();
	}

}
