# Introduction

This repository contains a Gradle build script to generate new Java projects based on templates.

# Usage

`./gradlew generate`

You will be prompted for following information:

1. Template to use
2. Your name
3. Project name
4. Project group
5. Source package
6. Project version

# Default values

The default values can be set in [gradle.properties](gradle.properties).

# Add templates

Just add a new folder with your files in `src/`.
