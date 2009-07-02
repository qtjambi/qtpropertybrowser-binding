A few notes:
I have created a binding for the QtPropertyBrowser. I focus on the
TreePropertyBrowser, so this is the only browser type i have experiences with.
The Binding works, but some problems do exist. If i click on an item inside the
TreePropertyBrowser, everytime a new QtBrowserItem gets instantiated, so the underlying
QtProperty (belonging to the QtBrowserItem) does too (worse, everytime i call the
.property() method of the QtBrowserItem, a new QtProperty gets instantiated).
This behavior makes it very hard (almost impossible) to uniquely identify
the item/property combination, because the java objects always change.
Maybe someone (Eskil?) could have a look on the binding XML,
i think this is the place where the problem has its origin.

Files:
/lib/ -> the compiled c++ part of the QtPropertyBrowser (with mingw)
/com/* -> the java binding
qtjambi-propertybrowser-2.5.jar -> the java binding as .jar file
typesystem_property.xml -> the mapping file for the binding generator