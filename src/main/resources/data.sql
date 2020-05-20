INSERT into users (username, password,enabled)
VALUES('user','user', true);

INSERT into users (username, password,enabled)
VALUES('admin','admin', true);

INSERT into authorities (username, authority)
VALUES('user','ROLE_USER');

INSERT into authorities (username, authority)
VALUES('admin','ROLE_ADMIN');
