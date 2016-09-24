Fangen der allgemeinsten Exception (S.993)
==========================================

Meist aus Bequemlichkeit wird für alle Exceptions lediglich der allgemeinte Typ Exception gefangen.

**Bad Smell, weil...**

* Fehlerbehandling nicht Zweckorientiert.
* Andere, unbekannte schwerwiegende Fehler können unerkannt bleiben und zu unerklärlichem Fehlverhalten des Programms führen.
* Wertebereichsüberprüfung aufwändig, wenn neue gültige Werte hinzugefügt werden sollen.

**Refactorings**

* Spezifische Exceptions fangen
* Im Falle, dass auf die spezifischen Ausnahmen immer gleich reagiert wird, kann ausnahmsweise Exception gefangen werden.
* Ab JDK 7 steht «Multi Catch» zur Verfügung, um mehrere spezifische Ausnahmen mit einem Catch zu fangen:

.. code-block:: java

 try {
  ...
 } catch (final RemoteException | FinderException | RemoveException ex) {
  ...
 }

