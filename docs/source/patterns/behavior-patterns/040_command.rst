Command
=======

(S.1134)

Diese Pattern stellt eine Wiederverwendbarkeit von Abläufen («Commands») zur Verfügung. Dabei werden individuelle Commands (z.B. LoadCommand, SaveCommand, etc.)
gegen ein Interface ``ICommand`` implementiert, das z.B. eine Methode ``execute()`` vorschreibt.

Die Commands werden zwar von einer Aufrufenden Komponente erzeugt, sollten aber nicht auch von ihr aufgerufen werden. Stattdessen eignet sich eine separate
Aufrufer-Klasse («CommandExecutor») dafür. Diese kümmert sich nebst dem Threadsicheren Aufruf der Commands auch darum, den Commands den nötigen «Execution Context» bereitzustellen.
Dieser Kontext wird in Form eines Value-Objects implementiert und enthält z.B. Referenzen auf Objekte, die für die Ausführung des Commands benötigt werden.

Dem Command werden somit bei seiner Erzeugung bereits `Spezifikationsdaten` übergeben, die `Ausführungsdaten` werden aber erst bei der Ausführung durch den «CommandExecutor» übergeben.

Vorteile
--------
* **Lose Kopplung:** Aufrufer und ausführende Einheit sind klar getrennt, Commands können von überall her aufgerufen werden.
* **Bessere Abstraktion:** In einem Befehl werden verschiedene auszuführende Methodenaufrufe an einer Stelle gebündelt.
* **Wiederverwendbarkeit**
* **Fernsteuerung:** Speicherung bzw. Aufzeichnung und ``Undo``-Funktion der Befehle ist möglich.

Nachteile
---------
* **Erhöhter Umfang**
