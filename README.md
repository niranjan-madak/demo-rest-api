# Demo REST API

A simple demonstration REST API built with Spring Boot, featuring Swagger documentation and Docker containerization.

## 🚀 Features

- **Spring Boot 4.0.5** with Java 17
- **REST API** with greeting endpoint
- **Swagger/OpenAPI 3.0** documentation
- **Docker** containerization with multi-stage builds
- **Health checks** and monitoring
- **Hot reload** with Spring Boot DevTools

## 📋 Prerequisites

- Java 17+
- Maven 3.6+
- Docker Desktop (for containerization)

## 🛠️ Tech Stack

- **Framework**: Spring Boot
- **Language**: Java 17
- **Build Tool**: Maven
- **Documentation**: Swagger/OpenAPI 3.0
- **Containerization**: Docker
- **Testing**: Spring Boot Test

## 🚀 Quick Start

### Option 1: Run Locally
```bash
# Clone the repository
git clone <repository-url>
cd demo-rest-api

# Run the application
.\mvnw.cmd spring-boot:run
```

### Option 2: Docker (Recommended)
```bash
# Build and run with Docker Compose
docker-compose up --build

# Run in detached mode
docker-compose up --build -d
```

## 📡 API Endpoints

### Hello API
- **URL**: `GET /api/hello`
- **Description**: Returns a welcome message
- **Response**: `🚀 Welcome to the API! Ready to explore amazing things?`

## 📚 Documentation

### Swagger UI
Access interactive API documentation at:
- **Local**: http://localhost:8080/swagger-ui.html
- **Docker**: http://localhost:8080/swagger-ui.html

### OpenAPI JSON
- **URL**: http://localhost:8080/v3/api-docs

## 🐳 Docker Commands

```bash
# Build and start
docker-compose up --build

# Stop containers
docker-compose down

# View logs
docker-compose logs -f

# Execute commands in container
docker-compose exec demo-rest-api sh

# Check container status
docker ps
```

## 📁 Project Structure

```
demo-rest-api/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/madak/org/demorestapi/
│       │       ├── DemoRestApiApplication.java
│       │       ├── HelloController.java
│       │       └── config/
│       │           └── SwaggerConfig.java
│       └── resources/
├── Dockerfile
├── docker-compose.yml
├── .dockerignore
├── pom.xml
└── README.md
```

## 🔧 Configuration

### Application Properties
Default configuration uses:
- **Port**: 8080
- **Context Path**: /
- **Profile**: default

### Docker Configuration
- **Base Image**: Eclipse Temurin 17 JRE Alpine
- **Build Tool**: Maven 3.9
- **Health Check**: `/api/hello` endpoint
- **Restart Policy**: unless-stopped

## 🧪 Testing

```bash
# Run tests
.\mvnw.cmd test

# Run with coverage
.\mvnw.cmd clean test jacoco:report
```

## 📊 Monitoring

### Health Checks
- **Endpoint**: `/api/hello`
- **Interval**: 30 seconds
- **Timeout**: 3 seconds
- **Retries**: 3

### Logs
- **Application Logs**: Available via `docker-compose logs`
- **Access Logs**: Configured via Spring Boot Actuator (if added)

## 🔄 Development

### Hot Reload
The application includes Spring Boot DevTools for automatic reloading on code changes.

### Adding New Endpoints
1. Create new controller methods
2. Add Swagger annotations
3. Update API documentation
4. Rebuild Docker image if needed

### Environment Variables
```bash
# Set Spring profile
SPRING_PROFILES_ACTIVE=docker

# Set JVM options
JAVA_OPTS=-Xms512m -Xmx1024m
```

## 🐛 Troubleshooting

### Common Issues

1. **Port 8080 already in use**
   ```bash
   # Find process using port 8080
   netstat -ano | findstr :8080
   # Kill the process
   taskkill /PID <PID> /F
   ```

2. **Docker build fails**
   ```bash
   # Clean Docker cache
   docker system prune -a
   # Rebuild
   docker-compose build --no-cache
   ```

3. **Maven dependencies issues**
   ```bash
   # Clean and rebuild
   .\mvnw.cmd clean compile
   ```

## 📝 License

This project is licensed under the MIT License.

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📞 Support

For questions and support:
- Create an issue in the repository
- Check the Swagger documentation
- Review the Docker logs

---

**Built with ❤️ using Spring Boot and Docker**
