-- Create ENUM type for DoctorSpecialty
CREATE TYPE doctor_specialty AS ENUM (
    'GENERAL_PRACTITIONER',
    'PEDIATRICIAN',
    'DERMATOLOGIST',
    'OPHTHALMOLOGIST'
);

-- Create ENUM type for PatientInsurrance
CREATE TYPE patient_insurance AS ENUM (
    'SUS',
    'UNIMED',
    'CLINIPAM',
    'SC_SAUDE',
    'CAIXA'
);

-- Create ENUM type for AppointmentStatus
CREATE TYPE appointment_status AS ENUM (
    'SCHEDULED',
    'IN_PROGRESS',
    'COMPLETED',
    'CANCELED'
);
