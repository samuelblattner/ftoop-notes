Annotations
===========

Code-Decorators für Compiler.

Target
------
Mit dem Decorator @Target (ElementType.TYPE) wird angegeben, auf welche Objekte die Annotation angewendet werden kann. ElementType.TYPE bedeutet alle Objekte.
Weitere Typen: ANNOTATION_TYPE(Annotations), CONSTRUCTOR, METHOD, FIELD, PARAMETER und PACKAGE.

Retention Policies
------------------
SOURCE
    Annotation ist nur im Sourcecode vorhanden, wird nicht in Bytecode (.class-Datei) übernommen.
CLASS
    Annotation wird in Bytecode übernommen, stehen zur Laufzeit aber nicht mehr zur Verfügung (default).
RUNTIME
    Annotations stehen auch zur Laufzeit zur Verfügung (über Reflection)

Beispiel 1
----------
.. literalinclude:: ../../../../src/advanced_techniques/annotations/MyAnnotation.java
   :language: java


.. literalinclude:: ../../../../src/advanced_techniques/annotations/AnnotatedClass.java
   :language: java


Beispiel 2
----------
.. literalinclude:: ../../../../src/advanced_techniques/exercises/TODO.java
   :language: java