-- Insert values on doctor table
INSERT INTO doctor (name, date_of_birth, cpf, phone_number, email, crm, doctor_specialty)
VALUES
    ('Dr. John Smith', '1980-05-15'::DATE, '12345678901', '555-555-5555', 'john.smith@example.com', 'ABC1234', 'OPHTHALMOLOGIST'),
    ('Dr. Maria Garcia', '1975-08-20'::DATE, '98765432109', '555-555-5556', 'maria.garcia@example.com', 'XYZ5678', 'GENERAL_PRACTITIONER'),
    ('Dr. Robert Johnson', '1982-03-10'::DATE, '45678901234', '555-555-5557', 'robert.johnson@example.com', 'DEF5678', 'GENERAL_PRACTITIONER'),
    ('Dr. Laura Davis', '1990-01-25'::DATE, '78901234567', '555-555-5558', 'laura.davis@example.com', 'GHI9012', 'DERMATOLOGIST'),
    ('Dr. Michael Brown', '1978-12-05'::DATE, '34567890123', '555-555-5559', 'michael.brown@example.com', 'JKL3456', 'OPHTHALMOLOGIST');
