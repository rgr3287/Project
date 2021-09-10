DROP TABLE tblMember;

CREATE TABLE tblMember(
   name VARCHAR(20)  NOT NULL,
   id VARCHAR(20) NOT NULL,
   pwd VARCHAR(20) NOT NULL,
   birthday VARCHAR(6) NOT NULL,
   hobby VARCHAR(5)  NOT NULL,
   email VARCHAR(30) NOT NULL,
   zipcode VARCHAR(5) NOT NULL,
   address VARCHAR(60)  NOT NULL,
   PRIMARY KEY (id)
);

INSERT INTO tblMember
VALUES ('현근', 'rgs3287', '12341234', '950218','00000','rgz3287@gmail.com',
'1234', 'seoul');

DROP TABLE tblZipcode;

CREATE TABLE tblZipcode(
	zipcode char(5) NOT NULL,
  	--시
	area1 char(50) DEFAULT NULL,
  	--구
	area2 char(50) DEFAULT NULL,
  	--로
	area3 char(50) DEFAULT NULL
);

COMMIT

insert into tblZipcode values ('06133','서울특별시','강남구','강남대로');
insert into tblZipcode values ('06307','서울특별시','강남구','개포로');
insert into tblZipcode values ('06361','서울특별시','강남구','광평로');
insert into tblZipcode values ('06327','서울특별시','강남구','선릉로');
insert into tblZipcode values ('06027','서울특별시','강남구','압구정로');
insert into tblZipcode values ('05264','서울특별시','강동구','올림픽로');
insert into tblZipcode values ('08384','서울특별시','구로구','구로동로');
insert into tblZipcode values ('08264','서울특별시','구로구','부일로');
insert into tblZipcode values ('08596','서울특별시','금천구','벚꽃로');
insert into tblZipcode values ('01691','서울특별시','노원구','상계로');
insert into tblZipcode values ('06960','서울특별시','동작구','성대로');
insert into tblZipcode values ('06936','서울특별시','동작구','장승배기로');
insert into tblZipcode values ('02446','서울특별시','동대문구','이문로');
insert into tblZipcode values ('04386','서울특별시','용산구','한강대로');


select * from tblMember;
-- //delete tblMember where id like '12341234' ;











