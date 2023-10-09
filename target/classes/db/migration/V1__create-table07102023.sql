-- Create doctor table
CREATE TABLE IF NOT EXISTS doctor(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    phone_number VARCHAR(255),
    email VARCHAR(255) NOT NULL,
    crm VARCHAR(7) NOT NULL UNIQUE,
    doctor_specialty VARCHAR(255) NOT NULL
);

-- Create patient table
CREATE TABLE IF NOT EXISTS patient(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    cpf VARCHAR(11) NOT NULL UNIQUE,
    phone_number VARCHAR(255),
    email VARCHAR(255) NOT NULL,
    medical_history VARCHAR(255),
    observation VARCHAR(255),
    patient_insurance VARCHAR(255) NOT NULL
);

-- Create appointment table
CREATE TABLE IF NOT EXISTS appointment (
    id SERIAL PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    doctor_id BIGINT NOT NULL,
    date TIMESTAMPTZ NOT NULL,
    observation TEXT,
    appointment_status VARCHAR(255) NOT NULL
);

ALTER TABLE appointment
ADD CONSTRAINT fk_patient
FOREIGN KEY (patient_id)
REFERENCES patient(id);

ALTER TABLE appointment
ADD CONSTRAINT fk_doctor
FOREIGN KEY (doctor_id)
REFERENCES doctor(id);


