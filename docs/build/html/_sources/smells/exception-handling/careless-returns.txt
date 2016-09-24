Unbedachter Rückgabewert (S.996)
================================

Bei Methoden mit einem Objekt als Rückgabewert, wird oft null zurückgegeben, z.B. falls der Eingabewert ungültig oder leer ist.

**Bad Smell, weil...**

* Rückgabewert null unerwartet, da Signatur z.B. String als Rückgabewert definiert => Potentielle NullPointerException
* Null-Rückgabewerte müssen als Randfall speziell behandelt werden

**Refactorings**

* Im Falle eines String-Rückgabewertes lieber einen leeren String verwenden
