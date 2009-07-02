package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtVariantProperty extends com.trolltech.solutions.qtpropertybrowser.QtProperty
{

    protected QtVariantProperty(com.trolltech.solutions.qtpropertybrowser.QtVariantPropertyManager manager){
        super((QPrivateConstructor)null);
        __qt_QtVariantProperty_QtVariantPropertyManager(manager == null ? 0 : manager.nativeId());
    }

    native void __qt_QtVariantProperty_QtVariantPropertyManager(long manager);

    @QtBlockedSlot
    public final java.lang.Object attributeValue(java.lang.String attribute)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_attributeValue_String(nativeId(), attribute);
    }
    @QtBlockedSlot
    native java.lang.Object __qt_attributeValue_String(long __this__nativeId, java.lang.String attribute);

    @QtBlockedSlot
    public final int propertyType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_propertyType(long __this__nativeId);

    @QtBlockedSlot
    public final void setAttribute(java.lang.String attribute, java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAttribute_String_Object(nativeId(), attribute, value);
    }
    @QtBlockedSlot
    native void __qt_setAttribute_String_Object(long __this__nativeId, java.lang.String attribute, java.lang.Object value);

    @QtBlockedSlot
    public final void setValue(java.lang.Object value)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_Object(nativeId(), value);
    }
    @QtBlockedSlot
    native void __qt_setValue_Object(long __this__nativeId, java.lang.Object value);

    @QtBlockedSlot
    public final java.lang.Object value()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value(nativeId());
    }
    @QtBlockedSlot
    native java.lang.Object __qt_value(long __this__nativeId);

    @QtBlockedSlot
    public final int valueType()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueType(nativeId());
    }
    @QtBlockedSlot
    native int __qt_valueType(long __this__nativeId);

    public static native QtVariantProperty fromNativePointer(QNativePointer nativePointer);

    protected QtVariantProperty(QPrivateConstructor p) { super(p); } 
}
