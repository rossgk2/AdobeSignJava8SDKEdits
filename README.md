# About

This repository is an Eclipse Mars 2 project that, when built, produces an already-modified version of the Adobe Sign SDK for Java 8. The SDK has been modified to work for GigaSign.

# Steps performed to create this repository 

1. Use JDGUI to decompile the already-modified Adobe Sign SDK for Java 8. It has this file structure: 

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

5. Use the dependencies from this build.gradle from the GigaSign source code (even though it’s not from the SDK, it’s probably originally SDK) in a build.gradle file. Put this in fldr. Add a settings.gradle to fldr whose only content is the single line include ':rest-api-sdk'. 

# How to build the code in this repository 

1. Download Eclipse Mars 2, since Eclipse Mars 2 is the version of Eclipse that supported Java 8. Use File > New > Java Project to open this repository folder as a Java Project. 
2. Since Eclipse Mars is old, we can’t use Gradle plugins from the Eclipse Marketplace with it, and have to manually run Gradle instead. To do this, after obtaining a global install of any Gradle version*, open a terminal, cd to fldr, and 
   1. `gradle wrapper`. This uses the global Gradle install to generate a local install of Gradle that is of the Gradle version that’s specified in fldr/build.gradle. The install is encapsulated in gradlew.bat, which is intended for Windows users, and gradlew, which is intended for Unix users.
   2. `gradlew eclipse` (on Windows) `./gradlew eclipse` (on Unix). This executes the local Gradle executable with the “eclipse” argument. Doing so instructs Gradle to add the dependencies specified in build.gradle to .classpath, which is an Eclipse project configuration file. Entries of .classpath can be interacted via the GUI in Project > Properties > Java Build Path > Libraries. 
3. Running gradlew eclipse causes extraneous folders (src/main/java, src/test/java) to get added to the build path. Remove them from the build path in Project > Properties.
4. For some reason, some of the decompiled source files are missing import statements, even though those import statements can be seen when browsing the original files in JDGUI. Manually fix these import statements. 
5. Some of the decompiled source files also have compile and syntax errors. All of these errors can be seen in the original files when browsing in JDGUI. So ignore them. 

6. File > Export to .jar. 

\* Any Gradle version will work, even if the Gradle version specified in build.gradle is greater than the globally installed Gradle version. To install Gradle globally, use a package manager like apt (Unix), Homebrew (Mac), or Chocolatey (Windows). You can also install it manually. or chochlatey download a .zip of Gradle from https://gradle.org/releases/. Extract the folder inside the .zip file; it will be called someting like “gradle-2.0”. Move this folder to somewhere convenient. Then add the full path of gradle-2.0 to the “PATH” environment variable. 
