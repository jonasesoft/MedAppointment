-- Insert data into the appointment table
INSERT INTO appointment (patient_id, doctor_id, date, observation, appointment_status)
VALUES
    (1, 1, '2023-10-10 09:00:00', 'Routine check-up', 'SCHEDULED'),
    (2, 2, '2023-10-11 10:30:00', 'Persistent headache', 'IN_PROGRESS'),
    (3, 3, '2023-10-12 14:15:00', 'Post-surgery follow-up', 'COMPLETED'),
    (4, 4, '2023-10-13 16:45:00', 'Annual check-up', 'SCHEDULED'),
    (5, 5, '2023-10-14 11:30:00', 'Annual vaccination', 'CANCELED');

