drop database userAddressdb;
create database userAddressdb;
use userAddressdb;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);


INSERT INTO users (name, email) VALUES 
('Alice Andersson', 'alice@example.com'), 
('Bob Berg', 'bob@example.com'), 
('Charlie Carlsson', 'charlie@example.com'), 
('David Dahl', 'david@example.com'), 
('Emma Eriksson', 'emma@example.com'), 
('Felix Forsberg', 'felix@example.com'), 
('Greta Gustafsson', 'greta@example.com'), 
('Hugo Hansson', 'hugo@example.com'), 
('Ida Isaksson', 'ida@example.com'), 
('Johan Johansson', 'johan@example.com');

CREATE TABLE addresses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    user_id BIGINT UNIQUE,
    FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON DELETE CASCADE
); 


INSERT INTO addresses (street, city, user_id) 
VALUES ('Storgatan 1', 'Stockholm', 1), 
('Lilla Vägen 12', 'Göteborg', 2), 
('Björkvägen 5', 'Malmö', 3), 
('Södra Gatan 44', 'Uppsala', 4), 
('Östra Esplanaden 7', 'Linköping', 5), 
('Hamnvägen 9', 'Västerås', 6), 
('Skogsstigen 21', 'Örebro', 7), 
('Solvägen 3', 'Helsingborg', 8), 
('Parkgatan 17', 'Jönköping', 9),
('Strandvägen 55', 'Lund', 10);