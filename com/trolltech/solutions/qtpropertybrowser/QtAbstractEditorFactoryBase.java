package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public abstract class QtAbstractEditorFactoryBase extends com.trolltech.qt.core.QObject
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }

    private static class ConcreteWrapper extends com.trolltech.solutions.qtpropertybrowser.QtAbstractEditorFactoryBase {
        protected ConcreteWrapper(QPrivateConstructor p) { super(p); }

        @Override
        @QtBlockedSlot
        public void addPropertyManager(com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager manager) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_addPropertyManager_QtAbstractPropertyManager(nativeId(), manager == null ? 0 : manager.nativeId());
        }

        @Override
        @QtBlockedSlot
        public com.trolltech.qt.gui.QWidget createEditor(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QWidget parent) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            return super.__qt_createEditor_QtProperty_QWidget(nativeId(), property == null ? 0 : property.nativeId(), parent == null ? 0 : parent.nativeId());
        }

        @Override
        protected void managerDestroyed(com.trolltech.qt.core.QObject manager) {
            com.trolltech.qt.GeneratorUtilities.threadCheck(this);
            if (nativeId() == 0)
                throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
            super.__qt_managerDestroyed_QObject(nativeId(), manager == null ? 0 : manager.nativeId());
        }
    }


    @QtBlockedSlot
    public abstract void addPropertyManager(com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyManager manager);
    @QtBlockedSlot
    native void __qt_addPropertyManager_QtAbstractPropertyManager(long __this__nativeId, long manager);

    @QtBlockedSlot
    public abstract com.trolltech.qt.gui.QWidget createEditor(com.trolltech.solutions.qtpropertybrowser.QtProperty property, com.trolltech.qt.gui.QWidget parent);
    @QtBlockedSlot
    native com.trolltech.qt.gui.QWidget __qt_createEditor_QtProperty_QWidget(long __this__nativeId, long property, long parent);

    protected abstract void managerDestroyed(com.trolltech.qt.core.QObject manager);
    native void __qt_managerDestroyed_QObject(long __this__nativeId, long manager);

    public static native QtAbstractEditorFactoryBase fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    protected QtAbstractEditorFactoryBase(QPrivateConstructor p) { super(p); } 
}
