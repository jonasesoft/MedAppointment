-- Alter table email 'doctor'
ALTER TABLE doctor
ADD CONSTRAINT unique_email_doctor UNIQUE (email);

-- Alter table email 'patient'
ALTER TABLE patient
ADD CONSTRAINT unique_email_patient UNIQUE (email);