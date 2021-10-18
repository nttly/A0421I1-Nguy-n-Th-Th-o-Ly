create database store;
use store;
create table Products(
 id int primary key,
productCode varchar(50),
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(250),
productStatus varchar(50));

-- insert into data
insert into products
values(1,'m1','bút',1000,10,'bút viết','còn'),
(2,'m2','thước',2000,15,' thước kẻ','hết'),
(3,'m3','phấn',3000,9,'phấn viết','còn'),
(4,'m4','tẩy',4000,8,'tẩy trắng','hết'),
(5,'m5','compa',5000,7,'vẽ hình','còn'),
(6,'m6','vở',2500,11,'vở trắng','hết');
