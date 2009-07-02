package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtGroupBoxPropertyBrowser extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser
{


    public QtGroupBoxPropertyBrowser() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
    public QtGroupBoxPropertyBrowser(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QtGroupBoxPropertyBrowser_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtGroupBoxPropertyBrowser_QWidget(long parent);

    @QtBlockedSlot
    protected void itemChanged(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemChanged_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_itemChanged_QtBrowserItem(long __this__nativeId, long item);

    @QtBlockedSlot
    protected void itemInserted(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, com.trolltech.solutions.qtpropertybrowser.QtBrowserItem afterItem)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemInserted_QtBrowserItem_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId(), afterItem == null ? 0 : afterItem.nativeId());
    }
    @QtBlockedSlot
    native void __qt_itemInserted_QtBrowserItem_QtBrowserItem(long __this__nativeId, long item, long afterItem);

    @QtBlockedSlot
    protected void itemRemoved(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_itemRemoved_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_itemRemoved_QtBrowserItem(long __this__nativeId, long item);

    public static native QtGroupBoxPropertyBrowser fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    protected QtGroupBoxPropertyBrowser(QPrivateConstructor p) { super(p); } 
}
