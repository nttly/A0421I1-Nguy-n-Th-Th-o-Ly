create database caseStudy;
use caseStudy;
create table vi_tri(
	id_viTri int auto_increment primary key,
    tenViTri varchar(45)
);
create table trinh_do(
	id_trinhDo int auto_increment primary key,
    trinhDo varchar(45)
);
create table bo_phan(
	id_boPhan int auto_increment primary key,
    tenBoPhan varchar(45)
);
create  table nhan_vien(
	id_nhanVien int auto_increment primary key,
    hoTen varchar(45),
    idviTri int,
    idtrinhDo int,
    idboPhan int,
    ngaySinh date,
    soCMND varchar(45),
    luong double,
    sdt varchar(10),
    email varchar(45),
    diaChi varchar(45),
    foreign key(idviTri) references vi_tri(id_viTri),
    foreign key(idtrinhDo) references trinh_do(id_trinhDo),
    foreign key(idboPhan) references bo_phan(id_boPhan)
);

create table loai_khach(
	id_loaiKhach int auto_increment primary key,
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
	id_kieuThue int auto_increment primary key,
    tenKieuThue varchar(45),
    gia int
);
create table loai_dich_vu(
	id_loaiDichVu int auto_increment primary key,
    tenLoaiDichVu varchar(45)
);
create table dich_vu(
	id_dichVu int auto_increment primary key,
    ten_dichVu varchar(45) ,
    dienTich int,
    soTang int,
    soNguoiToiDa varchar(45),
    chiPhiThue varchar(45),
    IdKieuThue int,
    IdLoaiDichVu int,
    trangThai varchar(45),
    foreign key(IdKieuThue) references kieu_thue(id_kieuThue),
    foreign key(IdLoaiDichVu) references loai_dich_vu(id_loaiDichVu)
);
create table dich_vu_di_kem(
	id_dichVuDiKem int primary key,
    tenDichVuDiKem varchar(45),
    gia int,
    donVi int,
    trangThaiKhachDung varchar(45)
);


