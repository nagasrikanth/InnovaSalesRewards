insert into b2bcustomer(id, name) values (1000, 'naga');
insert into b2bcustomer(id, name) values (1001, 'srikant');
insert into b2bcustomer(id, name) values (1002, 'modi');

insert into transaction(id, description, total, save_date, customer_id) values (1001, 'Macyspurchase', 100, '2023-10-17 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1002, 'kohlspurchase', 50, '2023-10-01 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1003, 'Indianstorepurchase 3', 120, '2023-10-10 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1004, 'Aldipurchase 10', 175.32, '2023-10-07 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1005, 'greatclips', 65.75, '2023-10-05 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1006, 'Kroger', 210.50, '2023-10-03 10:20:10', 1000);
insert into transaction(id, description, total, save_date, customer_id) values (1009, 'Heb', 42.80, '2023-10-18 17:10:10', 1000);

insert into transaction(id, description, total, save_date, customer_id) values (1200, 'costco', 25.60, '2023-10-01 12:20:10', 1002);
insert into transaction(id, description, total, save_date, customer_id) values (1201, 'canes', 80.50, '2023-10-05 15:00:10', 1002);
insert into transaction(id, description, total, save_date, customer_id) values (1202, 'chipotle', 116.14, '2023-10-10 11:30:10', 1002);

insert into transaction(id, description, total, save_date, customer_id) values (1008, 'mcDonalds', 200, '2023-10-17 10:20:10', 1001);