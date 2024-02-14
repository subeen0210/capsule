CREATE TABLE bottle(
b_no number(2) primary key,
s_no number(2)  NOT NULL,
b_date date NOT NULL, 
m_no number(2) NOT NULL
);

CREATE TABLE  memo(
m_no number(2) primary key,
m_date date NULL, 
m_keyword varchar2(100 char)  NOT NULL,
m_text varchar2(250 char) NOT NULL,
m_pic  varchar2(100 char) NULL
);

CREATE TABLE  happy_user(
u_id varchar2(20 char) primary key, 
u_pw varchar2(20 char) NOT NULL,
u_email varchar2(50 char) NOT NULL, 
u_name varchar2(20 char) NOT NULL
);

CREATE TABLE  shelf(
s_no   number(2)  primary key, 
u_id   varchar2(20 char) NOT NULL, 
b_no   number(2) NOT NULL
);

drop table bottle;
drop table memo;

select * from bottle;
select * from memo;
select * from happy_user;
select * from shelf;