Null-Objekt (S.1120)
====================

Statt bei ungültigen Anfragen oder leeren Mengen ``null`` zurückzugeben, wird von der verwendeten Klasse eine «Null-Objekt»-Variante implementiert. Dies kann einerseits durch
eine Unterklasse implementiert sein, wobei sämtliche Funktionen angepasst oder entfernt werden müssten. Vorzuziehen ist allerdings - falls die Hauptklasse ein Interface implementiert -
eine Null-Objekt-Klasse gegen dieses Interface zu realisieren. Dies verhindert, dass versehentlich vergessene Restfunktionalitäten in der Unterklasse trotzdem
aufgerufen werden könnten.

Dieses Pattern hat den Vorteil, dass kein Rückgabewert ``null`` vorkommt, der speziell evaluiert werden müsste.

Implementierung der Methoden
----------------------------
Um die «Null»-Eigenschaft auszudrücken, müssen Methoden für die Null-Objekt-Unterklasse nach folgenden Tipps implementiert/angepasst werden:

* Alle ``void``-Methoden werden leer implementiert.
* ``boolean``-Methoden geben häufig false zurück (z.B. für ``hasNext()``)
* Für ``int``bieten sich of 0 oder -1 als Rückgabewerte an (z.B. für ``getSize()``)
* Gleiches gilt für weitere Zahlentypen (float, double, etc.)
* Für Strings bietet sich ein Leerstring als Rückgabe an.
* Für Objektreferenzen kann entweder rekursiv das NULL-OBJEKT-Muster angewendet oder aber der Wert ``null`` zurückgegeben werden. Manchmal bietet sich auch das Auslösen einer NoSuchElementException an.
* Für untypisierte Container sind im Collections-Framework die NULL-OBJEKT-Konstanten ``EMPTY_SET, EMPTY_LIST`` oder `ÈMPTY_MAP`` definiert. Für generische Typen existieren die Methoden ``emptySet(), emptyList()`` und ``emptyMap()``, die typsichere, leere und unmodifizierbare Container zurückliefern.
* Arrays sollten mit ``new ArrayType[0]`` als leeres Array zurückgegeben werden.
* Für Methoden, deren Rückgabewert für ein Null-Objekt nicht sinnvoll gewählt werden kann, sollte eine ``UnsupportedOperationException`` geworfen werden.

Vorteile
--------
* **Bessere Lesbarkeit und keine Spezialbehandlungen:** Anwendungscode kann auf Spezialbehandlungen verzichten und ist lesbarer.

Nachteile
---------
* **Konzeptionelle Probleme:** Manchmal kann es schwierig sein, einen geeigneten Rückgabewert für eine best. Methode zu finden und es muss eine Exception geworfen werden.
* **Fehlerverschleierung möglich:** In best. Fällen ist es entscheidend zwischen den Fällen «es gibt *ein* Objekt» und «es gibt *kein* Objekt» zu unterscheiden. Diese Pattern kann in solchen Fällen zu Undeutlichkeiten führen.
