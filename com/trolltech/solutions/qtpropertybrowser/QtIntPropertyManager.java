package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtIntPropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer, java.lang.Integer> rangeChanged = new Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer, java.lang.Integer>();

    private final void rangeChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int minVal, int maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rangeChanged_QtProperty_int_int(nativeId(), property == null ? 0 : property.nativeId(), minVal, maxVal);
    }
    native void __qt_rangeChanged_QtProperty_int_int(long __this__nativeId, long property, int minVal, int maxVal);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer> singleStepChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer>();

    private final void singleStepChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_singleStepChanged_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), step);
    }
    native void __qt_singleStepChanged_QtProperty_int(long __this__nativeId, long property, int step);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_valueChanged_QtProperty_int(long __this__nativeId, long property, int val);


    public QtIntPropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtIntPropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtIntPropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtIntPropertyManager_QObject(long parent);

    @QtBlockedSlot
    public final int maximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_maximum_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final int minimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_minimum_QtProperty(long __this__nativeId, long property);

    public final void setMaximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), maxVal);
    }
    native void __qt_setMaximum_QtProperty_int(long __this__nativeId, long property, int maxVal);

    public final void setMinimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int minVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), minVal);
    }
    native void __qt_setMinimum_QtProperty_int(long __this__nativeId, long property, int minVal);

    public final void setRange(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int minVal, int maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_QtProperty_int_int(nativeId(), property == null ? 0 : property.nativeId(), minVal, maxVal);
    }
    native void __qt_setRange_QtProperty_int_int(long __this__nativeId, long property, int minVal, int maxVal);

    public final void setSingleStep(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), step);
    }
    native void __qt_setSingleStep_QtProperty_int(long __this__nativeId, long property, int step);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_setValue_QtProperty_int(long __this__nativeId, long property, int val);

    @QtBlockedSlot
    public final int singleStep(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_singleStep_QtProperty(long __this__nativeId, long property);

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

    public static native QtIntPropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtIntPropertyManager(QPrivateConstructor p) { super(p); } 
}
