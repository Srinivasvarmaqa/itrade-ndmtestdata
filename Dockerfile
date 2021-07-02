FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

WORKDIR /usr/share/selenium
RUN mkdir -p src/test/resources/TestData
RUN mkdir -p ScreenShots

ADD target/selenium-docker.jar 		selenium-docker.jar
ADD target/selenium-docker-tests.jar 	selenium-docker-tests.jar
ADD target/libs				libs
ADD src/test/resources/TestData/*.json		src/test/resources/TestData/
ADD src/main/resources/config.properties	.

# ADD suite files
ADD testng.xml 				.	
ADD testng-prod.xml 				.	

# ADD health check script
ADD healthcheck.sh                      healthcheck.sh

ENTRYPOINT sh healthcheck.sh && java -cp selenium-docker.jar:selenium-docker-tests.jar:libs/* -DHUB_HOST=$HUB_HOST -DMODULE=$MODULE -DBROWSER=$BROWSER org.testng.TestNG $MODULE
