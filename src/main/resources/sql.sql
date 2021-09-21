CREATE TABLE newsuser (
   id INT AUTO_INCREMENT PRIMARY KEY ,
   NAME VARCHAR(100) ,
   PASSWORD VARCHAR(100)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE utf8_general_ci ;

CREATE TABLE batis (
   b_id INT PRIMARY KEY AUTO_INCREMENT,
   b_name VARCHAR(20) ,
   b_date DATE ,
   b_desc VARCHAR(20)
)ENGINE=INNODB DEFAULT CHARSET=utf8 COLLATE utf8_general_ci;
#订单表
create table easybuyorder(
   id int primary key auto_increment,
   loginname varchar(100) ,
   createtime date ,
   cost float ,
   serialnumber varchar(20)
);

insert into easybuyorder (loginname, createtime, cost, serialnumber)
values ('凤姐','2020-04-29',10000,'111111111'),
        ('王益','2020-04-29',1000,'222222222');

#商品明细
create table orderdetail(
   id int primary key auto_increment,
   orderid int,
   productid int,
   cost float
);
insert into orderdetail(orderid,productid,cost)
values (1,1,4000),(1,2,6000),
       (2,3,1000);
#订单描述表
create table orderdesc(
  id int primary key auto_increment,
  orderid int,
  `describle` varchar(100)
);

insert into orderdesc(orderid,`describle`)
values(1,'凤姐的订单'),(2,'王益的订单');


create table student (
   sid int primary key auto_increment,
   sname varchar(20) , #姓名
   age int              #年龄
);
insert into student(sname,age) values ('学生1',18),('学生2',20);
create table teacher (
   tid int primary key auto_increment,
   tname varchar(20) , #姓名
   subject varchar(100) #课程
);
insert into teacher(tname,subject) values ('教师1','语文'),('教师2','数学');
create table stot( #关系对照表
   sid int, #学生id
   tid int  #教师id
);
insert into stot(sid,tid) values (1,1),(2,1),(1,2),(2,2) ;
