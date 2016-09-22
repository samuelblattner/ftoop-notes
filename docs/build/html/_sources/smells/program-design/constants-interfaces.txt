Magic Numbers
=============

Magic Numbers sind Zahlenwerte, die im Code «hardgecodet» hinterlegt werden (siehe Beispiel).

Bad Smell weil ...
------------------
* Magic Numbers sind semantisch nicht aussagekräftig, sprich: Man weiss nicht auf Anhieb, wofür die Zahl steht.
* Ein Ersetzen einer Magic Number, die an mehreren Stellen vorkommt ist sehr aufwändig und fehleranfällig!

.. literalinclude:: ../../../../src/smells/program_design/MagicNumbers_Bad.java

Refactoring
-----------
* Konstanten verwenden.

.. literalinclude:: ../../../../src/smells/program_design/MagicNumbers_Good.java