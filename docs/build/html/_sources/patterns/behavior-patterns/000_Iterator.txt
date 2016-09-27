Iterator
========

(S.1118)

Eine Art Hilfsklasse, die dafür zuständig ist, durch eine Sammlung von Objekten hindurch zu iterieren. Dies trennt somit auch die Zuständigkeiten,
sodass sich die Datenstruktur nur um die Daten kümmern muss und der Iterator um das Ablaufen derselben.

Meist wird ein Interface eines allgemeinen Iterators verwendet («Polymorpher Iterator»), das die Methoden ``Object nextElement()`` sowie ``boolean hasNext()`` vorgibt.

Ein Iterator speichert auch die aktuelle Position der Iteration.

Vorteile
--------
* **Abstraktion und Kapselung:** Die zu durchlaufende Datenstruktur wird gekapselt und kann bei Bedarf im Nachhinein verändert werden, ohne dass dies Änderungen aufseiten von Clients verursacht.
* **Vereinfachung:** Die Realisierung eigener Iteratorklassen für komplexere Datenstrukturen kann dabei helfen, eine ansonsten schwierige Implementierung des Iterationsprozesses zu kapseln, aus der Programmlogik herauszulösen und diese zu vereinfachen.
* **Bessere Lesbarkeit:** Lesbarkeit besser als bei einer ``for``-Schleife

Nachteile
---------
* **Existenz einer alternativen Schreibweise in der Sprache:** Seit Java 5 existiert mit der ``for-each``-Schleife eine Möglichkeit, die Lesbarkeit von Iterationen zu verbessern. Es können beliebige Datenstrukturen durchlaufen werden, die das Interface ``Iterable<T>`` implementieren. Dies wird implizit mit einem ``Iterator<E>`` implementiert - versteckt aber dieses Detail.