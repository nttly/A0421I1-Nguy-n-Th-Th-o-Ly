create database QuanLySinhVien3;
use  QuanLySinhVien3;
create table Class(
	classId int not null auto_increment primary key,
    className varchar(50) not null,
    startDate datetime not null,
    `status` bit
);
create table Student(
	studentId int not null auto_increment primary key,
    studentName varchar(50) not null,
    address varchar(50),
    phone varchar(10),
    `status` bit,
    classId int not null,
    foreign key(classId) references Class(classId)
);
create table `Subject`(
	subId int not null auto_increment primary key,
    subName varchar(50) not null,
    credit tinyint not null default 1 check (credit >=1),
    `status` bit default 1
);
create table Mark(
	MarkId int not null auto_increment primary key,
    subId int not null,
    studentId int not null,
    mark float default 0 check (Mark between 0 and 100),
    examTimes tinyint default 1,
    unique (subId,studentId),
    foreign key(subId) references `Subject`(subId),
    foreign key(studentId) references Student(studentId)
);
insert into Class values (1,'a1','2008-12-20',1);
insert into Class values (2,'a2','2008-12-22',1);
insert into Class values (3,'b3',current_date,0);
insert into Student(studentName, address, phone,`status`,classId) values ('Hung','HN','0123456',1,1);
insert into Student(studentName, address, `status`,classId) values ('Ly','QN',1,1);
insert into Student(studentName, address, phone,status,classId) values ('Manh','HN','0123453216',0,2);
insert into `Subject` values (1,'CF',5,1),
							(2,'C',6,1),
                            (3,'HDJ',5,1),
                            (4,'RDBMS',10,1);
insert into Mark(SubId,StudentId,Mark,ExamTimes) values (1,1,8,1),
														(1,2,10,2),
                                                        (2,1,12,1);
select *from student;
select address,count(studentId) as 'số lượng học viên' from student group by address;
SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;
SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;
SELECT S.StudentId,S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) > 15;
SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;
SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);