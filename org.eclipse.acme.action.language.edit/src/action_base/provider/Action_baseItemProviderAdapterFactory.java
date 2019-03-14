/**
 */
package action_base.provider;

import action_base.util.Action_baseAdapterFactory;

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
public class Action_baseItemProviderAdapterFactory extends Action_baseAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public Action_baseItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.Read} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadItemProvider readItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.Read}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadAdapter() {
		if (readItemProvider == null) {
			readItemProvider = new ReadItemProvider(this);
		}

		return readItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.Delete} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteItemProvider deleteItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.Delete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteAdapter() {
		if (deleteItemProvider == null) {
			deleteItemProvider = new DeleteItemProvider(this);
		}

		return deleteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.UpdateGID} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateGIDItemProvider updateGIDItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.UpdateGID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateGIDAdapter() {
		if (updateGIDItemProvider == null) {
			updateGIDItemProvider = new UpdateGIDItemProvider(this);
		}

		return updateGIDItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.UpdateName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateNameItemProvider updateNameItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.UpdateName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateNameAdapter() {
		if (updateNameItemProvider == null) {
			updateNameItemProvider = new UpdateNameItemProvider(this);
		}

		return updateNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.UpdateDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateDescriptionItemProvider updateDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.UpdateDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateDescriptionAdapter() {
		if (updateDescriptionItemProvider == null) {
			updateDescriptionItemProvider = new UpdateDescriptionItemProvider(this);
		}

		return updateDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.UpdateImplementationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateImplementationConstraintItemProvider updateImplementationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.UpdateImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateImplementationConstraintAdapter() {
		if (updateImplementationConstraintItemProvider == null) {
			updateImplementationConstraintItemProvider = new UpdateImplementationConstraintItemProvider(this);
		}

		return updateImplementationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.DeleteImplementationConstraint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteImplementationConstraintItemProvider deleteImplementationConstraintItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.DeleteImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteImplementationConstraintAdapter() {
		if (deleteImplementationConstraintItemProvider == null) {
			deleteImplementationConstraintItemProvider = new DeleteImplementationConstraintItemProvider(this);
		}

		return deleteImplementationConstraintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.AttachNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachNoteItemProvider attachNoteItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.AttachNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachNoteAdapter() {
		if (attachNoteItemProvider == null) {
			attachNoteItemProvider = new AttachNoteItemProvider(this);
		}

		return attachNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.DeleteNote} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteNoteItemProvider deleteNoteItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.DeleteNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteNoteAdapter() {
		if (deleteNoteItemProvider == null) {
			deleteNoteItemProvider = new DeleteNoteItemProvider(this);
		}

		return deleteNoteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.AddTaggedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddTaggedValueItemProvider addTaggedValueItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.AddTaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddTaggedValueAdapter() {
		if (addTaggedValueItemProvider == null) {
			addTaggedValueItemProvider = new AddTaggedValueItemProvider(this);
		}

		return addTaggedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.UpdateTaggedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateTaggedValueItemProvider updateTaggedValueItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.UpdateTaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUpdateTaggedValueAdapter() {
		if (updateTaggedValueItemProvider == null) {
			updateTaggedValueItemProvider = new UpdateTaggedValueItemProvider(this);
		}

		return updateTaggedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.DeleteTaggedValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeleteTaggedValueItemProvider deleteTaggedValueItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.DeleteTaggedValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeleteTaggedValueAdapter() {
		if (deleteTaggedValueItemProvider == null) {
			deleteTaggedValueItemProvider = new DeleteTaggedValueItemProvider(this);
		}

		return deleteTaggedValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.MakeAbstract} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeAbstractItemProvider makeAbstractItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.MakeAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMakeAbstractAdapter() {
		if (makeAbstractItemProvider == null) {
			makeAbstractItemProvider = new MakeAbstractItemProvider(this);
		}

		return makeAbstractItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.MakeCitation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MakeCitationItemProvider makeCitationItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.MakeCitation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMakeCitationAdapter() {
		if (makeCitationItemProvider == null) {
			makeCitationItemProvider = new MakeCitationItemProvider(this);
		}

		return makeCitationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link action_base.Cite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CiteItemProvider citeItemProvider;

	/**
	 * This creates an adapter for a {@link action_base.Cite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCiteAdapter() {
		if (citeItemProvider == null) {
			citeItemProvider = new CiteItemProvider(this);
		}

		return citeItemProvider;
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
		if (readItemProvider != null) readItemProvider.dispose();
		if (deleteItemProvider != null) deleteItemProvider.dispose();
		if (updateGIDItemProvider != null) updateGIDItemProvider.dispose();
		if (updateNameItemProvider != null) updateNameItemProvider.dispose();
		if (updateDescriptionItemProvider != null) updateDescriptionItemProvider.dispose();
		if (updateImplementationConstraintItemProvider != null) updateImplementationConstraintItemProvider.dispose();
		if (deleteImplementationConstraintItemProvider != null) deleteImplementationConstraintItemProvider.dispose();
		if (attachNoteItemProvider != null) attachNoteItemProvider.dispose();
		if (deleteNoteItemProvider != null) deleteNoteItemProvider.dispose();
		if (addTaggedValueItemProvider != null) addTaggedValueItemProvider.dispose();
		if (updateTaggedValueItemProvider != null) updateTaggedValueItemProvider.dispose();
		if (deleteTaggedValueItemProvider != null) deleteTaggedValueItemProvider.dispose();
		if (makeAbstractItemProvider != null) makeAbstractItemProvider.dispose();
		if (makeCitationItemProvider != null) makeCitationItemProvider.dispose();
		if (citeItemProvider != null) citeItemProvider.dispose();
	}

}