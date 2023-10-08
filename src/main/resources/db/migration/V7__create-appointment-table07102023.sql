-- Create appointment table
CREATE TABLE IF NOT EXISTS appointment (
    id SERIAL PRIMARY KEY,
    patient_id BIGINT NOT NULL,
    doctor_id BIGINT NOT NULL,
    date TIMESTAMPTZ NOT NULL,
    observation TEXT NOT NULL,
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