# Database Configuration

## MySQL Setup

### Database Creation
```sql
CREATE DATABASE IF NOT EXISTS hospital 
CHARACTER SET utf8mb4 
COLLATE utf8mb4_unicode_ci;

USE hospital;
```

### User Creation (Optional - for security)
```sql
-- Create a dedicated user for the application
CREATE USER 'hospital_user'@'localhost' IDENTIFIED BY 'secure_password';
GRANT SELECT, INSERT, UPDATE, DELETE ON hospital.* TO 'hospital_user'@'localhost';
FLUSH PRIVILEGES;
```

## Connection Configuration

### Current Settings
- **Driver**: `com.mysql.cj.jdbc.Driver`
- **URL**: `jdbc:mysql://localhost:3306/hospital?useSSL=false&serverTimezone=UTC`
- **Username**: `root`
- **Password**: `` (empty)

### Recommended Production Settings
```java
// In ConnectionDao.java
String url = "jdbc:mysql://localhost:3306/hospital?useSSL=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
String username = "hospital_user";
String password = System.getenv("DB_PASSWORD"); // Use environment variable
```

## Environment Variables

Create a `.env` file (not committed to git) with:
```
DB_HOST=localhost
DB_PORT=3306
DB_NAME=hospital
DB_USERNAME=hospital_user
DB_PASSWORD=your_secure_password
```

## Performance Tuning

### MySQL Configuration (my.cnf)
```ini
[mysqld]
innodb_buffer_pool_size = 256M
max_connections = 100
query_cache_size = 32M
query_cache_type = 1
```

### Connection Pool Settings
```java
// Recommended connection pool configuration
HikariConfig config = new HikariConfig();
config.setMaximumPoolSize(10);
config.setMinimumIdle(2);
config.setConnectionTimeout(30000);
config.setIdleTimeout(600000);
config.setMaxLifetime(1800000);
```

## Backup Strategy

### Daily Backup Script
```bash
#!/bin/bash
mysqldump -u root -p hospital > backup_$(date +%Y%m%d).sql
```

### Restore from Backup
```bash
mysql -u root -p hospital < backup_file.sql
```