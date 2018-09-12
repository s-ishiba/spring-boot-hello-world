FROM tomcat:8.5.33-jre10
COPY target/helloworld.war /usr/local/tomcat/webapps/helloworld.war
