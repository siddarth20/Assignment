/*Third normal form(Removing transitive dependancies*/
/*create table studentCourses(
studID int,
studName varchar(20),
subID int,
subj varchar(20),
address varchar(20));

insert into studentCourses values
(1,'Ajay',11,'Java','Thane'),
(2,'Seema',12,'Python','Chembur'),
(3,'Raj',13,'SQL','Matunga'),
(4,'Prince',11,'Java','Sion');*/

select * from studentCourses;

select studID,studName,subID,address into studentCoursesNew from studentCourses;

select subID,subj into subjectDetails from studentCourses;

select * from studentCoursesNew;
select * from subjectDetails;


