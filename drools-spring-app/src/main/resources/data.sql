insert into role (name) values ('ROLE_ADMIN');
insert into role (name) values ('ROLE_REGISTERED_USER');

insert into users (USER_TYPE, username, password, name, last_name, enabled) values ('ADMIN', 'taca', '$2a$10$kuG.m.KvcrNFEew/63ldyOp2Lkf.PNIOs0JKkWdR2lW9EhxlyJsuW', 'Tatjana', 'Gavrilovic', true);
insert into users (USER_TYPE, username, password, name, last_name, enabled) values ('REGISTERED_USER', 'ana', '$2a$10$zQFFPAKIA8NjiFlgV7aOHO5vQGC5/NOp8uk6qilpayB0sNU.9xHrO', 'Ana', 'Gavrilovic', true);

insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 2);

