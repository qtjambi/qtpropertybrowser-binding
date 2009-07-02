package com.trolltech.solutions.qtpropertybrowser;

class QtJambi_LibraryInitializer
{
    static {
        com.trolltech.qt.Utilities.loadJambiLibrary("com_trolltech_solutions_qtpropertybrowser");
        __qt_initLibrary();
    }
    private native static void __qt_initLibrary();
    static void init() { };
}

