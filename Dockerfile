FROM tomcat:8.5.33-jre10
COPY target/helloworld-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/helloworld.war
