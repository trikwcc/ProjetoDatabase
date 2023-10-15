CREATE TABLE IF NOT EXISTS admin (
    id SERIAL PRIMARY KEY,
    username VARCHAR(18) NOT NULL,
    password VARCHAR(100) NOT NULL,
    date DATE
);

CREATE TABLE IF NOT EXISTS policeOfficer (
    id SERIAL PRIMARY KEY,
    username VARCHAR(18) NOT NULL,
    password VARCHAR(100) NOT NULL,
    position VARCHAR(100) NOT NULL,
    date DATE
);

CREATE TABLE IF NOT EXISTS criminal (
    criminalId SERIAL PRIMARY KEY, -- Changed from INT AUTO_INCREMENT
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    gender CHAR(1) CHECK (gender IN ('M', 'F')), -- Fixed the column name
    image VARCHAR(255),
    date DATE,
    due DATE,
    timeNeedsServedInJail INT,
    incarceratedOrArrested BOOLEAN DEFAULT FALSE,
    setToArrest BOOLEAN DEFAULT FALSE
);

INSERT INTO admin (username, password) VALUES ('admin', 'admin123');
INSERT INTO policeOfficer (username, password, position) VALUES ('Polska', 'vodkaLife', 'Detective');
INSERT INTO policeOfficer (username, password, position) VALUES ('Admeir', 'vodkaLife', 'Deputy');

SELECT * FROM admin;
