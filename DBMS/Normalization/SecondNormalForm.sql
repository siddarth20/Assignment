/*Second normal form(Removing partial dependencies)*/
create table Orders(
cust_id int,
store_id varchar(10),
store_location varchar(10))

insert into Orders values
(1,'T1','Thane'),
(2,'D2','Dombivali'),
(3,'C1','Chembur'),
(4,'C2','Colaba'),
(5,'S1','Sion');

select * from Orders;

drop table Orders;

create table CustomerAndStore(
cust_id int primary key,
store_id varchar(10));

create table Stores(
store_id varchar(10) primary key,
store varchar(10));

insert into CustomerAndStore values
(1,'T1'),
(2,'D2'),
(3,'C1'),
(4,'C2'),
(5,'S1');

insert into Stores values
('T1','Thane'),
('D2','Dombivali'),
('C1','Chembur'),
('C2','Colaba'),
('S1','Sion');

select * from CustomerAndStore;
select * from Stores