CREATE TABLE IF NOT EXISTS admin (
    id SERIAL PRIMARY KEY,
    username VARCHAR(18) NOT NULL,
    password VARCHAR(100) NOT NULL
);

INSERT INTO admin (username, password) VALUES ('admin', 'admin123');

SELECT * FROM admin;