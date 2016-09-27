Proxy
=====

(S.1142)

Ein **Proxy** ist eine «vorgeschaltete» Klasse, die den Zugriff auf eine andere Klasse regelt. Beide, Proxy wie auch Hauptklasse, implementieren dasselbe Interface.

Es existieren drei Typen von Proxies:

* **Remote Proxy:** Betreut im Hintergrund einen entfernten Service (z.B. Webservice), erweckt aber den Eindruck, dass es sich um ein lokales Objekt handelt.
* **Lazy Init Proxy:** Erzeugt die Hauptklasse erst zum Zeitpunkt des Gebrauchs. => Erhöht Performance, da ressourcenschonend.
* **Access Control Proxy:** Regelt Zugriff und Berechtigungen auf die Hauptklasse.

Vorteile
--------
* **Steuerung von Funktionalität:** Ähnlich zur Decorator-Pattern kann die Basisfunktionalität erweitert werden. Steuerung steht aber im Vordergrund.

Nachteile
---------
* **Aufwand durch Delegation** Besonders wenn die Hauptklasse viele Methoden besitzt.
