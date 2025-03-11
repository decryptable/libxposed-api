
```
libxposed-api
├─ LICENSE
├─ api
│  ├─ proguard-rules.pro
│  └─ src
│     └─ main
│        ├─ AndroidManifest.xml
│        └─ java
│           └─ io
│              └─ github
│                 └─ libxposed
│                    └─ api
│                       ├─ XposedInterface.java
│                       ├─ XposedInterfaceWrapper.java
│                       ├─ XposedModule.java
│                       ├─ XposedModuleInterface.java
│                       ├─ errors
│                       │  ├─ HookFailedError.java
│                       │  └─ XposedFrameworkError.java
│                       └─ utils
│                          └─ DexParser.java
├─ checks
│  └─ src
│     └─ main
│        ├─ java
│        │  └─ io
│        │     └─ github
│        │        └─ libxposed
│        │           └─ lint
│        │              └─ XposedIssueRegistry.kt
│        └─ resources
│           └─ META-INF
│              └─ services
│                 └─ com.android.tools.lint.client.api.IssueRegistry
├─ gradle
│  ├─ libs.versions.toml
│  └─ wrapper
│     ├─ gradle-wrapper.jar
│     └─ gradle-wrapper.properties
├─ gradle.properties
├─ gradlew
└─ gradlew.bat

```