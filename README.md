---- Minecraft Crash Report ----
// I bet Cylons wouldn't have this problem.

Time: 2024-05-16 15:22:21
Description: Exception generating new chunk

java.lang.IllegalStateException: Feature order cycle found, involved sources: [Reference{ResourceKey[minecraft:worldgen/biome / mccourse:gardens_caves]=net.minecraft.world.biome.Biome@62f31489}]
	at net.minecraft.world.gen.feature.util.PlacedFeatureIndexer.collectIndexedFeatures(PlacedFeatureIndexer.java:100)
	at net.minecraft.world.gen.chunk.ChunkGenerator.method_44215(ChunkGenerator.java:102)
	at com.google.common.base.Suppliers$NonSerializableMemoizingSupplier.get(Suppliers.java:181)
	at net.minecraft.world.gen.chunk.ChunkGenerator.generateFeatures(ChunkGenerator.java:288)
	at net.minecraft.world.chunk.ChunkStatus.method_51375(ChunkStatus.java:108)
	at net.minecraft.world.chunk.ChunkStatus$SimpleGenerationTask.doWork(ChunkStatus.java:309)
	at net.minecraft.world.chunk.ChunkStatus.runGenerationTask(ChunkStatus.java:252)
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17225(ThreadedAnvilChunkStorage.java:671)
	at com.mojang.datafixers.util.Either$Left.map(Either.java:38)
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17224(ThreadedAnvilChunkStorage.java:660)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at net.minecraft.server.world.ChunkTaskPrioritySystem.method_17634(ChunkTaskPrioritySystem.java:62)
	at net.minecraft.util.thread.TaskExecutor.runNext(TaskExecutor.java:91)
	at net.minecraft.util.thread.TaskExecutor.runWhile(TaskExecutor.java:146)
	at net.minecraft.util.thread.TaskExecutor.run(TaskExecutor.java:102)
	at java.base/java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1423)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:387)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1312)
	at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1843)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1808)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:188)


A detailed walkthrough of the error, its code path and all known details is as follows:
---------------------------------------------------------------------------------------

-- Head --
Thread: Server thread
Stacktrace:
	at net.minecraft.world.gen.feature.util.PlacedFeatureIndexer.collectIndexedFeatures(PlacedFeatureIndexer.java:100)
	at net.minecraft.world.gen.chunk.ChunkGenerator.method_44215(ChunkGenerator.java:102)
	at com.google.common.base.Suppliers$NonSerializableMemoizingSupplier.get(Suppliers.java:181)
	at net.minecraft.world.gen.chunk.ChunkGenerator.generateFeatures(ChunkGenerator.java:288)
	at net.minecraft.world.chunk.ChunkStatus.method_51375(ChunkStatus.java:108)
	at net.minecraft.world.chunk.ChunkStatus$SimpleGenerationTask.doWork(ChunkStatus.java:309)
	at net.minecraft.world.chunk.ChunkStatus.runGenerationTask(ChunkStatus.java:252)
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17225(ThreadedAnvilChunkStorage.java:671)
	at com.mojang.datafixers.util.Either$Left.map(Either.java:38)
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17224(ThreadedAnvilChunkStorage.java:660)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at net.minecraft.server.world.ChunkTaskPrioritySystem.method_17634(ChunkTaskPrioritySystem.java:62)
	at net.minecraft.util.thread.TaskExecutor.runNext(TaskExecutor.java:91)
	at net.minecraft.util.thread.TaskExecutor.runWhile(TaskExecutor.java:146)
	at net.minecraft.util.thread.TaskExecutor.run(TaskExecutor.java:102)

-- Chunk to be generated --
Details:
	Location: -1,-1
	Position hash: -1
	Generator: net.minecraft.world.gen.chunk.NoiseChunkGenerator@7ec49c2c
Stacktrace:
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17225(ThreadedAnvilChunkStorage.java:671)
	at com.mojang.datafixers.util.Either$Left.map(Either.java:38)
	at net.minecraft.server.world.ThreadedAnvilChunkStorage.method_17224(ThreadedAnvilChunkStorage.java:660)
	at java.base/java.util.concurrent.CompletableFuture$UniCompose.tryFire(CompletableFuture.java:1150)
	at java.base/java.util.concurrent.CompletableFuture$Completion.run(CompletableFuture.java:482)
	at net.minecraft.server.world.ChunkTaskPrioritySystem.method_17634(ChunkTaskPrioritySystem.java:62)
	at net.minecraft.util.thread.TaskExecutor.runNext(TaskExecutor.java:91)
	at net.minecraft.util.thread.TaskExecutor.runWhile(TaskExecutor.java:146)
	at net.minecraft.util.thread.TaskExecutor.run(TaskExecutor.java:102)
	at java.base/java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1423)
	at java.base/java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:387)
	at java.base/java.util.concurrent.ForkJoinPool$WorkQueue.topLevelExec(ForkJoinPool.java:1312)
	at java.base/java.util.concurrent.ForkJoinPool.scan(ForkJoinPool.java:1843)
	at java.base/java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1808)
	at java.base/java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:188)

