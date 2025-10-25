# Build and deployment instructions

## Building the Project

### Using Apache Ant
```bash
# Compile the project
ant compile

# Create WAR file for deployment
ant dist

# Clean build artifacts
ant clean
```

### Using VS Code
1. Install the Extension Pack for Java
2. Install the Tomcat extension
3. Open the project in VS Code
4. Use the built-in Java compilation

## Deployment

### Tomcat Deployment
1. Build the project to create a WAR file
2. Copy the WAR file to Tomcat's webapps directory
3. Start Tomcat server
4. Access the application at http://localhost:8080/Hospital_Management_System

### Database Setup
1. Start MySQL server
2. Create database: `CREATE DATABASE hospital;`
3. Import the schema from `web/database/hospital.dmp`
4. Update connection credentials in ConnectionDao.java if needed

## Troubleshooting

### Common Issues
- **ClassNotFoundException**: Ensure MySQL connector JAR is in classpath
- **Connection refused**: Check if MySQL server is running
- **JSP compilation errors**: Verify servlet-api JAR is available
- **404 errors**: Check context path and file locations

### Dependencies
All required JAR files are included in `src/lib/`:
- javax.servlet-api-4.0.1.jar
- mysql-connector-java-8.0.33.jar
- activation.jar
- mail.jar
- upload.jar
- ojdbc14.jar