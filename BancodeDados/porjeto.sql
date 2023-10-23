CREATE TABLE IF NOT EXISTS admin (
    id SERIAL PRIMARY KEY,
    username VARCHAR(18) NOT NULL,
    password VARCHAR(100) NOT NULL,
    access_date DATE
);

CREATE TABLE IF NOT EXISTS policeOfficer (
    id SERIAL PRIMARY KEY,
    username VARCHAR(18) NOT NULL,
    password VARCHAR(100) NOT NULL,
    position VARCHAR(100) NOT NULL,
    gender CHAR(1) CHECK (gender IN ('M', 'F')),
    time_worked INT DEFAULT "0",
    people_arrested INT DEFAULT "0",
    started_time DATE,
    Active boolean,
    access_date DATE
);

CREATE TABLE IF NOT EXISTS criminal (
    criminalId SERIAL PRIMARY KEY,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    gender CHAR(1) CHECK (gender IN ('M', 'F')), 
    image VARCHAR(255),
    date DATE,
    due INT,
    time_needsJail INT,
    incarcerated_Arrested BOOLEAN DEFAULT FALSE,
    set_Arrest BOOLEAN DEFAULT FALSE
);

INSERT INTO admin (username, password) VALUES ('admin', 'admin123');
INSERT INTO policeOfficer (username, password, position) VALUES ('Polska', 'vodkaLife', 'Detective');
INSERT INTO policeOfficer (username, password, position) VALUES ('Admeir', 'vodkaLife', 'Deputy');

SELECT * FROM admin;
