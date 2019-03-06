create database microservice;

#创建一个名称为tb_user的表
use microservice;
create table tb_user(
  id int(32) primary key auto_increment,
  username varchar(32),
  address varchar(256)
);

#插入三条记录
insert into  tb_user values ('1','小韩','北京市海淀区');
insert into  tb_user values ('2','小石','北京市昌平区');
insert into  tb_user values ('3','小陈','北京市顺义区');

