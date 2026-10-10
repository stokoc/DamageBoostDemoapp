#!/usr/bin/env sh

# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/bin/java" ] ; then
        JAVACMD="$JAVA_HOME/bin/java"
    fi
fi
if [ -z "$JAVACMD" ] ; then
    JAVACMD="java"
fi

# Locate the gradle-wrapper.jar
wrapperJar="$(dirname "$0")/gradle/wrapper/gradle-wrapper.jar"

exec "$JAVACMD" -jar "$wrapperJar" "$@"
