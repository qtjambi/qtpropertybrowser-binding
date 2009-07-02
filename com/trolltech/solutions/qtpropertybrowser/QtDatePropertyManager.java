package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtDatePropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate> rangeChanged = new Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QDate, com.trolltech.qt.core.QDate>();

    private final void rangeChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate minVal, com.trolltech.qt.core.QDate maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_rangeChanged_QtProperty_QDate_QDate(nativeId(), property == null ? 0 : property.nativeId(), minVal == null ? 0 : minVal.nativeId(), maxVal == null ? 0 : maxVal.nativeId());
    }
    native void __qt_rangeChanged_QtProperty_QDate_QDate(long __this__nativeId, long property, long minVal, long maxVal);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QDate> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.core.QDate>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_QDate(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_valueChanged_QtProperty_QDate(long __this__nativeId, long property, long val);


    public QtDatePropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtDatePropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtDatePropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtDatePropertyManager_QObject(long parent);

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate maximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_maximum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_maximum_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate minimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_minimum_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_minimum_QtProperty(long __this__nativeId, long property);

    public final void setMaximum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMaximum_QtProperty_QDate(nativeId(), property == null ? 0 : property.nativeId(), maxVal == null ? 0 : maxVal.nativeId());
    }
    native void __qt_setMaximum_QtProperty_QDate(long __this__nativeId, long property, long maxVal);

    public final void setMinimum(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate minVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setMinimum_QtProperty_QDate(nativeId(), property == null ? 0 : property.nativeId(), minVal == null ? 0 : minVal.nativeId());
    }
    native void __qt_setMinimum_QtProperty_QDate(long __this__nativeId, long property, long minVal);

    public final void setRange(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate minVal, com.trolltech.qt.core.QDate maxVal)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRange_QtProperty_QDate_QDate(nativeId(), property == null ? 0 : property.nativeId(), minVal == null ? 0 : minVal.nativeId(), maxVal == null ? 0 : maxVal.nativeId());
    }
    native void __qt_setRange_QtProperty_QDate_QDate(long __this__nativeId, long property, long minVal, long maxVal);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.core.QDate val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_QDate(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_setValue_QtProperty_QDate(long __this__nativeId, long property, long val);

    @QtBlockedSlot
    public final com.trolltech.qt.core.QDate value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.core.QDate __qt_value_QtProperty(long __this__nativeId, long property);

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

    public static native QtDatePropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtDatePropertyManager(QPrivateConstructor p) { super(p); } 
}
