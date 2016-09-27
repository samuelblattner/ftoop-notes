Template Method («Schablonenmethode»)
=====================================

(S.1123)

Bei dieser Pattern wird eine abstrakte Basisklasse («Schablone») erstellt, die einen bestimmten logischen Ablauf durch Aufruf entsprechender Methoden vorgibt.
Diese aufgerufenen Methoden werden als ``protected`` deklariert, damit sie in Unterklassen überschrieben werden können.

Es gibt dabei Methoden, die freiwillig überschrieben werden *können* und solche, die überschrieben werden *müssen*. Letztere werden in der Basisklasse
als ``abstract``deklariert.

Vorteile
--------
* **Definition von Erweiterungsstellen:** Es wird ein Algorithmus vorgegeben, Funktionalitäten können an bestimmten Stellen überschrieben werden.

Nachteile
---------
* **Weniger Flexibilität:** Algoritmus vorgegeben und schwierig modifizierbar. In diesem Fall ist dieses Verhalten aber erwünscht.

Beispiel
--------

.. literalinclude:: ../../../../src/patterns/verhaltensmuster/template/AirplaneChecklist.java
   :language: java

.. literalinclude:: ../../../../src/patterns/verhaltensmuster/template/CessnaChecklist.java
   :language: java

.. literalinclude:: ../../../../src/patterns/verhaltensmuster/template/TemplatePatternExample.java
   :language: java