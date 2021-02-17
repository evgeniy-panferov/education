create procedure insert_people(name_value varchar, job_value varchar)
    language sql
as
$$
insert into education(name, job) VALUES (name_value, job_value)
$$;

call insert_people('Петр','Летчик')
