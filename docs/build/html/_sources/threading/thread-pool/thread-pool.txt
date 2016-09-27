Executor Framework (Thread Pools) (S.557)
=========================================

Callable
--------
Wie Runnable, aber für einen Rückgabetyp vorgesehen. Interface Callable ist wiefolgt definiert:

.. code-block:: java

   public interface Callable<V>
   {
        V call() throws Exception;
   }


Future<V>
---------
Der ExecutorService liefert beim Hinzufügen eines Runnable oder Callable ein Interface Future<V> zurück, das einerseits
den Status des asynchronen Tasks, als auch später das Resultat enthält (via synchronem .get())

.. code-block:: java

   public interface Future<V>
   {
        V get() throws InterruptedException, ExecutionException;
        V get(long timeout, TimeUnit unit) throws
               InterruptedExecution, ExecutionException, TimeoutException;
        boolean cancel (boolean mayInterruptIfRunning);
        boolean isCancelled();
        boolean isDone();
   }


Beispiel
--------

.. literalinclude:: ../../../../src/threading/threadpool/PrimeSpotter.java
   :language: java

.. literalinclude:: ../../../../src/threading/threadpool/OptimusPrime.java
   :language: java