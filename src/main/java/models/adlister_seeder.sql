use adlister_db;
# TODO the drop have to be in reverse order because the ads tabel depeneds on the users
drop table if exists  ads;
drop table if exists users;

# TODO the users table has to be created first because the ads table depends on it
create table IF NOT EXISTS users(
    id int unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    username varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    password varchar(128) NOT NULL
);

create table IF NOT EXISTS ads (
    id int unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY ,
    user_id int unsigned NOT NULL,
    title varchar(128) NOT NULL,
    description varchar(300) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);
