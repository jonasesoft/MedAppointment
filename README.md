# MedAppointment
MedAppointment is a straightforward API for scheduling appointments between patients and doctors.

## Description
This project aims to simplify the scheduling of medical appointments, allowing patients to book appointments with doctors efficiently and conveniently.

### How to run application:

#### Prerequisites

- Docker installed on your system.
- Postgres SQL installed in your system.

#### Steps

- **1**  Open a **terminal** or **command prompt** in the root directory of your project.

- **2** Execute the following command to start **PostgreSQL** in a **Docker** container:

   ```bash
   docker run -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres


### Features

- **Class Diagram of the Solution**: The project includes a class diagram that represents the structure of the solution.

#### Diagrams

**UML**


![uml](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation%20(isomnia%20and%20UML)/UML.png)

**MER**


![mer](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation%20(isomnia%20and%20UML)/postgres%20-%20public%20-%20appointment.png)
#### Insomnia Doc
- **Examples of API Calls**: An Insomnia file is available with examples of all API calls in the application, [click here](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation%20(isomnia%20and%20UML)/Insomnia_2023-10-07.json) to access Insomnia doc.


#### Swagger
- **API Documentation in Swagger**: the basic documentation is avaliable, [click here](http://localhost:8080/swagger-ui/index.html#/appointment-controller) after initialized the application

### About Application

#### Deploy on Railway: the project is deployed on this link (click here)[https://medappointment-production.up.railway.app/] for home page 

- **Software Running Correctly**: The project is initially running correctly (on my computer) and can be deployed and used to schedule appointments.

### Functional Requirements

**Registration of Doctors and Patients:**

- The application allows the registration of doctors and patients with personal information such as name, date of birth, CPF (Brazilian ID), phone number, email, specialty (for doctors), medical history (for patients), observations, and insurance type (for patients).

**Appointment Scheduling:**

- Doctors and patients can schedule medical appointments.

- Appointments include information about the patient, doctor, appointment date, and additional notes.

**Record Update and Deletion:**

- Records of doctors, patients, and appointments can be updated and deleted as needed.

### Non-Functional Requirements

- **Applicaton Developed using Spring** : The Application is using Spring Framework for run and Docker for using postgres images.


- **Data Persistence in Postgres**: Data is persisted in a PostgreSQL database, ensuring data reliability and integrity.


- **Migration Management with Flyway**: Flyway is used to manage database migrations, making database schema updates and changes a straightforward task.


- **Dependency Management with Maven**: Maven is used to manage dependencies and the project's structure, making it easy to build and deploy.

### Bussiness-Rules
- CPF needs be unique.
- CRM needs be unique.
- Email needs be unique.

  

### Building

- **Code Coverage of at Least 50%** : In Process.


### Final Consideration




