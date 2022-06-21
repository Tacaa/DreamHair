insert into role (name) values ('ROLE_ADMIN');
insert into role (name) values ('ROLE_REGISTERED_USER');

insert into users (USER_TYPE, username, password, name, last_name, enabled) values ('ADMIN', 'taca', 'taca', 'Tatjana', 'Gavrilovic', true);
insert into users (USER_TYPE, username, password, name, last_name, enabled) values ('REGISTERED_USER', 'ana', 'ana', 'Ana', 'Gavrilovic', true);

insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 2);

