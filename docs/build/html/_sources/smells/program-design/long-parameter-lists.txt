Lange Methoden-Parameterlisten (gleichen Typs)
==============================================

Methodensignaturen mit vielen und vor allem ähnlichen Datentypen (aber unterschiedlicher Bedeutung) sind schnell unübersichtlich und können zu fehlerhaften Aufrufen durch den Programmierer führen, insbesondere dann, wenn die Methode überladen wird.

**Bad Smell weil ...**

* Einfaches Vertauschen von Parametern wenn Methode überladen.
* Unübersichtlich

.. literalinclude:: ../../../../src/smells/program_design/MethodParameterLength_Bad.java
   :language: java


**Refactoring**

* Möglichst gleiche Reihenfolge der Parameter in den Überladenen Signaturen.
* Nach Bedeutung zusammengehörige Parameter möglichst in "Parameter Value Objects" kapseln

.. literalinclude:: ../../../../src/smells/program_design/MethodParameterLength_Good.java
   :language: java