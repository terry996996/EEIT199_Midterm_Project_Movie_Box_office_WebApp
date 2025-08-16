CREATE DATABASE midterm;
USE midterm;

CREATE TABLE movie(
	movie_id INT primary key identity(1,1),
	country NVARCHAR(1000) not null, 
	movie_name_cn NVARCHAR(1000) not null,
	applicant_company NVARCHAR(1000) not null,
	production_unit NVARCHAR(1000) not null,
	theater_showing_num INT not null,
	box_office BIGINT not null,
	box_office_sales BIGINT not null,
	create_name NVARCHAR(1000),
	create_time DATETIME,
	update_name NVARCHAR(1000),
	update_time DATETIME
);

CREATE TABLE user_account(
	id INT primary key identity(1,1),
	account NVARCHAR(100) not null Unique,
	password NVARCHAR(100) not null,
);


-- SELECT * FROM movie
-- SELECT * FROM user_account


-- TRUNCATE TABLE movie;
-- TRUNCATE TABLE user_account;

-- DROP TABLE movie;
-- DROP TABLE user_account;