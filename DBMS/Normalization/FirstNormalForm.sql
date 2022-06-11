/* First Normal Form(Atomicity of columns)*/
create table Employee(
EmpId int,
Name varchar(20),
DeptName varchar(20));

insert into Employee values
(1,'ABC','Sales,Admin'),
(2,'DEF','Finance,Sales'),
(3,'GHI','Advertisement');

select * from Employee;

create table Department(
DeptId int primary key,
Name varchar(20));

insert into Department values
(1,'Sales'),
(2,'Admin'),
(3,'Finance'),
(4,'Advertisement');

drop table Employee;

create table Employee(
EmpId int,
Name varchar(20),
DeptId int);

insert into Employee values
(1,'ABC',1),
(1,'ABC',2),
(2,'DEF',1),
(2,'DEF',3),
(3,'GHI','3');

select * from Employee;
select * from Department;
