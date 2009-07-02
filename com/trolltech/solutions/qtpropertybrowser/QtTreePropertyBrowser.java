package com.trolltech.solutions.qtpropertybrowser;

import com.trolltech.qt.*;


@QtJambiGeneratedClass
public class QtTreePropertyBrowser extends com.trolltech.solutions.qtpropertybrowser.QtAbstractPropertyBrowser
{
    public enum ResizeMode implements com.trolltech.qt.QtEnumerator {
        Interactive(0),
        Stretch(1),
        Fixed(2),
        ResizeToContents(3);

        ResizeMode(int value) { this.value = value; }
        public int value() { return value; }

        public static ResizeMode resolve(int value) {
            return (ResizeMode) resolve_internal(value);
        }
        private static Object resolve_internal(int value) {
            switch (value) {
            case 0: return Interactive;
            case 1: return Stretch;
            case 2: return Fixed;
            case 3: return ResizeToContents;
            }
            throw new com.trolltech.qt.QNoSuchEnumValueException(value);
        }
        private final int value;

    }

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


    public QtTreePropertyBrowser() {
        this((com.trolltech.qt.gui.QWidget)null);
    }
    public QtTreePropertyBrowser(com.trolltech.qt.gui.QWidget parent){
        super((QPrivateConstructor)null);
        __qt_QtTreePropertyBrowser_QWidget(parent == null ? 0 : parent.nativeId());
    }

    native void __qt_QtTreePropertyBrowser_QWidget(long parent);

