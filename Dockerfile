FROM tomcat:9.0.11-jre10
copy target/letsdoitauth.war /usr/local/tomcat/webapps/.
CMD ["catalina.sh", "run"]
