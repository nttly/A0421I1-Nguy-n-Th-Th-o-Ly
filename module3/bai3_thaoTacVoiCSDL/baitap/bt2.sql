create database quanlybanhang2;
use quanlybanhang2;
create table customer(
	id int auto_increment primary key,
    `name` varchar(50),
    age int
    
);
create table `Order`(
	id int auto_increment primary key,
    `date` date,
    totalPrice double,
    id_product int,
    foreign key(id_product) references customer(id)
);

create table product(
	id int auto_increment primary key,
    `name` varchar(50),
    price double
);
create table OrderDetail(
	id_order int ,
    id_product int,
    QTY int,
    constraint pk_oder_product primary key(id_order,id_product ),
    foreign key (id_order) references `Order`(id),
    foreign key (id_product) references product(id)
);
insert into customer values (1,'Minh Quan',10),
							(2,'Ngoc Oanh',20),
                            (3,'Hong Ha',50);
insert into `order` values (1,'2006-3-21',null,1),
							(2,'2006-3-23',null,2),
                            (3,'2006-3-16',null,1);
insert into product values (1,'may giac', 3),
							(2,'tu lanh', 5),
                            (3,'dieu hoa', 7),
                            (4,'quat', 1),
                            (5,'bep dien', 2);
insert into orderDetail values (1,1,3),
								(1,3,7),
                                (1,4,2),
                                (2,1,1),
                                (3,1,8),
                                (2,5,4),
                                (2,3,3);
select id,`date`,totalPrice from `order`;   
select  customer.name,product.name from customer join product on  customer.id=product.id;                     
select 	customer.name,product.name  from customer left join product on customer.id<>product.id;					

