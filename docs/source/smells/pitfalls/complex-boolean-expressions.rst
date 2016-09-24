Einsatz komplizierter boolescher Bedingungen (S.1017)
=====================================================

Bedingungen durch Verkettung boolescher Ausdrücke sind oft unbedacht und zu kompliziert geschrieben.

**Beispiel**

.. code-block:: java

    if ((lastWorkingState == false && newWorkingState == true) ||
        (lastWorkingState == true && newWorkingState == false))


**Refactorings**

.. code-block:: java

    if (lastWorkingState != newWorkingState)
