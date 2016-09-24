Zusammengehörende Konstanten nicht als Typ definiert (S.956)
============================================================

Zusammenhängede Konstanten werden 'lose' definiert (z.B. Konstanten für Befehle mittels int).

**Bad Smell, weil...**

* Beim Aufruf der verwendenden Funktion wäre theoretisch auch jeder andere int-Wert möglich => Fehlerpotenzial!
* Es wäre eine Wertebereichsüberprüfung nötig, um ungültige Werte auszuschliessen.
* Wertebereichsüberprüfung aufwändig, wenn neue gültige Werte hinzugefügt werden sollen.

.. literalinclude:: ../../../../src/smells/program_design/EnumConstants_Bad.java

**Refactorings**

* Zusammenhängende Konstanten als Typ (mit enum) lösen.

.. literalinclude:: ../../../../src/smells/program_design/EnumConstants_Good.java



