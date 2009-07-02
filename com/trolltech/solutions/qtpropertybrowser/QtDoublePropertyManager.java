package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtDoublePropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer> decimalsChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Integer>();

    private final void decimalsChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int prec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_decimalsChanged_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), prec);
    }
    native void __qt_decimalsChanged_QtProperty_int(long __this__nativeId, long property, int prec);
    public final Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double, java.lang.Double> rangeChanged = new Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double, java.lang.Double>();

    private final void rangeChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double minVal, double maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rangeChanged_QtProperty_double_double(nativeId(), property == null ? 0 : property.nativeId(), minVal, maxVal);
    }
    native void __qt_rangeChanged_QtProperty_double_double(long __this__nativeId, long property, double minVal, double maxVal);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double> singleStepChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double>();

    private final void singleStepChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_singleStepChanged_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), step);
    }
    native void __qt_singleStepChanged_QtProperty_double(long __this__nativeId, long property, double step);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Double>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_valueChanged_QtProperty_double(long __this__nativeId, long property, double val);


    public QtDoublePropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtDoublePropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtDoublePropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtDoublePropertyManager_QObject(long parent);

    @QtBlockedSlot
    public final int decimals(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_decimals_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_decimals_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final double maximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native double __qt_maximum_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final double minimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native double __qt_minimum_QtProperty(long __this__nativeId, long property);

    public final void setDecimals(com.trolltech.solutions.qtpropertybrowser.QtProperty property, int prec)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setDecimals_QtProperty_int(nativeId(), property == null ? 0 : property.nativeId(), prec);
    }
    native void __qt_setDecimals_QtProperty_int(long __this__nativeId, long property, int prec);

    public final void setMaximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), maxVal);
    }
    native void __qt_setMaximum_QtProperty_double(long __this__nativeId, long property, double maxVal);

    public final void setMinimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double minVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), minVal);
    }
    native void __qt_setMinimum_QtProperty_double(long __this__nativeId, long property, double minVal);

    public final void setRange(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double minVal, double maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_QtProperty_double_double(nativeId(), property == null ? 0 : property.nativeId(), minVal, maxVal);
    }
    native void __qt_setRange_QtProperty_double_double(long __this__nativeId, long property, double minVal, double maxVal);

    public final void setSingleStep(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double step)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSingleStep_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), step);
    }
    native void __qt_setSingleStep_QtProperty_double(long __this__nativeId, long property, double step);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, double val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_double(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_setValue_QtProperty_double(long __this__nativeId, long property, double val);

    @QtBlockedSlot
    public final double singleStep(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_singleStep_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native double __qt_singleStep_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final double value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native double __qt_value_QtProperty(long __this__nativeId, long property);

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

    public static native QtDoublePropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtDoublePropertyManager(QPrivateConstructor p) { super(p); } 
}
