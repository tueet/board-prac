#!/bin/sh

./gradlew build --stacktrace
nohup java -jar build/libs/info-0.0.1-SNAPSHOT.jar &
tail -f nohup.out