    @com.trolltech.qt.QtPropertyReader(name="alternatingRowColors")
    @QtBlockedSlot
    public final boolean alternatingRowColors()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_alternatingRowColors(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_alternatingRowColors(long __this__nativeId);

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor backgroundColor(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_backgroundColor_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_backgroundColor_QtBrowserItem(long __this__nativeId, long item);

    @QtBlockedSlot
    public final com.trolltech.qt.gui.QColor calculatedBackgroundColor(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_calculatedBackgroundColor_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native com.trolltech.qt.gui.QColor __qt_calculatedBackgroundColor_QtBrowserItem(long __this__nativeId, long item);

    @QtBlockedSlot
    public final void editItem(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_editItem_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native void __qt_editItem_QtBrowserItem(long __this__nativeId, long item);

    @com.trolltech.qt.QtPropertyReader(name="indentation")
    @QtBlockedSlot
    public final int indentation()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_indentation(nativeId());
    }
    @QtBlockedSlot
    native int __qt_indentation(long __this__nativeId);

    @QtBlockedSlot
    public final boolean isExpanded(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isExpanded_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isExpanded_QtBrowserItem(long __this__nativeId, long item);

    @com.trolltech.qt.QtPropertyReader(name="headerVisible")
    @QtBlockedSlot
    public final boolean isHeaderVisible()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isHeaderVisible(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isHeaderVisible(long __this__nativeId);

    @QtBlockedSlot
    public final boolean isItemVisible(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_isItemVisible_QtBrowserItem(nativeId(), item == null ? 0 : item.nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_isItemVisible_QtBrowserItem(long __this__nativeId, long item);

    @com.trolltech.qt.QtPropertyReader(name="propertiesWithoutValueMarked")
    @QtBlockedSlot
    public final boolean propertiesWithoutValueMarked()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_propertiesWithoutValueMarked(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_propertiesWithoutValueMarked(long __this__nativeId);

    @com.trolltech.qt.QtPropertyReader(name="resizeMode")
    @QtBlockedSlot
    public final com.trolltech.solutions.qtpropertybrowser.QtTreePropertyBrowser.ResizeMode resizeMode()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return com.trolltech.solutions.qtpropertybrowser.QtTreePropertyBrowser.ResizeMode.resolve(__qt_resizeMode(nativeId()));
    }
    @QtBlockedSlot
    native int __qt_resizeMode(long __this__nativeId);

    @com.trolltech.qt.QtPropertyReader(name="rootIsDecorated")
    @QtBlockedSlot
    public final boolean rootIsDecorated()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_rootIsDecorated(nativeId());
    }
    @QtBlockedSlot
    native boolean __qt_rootIsDecorated(long __this__nativeId);

    @com.trolltech.qt.QtPropertyWriter(name="alternatingRowColors")
    @QtBlockedSlot
    public final void setAlternatingRowColors(boolean enable)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setAlternatingRowColors_boolean(nativeId(), enable);
    }
    @QtBlockedSlot
    native void __qt_setAlternatingRowColors_boolean(long __this__nativeId, boolean enable);

    @QtBlockedSlot
    public final void setBackgroundColor(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, com.trolltech.qt.gui.QColor color)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setBackgroundColor_QtBrowserItem_QColor(nativeId(), item == null ? 0 : item.nativeId(), color == null ? 0 : color.nativeId());
    }
    @QtBlockedSlot
    native void __qt_setBackgroundColor_QtBrowserItem_QColor(long __this__nativeId, long item, long color);

    @QtBlockedSlot
    public final void setExpanded(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, boolean expanded)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setExpanded_QtBrowserItem_boolean(nativeId(), item == null ? 0 : item.nativeId(), expanded);
    }
    @QtBlockedSlot
    native void __qt_setExpanded_QtBrowserItem_boolean(long __this__nativeId, long item, boolean expanded);

    @com.trolltech.qt.QtPropertyWriter(name="headerVisible")
    @QtBlockedSlot
    public final void setHeaderVisible(boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setHeaderVisible_boolean(nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setHeaderVisible_boolean(long __this__nativeId, boolean visible);

    @com.trolltech.qt.QtPropertyWriter(name="indentation")
    @QtBlockedSlot
    public final void setIndentation(int i)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setIndentation_int(nativeId(), i);
    }
    @QtBlockedSlot
    native void __qt_setIndentation_int(long __this__nativeId, int i);

    @QtBlockedSlot
    public final void setItemVisible(com.trolltech.solutions.qtpropertybrowser.QtBrowserItem item, boolean visible)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setItemVisible_QtBrowserItem_boolean(nativeId(), item == null ? 0 : item.nativeId(), visible);
    }
    @QtBlockedSlot
    native void __qt_setItemVisible_QtBrowserItem_boolean(long __this__nativeId, long item, boolean visible);

    @com.trolltech.qt.QtPropertyWriter(name="propertiesWithoutValueMarked")
    @QtBlockedSlot
    public final void setPropertiesWithoutValueMarked(boolean mark)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setPropertiesWithoutValueMarked_boolean(nativeId(), mark);
    }
    @QtBlockedSlot
    native void __qt_setPropertiesWithoutValueMarked_boolean(long __this__nativeId, boolean mark);

    @com.trolltech.qt.QtPropertyWriter(name="resizeMode")
    @QtBlockedSlot
    public final void setResizeMode(com.trolltech.solutions.qtpropertybrowser.QtTreePropertyBrowser.ResizeMode mode)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setResizeMode_ResizeMode(nativeId(), mode.value());
    }
    @QtBlockedSlot
    native void __qt_setResizeMode_ResizeMode(long __this__nativeId, int mode);

    @com.trolltech.qt.QtPropertyWriter(name="rootIsDecorated")
    @QtBlockedSlot
    public final void setRootIsDecorated(boolean show)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setRootIsDecorated_boolean(nativeId(), show);
    }
    @QtBlockedSlot
    native void __qt_setRootIsDecorated_boolean(long __this__nativeId, boolean show);

    @com.trolltech.qt.QtPropertyWriter(name="splitterPosition")
    @QtBlockedSlot
    public final void setSplitterPosition(int position)    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        __qt_setSplitterPosition_int(nativeId(), position);
    }
    @QtBlockedSlot
    native void __qt_setSplitterPosition_int(long __this__nativeId, int position);

    @com.trolltech.qt.QtPropertyReader(name="splitterPosition")
    @QtBlockedSlot
    public final int splitterPosition()    {
        com.trolltech.qt.GeneratorUtilities.threadCheck(this);
        if (nativeId() == 0)
            throw new QNoNativeResourcesException("Function call on incomplete object of type: " +getClass().getName());
        return __qt_splitterPosition(nativeId());
    }
    @QtBlockedSlot
    native int __qt_splitterPosition(long __this__nativeId);

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

    public static native QtTreePropertyBrowser fromNativePointer(QNativePointer nativePointer);

    private static native long originalMetaObject();

    @Override
    @QtBlockedSlot protected boolean __qt_signalInitialization(String name) {
        return (__qt_signalInitialization(nativeId(), name)
                || super.__qt_signalInitialization(name));
    }

    @QtBlockedSlot
    private native boolean __qt_signalInitialization(long ptr, String name);

    protected QtTreePropertyBrowser(QPrivateConstructor p) { super(p); } 
}
