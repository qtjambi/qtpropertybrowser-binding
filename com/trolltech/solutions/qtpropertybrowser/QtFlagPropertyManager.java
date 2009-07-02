package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtFlagPropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.util.List<java.lang.String>> flagNamesChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.util.List<java.lang.String>>();

    private final void flagNamesChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.util.List<java.lang.String> names)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_flagNamesChanged_QtProperty_List(nativeId(), property == null ? 0 : property.nativeId(), names);
    }
    native void __qt_flagNamesChanged_QtProperty_List(long __this__nativeId, long property, java.util.List<java.lang.String> names);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_valueChanged_QtProperty_int(long __this__nativeId, long property, int val);


    public QtFlagPropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtFlagPropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtFlagPropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtFlagPropertyManager_QObject(long parent);

    @QtBlockedSlot
    public final java.util.List<java.lang.String> flagNames(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_flagNames_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_flagNames_QtProperty(long __this__nativeId, long property);

    public final void setFlagNames(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.util.List<java.lang.String> names)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setFlagNames_QtProperty_List(nativeId(), property == null ? 0 : property.nativeId(), names);
    }
    native void __qt_setFlagNames_QtProperty_List(long __this__nativeId, long property, java.util.List<java.lang.String> names);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_setValue_QtProperty_int(long __this__nativeId, long property, int val);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtBoolPropertyManager subBoolPropertyManager()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subBoolPropertyManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtBoolPropertyManager __qt_subBoolPropertyManager(long __this__nativeId);

    @QtBlockedSlot
    public final int value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_value_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    protected void initializeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
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
    protected java.lang.String valueText(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueText_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_valueText_QtProperty(long __this__nativeId, long property);

    public static native QtFlagPropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtFlagPropertyManager(QPrivateConstructor p) { super(p); } 
}
