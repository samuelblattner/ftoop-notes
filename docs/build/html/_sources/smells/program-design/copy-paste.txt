Copy-Paste Leichen
==================

Oft werden Codeblöcke aufgrund gleicher oder ähnlicher Funktionalität kopiert, woanders eingefügt und leicht abgeändert.

**Bad Smell weil ...**

* Vielfach gehen dabei wichtige Änderungen (z.B. von Variablennamen) vergessen und es kommt zu Fehlverhalten.
* Code wird unübersichtlicher, da vieles ähnlich aussieht.
* Code ist u.U. für den neuen Einsatzzweck nicht optimal, da einfach kopiert.

.. literalinclude:: ../../../../src/smells/program_design/CopyPaste_Bad.java
   :language: java
