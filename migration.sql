USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(240) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);

insert into ads (user_id, title, description) VALUES
                                                  (1, 'PS5 4 sale', 'I need money bad. Not for drugs'),
                                                    (1, 'Honda accord 4 sale', 'I need money bad. No drug trades'),
                                                    (1, 'Will clean 4 cash', 'I need money asap. Grandma getting evicted');

insert into users (username, email, password) VALUES('frylock', 'fry@lock.com', 'password');