Observer
========

(S.1144)

Diese Pattern ermöglich es Klassen, sich bei einer anderen Klasse als «Interessenten» anzumelden. Sie werden bei jeder Statusänderung des Hauptobjektes über den neuen Zustand informiert.

Es gibt dabei zwei Varianten:
* **Pull:** Die Interessenten werden nur darüber informiert, *dass* eine Änderung stattgefunden hat. *Was* sich genau geändert hat und alle weiteren Details müssen sie sich selber über eine ``get()``-Methode holen. Dies bedingt aber auch, dass die Interessenten stets eine Referenz auf das beobachtete Objekt behalten.
* **Push:** Sämtliche Informationen zur Statusänderung werden an die Interessenten «gepusht». Sie benötigen somit keine Referenz auf das beobachtete Objekt. Allerdings müssen hier auch immer *alle* Informationen übermittelt werden, da das beobachtete Objekt nichts von den Bedürfnissen der Interessenten weiss.

Beobachtung mehrerer Objekte
----------------------------
Beobachtet ein Interessent mehrere Objekte, so ist es wichtig, dass bei der ``update()``-Methode stets die Referenz zum beobachteten Objekt mitgesendet wird. Ansonsten weiss der Interessent nicht, welches seiner beobachteten Objekte gerade sendet.

Einschränkung des Subjekt-Zugriffs
----------------------------------
Da Interessenten u.U. eine Referenz auf das beobachtete Objekt halten und weil allgemeine ``update()``-Methoden eher schlechter lesbar sind, sollte die Beobachtung
über ein spezifisches Interface geschehen, z.B. ``nameChanged``. Dies hat zum Vorteil, dass sprechende, leicht lesbare Methodennamen verwendet werden. Zudem sollte der get-Zugriff, um
den Zustand abzurufen ebenfalls über ein Interface mit der Methode ``getState()`` erfolgen, um den Aufruf anderer Methoden zu verhindern.

Vorteile
--------
* **Lose Kopplung:** Insbesondere wenn sich Subjekt und Beobachter nicht kennen (über Interfaces) => Einfache Erweiterbarkeit.
* **Flexibilität:** Anzahl Interessenten kann zur Laufzeit erhöht und vermindert werden. Beobachter beeinflussen sich nicht gegenseitig.

Nachteile
---------
* **Fehlende Reaktion:** Das Subjekt weiss nicht, ob ein Beobachter auf ein Ereignis reagieren wird. Er könnte es einfach ignorieren.
* **Probleme der Statusänderung:** Subjekt weiss nicht, wie Beobachter reagiert. Im schlimmsten fall könnte die Reaktion sehr lange dauern oder zur Blockade führen. => Asynchrone Abarbeitung in Betracht ziehen.
* **Komplexität:** Schwierig, den ganzen Prozess threadsicher zu gestalten. Neue Interessenten sollten als Kompromiss nur nachfolgende Benachrichtigungen erhalten.
* **Nachvollziehbarkeit:** Häufig gibt es sehr viele Benachrichtigungen => Ablauf schwer nachzuvollziehen (Debugging)
* **Gefahr von Zyklen(!):** Werden Beobachter ebenfalls beobachtet, ist die Gefahr von unerklärbaren Effekten und Endlosschlaufen gross!