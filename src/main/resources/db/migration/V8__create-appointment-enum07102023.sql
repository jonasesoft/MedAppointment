-- Create ENUM type for AppointmentStatus
CREATE TYPE appointment_status AS ENUM (
    'SCHEDULED',
    'IN_PROGRESS',
    'COMPLETED',
    'CANCELED'
);
