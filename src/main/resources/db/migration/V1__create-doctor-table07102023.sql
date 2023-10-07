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


