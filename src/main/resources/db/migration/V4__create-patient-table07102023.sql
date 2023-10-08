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
