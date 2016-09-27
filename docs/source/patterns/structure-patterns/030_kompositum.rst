Kompositum
==========

(S.1114)

Ermöglicht hierarchische Datenstrukturen, wobei sowohl Knotenpunkte als auch «Blätter» dieselben Funktionalitäten aufweisen. Einezlobjekte sowie Komposita können somit
beliebig hierarchisch kombiniert werden. Durch ein gemeinsames Interface können alle Bestandteile der Hierarchie gleich verwendet werden.

Vorteile
--------
* **Vereinfachung:** Zugriff auf Bestandteile einer Hierarchie wird vereinfach, da der Client nicht wissen muss, welches Objekt er gerade anspricht.
* **Strukturierung:** Zugriffe werden strukturiert und Implementierungsdetails lassen sich verstecken.

Nachteile
---------
* **Erschwerter Zugriff auf Spezialisierungen:** Durch das gemeinsame Interface ist der Aufruf von spezialisierten Methoden der einzelnen Bestandteile aufwändiger.
