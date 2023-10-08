-- Create ENUM type for PatientInsurrance
CREATE TYPE patient_insurance AS ENUM (
    'SUS',
    'UNIMED',
    'CLINIPAM',
    'SC_SAUDE',
    'CAIXA'
);
