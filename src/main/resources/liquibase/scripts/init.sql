-- liquibase formatted sql

-- changeset q100s:1
CREATE TABLE ad (
    id INT PRIMARY KEY,
    price INT,
    title VARCHAR,
    description VARCHAR,
    image_url VARCHAR,
    author_id INT
);

CREATE TABLE comments (
    id INT PRIMARY KEY,
    price INT,
    text VARCHAR,
    created_at INT,
    author_id INT,
    ad_id INT
);

CREATE TABLE users (
    id INT PRIMARY KEY,
    email VARCHAR,
    password VARCHAR,
    first_name VARCHAR,
    last_name VARCHAR,
    phone_number VARCHAR,
    role VARCHAR, --enum Role
    image_url VARCHAR
);