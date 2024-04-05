# syntax=docker/dockerfile:1


FROM openjdk:oraclelinux8

#thư mục làm việc cd tới /app
WORKDIR /app

# copy vào container 
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# build thư viện
RUN ./mvnw dependency:go-offline
COPY src ./src

# run java spring
CMD ["./mvnw", "spring-boot:run"]