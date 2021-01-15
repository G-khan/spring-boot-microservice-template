## Spring Boot Microservice Template with Kafka, MongoDB and Docker

Dockerized Base template of microservice via Spring Boot, dockerized kafka and dockerized mongo-db. It is including sample consumer,producer and spring data.

## Requirements
1.  Java - 1.11.x
2.  Gradle- 3.x.x
3.  Docker- 5.x.x

**Running the App**
Type the following command in your terminal to run the app -

     ./gradlew bootRun
    
**Build and Run with Docker**
Build the project with gradle:

    ./gradlew build

Build Docker and run docker with docker-compose

    docker build . -t spring-boot-ms-template

    docker-compose up -d
    
##Containers

* template_app
* mongo
* zookeper
* kafka
