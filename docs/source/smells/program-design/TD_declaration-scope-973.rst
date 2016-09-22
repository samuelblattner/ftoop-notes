Lange Methoden-Parameterlisten (gleichen Typs)
==============================================

Methodensignaturen mit vielen und vor allem ähnlichen Datentypen sind schnell unübersichtlich und können zu fehlerhaften Aufrufen durch den Programmierer führen, insbesondere dann, wenn die Methode überladen wird.

Bad Smell weil ...
------------------
* Einfaches Vertauschen von Parametern wenn Methode überladen.
* Unübersichtlich

.. literalinclude:: ../../../../src/smells/program_design/CopyPaste_Bad.java
   :language: java
