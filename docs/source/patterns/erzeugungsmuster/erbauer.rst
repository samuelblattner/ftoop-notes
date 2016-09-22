Erbauer (Builder)
=================
* Ebenfalls eine «Konfigurationsmethode»
* Unterschied zu ```Fabrikmethode```: Es wird eine Instanz des Builders (innere statische Klasse von Produkt) erstellt, die durch gekettete Aufrufe von Konfigurationsmethoden konfiguriert werden kann.
* Dem Produkt wird anschliessend die Instanz des Builders als Konfiguration übergeben.

| **Vorteile**
| \+ Lesbarkeit und Vereinfacung
| \+ Konstruktionssicherheit
| \+ Unterstützung optionaler Attribute
| \- Komplexer
|

Beispiel
--------
.. literalinclude:: ../../../../src/patterns/erzeugungsmuster/erbauer/Vehicle.java
.. literalinclude:: ../../../../src/patterns/erzeugungsmuster/erbauer/Main.java
