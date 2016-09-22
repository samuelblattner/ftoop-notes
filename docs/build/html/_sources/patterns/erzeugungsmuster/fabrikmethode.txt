Fabrikmethode (Factory)
=======================
* Ebenfalls eine «Konfigurationsmethode»
* Unterschied zu ```Erzeugungsmethode```: Den Job der Konstruktion übernimmt eine separate Fabrik-Klasse
* Produkte müssen entweder gemeinsames Interface implementieren, gemeinsame abstrakte Klasse erben oder beides!

| **Vorteile**
| \+ Lesbarkeit
| \+ Abstraktion / Kapselung
| \+ Konstruktionssicherheit
| \- Mehraufwand
| \- Komplexer
|

Beispiel
--------
.. literalinclude:: ../../../../src/patterns/erzeugungsmuster/fabrikmethode/Vehicle.java
.. literalinclude:: ../../../../src/patterns/erzeugungsmuster/fabrikmethode/VehicleFactory.java
