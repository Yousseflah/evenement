FROM openjdk:11
ADD target/Evenement-0.0.1-SNAPSHOT.war evenement.war
ENTRYPOINT ["java", "-jar", "evenement.war"]