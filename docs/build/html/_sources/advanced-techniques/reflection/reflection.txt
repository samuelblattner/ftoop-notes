Reflection
==========

Die Reflection-API bildet ein Modell der Java-Sprache. Die Reflection-API beschreibt
mittels Klassen wie Method, Constructor, Class, Field, etc. die Elemente von Java.
Mit Reflection kann die Struktur unbekannter Objekte und Klassen zur Laufzeit analysiert
werden. Ausserdem können damit Methoden und Konstruktoren aufgerufen und
Felder gesetzt werden.

**Class-Objekte erhält man über**

* anyObject.getClass()
* AnyClass.class
* Class.forName("fully.qualified.Name")

Vorteile
--------

1. Von der Klasse, die Reflection benutzt, gibt es nie eine direkte (binäre) Abhängigkeit auf die mit Reflection verwendeten Klassen. Sie kann deshalb unabhängig vom Vorhandensein der benutzten Klasse geladen und ausgeführt werden.
2. Die mit Reflection aufgerufenen Klassen müssen z.B. keinen bestimmten Typ haben, sondern nur Methoden mit einer bestimmten Signatur anbieten.
3. Verwendung von Annotations
4. Generische / konfigurierbare Ausführung von Programmen wird möglich.


Nachteile
---------
1. Die Reflection-API arbeitet mit Strings. Dadurch entsteht nur eine implizite Abhängigkeit / Kopplung zu den benutzen Klassen. Bei einer Veränderung der API der benutzten Klassen kann diese (vom Compiler unbemerkt) gebrochen werden.


Beispiel Allgemein
------------------

.. literalinclude:: ../../../../src/advanced_techniques/reflection/DummyClass.java
    :language: java

.. literalinclude:: ../../../../src/advanced_techniques/reflection/Reflection.java
    :language: java