-- Affected level --
Details:
	All players: 0 total; []
	Chunk stats: 625
	Level dimension: minecraft:overworld
	Level spawn location: World: (8,64,8), Section: (at 8,0,8 in 0,4,0; chunk contains blocks 0,-64,0 to 15,319,15), Region: (0,0; contains chunks 0,0 to 31,31, blocks 0,-64,0 to 511,319,511)
	Level time: 0 game time, 0 day time
	Level name: New World
	Level game mode: Game mode: creative (ID 1). Hardcore: false. Cheats: true
	Level weather: Rain time: 0 (now: false), thunder time: 0 (now: false)
	Known server brands: fabric
	Removed feature flags: 
	Level was modded: true
	Level storage version: 0x04ABD - Anvil
Stacktrace:
	at net.minecraft.server.MinecraftServer.createWorlds(MinecraftServer.java:374)
	at net.minecraft.server.MinecraftServer.loadWorld(MinecraftServer.java:322)
	at net.minecraft.server.integrated.IntegratedServer.setupServer(IntegratedServer.java:69)
	at net.minecraft.server.MinecraftServer.runServer(MinecraftServer.java:642)
	at net.minecraft.server.MinecraftServer.method_29739(MinecraftServer.java:263)
	at java.base/java.lang.Thread.run(Thread.java:1583)

