-- Insert dat into the doctor table
INSERT INTO doctor (name, date_of_birth, cpf, phone_number, email, crm, doctor_specialty)
VALUES
    ('Dr. John Smith', '1980-05-15'::DATE, '12345678901', '555-555-5555', 'john.smith@example.com', 'ABC1234', 'OPHTHALMOLOGIST'),
    ('Dr. Maria Garcia', '1975-08-20'::DATE, '98765432109', '555-555-5556', 'maria.garcia@example.com', 'XYZ5678', 'GENERAL_PRACTITIONER'),
    ('Dr. Robert Johnson', '1982-03-10'::DATE, '45678901234', '555-555-5557', 'robert.johnson@example.com', 'DEF5678', 'GENERAL_PRACTITIONER'),
    ('Dr. Laura Davis', '1990-01-25'::DATE, '78901234567', '555-555-5558', 'laura.davis@example.com', 'GHI9012', 'DERMATOLOGIST'),
    ('Dr. Michael Brown', '1978-12-05'::DATE, '34567890123', '555-555-5559', 'michael.brown@example.com', 'JKL3456', 'OPHTHALMOLOGIST');

-- Insert data into the patient table
INSERT INTO patient (name, date_of_birth, cpf, phone_number, email, medical_history, observation, patient_insurance)
VALUES
    ('John Smith', '1990-03-15', '12345678801', '123-456-7890', 'johni@example.com', 'Type 2 Diabetes', 'Patient undergoes regular check-ups', 'SUS'),
    ('Mary Johnson', '1985-05-20', '98765432101', '987-654-3210', 'mary@example.com', 'Asthma', 'Requires regular inhaler use', 'UNIMED'),
    ('Carlos Santos', '1980-10-10', '56789012301', '567-890-1230', 'carlos@example.com', 'Hypertension', 'Blood pressure under control', 'CLINIPAM'),
    ('Anna Davis', '1995-08-25', '23456789012', '234-567-8901', 'anna@example.com', 'Migraine', 'Patient reports frequent headaches', 'SUS'),
    ('Peter Wilson', '1988-12-05', '34567890123', '345-678-9012', 'peter@example.com', 'Rheumatoid Arthritis', 'Requires rheumatology follow-up', 'CAIXA');

-- Insert data into the appointment table
INSERT INTO appointment (patient_id, doctor_id, date, observation, appointment_status)
VALUES
    (1, 1, '2023-10-10 09:00:00', 'Routine check-up', 'SCHEDULED'),
    (2, 2, '2023-10-11 10:30:00', 'Persistent headache', 'IN_PROGRESS'),
    (3, 3, '2023-10-12 14:15:00', 'Post-surgery follow-up', 'COMPLETED'),
    (4, 4, '2023-10-13 16:45:00', 'Annual check-up', 'SCHEDULED'),
    (5, 5, '2023-10-14 11:30:00', 'Annual vaccination', 'CANCELED');



