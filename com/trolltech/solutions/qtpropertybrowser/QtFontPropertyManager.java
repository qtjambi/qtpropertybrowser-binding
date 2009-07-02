package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtFontPropertyManager extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager
{
    public final Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.gui.QFont> valueChanged = new Signal2<com.trolltech.solutions.qtpropertybrowser.QtProperty, com.trolltech.qt.gui.QFont>();

    private final void valueChanged(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QFont val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_valueChanged_QtProperty_QFont(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_valueChanged_QtProperty_QFont(long __this__nativeId, long property, long val);


    public QtFontPropertyManager() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtFontPropertyManager(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtFontPropertyManager_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtFontPropertyManager_QObject(long parent);

    public final void setValue(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QFont val)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setValue_QtProperty_QFont(nativeId(), property == null ? 0 : property.nativeId(), val == null ? 0 : val.nativeId());
    }
    native void __qt_setValue_QtProperty_QFont(long __this__nativeId, long property, long val);

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
    public final com.trolltech.solutions.qtpropertybrowser.QtEnumPropertyManager subEnumPropertyManager()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subEnumPropertyManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtEnumPropertyManager __qt_subEnumPropertyManager(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtIntPropertyManager subIntPropertyManager()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_subIntPropertyManager(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtIntPropertyManager __qt_subIntPropertyManager(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QFont value(com.trolltech.solutions.qtpropertybrowser.QtProperty property)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_value_QtProperty(nativeId(), property == null ? 0 : property.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QFont __qt_value_QtProperty(long __this__nativeId, long property);

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

    public static native QtFontPropertyManager fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtFontPropertyManager(QPrivateConstructor p) { super(p); } 
}
