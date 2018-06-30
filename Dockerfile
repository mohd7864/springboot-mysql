FROM java:8
VOLUME /tmp
ADD target/springbootmysql-0.0.1.jar app.jar
ADD healthcheck.sh healthcheck.sh
RUN bash -c 'chmod +x /healthcheck.sh'
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["/bin/bash", "/healthcheck.sh"]
