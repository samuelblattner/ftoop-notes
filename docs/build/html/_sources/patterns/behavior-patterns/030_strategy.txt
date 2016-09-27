Strategie
=========

(S.1127)

Ähnlich wie bei der Template-Pattern wird hier ein bestimmter Ablauf vorgegeben, jedoch in einer viel lockereren Weise. Die Hauptfunktionalität wird durch «Strategien» festgelegt.
Strategien sind Klassen, die ein gemeinsames Interface «Strategy» implementieren. Instanzen dieser Klassen werden dann jeweils an eine Instanze der
Steuerklasse übergeben, welche sie ausführt.

Somit können Endresultate der Steuerklasse mit verschiedenen Strategien/Implementierungen erreicht werden, ohne den Aufruf zu verändern.

Vorteile
--------
* **Erhöhte Flexibilität:** Die Auswahl der verschiedenen Strategien kann zur Laufzeit erfolgen. Dadurch erhöht sich die Flexibilität und die Wiederverwendbarkeit.
* **Bessere Erweiterbarkeit:** Strategien haben keine Abhängigkeiten untereinander => Leicht erweiterbar.

Nachteile
---------
* **Kopplung an konkrete Strategien:** Clients müssen die konkreten Strategiklassen kennen.
* **Erhöhter Umfang:** Die Anzahl der Klassen erhöht sich.
