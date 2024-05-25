error id: RH7/Xq/bRt2JefeVoBZtEQ==
### Bloop error:

Unexpected error when compiling suniform: java.nio.file.NoSuchFileException: <WORKSPACE>/.bloop/suniform/bloop-bsp-clients-classes/classes-Metals-vDVr6tuSRHmpp0nMtpYaRA==/dive/suniform/api/NewIssue$Error$StringValidation.class
	at java.base/sun.nio.fs.UnixException.translateToIOException(UnixException.java:92)
	at java.base/sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:106)
	at java.base/sun.nio.fs.UnixException.rethrowAsIOException(UnixException.java:111)
	at java.base/sun.nio.fs.UnixFileSystemProvider.implDelete(UnixFileSystemProvider.java:248)
	at java.base/sun.nio.fs.AbstractFileSystemProvider.delete(AbstractFileSystemProvider.java:105)
	at java.base/java.nio.file.Files.delete(Files.java:1152)
	at bloop.Compiler$$anon$2.$anonfun$trigger$12(Compiler.scala:559)
	at bloop.Compiler$$anon$2.$anonfun$trigger$12$adapted(Compiler.scala:551)
	at scala.collection.mutable.HashSet.foreach(HashSet.scala:79)
	at bloop.Compiler$$anon$2.$anonfun$trigger$11(Compiler.scala:551)
	at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:23)
	at monix.eval.internal.TaskRunLoop$.startFull(TaskRunLoop.scala:81)
	at monix.eval.internal.TaskRestartCallback.syncOnSuccess(TaskRestartCallback.scala:101)
	at monix.eval.internal.TaskRestartCallback.onSuccess(TaskRestartCallback.scala:74)
	at monix.eval.internal.TaskShift$Register$$anon$1.run(TaskShift.scala:65)
	at monix.execution.internal.InterceptRunnable.run(InterceptRunnable.scala:27)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	at java.base/java.lang.Thread.run(Thread.java:833)
#### Short summary: 

Unexpected error when compiling suniform: java.nio.file.NoSuchFileException: <WORKSPACE>/.bloop/suni...