# Docker Setup for Demo REST API

This project has been containerized using Docker. Follow these instructions to build and run the application.

## Prerequisites
- Docker Desktop installed and running
- Docker Compose (usually included with Docker Desktop)

## Quick Start

### Option 1: Using Docker Compose (Recommended)
```bash
# Build and start the container
docker-compose up --build

# Run in detached mode
docker-compose up --build -d

# Stop the container
docker-compose down
```

### Option 2: Using Docker directly
```bash
# Build the image
docker build -t demo-rest-api .

# Run the container
docker run -p 8080:8080 --name demo-rest-api-container demo-rest-api

# Stop the container
docker stop demo-rest-api-container
docker rm demo-rest-api-container
```

## Access Points
Once the container is running, you can access:
- **Application**: http://localhost:8080
- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **API Endpoint**: http://localhost:8080/api/hello

## Docker Configuration

### Dockerfile Features
- Multi-stage build for optimized image size
- OpenJDK 17 runtime environment
- Health checks for monitoring
- Exposed port 8080

### Docker Compose Features
- Automatic restart policy
- Health monitoring
- Custom network configuration
- Environment variable configuration

## Development Workflow
```bash
# Build only
docker-compose build

# View logs
docker-compose logs -f

# Execute commands in container
docker-compose exec demo-rest-api bash

# Rebuild after changes
docker-compose up --build --force-recreate
```

## Troubleshooting
- Ensure Docker Desktop is running
- Check if port 8080 is available
- Verify Docker daemon is accessible
- Check container logs: `docker-compose logs demo-rest-api`

## Docker Compose vs. Kubernetes Orchestration

### When to Use Docker Compose
Docker Compose is ideal for:
- **Local Development**: Quick setup for development environments
- **Single-Host Deployment**: Running multiple containers on one machine
- **Simple Applications**: Projects with limited scaling requirements
- **Testing & Prototyping**: Fast iteration without complex infrastructure

### When to Use Kubernetes (or Similar Orchestration)
Kubernetes is necessary for:
- **Production Environments**: Enterprise-grade reliability and uptime requirements
- **Auto-Scaling**: Automatically scale services based on demand (CPU, memory, traffic)
- **Multi-Node Clusters**: Distribute containers across multiple machines for high availability
- **Self-Healing**: Automatic restart of failed containers and node failover
- **Load Balancing**: Built-in traffic distribution across replicas
- **Rolling Deployments**: Zero-downtime updates and rollbacks
- **Resource Management**: Efficient CPU/memory allocation across cluster
- **Persistent Storage**: Advanced volume management and data persistence
- **Monitoring & Logging**: Centralized observability across all services
- **Microservices Architecture**: Complex inter-service communication and service discovery

### Summary
**Docker Compose** = Development and simple deployments  
**Kubernetes** = Production, scalability, and complex distributed systems

For this Demo REST API, Docker Compose is sufficient for development. Use Kubernetes when moving to production with high-availability requirements.
