package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QtAbstractPropertyBrowser extends com.trolltech.qt.gui.QWidget
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void itemChanged(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_itemChanged_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected void itemInserted(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, com.trolltech.solutions.qtpropertybrowser.QtBrowserItem afterItem) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_itemInserted_QtBrowserItem_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId(), afterItem == null ? 0 : afterItem.nativeId());
        }

        @Override
        @QtBlockedSlot
        protected void itemRemoved(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_itemRemoved_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
        }
    }

    public final Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> currentItemChanged = new Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem>();

    private final void currentItemChanged(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_currentItemChanged_QtBrowserItem(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    native void __qt_currentItemChanged_QtBrowserItem(long __this__nativeId, long arg__1);


    public QtAbstractPropertyBrowser() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
    public QtAbstractPropertyBrowser(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QtAbstractPropertyBrowser_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtAbstractPropertyBrowser_QWidget(long parent);

    public final com.trolltech.solutions.qtpropertybrowser.QtBrowserItem addProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    native com.trolltech.solutions.qtpropertybrowser.QtBrowserItem __qt_addProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final void clear()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_clear(nativeId());
    }
    @QtBlockedSlot
    native void __qt_clear(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtBrowserItem currentItem()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_currentItem(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtBrowserItem __qt_currentItem(long __this__nativeId);

    public final com.trolltech.solutions.qtpropertybrowser.QtBrowserItem insertProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.solutions.qtpropertybrowser.QtProperty afterProperty)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_insertProperty_QtProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId(), afterProperty == null ? 0 : afterProperty.nativeId());
    }
    native com.trolltech.solutions.qtpropertybrowser.QtBrowserItem __qt_insertProperty_QtProperty_QtProperty(long __this__nativeId, long property, long afterProperty);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> items(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_items_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> __qt_items_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.solutions.qtpropertybrowser.QtProperty> browserProperties()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_browserProperties(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.solutions.qtpropertybrowser.QtProperty> __qt_browserProperties(long __this__nativeId);

    public final void removeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    native void __qt_removeProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final void setCurrentItem(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem arg__1)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setCurrentItem_QtBrowserItem(nativeId(), arg__1 == null ? 0 : arg__1.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setCurrentItem_QtBrowserItem(long __this__nativeId, long arg__1);

    @QtBlockedSlot
    public final void setFactoryForManager(com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager manager, com.trolltech.solutions.qtpropertybrowser.QtAbstractEditorFactoryBase factory)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFactoryForManager_QtAbstractPropertyManager_QtAbstractEditorFactoryBase(nativeId(), manager == null ? 0 : manager.nativeId(), factory == null ? 0 : factory.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setFactoryForManager_QtAbstractPropertyManager_QtAbstractEditorFactoryBase(long __this__nativeId, long manager, long factory);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtBrowserItem topLevelItem(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelItem_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtBrowserItem __qt_topLevelItem_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> topLevelItems()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_topLevelItems(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> __qt_topLevelItems(long __this__nativeId);

    @QtBlockedSlot
    public final void unsetFactoryForManager(com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager manager)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_unsetFactoryForManager_QtAbstractPropertyManager(nativeId(), manager == null ? 0 : manager.nativeId());
    }
    @QtBlockedSlot
    native void __qt_unsetFactoryForManager_QtAbstractPropertyManager(long __this__nativeId, long manager);

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QWidget createEditor(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QWidget parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEditor_QtProperty_QWidget(nativeId(), property == null ? 0 : property.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_QtProperty_QWidget(long __this__nativeId, long property, long parent);

    @QtBlockedSlot
    protected abstract void itemChanged(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item);
    @QtBlockedSlot
    native void __qt_itemChanged_QtBrowserItem(long __this__nativeId, long item);

    @QtBlockedSlot
    protected abstract void itemInserted(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, com.trolltech.solutions.qtpropertybrowser.QtBrowserItem afterItem);
    @QtBlockedSlot
    native void __qt_itemInserted_QtBrowserItem_QtBrowserItem(long __this__nativeId, long item, long afterItem);

    @QtBlockedSlot
    protected abstract void itemRemoved(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item);
    @QtBlockedSlot
    native void __qt_itemRemoved_QtBrowserItem(long __this__nativeId, long item);

    public static native QtAbstractPropertyBrowser fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtAbstractPropertyBrowser(QPrivateConstructor p) { super(p); } 
}
