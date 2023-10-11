
    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;

    create table appointment (
        date timestamp(6) not null,
        doctor_id bigint not null,
        id bigserial not null,
        patient_id bigint not null,
        appointment_status varchar(255) not null check (appointment_status in ('SCHEDULED','IN_PROGRESS','COMPLETED','CANCELED')),
        observation varchar(255),
        primary key (id)
    );

    create table doctor (
        crm varchar(7) not null unique,
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        doctor_specialty varchar(255) not null check (doctor_specialty in ('GENERAL_PRACTITIONER','PEDIATRICIAN','DERMATOLOGIST','OPHTHALMOLOGIST')),
        email varchar(255) not null unique,
        name varchar(255) not null,
        phone_number varchar(255),
        primary key (id)
    );

    create table patient (
        date_of_birth timestamp(6) not null,
        id bigserial not null,
        cpf varchar(11) not null unique,
        email varchar(255) not null unique,
        medical_history varchar(255),
        name varchar(255) not null,
        observation varchar(255),
        patient_insurance varchar(255) not null check (patient_insurance in ('SUS','UNIMED','CLINIPAM','SC_SAUDE','CAIXA')),
        phone_number varchar(255),
        primary key (id)
    );

    alter table if exists appointment 
       add constraint FKoeb98n82eph1dx43v3y2bcmsl 
       foreign key (doctor_id) 
       references doctor;

    alter table if exists appointment 
       add constraint FK4apif2ewfyf14077ichee8g06 
       foreign key (patient_id) 
       references patient;
