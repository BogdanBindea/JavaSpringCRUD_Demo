drop schema seria_demo;
create schema seria_demo;

use seria_demo;

create table teachers(
teacher_id int primary key AUTO_INCREMENT,
last_name varchar(255),
first_name varchar(255));

create table courses (
course_id int primary key AUTO_INCREMENT, 
course_name varchar(255),
teacher_id int, 
foreign key (teacher_id) references teachers(teacher_id));

insert into teachers values 
(1, 'Ion','Popescu');

insert into teachers values 
(2, 'Vasile','Radu');

insert into teachers values 
(3, 'Gheorghe','Pop');

insert into teachers values 
(4, 'Mircea','Constantin');

insert into courses values
(1, 'Course 1', 1);

insert into courses values
(2, 'Course 2', 2);
insert into courses values
(3, 'Course 3', 3);
insert into courses values
(4, 'Course 4', 4);
insert into courses values
(5, 'Course 5', 1);
insert into courses values
(6, 'Course 6', 2);

insert into courses values
(7, 'Course 7', 2);
