Singleton
=========
* Max. 1 Instanz soll existieren
* Z.B. zentrale Registrierung oder Ressourcen-Handler
* Privater Konstruktor


| **Vorteile**
| \+ Zentraler Zugriffspunkt
| \+ Strukturierung
| \- Mehrer Instanzen bei mehreren ClassLoadern möglich (z.B. Webserver)
|
| **Hinweis**
| Benutzen von Lazy-Instance (Erzeugung Instanz erst bei Gebrauch) ist nicht zu empfehlen, da die getInstance()-Methode dann synchronized sein müsste und einen potentiellen Flaschenhals darstellt. Deshalb: Lieber bereits zur Ladezeit eine Instanz erzeugen.
|

Beispiel
--------
.. literalinclude:: ../../../../src/patterns/erzeugungsmuster/singleton/Singleton.java
