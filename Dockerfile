FROM tomcat:10.1.15-jre17-temurin-jammy

COPY /target/task_sql-1.0.war /usr/local/tomcat/webapps

EXPOSE 8080

CMD ["catalina.sh", "run"]
