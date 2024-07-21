# Usa la imagen base de OpenJDK 20
FROM openjdk:20-jdk

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR generado en el directorio target al contenedor
COPY target/demo-0.0.1-SNAPSHOT.jar /app/InhautBackend.jar

# Especifica el comando para ejecutar la aplicación
CMD ["java", "-jar", "InhautBackend.jar"]