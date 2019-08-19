DROP TABLE IF EXISTS images;

CREATE TABLE images(
id INT AUTO_INCREMENT PRIMARY KEY ,
name VARCHAR(250) NOT NULL,
title VARCHAR(250) DEFAULT NULL
);

INSERT INTO images (name, title) VALUES
('Kafka image', 'kafka title'),
('Elastic image', 'elastic title');