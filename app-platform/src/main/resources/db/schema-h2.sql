DROP TABLE user IF EXISTS;

CREATE TABLE user (
    id VARCHAR(32),
    username VARCHAR(40),
    name VARCHAR(20),
    age INT,
    balance DECIMAL(10, 2),
    PRIMARY KEY(id)
);