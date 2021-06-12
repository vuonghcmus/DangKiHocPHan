create database DangKiHocPhan
use DangKiHocPhan

create table user(
	username varchar(20),
    password varchar(20),
    type int,
    id varchar(50),
    primary key (username)
)

insert into user values("khiet", "123456", 1, null)
insert into user values("nam", "123456", 1, null)
insert into user values("thanh", "123456", 1, null)
insert into user values("19120728", "123456", 0, null)
insert into user values("19120725", "123456", 0, null)

create table teacher(
	name nvarchar(50),
	email varchar(50),
	phone_number varchar(15),
	address nvarchar(100),
	username varchar(20),
	primary key (username)
)

insert into teacher values("Nguyễn Văn Khiết", "khiet123@gmail.com", "19008008", "Quận Thủ Đức", "khiet");
insert into teacher values("Lê Văn Nam", "nam456@gmail.com", "0343333395", "Quận 2", "nam");
insert into teacher values("Hồ Tuấn Thanh", "thanh123@gmail.com", "19008198", "Quận 5", "thanh");

create table subject(
	maMonHoc varchar(20),
    name nvarchar(50),
    soTinChi int,
    maSinhVien varchar(20),
    primary key(maMonHoc),
    KEY maSinhVien (maSinhVien),
	CONSTRAINT fk_subject_student FOREIGN KEY (maSinhVien) REFERENCES student (id)
)

insert into subject values("BAA00011", "Anh văn 1", 3, null)
insert into subject values("BAA00022", "Thể dục 2", 2, null)
insert into subject values("BAA000103", "Tư tưởng Hồ Chí Minh", 2, null)
insert into subject values("BIO00001", "Sinh đại cương 1", 3, null)
insert into subject values("CSC10002", "Ký thuật lập trình", 4, null)
insert into subject values("CSC10009", "Hệ thống máy tính", 2, null)
insert into subject values("CSC10006", "Cơ sở dữ liệu", 4, null)
insert into subject values("CSC13102", "Lập trình ứng dụng Java", 4, null)
insert into subject values("ENV00002", "Khoa học môi trường", 2, null)
insert into subject values("MTH00001", "Vi tích phân 1C", 4, null)
insert into subject values("MTH00030", "Đại số tuyến tính", 4, null)
insert into subject values("MTH00040", "Xác suất thống kê", 4, null)
insert into subject values("MTH00050", "Toán học tổ hợp", 4, null)
insert into subject values("PHY00002", "Vật lý đại cương 2", 3, null)
insert into subject values("CSC10003", "Lập trình hướng đối tượng", 4, null)

create table semester(
	name varchar(20),
    year varchar(4),
    ngaybatdau varchar(20),
    ngayketthuc varchar(20),
    hkhientai int,
    primary key (ngaybatdau)
)

insert into semester values("HK1", "2021", "20-09-2020", "08-01-2021", 0) 
insert into semester values("HK2", "2020", "15-05-2020", "05-09-2020", 0) 
insert into semester values("HK1", "2019", "20-09-2018", "08-01-2019", 0) 
insert into semester values("HK2", "2019", "19-02-2019", "05-06-2019", 0) 
insert into semester values("HK1", "2020", "20-09-2019", "08-01-2020", 0) 
insert into semester values("HK2", "2021", "10-03-2021", "03-07-2021", 1) 

create table student(
	id varchar(20),
    name nvarchar(50),
    gioitinh int,
    mamonhoc varchar(20),
    address nvarchar(50),
    primary key(id)
)

insert into student values("19120728", "Trương Quốc Vương", 1, null, "Bình Định");
insert into student values("19120725", "Lê Trường Vũ", 1, null, "Bình Dương");
insert into student values("19120724", "Lê Anh Vũ", 1, null, "Ninh Thuận");
insert into student values("19120721", "Phan Nguyễn Anh Vinh", 1, null, "Bình Định");
insert into student values("19120729", "Bùi Ngọc Thảo Vy", 0, null, "TP Hồ Chí Minh");
insert into student values("19120716", "Lê Trọng Việt", 1, null, "Thanh Hóa");
insert into student values("19120673", "Nguyễn Phú Thụ", 1, null, "Quảng Bình");
insert into student values("19120685", "Võ Ngọc Tín", 0, null, "Vĩnh Long");
insert into student values("19120693", "Châu Lý Phương Trinh", 0, null, "Khánh Hòa");
insert into student values("19120730", "Ngô Huỳnh Hải Vy", 0, null, "Bình Dương");
insert into student values("19120731", "Trần Ngọc Vỹ", 1, null, "Quảng Ngãi");

create table class(
	malop varchar(20),
    primary key(malop)
)

insert into class values("19CTT4")
insert into class values("19CTT1")
insert into class values("19CTT2")
insert into class values("19CTT3")
insert into class values("19HO1")
insert into class values("19SH1")
insert into class values("19CM1")
insert into class values("20CTT4")

create table student_class(
	id_student varchar(20),
    malop_class varchar(20),
    primary key(id_student, malop_class),
	KEY fk_student_class (malop_class),
	CONSTRAINT fk_classtudent_student FOREIGN KEY (id_student) REFERENCES student (id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_classtudent_class FOREIGN KEY (malop_class) REFERENCES class (malop) ON DELETE CASCADE ON UPDATE CASCADE
)

create table student_subject(
	id_student varchar(20),
    maMonHoc_subject varchar(20),
    primary key (id_student, maMonHoc_subject),
    KEY fk_student_subject (maMonHoc_subject),
	CONSTRAINT fk_subjectStudent_student FOREIGN KEY (id_student) REFERENCES student (id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_subjectStudent_subject FOREIGN KEY (maMonHoc_subject) REFERENCES subject (maMonHoc) ON DELETE CASCADE ON UPDATE CASCADE
)

drop table dangkihocphan
create table dangkihocphan(
	id int auto_increment,
	name varchar(20),
	ngaybatdau varchar(20), 
    ngayketthuc varchar(20),
    hkhientai int default 0,
    primary key(id)
)

insert into dangkihocphan(name, ngaybatdau, ngayketthuc) values("HK1 - 2020", "10-09-2019", "25-09-2020");
insert into dangkihocphan(name, ngaybatdau, ngayketthuc) values("HK1 - 2019", "10-09-2018", "25-09-2018");
insert into dangkihocphan(name, ngaybatdau, ngayketthuc) values("HK2 - 2019", "09-02-2019", "24-02-2019");
insert into dangkihocphan(name, ngaybatdau, ngayketthuc) values("HK2 - 2020", "05-05-2020", "20-05-2020");
insert into dangkihocphan(name, ngaybatdau, ngayketthuc, hkhientai) values("HK2 - 2021", "01-03-2021", "16-06-2021", 1);
insert into dangkihocphan(name, ngaybatdau, ngayketthuc) values("HK1 - 2021", "10-09-2020", "25-09-2020");

create table course(
	maMonHoc varchar(20),
    tenmon nvarchar(50),
    soTinChi int,
    gvlt nvarchar(50),
    tenphonghoc varchar(20),
    ngayhoc varchar(20),
    cahoc int,
    maxSlot int,
    primary key(maMonHoc)    
)

create table student_course(
	id_student varchar(20),
    maMonHoc_course varchar(20),
    primary key (id_student, maMonHoc_course),
    KEY fk_student_course (maMonHoc_course),
	CONSTRAINT fk_courseStudent_student FOREIGN KEY (id_student) REFERENCES student (id) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT fk_courseStudent_course FOREIGN KEY (maMonHoc_course) REFERENCES course (maMonHoc) ON DELETE CASCADE ON UPDATE CASCADE
)
