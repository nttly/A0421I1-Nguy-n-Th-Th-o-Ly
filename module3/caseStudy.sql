create database caseStudy;
use caseStudy;
create table vi_tri(
	id_viTri int primary key,
    tenViTri varchar(45)
);
create table trinh_do(
	id_trinhDo int,
    trinhDo varchar(45)
);
create table bo_phan(
	id_boPhan int primary key,
    tenBoPhan varchar(45)
);
create  table nhan_vien(
	id_nhanVien int auto_increment primary key,
    hoTen varchar(45),
    id_viTri int,
    id_trinhDo int,
    id_boPhan int,
    ngaySinh date,
    soCMND varchar(45),
    luong double,
    sdt varchar(10),
    email varchar(45),
    diaChi varchar(45),
    foreign key(id_viTri1) references vi_tri(id_viTri),
    foreign key(id_trinhDo1) references trinh_do(id_trinhDo),
    foreign key(id_boPhan1) references bo_phan(id_boPhan)
);

create table loai_khach(
	id_loaiKhach int primary key,
    tenLoaiKhach varchar(45)
);
create table khach_hang(
	id_khachHang int auto_increment primary key,
    id_loaiKhach int, 
    hoTen varchar(50),
    ngaySinh date,
    soCMND varchar(50),
    sdt varchar(50),
    email varchar(50),
    diaChi varchar(50),
    foreign key(id_loaiKhach) references loai_khach(id_loaiKhach)
);
create table kieu_thue(
	id_kieuThue int primary key,
    tenKieuThue varchar(45),
    gia int
);
create table loai_dich_vu(
	id_loaiDichVu int primary key,
    tenLoaiDichVu varchar(45)
);
create table dich_vu(
	id_dichVu int auto_increment primary key,
    ten_dichVu varchar(45) ,
    dienTich int,
    soTang int,
    soNguoiToiDa varchar(45),
    chiPhiThue varchar(45),
    Id_KieuThue varchar(45),
    Id_LoaiDichVu int,
    trangThai varchar(45),
    foreign key(id_kieuThue) references kieu_thue(id_kieuThue),
    foreign key(id_loaiDichVu) references loai_dich_vu(id_loaiDichVu)
);
create table dich_vu_di_kem(
	id_dichVuDiKem int primary key,
    tenDichVuDiKem varchar(45),
    gia int,
    donVi int,
    trangThaiKhachDung varchar(45)
);

create table hop_dong_chi_tiet(
	id_hopDongChiTiet int primary key,
    id_hopDong int,
    id_dichVuDiKem int,
    soLuong int,
    foreign key(id_hopdong) references hop_dong(id_hopDong),
    foreign key(id_dichVuDiKem) references dich_vu_di_kem(id_dichVuDiKem)
);
create table dop_dong(
	id_hopDong int auto_increment primary key,
    id_nhanVien int,
    id_khachHang int,
    id_dichVu int,
    ngayLamHopDong date,
    ngayKetHopDng date,
    tienDatCoc int,
    tongTien int,
    foreign key(id_nhanVien) references nhan_vien(id_nhanVien),
    foreign key(id_khachHang) references khach_hang(id_khachHang),
    foreign key(id_dichVu) references dich_vu(id_dichVu)
);
insert into vi_tri
values
(1,'lễ tân'),
(2,'phục vụ'),
(3,'chuyên viên'),
(4,'giám sát'),
(5,'quản lí'),
(6,'giám đốc');

insert into trinh_do
values
(1,'trung cấp'),
(2,'cao đẳng'),
(3,'đại học'),
(4,'sau đại học');

insert into bo_phan
values
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');

insert into nhan_vien
values
(1,'Hồ Đình Khuê',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(2,'Nguyễn Văn Sơn',1,1,1,'1999-12-12',206764234,5000000,090534345,'nguyenson@gmail.com','Đà Nẵng'),
(3,'Nguyễn Văn An',1,1,3,'1988-04-13',206184291,5000000,0905768796,'vanan@gmail.com','Quảng Nam'),
(4,'Lê Thị Thu',2,3,4,'1995-02-12',206184291,10000000,0905453657,'lethu@gmail.com','Đà Nẵng'),
(5,'Trương Văn Tuấn',2,3,1,'1989-02-09',206915647,10000000,0909452456,'vantuan@gmail.com','Hồ Chí Minh'),
(6,'Trần Khánh Chi',3,3,2,'1991-12-17',202914563,20000000,0905567345,'tranchi@gmail.com','Hà Nội'),
(7,'Nguyễn Ngọc',3,3,1,'1988-02-12',206566914,20000000,09055467846,'nguyenngoc@gmail.com','Hai Phòng'),
(8,'La Thành',4,4,4,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(9,'Hồ Văn Chiến',6,4,2,'1978-02-18',20657478,30000000,0935678567,'vanchien@gmail.com','Đà Nẵng'),
(10,'Võ Anh Dũng',5,4,1,'1990-02-12',20656465,40000000,0905345768,'voanh@gmail.com','Quảng Nam');

insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');	

insert into khach_hang
values
(1,2,'Nguyễn Đoàn','1989-02-09','234345345','090543454','nguyendoan@gmail.com','Hai Phong'),
(2,3,'Nguyễn Anh','1991-12-17','223445398','095643457','nguyenanh@gmail.com','Quảng Bình'),
(3,1,'Lê Hùng','1990-02-12','342345456','0906456756','hung@gmail.com','Hai Dương'),
(4,4,'Đoàn Lĩnh','1978-02-12','234345665','0935678767','doanlinhgmail.com','Đà Nẵng'),
(5,5,'Tô Lâm','1995-02-12','323454345','090542546','tolam@gmail.com','Hà Nội');

insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into kieu_thue
values
(1,'năm',90000000),
(2,'tháng',1200000),
(3,'ngày',2000000),
(4,'giờ',200000);

insert into dich_vu
values
(1,'thuê view biển villa',200,2,'12',5000000,3,1,'tốt nhất'),
(2,'thuê view biển house',100,2,'9',4000000,3,2,'tốt nhất'),
(3,'thuê view biển room',30,2,'3',3000000,3,3,'tốt nhất'),
(4,'thuê view trung tâm villa',200,2,'12',4000000,3,1,'tốt nhất'),
(5,'thuê view trung tâm house',100,2,'9',3000000,3,2,'tốt nhất'),
(6,'thuê view trung tâm room',30,2,'3',2000000,3,3,'tốt nhất');

insert into hop_dong
values
(1,2,1,1,'2020-12-12','2021-01-02',3000000,5000000),
(2,3,4,2,'2021-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2020-03-12','2021-03-22',5000000,10000000);

insert into dich_vu_di_kem
values
(1,'massage',500000,1,'hoàn thành'),
(2,'karaoke',400000,1,'một giờ'),
(3,'thức ăn',100000,1,'một khẩu phần'),
(4,'nước uống',20000,1,'chai'),
(5,'thuê xe di chuyển tham quan resort',1000000,1,'tour');

insert into hop_dong_chi_tiet
values
(1,1,2,3),
(2,2,1,2),
(3,3,4,2);

