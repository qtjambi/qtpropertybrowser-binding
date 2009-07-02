package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtFontEditorFactory extends com.trolltech.solutions.qtpropertybrowser.QtAbstractEditorFactoryBase
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }


    public QtFontEditorFactory() {
        this((com.trolltech.qt.core.QObject)null);
    }
    public QtFontEditorFactory(com.trolltech.qt.core.QObject parent){
        super((QPrivateConstructor)null);
        __qt_QtFontEditorFactory_QObject(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtFontEditorFactory_QObject(long parent);

    @QtBlockedSlot
    protected final void connectPropertyManager(com.trolltech.solutions.qtpropertybrowser.QtFontPropertyManager manager)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_connectPropertyManager_QtFontPropertyManager(nativeId(), manager == null ? 0 : manager.nativeId());
    }
    @QtBlockedSlot
    native void __qt_connectPropertyManager_QtFontPropertyManager(long __this__nativeId, long manager);

    @QtBlockedSlot
    protected final com.trolltech.qt.gui.QWidget createEditor(com.trolltech.solutions.qtpropertybrowser.QtFontPropertyManager manager, com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QWidget parent)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_createEditor_QtFontPropertyManager_QtProperty_QWidget(nativeId(), manager == null ? 0 : manager.nativeId(), property == null ? 0 : property.nativeId(), parent == null ? 0 : parent.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_QtFontPropertyManager_QtProperty_QWidget(long __this__nativeId, long manager, long property, long parent);

    @QtBlockedSlot
    protected final void disconnectPropertyManager(com.trolltech.solutions.qtpropertybrowser.QtFontPropertyManager manager)    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_disconnectPropertyManager_QtFontPropertyManager(nativeId(), manager == null ? 0 : manager.nativeId());
    }
    @QtBlockedSlot
    native void __qt_disconnectPropertyManager_QtFontPropertyManager(long __this__nativeId, long manager);

    public static native QtFontEditorFactory fromNativePointer(QNativePointer nativePointer);

    protected QtFontEditorFactory(QPrivateConstructor p) { super(p); } 
}
