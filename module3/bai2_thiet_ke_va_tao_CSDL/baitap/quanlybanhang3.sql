create database quan_ly_ban_hang3;
use quan_ly_ban_hang3;
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
create table OrderDetail(
	id_order int ,
    id_product int,
    QTY varchar(50),
    constraint pk_oder_product primary key(id_order,id_product ),
    foreign key (id_order) references `Order`(id),
    foreign key (id_product) references product(id)
);
create table product(
	id int auto_increment primary key,
    `name` varchar(50),
    price double
);
