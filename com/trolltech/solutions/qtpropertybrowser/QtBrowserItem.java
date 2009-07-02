package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public final class QtBrowserItem extends com.trolltech.qt.QtJambiObject
{

    static {
        com.trolltech.solutions.qtpropertybrowser.QtJambi_LibraryInitializer.init();
    }

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser browser()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_browser(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser __qt_browser(long __this__nativeId);

    @QtBlockedSlot
    public final java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> children()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_children(nativeId());
    }
    @QtBlockedSlot
    native java.util.List<com.trolltech.solutions.qtpropertybrowser.QtBrowserItem> __qt_children(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtBrowserItem parent()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_parent(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtBrowserItem __qt_parent(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtProperty property()    {
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_property(nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.solutions.qtpropertybrowser.QtProperty __qt_property(long __this__nativeId);

    public static native QtBrowserItem fromNativePointer(QNativePointer nativePointer);

    protected QtBrowserItem(QPrivateConstructor p) { super(p); } 
}
