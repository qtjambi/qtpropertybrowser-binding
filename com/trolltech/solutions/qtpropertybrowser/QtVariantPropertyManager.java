package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtVariantPropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.String, java.lang.Object> attributeChanged = new Signal3<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.String, java.lang.Object>();

    private final void attributeChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.lang.String attribute, java.lang.Object val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_attributeChanged_QtProperty_String_Object(nativeId(), property == null ? 0 : property.nativeId(), attribute, val);
    }
    native void __qt_attributeChanged_QtProperty_String_Object(long __this__nativeId, long property, java.lang.String attribute, java.lang.Object val);
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Object> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, java.lang.Object>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.lang.Object val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_Object(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_valueChanged_QtProperty_Object(long __this__nativeId, long property, java.lang.Object val);


    public QtVariantPropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtVariantPropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtVariantPropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtVariantPropertyManager_QObject(long parent);

    @QtBlockedSlot
    public final int propertyType(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyType_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_propertyType_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final int valueType(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueType_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native int __qt_valueType_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtVariantProperty variantProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_variantProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtVariantProperty __qt_variantProperty_QtProperty(long __this__nativeId, long property);


    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtVariantProperty addProperty(int propertyType) {
        return addProperty(propertyType, (java.lang.String)null);
    }
    @QtBlockedSlot
    public com.trolltech.solutions.qtpropertybrowser.QtVariantProperty addProperty(int propertyType, java.lang.String name)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_addProperty_int_String(nativeId(), propertyType, name);
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtVariantProperty __qt_addProperty_int_String(long __this__nativeId, int propertyType, java.lang.String name);

    @QtBlockedSlot
    public int attributeType(int propertyType, java.lang.String attribute)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeType_int_String(nativeId(), propertyType, attribute);
    }
    @QtBlockedSlot
    native int __qt_attributeType_int_String(long __this__nativeId, int propertyType, java.lang.String attribute);

    @QtBlockedSlot
    public java.lang.Object attributeValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.lang.String attribute)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeValue_QtProperty_String(nativeId(), property == null ? 0 : property.nativeId(), attribute);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_attributeValue_QtProperty_String(long __this__nativeId, long property, java.lang.String attribute);

    @QtBlockedSlot
    public java.util.List<java.lang.String> attributes(int propertyType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributes_int(nativeId(), propertyType);
    }
    @QtBlockedSlot
    native java.util.List<java.lang.String> __qt_attributes_int(long __this__nativeId, int propertyType);

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
    protected void initializeProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_initializeProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native void __qt_initializeProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public boolean isPropertyTypeSupported(int propertyType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isPropertyTypeSupported_int(nativeId(), propertyType);
    }
    @QtBlockedSlot
    native boolean __qt_isPropertyTypeSupported_int(long __this__nativeId, int propertyType);

    public void setAttribute(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.lang.String attribute, java.lang.Object value)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_QtProperty_String_Object(nativeId(), property == null ? 0 : property.nativeId(), attribute, value);
    }
    native void __qt_setAttribute_QtProperty_String_Object(long __this__nativeId, long property, java.lang.String attribute, java.lang.Object value);

    public void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, java.lang.Object val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_Object(nativeId(), property == null ? 0 : property.nativeId(), val);
    }
    native void __qt_setValue_QtProperty_Object(long __this__nativeId, long property, java.lang.Object val);

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
    public java.lang.Object value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value_QtProperty(long __this__nativeId, long property);

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

    @QtBlockedSlot
    public int valueType(int propertyType)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueType_int(nativeId(), propertyType);
    }
    @QtBlockedSlot
    native int __qt_valueType_int(long __this__nativeId, int propertyType);

    public native static int enumTypeId();

    public native static int flagTypeId();

    public native static int groupTypeId();

    public native static int iconMapTypeId();

    public static native QtVariantPropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtVariantPropertyManager(QPrivateConstructor p) { super(p); } 
}
