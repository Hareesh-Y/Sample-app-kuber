FROM openjdk:11

COPY target/sb_k8s_app.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT [ "java","-jar","sb_k8s_app.jar" ]

