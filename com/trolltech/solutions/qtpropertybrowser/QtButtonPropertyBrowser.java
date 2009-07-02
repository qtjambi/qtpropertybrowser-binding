package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtButtonPropertyBrowser extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser
{
    public final Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> collapsed = new Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem>();

    private final void collapsed(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_collapsed_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_collapsed_QtBrowserItem(long __this__nativeId, long item);
    public final Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> expanded = new Signal1<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem>();

    private final void expanded(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_expanded_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    native void __qt_expanded_QtBrowserItem(long __this__nativeId, long item);


    public QtButtonPropertyBrowser() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
    public QtButtonPropertyBrowser(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QtButtonPropertyBrowser_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtButtonPropertyBrowser_QWidget(long parent);

    @QtBlockedSlot
    public final boolean isExpanded(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExpanded_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExpanded_QtBrowserItem(long __this__nativeId, long item);

    @QtBlockedSlot
    public final void setExpanded(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, boolean expanded)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpanded_QtBrowserItem_boolean(nativeId(), item == null ? 0 : item.nativeId(), expanded);
    }
    @QtBlockedSlot
    native void __qt_setExpanded_QtBrowserItem_boolean(long __this__nativeId, long item, boolean expanded);

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

    public static native QtButtonPropertyBrowser fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtButtonPropertyBrowser(QPrivateConstructor p) { super(p); } 
}
