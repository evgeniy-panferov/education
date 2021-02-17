drop table if exists Education;
drop procedure if exists insert_people(name_value varchar, job_value varchar);

create table Education
(
    id   SERIAL         NOT NULL primary key ,
    name VARCHAR(50) NOT NULL,
    job  VARCHAR(50) NOT NULL
)