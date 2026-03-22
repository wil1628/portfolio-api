# Portfolio API

Una API REST desarrollada con Spring Boot para gestionar y exponer contenido de portafolio profesional.

## 📋 Descripción

Portfolio API es una aplicación backend construida con Spring Boot que proporciona endpoints REST para gestionar información de portafolio. Utiliza PostgreSQL como base de datos y está containerizada con Docker para facilitar el despliegue.

## 🛠️ Tecnologías

- **Java 21** - Lenguaje de programación
- **Spring Boot 4.0.4** - Framework web
- **Spring Data JPA** - Persistencia de datos
- **PostgreSQL** - Base de datos relacional
- **Lombok** - Reducción de código boilerplate
- **Maven** - Gestor de dependencias
- **Docker** - Containerización

## 📦 Requisitos Previos

- Java 21 o superior
- Maven 3.6+
- PostgreSQL 12+
- Docker (opcional, para containerización)

## 🚀 Instalación

### Clonación del repositorio

```bash
git clone https://github.com/wil1628/portfolio-api.git
cd portfolio-api
```

### Configuración de la base de datos

Crea una base de datos PostgreSQL:

```sql
CREATE DATABASE portfolio_db;
```

Configura las variables de entorno o actualiza el archivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/portfolio_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Ejecución local

Usando Maven:

```bash
./mvnw spring-boot:run
```

O compilar y ejecutar el JAR:

```bash
./mvnw clean package
java -jar target/portafolio-api-0.0.1-SNAPSHOT.jar
```

## 🐳 Docker

### Construir la imagen

```bash
docker build -t portfolio-api:latest .
```

### Ejecutar el contenedor

```bash
docker run -p 8080:8080 \
  -e SPRING_DATASOURCE_URL=jdbc:postgresql://host.docker.internal:5432/portfolio_db \
  -e SPRING_DATASOURCE_USERNAME=usuario \
  -e SPRING_DATASOURCE_PASSWORD=contraseña \
  portfolio-api:latest
```

## 📡 Endpoints

La API estará disponible en `http://localhost:8080/api`

## 🧪 Testing

Ejecutar los tests:

```bash
./mvnw test
```

## 📝 Estructura del Proyecto

```
portfolio-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── pom.xml
├── Dockerfile
├── mvnw
└── README.md
```

## 🔧 Configuración

La aplicación se configura mediante el archivo `application.properties` o variables de entorno:

- `server.port` - Puerto de la aplicación (default: 8080)
- `spring.datasource.url` - URL de conexión a PostgreSQL
- `spring.datasource.username` - Usuario de base de datos
- `spring.datasource.password` - Contraseña de base de datos

## 📄 Licencia

Este proyecto está bajo licencia MIT.

## 👨‍💻 Autor

**Wilber Jimenez** - [GitHub](https://github.com/wil1628)

## 🤝 Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un issue o pull request para sugerir cambios.

---

**Última actualización:** Marzo 2026