create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table phieuXuat( 
	soPX int auto_increment primary key,
    ngayXuat date
);
create table vatTu(
	maVTU varchar(50) primary key,
    tenVTU varchar(50)
);
create table phieuNhap(
	soPN int auto_increment primary key,
    ngayNhap date
);
create table DonDH(
	soDH int auto_increment primary key,
    ngayDH date,
    maNCC_NhaCC varchar(50)
    
);
create table sdt_type(
	maNCC varchar(50) primary key,
	tenChuSDT varchar(50),
    sdt varchar(10)
);
create table nhaCC(
	maNCC varchar(50) primary key,
    tenNCC varchar(250),
    diaChi varchar(250),
    sdt varchar(10),
    sdt_maNCC varchar(50),
    foreign key(sdt_maNCC) references sdt_type(maNCC)
);
create table phieuXuat_vatTu(
	soPx_PhieuXuat int,
    maVTU_VatTu varchar(50),
    constraint pk_phieuXuat_vatTu primary key(soPx_PhieuXuat,maVTU_VatTu),
    foreign key(soPx_PhieuXuat ) references phieuXuat(soPX),
    foreign key(maVTU_VatTu) references vatTu(maVTU)
);
create table vatTu_phieuNhap(
	maVTU_vatTu varchar(50),
    soPN_phieuNhap int,
    constraint pk_vattu_phieunhap primary key(maVTU_vatTu,soPN_phieuNhap),
    foreign key(maVTU_vatTu) references vatTu(maVTU) ,
    foreign key(soPN_phieuNhap) references phieuNhap(soPN)
);
create table vatTu_donDH(
	maVTU_vatTu varchar(50),
    soDH_donDH int,
    constraint pk_vattu_dondh primary key (maVTU_vatTu,soDH_donDH),
    foreign key(maVTU_vatTu) references vatTu(maVTU) ,
    foreign key(soDH_donDH) references DonDH(soDH) 
);

