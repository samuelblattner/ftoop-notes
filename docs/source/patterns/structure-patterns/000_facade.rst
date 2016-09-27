Fassade
=======

(S.1106)

Fassade kapselt und versteckt Komplexität eines Subsystems. «High-Level Interface».

Vorteile
--------
* Vereinfachung API
* Trennung zwischen Clients un Subsystem reduziert Komplexität, erhöht lose Kopplung.
* Zentralisierung von Funktionalität und Updates: Transaktionsverwaltung möglich, Bündelung

Nachteile
---------
* Gefahr eines breiten Interface / API, zu viele Methoden
* Keine Nutzungsgarantie: Clients könnten weiterhin direkt auf Subsystemklassen zugreifen.
* Mehr Indirektionen: Weiterleitungen von Methodenaufrufen («Indirektionen») werden eingeführt.