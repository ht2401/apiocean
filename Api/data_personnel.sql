create database data_personnel;

use data_personnel;

create table Personnel (id int auto_increment primary key, username varchar(50), position varchar(20), time_in time , time_out time);


insert into Personnel (username, position , time_in , time_out) values ("hathang", "giam doc" , "07:06:55" , "09:09:09");
insert into Personnel (username, position , time_in , time_out) values ("hathang1", "giam doc" , "07:06:55" , "07:29:09");

select *from Personnel;

select *from Personnel
where hour(time_in) >= 7 and hour(time_out) <= 8 