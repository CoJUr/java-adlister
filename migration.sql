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
    `price_in_cents` int unsigned,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);

insert into users (username, email, password)
VALUES ('andy123', 'andy@email.com', 'password'),
('becky123', 'becky@email.com', 'password'),
('cindy123', 'andy@email.com', 'password');



INSERT INTO ads (user_id, title, description, price_in_cents)
VALUES (1, 'Selling mens clothes', 'Please buy. 10 USD each. I need money', 1000),
       (2, 'Selling womens shoes', 'All my single ladies. 20 dollars each', 2000),
       (3, 'Cats wanted', 'Kittens and cats please. Will pay three fifty ', 350);
