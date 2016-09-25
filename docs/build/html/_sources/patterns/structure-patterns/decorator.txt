Decorator (aka «Wrapper») (S.1111)
==================================

Eine bestehende Klasse wird von einer Wrapper-Klasse umhült und erweitert. Grundlage dabei ist ein gemeinsamer Basistyp oder Interface. Eine best. Methode wird dabei erst vom Wrapper aufgerufen und dann vom «gewrappten» Objekt.

Vorteile
--------
* Transparent zusätzliche Funktionalität ohne Vererbung
* Hintereinanderschaltung mehrerer Decorators möglich
* Fexibilität: Zu dekorierende Klasse nicht festgelegt, da nur gegen gemeinsames Interface programmiert wird => Wrapper können für mehrere verschiedene Klassen genutzt werden.
* Vereinfachung von Vererbungshierarchien (im Gegensatz zu Vererbung)

Nachteile
---------
* Gemeinsamer Basistyp benötigt
* Fehlende Kontrolle über Einsatz von Entwickler (z.B. mehrfache Hintereinanderschaltung, sinnvoll?)
* Zugriff auf Spezialisierungen schwieriger möglich
* Implementierungsaufwand