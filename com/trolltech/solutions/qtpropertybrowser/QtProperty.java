package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtProperty extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }

    protected QtProperty(com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager manager){
        super((QPrivateConstructor)null);
        __qt_QtProperty_QtAbstractPropertyManager(manager == null ? 0 : manager.nativeId());
    }

    native void __qt_QtProperty_QtAbstractPropertyManager(long manager);

    @QtBlockedSlot
    public final void addSubProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_addSubProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native void __qt_addSubProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final boolean hasValue()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_hasValue(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_hasValue(long __this__nativeId);

    @QtBlockedSlot
    public final void insertSubProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.solutions.qtpropertybrowser.QtProperty afterProperty)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_insertSubProperty_QtProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId(), afterProperty == null ? 0 : afterProperty.nativeId());
    }
    @QtBlockedSlot
    native void __qt_insertSubProperty_QtProperty_QtProperty(long __this__nativeId, long property, long afterProperty);

    @QtBlockedSlot
    public final boolean isEnabled()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isEnabled(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isEnabled(long __this__nativeId);

    @QtBlockedSlot
    public final boolean isModified()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isModified(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isModified(long __this__nativeId);

    @QtBlockedSlot
    protected final void propertyChanged()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_propertyChanged(nativeId());
    }
    @QtBlockedSlot
    native void __qt_propertyChanged(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager propertyManager()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager __qt_propertyManager(long __this__nativeId);

    @QtBlockedSlot
    public final java.lang.String propertyName()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertyName(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_propertyName(long __this__nativeId);

    @QtBlockedSlot
    public final void removeSubProperty(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_removeSubProperty_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native void __qt_removeSubProperty_QtProperty(long __this__nativeId, long property);

    @QtBlockedSlot
    public final void setEnabled(boolean enable)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setEnabled_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setEnabled_boolean(long __this__nativeId, boolean enable);

    @QtBlockedSlot
    public final void setModified(boolean modified)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setModified_boolean(nativeId(), modified);
    }
    @QtBlockedSlot
    native void __qt_setModified_boolean(long __this__nativeId, boolean modified);

    @QtBlockedSlot
    public final void setPropertyName(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPropertyName_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setPropertyName_String(long __this__nativeId, java.lang.String text);

    @QtBlockedSlot
    public final void setStatusTip(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setStatusTip_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setStatusTip_String(long __this__nativeId, java.lang.String text);

    @QtBlockedSlot
    public final void setToolTip(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setToolTip_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setToolTip_String(long __this__nativeId, java.lang.String text);

    @QtBlockedSlot
    public final void setWhatsThis(java.lang.String text)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setWhatsThis_String(nativeId(), text);
    }
    @QtBlockedSlot
    native void __qt_setWhatsThis_String(long __this__nativeId, java.lang.String text);

    @QtBlockedSlot
    public final java.lang.String statusTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_statusTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_statusTip(long __this__nativeId);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.solutions.qtpropertybrowser.QtProperty> subProperties()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subProperties(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.solutions.qtpropertybrowser.QtProperty> __qt_subProperties(long __this__nativeId);

    @QtBlockedSlot
    public final java.lang.String toolTip()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_toolTip(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_toolTip(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QIcon valueIcon()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueIcon(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QIcon __qt_valueIcon(long __this__nativeId);

    @QtBlockedSlot
    public final java.lang.String valueText()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_valueText(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_valueText(long __this__nativeId);

    @QtBlockedSlot
    public final java.lang.String whatsThis()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_whatsThis(nativeId());
    }
    @QtBlockedSlot
    native java.lang.String __qt_whatsThis(long __this__nativeId);

    public static native QtProperty fromNativePointer(QNativePointer nativePointer);

    protected QtProperty(QPrivateConstructor p) { super(p); } 
}
