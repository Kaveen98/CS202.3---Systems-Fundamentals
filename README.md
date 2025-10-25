# Hospital Management System

A comprehensive web-based Hospital Management System built with Java, JSP, and MySQL.

## Features

- **Patient Management**: Register, update, and manage patient records
- **Doctor Management**: Manage doctor profiles and departments
- **Department Management**: Organize hospital departments
- **Room & Bed Management**: Track room availability and bed assignments
- **Billing System**: Generate and manage patient bills
- **Pathology Reports**: Manage medical test results
- **Blood Donor Management**: Track blood donors and donations
- **User Authentication**: Role-based access for admin and patients

## Technology Stack

- **Backend**: Java, JSP (JavaServer Pages)
- **Database**: MySQL
- **Frontend**: HTML, CSS, Bootstrap, JavaScript
- **Server**: Apache Tomcat
- **Build Tool**: Apache Ant

## Project Structure

```
├── src/
│   ├── classes/           # Java source files
│   ├── lib/              # JAR dependencies
│   └── conf/             # Configuration files
├── web/                  # Web content (JSP, CSS, JS, images)
├── nbproject/           # NetBeans project files
└── build.xml           # Ant build configuration
```

## Database Schema

The system uses the following main entities:
- `patient_info` - Patient records
- `doctor_info` - Doctor profiles
- `department` - Hospital departments
- `staffinfo` - Staff information
- `billing` - Billing records
- `pathology` - Medical test results
- `room_info` - Room and bed management

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- MySQL Server
- Apache Tomcat 9.x
- Apache Ant (for building)

### Setup Instructions

1. Clone the repository
2. Install MySQL and create a database named `hospital`
3. Import the database schema from `web/database/hospital.dmp`
4. Configure database connection in `src/classes/ConnectionDao.java`
5. Build the project using Ant or deploy to Tomcat

## Development

This project was developed as part of a Systems Fundamentals course and demonstrates:
- Web application architecture
- Database design and connectivity
- User interface design
- Session management
- Security considerations

## License

This project is for educational purposes.