create table hop_dong(
	id_hopDong int auto_increment primary key,
    id_nhanVien int,
    id_khachHang int,
    id_dichVu int,
    ngayLamHopDong date,
    ngayKetHopDong date,
    tienDatCoc int,
    tongTien int,
    foreign key(id_nhanVien) references nhan_vien(id_nhanVien),
    foreign key(id_khachHang) references khach_hang(id_khachHang),
    foreign key(id_dichVu) references dich_vu(id_dichVu)
);
create table hop_dong_chi_tiet(
	id_hopDongChiTiet int auto_increment primary key,
    id_hopDong int,
    id_dichVuDiKem int,
    soLuong int,
    foreign key(id_hopdong) references hop_dong(id_hopDong),
    foreign key(id_dichVuDiKem) references dich_vu_di_kem(id_dichVuDiKem)
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
(1,'Hồ Đình',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
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
(3,1,'Lê Hùng','1990-02-12','342345456','0906456756','hung@gmail.com','Quảng Ngãi'),
(4,4,'Đoàn Lĩnh','1978-02-12','234345665','0935678767','doanlinhgmail.com','Đà Nẵng'),
(5,5,'Tô Lâm','1995-02-12','323454345','090542546','tolam@gmail.com','Vinh'),
(6,1,'Thảo Ly','2000-08-20','323454345','090542546','nttl2008@gmail.com','Quảng Nam'),
(7,1,'Thùy Linh','2000-08-20','323454345','090542546','nttl2008@gmail.com','Vinh');
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
(2,3,4,2,'2018-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2019-03-12','2021-03-22',5000000,100000000),
(4,2,3,5,'2018-03-12','2021-03-22',5000000,100000000),
(5,6,6,2,'2018-01-12','2021-01-20',600000,7000000),
(6,6,6,2,'2018-01-12','2021-01-20',700000,8000000),
(7,6,6,2,'2019-01-12','2021-01-20',800000,9000000),
(8,6,7,2,'2019-01-12','2021-01-20',800000,9000000);
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
(3,3,4,2),
(4,8,3,2);
select *from nhan_vien;
-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
select *from nhan_vien 
where (hoTen like 'H%' or hoTen like 'T%' or hoTen like 'K%' )and length(hoTen)<=15;
-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select id_khachhang,id_loaikhach,hoTen,ngaySinh,soCMND,sdt,email,diachi, round(datediff(curdate(),ngaysinh)/365,0) as tuoi from khach_hang 
where (round(datediff(curdate(),ngaysinh)/365,0)  >18 and round(datediff(curdate(),ngaysinh)/365,0)<50) and (diachi='Đà Nẵng' or diachi='Quảng Nam') ;
-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
select *from khach_hang;
select distinct hoTen from khach_hang ;

-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
 select k.id_khachHang, k.hoten,l.tenloaikhach,h.id_hopDong,d.ten_dichvu,h.ngaylamhopdong,h.ngaykethopdong,(d.chiphithue+ht.soluong*dk.gia) as tongtien 
 from khach_hang as k
 left outer join hop_dong as h  on h.id_khachHang=k.id_khachhang
  join loai_khach as l on k.id_loaiKhach=l.id_loaiKhach
  join dich_vu as d on h.id_dichVu=d.id_dichVu
  join hop_dong_chi_tiet as ht on h.id_hopdong=ht.id_hopdongchitiet
  join dich_vu_di_kem as dk on ht.id_dichvudikem=dk.id_dichvudikem;
  -- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
  select k.hoten,count(h.id_khachhang) as solanthue from khach_hang as k 
  join loai_khach as l on k.id_loaikhach=l.id_loaikhach
  join hop_dong as h on k.id_khachhang=h.id_khachhang
  where (l.tenloaikhach='diamond')  order by solanthue;
-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
select d.id_dichvu,d.ten_dichvu,d.dientich,d.chiphithue,l.tenloaidichvu,h.ngaylamhopdong
from dich_vu as d join loai_dich_vu as l on d.idloaidichvu = l.id_loaidichvu
join hop_dong as h on d.id_dichvu=h.id_dichvu
where year(h.ngaylamhopdong) >= 2019  and not (month(h.ngaylamhopdong)=1 or month(h.ngaylamhopdong)=2 or month(h.ngaylamhopdong)= 3);
-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019
select d.id_dichvu,d.ten_dichvu,d.dientich,d.songuoitoida,d.chiphithue,l.tenloaidichvu,h.ngaylamhopdong
from dich_vu as d join loai_dich_vu as l on d.idloaidichvu = l.id_loaidichvu
join hop_dong as h on d.id_dichvu=h.id_dichvu
where year(h.ngaylamhopdong)=2018 and not year(h.ngaylamhopdong)=2019;
-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
select month(ngaylamhopdong) as thang,count(id_khachhang) as sokhach from hop_dong where year(ngaylamhopdong)=2019 group by month(ngaylamhopdong) ;
-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet).
select h.id_hopdong,h.ngaylamhopdong,h.ngaykethopdong,h.tiendatcoc, count(ht.id_hopdongchitiet) as soLuongDichVuDiKem
from hop_dong as h join hop_dong_chi_tiet as ht on h.id_hopdong=ht.id_hopdong group by h.id_hopdong ;
-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có TenLoaiKhachHang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”.
select d.id_dichvudikem,k.hoten,d.tendichvudikem,d.gia,d.donvi,d.trangthaikhachdung
from dich_vu_di_kem as d 
join hop_dong_chi_tiet as ht on d.id_dichvudikem = ht.id_dichvudikem
join hop_dong as h on ht.id_hopdong=h.id_hopdong
join khach_hang as k on h.id_khachhang=k.id_khachhang
join loai_khach as l on k.id_loaikhach=l.id_loaikhach
where l.tenloaikhach='diamond' and (k.diachi='Vinh' or k.diachi='Quảng Ngãi');
-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
select id_hopdong,n.hoten,k.hoten,n.sdt as sdt_nv,k.sdt as sdt_kh ,tendichvu,tiendatcoc
from khach_hang as k join hop_dong as h on k.id_khachhang=h.id_khachhang
join nhan_vien as n on h.id_nhanvien=n.id_nhanvien