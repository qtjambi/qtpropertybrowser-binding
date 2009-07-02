package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QtAbstractPropertyManager extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        protected void initializeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_initializeProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
        }
    }

    public final Signal1<com.trolltech.solutions.qtpropertybrowser.QtProperty> propertyChanged = new Signal1<com.trolltech.solutions.qtpropertybrowser.QtProperty>();

    private final void propertyChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_propertyChanged_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    native void __qt_propertyChanged_QtProperty(long __this__nativeId, long property);
    public final Signal1<com.trolltech.solutions.qtpropertybrowser.QtProperty> propertyDestroyed = new Signal1<com.trolltech.solutions.qtpropertybrowser.QtProperty>();

    private final void propertyDestroyed(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_propertyDestroyed_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    native void __qt_propertyDestroyed_QtProperty(long __this__nativeId, long property);
    public final Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty> propertyInserted = new Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty>();

    private final void propertyInserted(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.solutions.qtpropertybrowser.QtProperty parent, com.trolltech.solutions.qtpropertybrowser.QtProperty after)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_propertyInserted_QtProperty_QtProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId(), parent == null ? 0 : parent.nativeId(), after == null ? 0 : after.nativeId());
    }
    native void __qt_propertyInserted_QtProperty_QtProperty_QtProperty(long __this__nativeId, long property, long parent, long after);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty> propertyRemoved = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.solutions.qtpropertybrowser.QtProperty>();

    private final void propertyRemoved(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.solutions.qtpropertybrowser.QtProperty parent)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_propertyRemoved_QtProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    native void __qt_propertyRemoved_QtProperty_QtProperty(long __this__nativeId, long property, long parent);


    public QtAbstractPropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtAbstractPropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtAbstractPropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtAbstractPropertyManager_QObject(long parent);


    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtProperty addProperty() {
        return addProperty((java.lang.String)null);
    }
    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtProperty addProperty(java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addProperty_String(nativeId(), name);
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtProperty __qt_addProperty_String(long __this__nativeId, java.lang.String name);

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
    public final java.util.Set<com.trolltech.solutions.qtpropertybrowser.QtProperty> browserProperties()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_browserProperties(nativeId());
    }
    @QtBlockedSlot
    native java.util.Set<com.trolltech.solutions.qtpropertybrowser.QtProperty> __qt_browserProperties(long __this__nativeId);

    @QtBlockedSlot
    protected com.trolltech.solutions.qtpropertybrowser.QtProperty createProperty()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createProperty(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtProperty __qt_createProperty(long __this__nativeId);

    @QtBlockedSlot
    protected boolean hasValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasValue_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasValue_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    protected abstract void initializeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property);
    @QtBlockedSlot
    native void __qt_initializeProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    protected void uninitializeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_uninitializeProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native void __qt_uninitializeProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    protected com.trolltech.qt.gui.QIcon valueIcon(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueIcon_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_valueIcon_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    protected java.lang.String valueText(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueText_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_valueText_QtProperty(long __this__nativeId, long property);

    public static native QtAbstractPropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtAbstractPropertyManager(QPrivateConstructor p) { super(p); } 
}