-- System Details --
Details:
	Minecraft Version: 1.20.2
	Minecraft Version ID: 1.20.2
	Operating System: Windows 10 (amd64) version 10.0
	Java Version: 21.0.3, Amazon.com Inc.
	Java VM Version: OpenJDK 64-Bit Server VM (mixed mode, sharing), Amazon.com Inc.
	Memory: 162662744 bytes (155 MiB) / 700448768 bytes (668 MiB) up to 6379536384 bytes (6084 MiB)
	CPUs: 8
	Processor Vendor: GenuineIntel
	Processor Name: Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz
	Identifier: Intel64 Family 6 Model 60 Stepping 3
	Microarchitecture: Haswell (Client)
	Frequency (GHz): 3.59
	Number of physical packages: 1
	Number of physical CPUs: 4
	Number of logical CPUs: 8
	Graphics card #0 name: NVIDIA GeForce RTX 3070 Ti
	Graphics card #0 vendor: NVIDIA (0x10de)
	Graphics card #0 VRAM (MB): 4095.00
	Graphics card #0 deviceId: 0x2482
	Graphics card #0 versionInfo: DriverVersion=31.0.15.3623
	Memory slot #0 capacity (MB): 4096.00
	Memory slot #0 clockSpeed (GHz): 1.33
	Memory slot #0 type: DDR3
	Memory slot #1 capacity (MB): 4096.00
	Memory slot #1 clockSpeed (GHz): 1.33
	Memory slot #1 type: DDR3
	Memory slot #2 capacity (MB): 8192.00
	Memory slot #2 clockSpeed (GHz): 1.33
	Memory slot #2 type: DDR3
	Memory slot #3 capacity (MB): 8192.00
	Memory slot #3 clockSpeed (GHz): 1.33
	Memory slot #3 type: DDR3
	Virtual memory max (MB): 34568.83
	Virtual memory used (MB): 14232.24
	Swap memory total (MB): 10240.00
	Swap memory used (MB): 216.33
	JVM Flags: 0 total; 
	Fabric Mods: 
		customportalapi: Custom Portal Api 0.0.1-beta64.5-1.20.2
		fabric-api: Fabric API 0.91.6+1.20.2
		fabric-api-base: Fabric API Base 0.4.33+fce67b32a0
		fabric-api-lookup-api-v1: Fabric API Lookup API (v1) 1.6.43+b1792f7da0
		fabric-biome-api-v1: Fabric Biome API (v1) 13.0.14+b1792f7da0
		fabric-block-api-v1: Fabric Block API (v1) 1.0.12+73761d2ea0
		fabric-block-view-api-v2: Fabric BlockView API (v2) 1.0.1+73761d2ea0
		fabric-blockrenderlayer-v1: Fabric BlockRenderLayer Registration (v1) 1.1.43+f4b7e424a0
		fabric-client-tags-api-v1: Fabric Client Tags 1.1.4+86b12645a0
		fabric-command-api-v1: Fabric Command API (v1) 1.2.37+f71b366fa0
		fabric-command-api-v2: Fabric Command API (v2) 2.2.16+b1792f7da0
		fabric-commands-v0: Fabric Commands (v0) 0.2.54+df3654b3a0
		fabric-containers-v0: Fabric Containers (v0) 0.1.81+df3654b3a0
		fabric-content-registries-v0: Fabric Content Registries (v0) 5.0.6+b1792f7da0
		fabric-convention-tags-v1: Fabric Convention Tags 1.5.8+b1792f7da0
		fabric-crash-report-info-v1: Fabric Crash Report Info (v1) 0.2.20+f4b7e424a0
		fabric-data-generation-api-v1: Fabric Data Generation API (v1) 13.1.11+b1792f7da0
		fabric-dimensions-v1: Fabric Dimensions API (v1) 2.1.57+b1792f7da0
		fabric-entity-events-v1: Fabric Entity Events (v1) 1.5.26+b1792f7da0
		fabric-events-interaction-v0: Fabric Events Interaction (v0) 0.6.10+b1792f7da0
		fabric-events-lifecycle-v0: Fabric Events Lifecycle (v0) 0.2.70+df3654b3a0
		fabric-game-rule-api-v1: Fabric Game Rule API (v1) 1.0.42+a44e16a6a0
		fabric-gametest-api-v1: Fabric Game Test API (v1) 1.2.16+b1792f7da0
		fabric-item-api-v1: Fabric Item API (v1) 2.1.33+b1792f7da0
		fabric-item-group-api-v1: Fabric Item Group API (v1) 4.0.15+e3d2bf3fa0
		fabric-key-binding-api-v1: Fabric Key Binding API (v1) 1.0.38+f4b7e424a0
		fabric-keybindings-v0: Fabric Key Bindings (v0) 0.2.36+df3654b3a0
		fabric-lifecycle-events-v1: Fabric Lifecycle Events (v1) 2.2.28+c8b10480a0
		fabric-loot-api-v2: Fabric Loot API (v2) 2.1.1+3ba460fba0
		fabric-message-api-v1: Fabric Message API (v1) 6.0.2+e3d2bf3fa0
		fabric-mining-level-api-v1: Fabric Mining Level API (v1) 2.1.56+f4b7e424a0
		fabric-model-loading-api-v1: Fabric Model Loading API (v1) 1.0.6+b1792f7da0
		fabric-models-v0: Fabric Models (v0) 0.4.5+9386d8a7a0
		fabric-networking-api-v1: Fabric Networking API (v1) 3.1.5+f4be560ba0
		fabric-object-builder-api-v1: Fabric Object Builder API (v1) 12.1.2+2ff98d3ba0
		fabric-particles-v1: Fabric Particles (v1) 1.1.4+f4b7e424a0
		fabric-recipe-api-v1: Fabric Recipe API (v1) 2.0.14+52b3ebe5a0
		fabric-registry-sync-v0: Fabric Registry Sync (v0) 4.0.12+b1792f7da0
		fabric-renderer-api-v1: Fabric Renderer API (v1) 3.2.1+2034447ca0
		fabric-renderer-indigo: Fabric Renderer - Indigo 1.5.1+2034447ca0
		fabric-renderer-registries-v1: Fabric Renderer Registries (v1) 3.2.49+df3654b3a0
		fabric-rendering-data-attachment-v1: Fabric Rendering Data Attachment (v1) 0.3.39+73761d2ea0
		fabric-rendering-fluids-v1: Fabric Rendering Fluids (v1) 3.0.30+f4b7e424a0
		fabric-rendering-v0: Fabric Rendering (v0) 1.1.52+df3654b3a0
		fabric-rendering-v1: Fabric Rendering (v1) 3.0.11+b1792f7da0
		fabric-resource-conditions-api-v1: Fabric Resource Conditions API (v1) 2.3.11+239dafd8a0
		fabric-resource-loader-v0: Fabric Resource Loader (v0) 0.11.12+b1792f7da0
		fabric-screen-api-v1: Fabric Screen API (v1) 2.0.12+b1792f7da0
		fabric-screen-handler-api-v1: Fabric Screen Handler API (v1) 1.3.47+b1792f7da0
		fabric-sound-api-v1: Fabric Sound API (v1) 1.0.14+f4b7e424a0
		fabric-transfer-api-v1: Fabric Transfer API (v1) 3.3.13+4944b5a5a0
		fabric-transitive-access-wideners-v1: Fabric Transitive Access Wideners (v1) 5.0.3+fce67b32a0
		fabricloader: Fabric Loader 0.15.11
		java: OpenJDK 64-Bit Server VM 21
		mccourse: MC Course 1.0.0
		minecraft: Minecraft 1.20.2
		mixinextras: MixinExtras 0.3.5
		terrablender: TerraBlender 3.0.0.169
	Server Running: true
	Player Count: 0 / 8; []
	Data Packs: vanilla, fabric
	Enabled Feature Flags: minecraft:vanilla
	World Generation: Stable
	Type: Integrated Server (map_client.txt)
	Is Modded: Definitely; Client brand changed to 'fabric'; Server brand changed to 'fabric'
	Launched Version: Fabric
