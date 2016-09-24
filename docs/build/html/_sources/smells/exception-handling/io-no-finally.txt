I/O ohne finally (S.1004)
=========================

Bei Arbeit mit Stream-Objekten werden neben einem Java-Objekt auch Systemressourcen alloziert. Diese werden bei Zerstörung des Java-Objektes nicht automatisch freigegeben und bedürfen eines manuellen Aufrufs von close().
Meist wird das Öffnen und Schliessen einer Datei innerhalb eines try/catch Blocks ohne finally abgehandelt.

**Bad Smell, weil...**

* Im Fehlerfall wird u.U. die close()-Methode nicht ausgeführt => «verlorene» Ressourcen.
* Null-Rückgabewerte müssen als Randfall speziell behandelt werden

.. literalinclude:: ../../../../src/smells/exception_handling/IONoFinally_Bad.java
   :language: java

**Refactorings**

* Finally-Block verwenden, der in jedem Fall ausgeführt wird

.. literalinclude:: ../../../../src/smells/exception_handling/IONoFinally_Good.java
   :language: java

* Oder ab JDK 7 ARM (Automatic Resource Management) verwenden:

.. literalinclude:: ../../../../src/smells/exception_handling/IONoFinally_Good2.java
:language: java

