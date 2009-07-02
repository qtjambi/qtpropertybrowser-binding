package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtTimePropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QTime> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QTime>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QTime val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_QTime(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_valueChanged_QtProperty_QTime(long __this__nativeId, long property, long val);


    public QtTimePropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtTimePropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtTimePropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtTimePropertyManager_QObject(long parent);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QTime val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_QTime(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_setValue_QtProperty_QTime(long __this__nativeId, long property, long val);

    @QtBlockedSlot
    public final com.trolltech.qt.core.QTime value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QTime __qt_value_QtProperty(long __this__nativeId, long property);

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

    public static native QtTimePropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtTimePropertyManager(QPrivateConstructor p) { super(p); } 
}
