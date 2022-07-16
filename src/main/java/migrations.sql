USE adlister_db;

DROP TABLE IF EXISTS users;

CREATE TABLE users(
                       id INT UNSIGNED AUTO_INCREMENT NOT NULL,
                       username VARCHAR(70) DEFAULT 'NONE',
                       email VARCHAR(150) NOT NULL,
                       password varchar(150) NOT NULL,
                       PRIMARY KEY (id)
);

DROP TABLE IF EXISTS ads;

CREATE TABLE ads(
                       id INT UNSIGNED AUTO_INCREMENT NOT NULL,
                       user_id INT UNSIGNED,
                       title VARCHAR(150) NOT NULL,
                       description varchar(250) NOT NULL DEFAULT 'NONE',
                       PRIMARY KEY (id),
                        FOREIGN KEY(user_id) REFERENCES users(id)
);

