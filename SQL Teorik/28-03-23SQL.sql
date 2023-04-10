-- Database: db_real_estate

-- DROP DATABASE IF EXISTS db_real_estate;

CREATE DATABASE db_real_estate
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Turkish_Turkey.1254'
    LC_CTYPE = 'Turkish_Turkey.1254'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
-- SCHEMA: sc_real_estate

-- DROP SCHEMA IF EXISTS sc_real_estate ;

CREATE SCHEMA IF NOT EXISTS sc_real_estate
    AUTHORIZATION postgres;
	
	
-- Table: public.users

-- DROP TABLE IF EXISTS public.users;

CREATE TABLE IF NOT EXISTS sc_real_estate.users
(
    id_user bigint NOT NULL DEFAULT nextval('users_id_user_seq'::regclass),
    firstname character(45) COLLATE pg_catalog."default",
    lastname character(45) COLLATE pg_catalog."default",
    username character(45) COLLATE pg_catalog."default",
    email character(60) COLLATE pg_catalog."default",
    password character(128) COLLATE pg_catalog."default",
    CONSTRAINT users_pkey PRIMARY KEY (id_user)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.users
    OWNER to postgres;
	
--Kullanıcı Ekleme	
	
INSERT INTO sc_real_estate.users(
	firstname, lastname, username, email, password)
	VALUES ('Ahmet Doruk', 'Bıyıklı', 'ahmet', 'a@gmail.com', '123456');
	
	INSERT INTO sc_real_estate.users(
	firstname, lastname, username, email, password)
	VALUES ('Ayşe', 'ÖZcen', 'ayse', 'a@gmail.com', '123456');
	
		INSERT INTO sc_real_estate.users(
	 firstname, lastname, username, email, password)
	VALUES ('Yasin', 'Solak', 'yasin', 'y@gmail.com', '123456');