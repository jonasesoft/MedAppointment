-- Create ENUM type for DoctorSpecialty
CREATE TYPE doctor_specialty AS ENUM (
    'GENERAL_PRACTITIONER',
    'PEDIATRICIAN',
    'DERMATOLOGIST',
    'OPHTHALMOLOGIST'
);
