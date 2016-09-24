Konstanten in Interfaces definieren (S.954)
===========================================

Entweder werden Interfaces ausschliesslich zur Definition von Konstanten verwendet, oder sie werden zusammen mit Methodendefinitionen aufgeführt.

**Bad Smell, weil...**

* Sichtbarkeit kann nicht eingeschränkt werden, da jede Konstante in einem Interface implizit ```public``` ist.
* Wenn eine Klasse das Interface implementiert ist nur schwer erkennbar, woher die Konstanten effektiv entstammen.
* Wenn eine Klasse das Interface implementiert und eine Subklasse dieser Klasse ein andere Interface implementiert, das zufällig gleiche Konstantennamen definiert, kommt es zu Mehrdeutitgkeiten der Konstanten und das Programm kann nicht kompiliert werden.

**Refactorings**

* Interfaces nicht für Konstantensammlungen verwenden.
* Stattdessen dedizierte Klassen oder enums verwenden.

