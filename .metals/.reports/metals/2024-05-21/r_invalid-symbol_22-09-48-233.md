### scala.meta.internal.mtags.IndexingExceptions$InvalidSymbolException: /ExecFormats#

Symbol: /ExecFormats#

#### Error stacktrace:

```
scala.meta.internal.mtags.OnDemandSymbolIndex.definitions(OnDemandSymbolIndex.scala:61)
	scala.meta.internal.metals.WorkspaceSearchVisitor.definition(WorkspaceSearchVisitor.scala:92)
	scala.meta.internal.metals.WorkspaceSearchVisitor.expandClassfile(WorkspaceSearchVisitor.scala:129)
	scala.meta.internal.metals.WorkspaceSearchVisitor.visitClassfile(WorkspaceSearchVisitor.scala:119)
	scala.meta.internal.metals.ClasspathSearch.$anonfun$search$5(ClasspathSearch.scala:50)
	scala.meta.internal.metals.ClasspathSearch.$anonfun$search$5$adapted(ClasspathSearch.scala:40)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:619)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:617)
	scala.collection.AbstractIterator.foreach(Iterator.scala:1303)
	scala.meta.internal.metals.ClasspathSearch.search(ClasspathSearch.scala:40)
	scala.meta.internal.metals.WorkspaceSymbolProvider.search(WorkspaceSymbolProvider.scala:93)
	scala.meta.internal.metals.WorkspaceSymbolProvider.searchExactFrom(WorkspaceSymbolProvider.scala:83)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$fromSearch$5(DefinitionProvider.scala:197)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$fromSearch$4(DefinitionProvider.scala:170)
	scala.Option.flatMap(Option.scala:283)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$fromSearch$3(DefinitionProvider.scala:169)
	scala.Option.flatMap(Option.scala:283)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$fromSearch$2(DefinitionProvider.scala:168)
	scala.Option.flatMap(Option.scala:283)
	scala.meta.internal.metals.DefinitionProvider.fromSearch(DefinitionProvider.scala:166)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$definition$3(DefinitionProvider.scala:125)
	scala.Option.orElse(Option.scala:477)
	scala.meta.internal.metals.DefinitionProvider.$anonfun$definition$2(DefinitionProvider.scala:125)
	scala.concurrent.impl.Promise$Transformation.run(Promise.scala:467)
	java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136)
	java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635)
	java.base/java.lang.Thread.run(Thread.java:833)
```
#### Short summary: 

scala.meta.internal.mtags.IndexingExceptions$InvalidSymbolException: /ExecFormats#