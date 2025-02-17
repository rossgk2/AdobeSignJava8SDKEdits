# About

This repository is an Eclipse Mars 2 project that, when built, produces an already-modified version of the Adobe Sign SDK for Java 8. The SDK has been modified to work for GigaSign.

# Steps performed to create this repository 

You do not need to follow the below steps. And you actually cannot perform these steps, since they require access to private resources.

1. Use [JD-GUI](https://java-decompiler.github.io/) to decompile the already-modified Adobe Sign SDK for Java 8. It has this file structure: 

* build
  * libs
    * adobe-sign-java-sdk-1.1.1.jar
* com.adobe.sign
  * ... lots of .java files ...
* .classpath
* .project

Use File > “Save all sources” to save the decompilation as a .zip. 

2. Extract the single folder that is inside the .zip. Let’s say it’s called “fldr”. 

3. Delete .project and .classpath from fldr. 

4. Replace the adobe-sign-java-sdk-1.1.1.jar.zip in fldr/build/libs with adobe-sign-java-sdk-1.1.1.jar from the build/libs folder of the already-modified SDK. 

5. Use the dependencies from the build.gradle from the GigaSign source code in a build.gradle file. (This works since the build.gradle from the GigaSign source code is derived from the build.gradle for the Java 8 Adobe Sign SDK). Put this build.gradle in fldr. Also, add a settings.gradle file to fldr whose only content is the single line `include ':rest-api-sdk'`.

6. Follow the below steps 1 - 4 and view the repository in Eclipse Mars 2. For some reason, some of the decompiled source files are missing `import` statements, even though those `import` statements can be seen when browsing the original files in JD-GUI. Manually fix these import statements.

7. After all of the missing `import` statements are added, there will still be compile errors. If you browse the original files with JD-GUI before doing "Save all sources", you will see these same errors. This is because these errors are an artifact of the decompilation. Fix the errors by making educated guesses as to what the code is supposed to be.

# How to build the code in this repository 

1. Download this repository, either manually or via `git clone`.
2. [Download Eclipse Mars 2](https://www.eclipse.org/downloads/packages/release/mars/2/eclipse-ide-java-developers), since Eclipse Mars 2 is the version of Eclipse that supported Java 8. Use File > New > Java Project to open this repository folder as a Java Project. 
3. Since Eclipse Mars 2 is old, we can’t use Gradle plugins from the Eclipse Marketplace with it, and have to manually run Gradle instead. To do this, after obtaining a global install of any Gradle version*, open a terminal, `cd` to this repository, and 
   1. `gradle wrapper`. This uses the global Gradle install to generate a local install of Gradle that is of the Gradle version specified in fldr/build.gradle. The install is encapsulated in gradlew.bat, which is intended for Windows users, and gradlew, which is intended for Unix users.
   2. `gradlew eclipse` (on Windows) `./gradlew eclipse` (on Unix). This executes the local Gradle executable with the “eclipse” argument. Doing so instructs Gradle to add the dependencies specified in build.gradle to .classpath, which is an Eclipse project configuration file. Entries of .classpath can be interacted via the GUI in Project > Properties > Java Build Path > Libraries. 
4. Running `gradlew eclipse` causes extraneous folders (src/main/java, src/test/java) to get added to the build path. Remove them from the build path in Project > Properties.
5. File > Export to .jar. 

\* Any global Gradle version will work, even if the Gradle version specified in build.gradle is greater than the globally installed Gradle version. To check if you have a global Gradle install, execute `gradle -v` in a command prompt. If you get an error, you do not have a global Gradle install. To install Gradle globally, you can either use a package manager like apt (Unix), Homebrew (Mac), or Chocolatey (Windows), or you can do a manual install. To perform a manual install, download a .zip of some Gradle release from https://gradle.org/releases/. Extract the folder inside the .zip file; it will be called something like “gradle-2.0”. Move this folder to somewhere convenient. Then add the full path of "gradle-2.0/bin" to the "PATH" environment variable.
