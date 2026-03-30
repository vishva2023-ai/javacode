FROM tomcat:9.0

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/fibonacci-app.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 80

CMD ["catalina.sh", "run"]