CREATE DATABASE ecommerce
USE ecommerce
CREATE TABLE eproduvt(ID bigint primary key auto_increment, name varchar(100), price decimal(10,2), date_added timestamp default now())
INSERT INTO eproduct(name, ‘HP Laptop ABC’, 12000)
INSERT INTO eproduct(name, ‘Acer Laptop ABC’, 14000) 
INSERT INTO eproduct(name, ‘lenovo Laptop ABC’, 18000) 
select * from eproduct
INSERT INTO eproduct(name, ‘Lenovo Laptop ABC’, 12000) 
select * from eproduct
exit
