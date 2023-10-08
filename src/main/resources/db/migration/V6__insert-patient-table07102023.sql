-- Insert data into the patient table
INSERT INTO patient (name, date_of_birth, cpf, phone_number, email, medical_history, observation, patient_insurance)
VALUES
    ('John Smith', '1990-03-15', '12345678801', '123-456-7890', 'john@example.com', 'Type 2 Diabetes', 'Patient undergoes regular check-ups', 'SUS'),
    ('Mary Johnson', '1985-05-20', '98765432101', '987-654-3210', 'mary@example.com', 'Asthma', 'Requires regular inhaler use', 'UNIMED'),
    ('Carlos Santos', '1980-10-10', '56789012301', '567-890-1230', 'carlos@example.com', 'Hypertension', 'Blood pressure under control', 'CLINIPAM'),
    ('Anna Davis', '1995-08-25', '23456789012', '234-567-8901', 'anna@example.com', 'Migraine', 'Patient reports frequent headaches', 'SUS'),
    ('Peter Wilson', '1988-12-05', '34567890123', '345-678-9012', 'peter@example.com', 'Rheumatoid Arthritis', 'Requires rheumatology follow-up', 'CAIXA');
