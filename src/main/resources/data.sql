insert into user (id, user_name, password, active, roles) values
(1, 'sam', 'pass', 'true', 'USER'),
(2, 'ven', 'pass', 'true', 'USER');

insert into user_profile (id, user_name, resume_theme, resume_summary, first_name, last_name, email, phone, designation) values
(1, 'sam', 'MODERN', 'Seasoned Developer with over 5 Years of Work Ex', 'Sam', 'Mendes', 'sam@abc.com', '123456789', 'Project Lead'),
(2, 'ven', 'MINIMAL', 'Seasoned QA with over 5 Years of Work Ex', 'Venkat', 'Potlapalli', 'ven@abc.com', '123456789', 'Lead QA Engineer');


insert into job(id, company, designation, start_date, end_date, current_job, job_id) values
(1, 'Dolite', 'Senior Software Engineer', '2018-03-01', null , 'true', 1),
(2, 'Dalda Org', 'Software Engineer', '2017-03-01', '2018-02-25', 'false', 1),
(3, 'Askenture', 'Associate Software Engineer', '2015-03-01', '2017-02-25', 'false', 1);

insert into job_responsibilities(job_id, responsibilities) values
(1, 'Implementation of Elastic Search'),
(1, 'Kibana Dashboard For PipeLines'),
(1, 'Code Reviews & CI Pipelines Built'),
(2, 'Developed Android App'),
(2, 'Requirement Implementation & Code Reviews'),
(3, 'Selenium Test Cases Implementation'),
(3, 'Building Library Logic');
