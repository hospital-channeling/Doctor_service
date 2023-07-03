# Doctor Availability Service

Doctor Availability Service is a microservice developed as part of an online channeling system for a hospital management project. This service handles the management of doctor's availability, including their schedules, working hours, and other relevant details.

## Features

- Create doctor availability schedules
- Retrieve doctor availability by doctor ID
- Update doctor availability details
- Delete doctor availability schedules

## Technologies

- Java 11
- Spring Boot
- Spring Data JPA
- MySQL

## Prerequisites

- Java 11 or higher
- MySQL server running with the `hospital_management_system` database created

## Setup

1. Clone the repository:

git clone https://github.com/your-username/doctor-availability-service.git


2. Import the project into your favorite IDE as a Maven project.

3. Update the `src/main/resources/application.properties` file with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/hospital_management_system
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.show-sql=true



4. Run the `DoctorAvailabilityServiceApplication` class to start the application.

5. Access the service's endpoints using a tool like Postman or curl.

## API Endpoints

| Method | Endpoint                              | Description                             |
|--------|---------------------------------------|-----------------------------------------|
| POST   | `/doctors/{doctorId}/availability`   | Create doctor availability             |
| GET    | `/doctors/{doctorId}/availability`   | Get all doctor availabilities           |
| GET    | `/doctors/{doctorId}/availability/{id}` | Get doctor availability by ID          |
| PUT    | `/doctors/{doctorId}/availability/{id}` | Update doctor availability             |
| DELETE | `/doctors/{doctorId}/availability/{id}` | Delete doctor availability             |

## Code Summary

### `DoctorAvailabilityController`

This is where you handle incoming HTTP requests. You define endpoints here like `GET /doctors/{doctorId}/availability` and you'll use the `DoctorAvailabilityService` to perform operations based on these requests.

### `DoctorAvailability` (in entity package)

This is an entity class, which Hibernate (the ORM used by Spring Data JPA) will use to create the `doctor_availability` table in the MySQL database.

### `DoctorAvailabilityRepository` (in repository package)

This is a Spring Data JPA repository for `DoctorAvailability`. Spring will automatically implement this interface in a bean that has the same name but starting with a lowercase letter (i.e., `doctorAvailabilityRepository`).

### `DoctorAvailabilityService` (in service package)

This is an interface that defines the operations you can perform on `DoctorAvailability` entities.

### `DoctorAvailabilityServiceImpl` (in service package)

This class implements `DoctorAvailabilityService`, using `DoctorAvailabilityRepository` to interact with the database.




## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
