#!/usr/bin/env bash

JAVA_HOME=$(/usr/libexec/java_home)
APP_HOME=../sample-thetwo/build/classes/main
NEW_PROPERTIES=../sample-thethree/build/libs/thethree-1.0-SNAPSHOT.jar
ORG_PROPERTIES=../build/libs/theone-1.0-SNAPSHOT.jar

BINARY=net.mypola.thetwo.TheTwo

case "$1" in
    1)
      CLASSPATH=$APP_HOME:$ORG_PROPERTIES:$NEW_PROPERTIES;;
    2)
      CLASSPATH=$APP_HOME:$NEW_PROPERTIES:$ORG_PROPERTIES;;
    *)
      echo ">> unrecognized option: $1";
      echo ">> options: 1 or 2";
      exit 0;;
esac

RUNAS="$JAVA_HOME/bin/java -cp $CLASSPATH $BINARY"
echo $RUNAS
$RUNAS &