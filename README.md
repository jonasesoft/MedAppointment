# MedAppointment
MedAppointment is a straightforward API for scheduling appointments between patients and doctors.

## Description
This project aims to simplify the scheduling of medical appointments, allowing patients to book appointments with doctors efficiently and conveniently.

### How to run application in your pc :

#### Prerequisites
- selected **"local"** in  [application.properties](src/main/resources/application.properties) file
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


![uml](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation/UML.png)

**MER**


![mer](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation/postgres%20-%20public%20-%20appointment.png)
#### Insomnia Doc
- **Examples of API Calls**: An Insomnia file is available with examples of all API calls in the application, [click here](Documetation/Insomnia_2023-10-07.json) to access Insomnia doc.


#### Swagger
- **API Documentation in Swagger**: the basic documentation is avaliable, [click here](http://localhost:8080/swagger-ui/index.html#/appointment-controller) after initialized the application

### About Application

#### Deploy on Railway: the project is deployed on this link [click here](https://medappointment-production.up.railway.app/) to access home page 

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

- **Data Persistence in Postgres**: Data is persisted in a PostgreSQL database, ensuring data reliability and integrity.


- **Migration Management with Flyway**: Flyway is used to manage database migrations, making database schema updates and changes a straightforward task.

### Bussiness-Rules
- CPF needs be unique.
- CRM needs be unique.
- Email needs be unique.



### Code Coverage of at Least 50% :
- An 59% code coverage has been achieved using the JaCoCo plugin.
![print](https://github.com/jonasesoft/MedAppointment/blob/main/Documetation/Screenshot%20from%202023-10-11%2021-58-36.png)



### Final Consideration
In my syllabus, I learned a lot in a short amount of time, dealing with various challenges during the course, such as learning new technologies and applying them to a project. However, it was a journey with a lot of learning, and there is still much to study. Therefore, I will be implementing new projects and always striving for continuous learning. Thanks [Marcio (depende)](https://github.com/marciomichelluzzi) for All



