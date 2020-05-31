DROP SCHEMA IF EXISTS `clinics`;
CREATE SCHEMA IF NOT EXISTS `clinics`
    CHARACTER SET `utf8`;

USE `clinics`;

DROP TABLE IF EXISTS `clinic`;
CREATE TABLE `clinic`
(
    `id`       BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name`     VARCHAR(255) NOT NULL,
    `phone`    VARCHAR(255) NOT NULL,
    `email`    VARCHAR(255) NOT NULL,
    `country`  VARCHAR(255) NOT NULL,
    `city`     VARCHAR(255) NOT NULL,
    `street`   VARCHAR(255) NOT NULL,
    `building` VARCHAR(255) NOT NULL

);

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `fk_clinic_id` BIGINT       NOT NULL,
    `first_name`   VARCHAR(255) NOT NULL,
    `last_name`    VARCHAR(255) NOT NULL,
    `birthday`     DATE         NOT NULL,
    `gender`       VARCHAR(255) NOT NULL,
    `email`        VARCHAR(255),
    `phone`        VARCHAR(255),
    `position`     VARCHAR(255) NOT NULL,
    `country`      VARCHAR(255),
    `city`         VARCHAR(255),
    `street`       VARCHAR(255),
    `building`     VARCHAR(255),
    CONSTRAINT `fk_doctor_to_clinic` FOREIGN KEY (`fk_clinic_id`) REFERENCES `clinic` (`id`)
);

DROP TABLE IF EXISTS `patient`;
CREATE TABLE `patient`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `clinic_id`  BIGINT       NOT NULL,
    `first_name` VARCHAR(255) NOT NULL,
    `last_name`  VARCHAR(255) NOT NULL,
    `birthday`   DATE         NOT NULL,
    `gender`     VARCHAR(255) NOT NULL,
    `email`      VARCHAR(255),
    `phone`      VARCHAR(255) NOT NULL,
    `country`    VARCHAR(255),
    `city`       VARCHAR(255),
    `street`     VARCHAR(255),
    `building`   VARCHAR(255)
);

DROP TABLE IF EXISTS `diagnosis`;
CREATE TABLE `diagnosis`
(
    `id`         BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `patient_id` BIGINT NOT NULL,
    `date`       DATE   NOT NULL,
    `analyzes`   VARCHAR(255),
    `diagnosis`  VARCHAR(255),
    `recipe`     VARCHAR(255),
    CONSTRAINT `fk_diagnosis_to_patient` FOREIGN KEY (`patient_id`) REFERENCES `patient` (`id`)
);

DROP TABLE IF EXISTS `clinic_patient`;
CREATE TABLE `clinic_patient`
(
    `id`            BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `fk_clinic_id`  BIGINT NOT NULL,
    `fk_patient_id` BIGINT NOT NULL,
    CONSTRAINT `fk_clinic_patient_to_clinic` FOREIGN KEY (`fk_clinic_id`) REFERENCES `clinic` (`id`),
    CONSTRAINT `fk_clinic_patient_to_patient` FOREIGN KEY (`fk_patient_id`) REFERENCES `patient` (`id`)
);

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`       BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `login`    VARCHAR(255) NOT NULL,
    `email`    VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    `status`   VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`
(
    `id`    BIGINT       NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `value` VARCHAR(255) NOT NULL
);

-- test data --
INSERT INTO clinic (id, name, phone, email, country, city, street, building)
VALUES (1, 'МедиЛюкс Минск', '+375-29-123-45-67', 'mlminsk@medilus.by', 'Беларусь', 'Минск', 'Притыцкого', '8');
INSERT INTO clinic (id, name, phone, email, country, city, street, building)
VALUES (2, 'МедиЛюкс Гомель', '+375-29-987-65-43', 'mlgomel@medilus.by', 'Беларусь', 'Гомель', 'Главная', '126');
INSERT INTO clinic (id, name, phone, email, country, city, street, building)
VALUES (3, 'МедиЛюкс Брест', '+375-29-456-91-45', 'mlbrest@medilus.by', 'Беларусь', 'Брест', 'Гоголя', '94');

INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position, country,
                    city, street, building)
VALUES (1, '1', 'Павел', 'Петров', '1975-11-15', 'мужской', 'pavel.petrov@medilux.by', '+375-44-128-32-64',
        'Терапевт',
        'Беларусь', 'Минск', 'Алибегова', '16-4');
INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position)
VALUES (2, '3', 'Иван', 'Иванов', '1985-01-07', 'мужской', 'ivan.ivanov@medilux.by', '+375-29-639-92-81',
        'Терапевт');
INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position)
VALUES (3, '1', 'Анна', 'Нестеренко', '1975-04-10', 'женский', 'anna.nesterenko@medilux.by',
        '+375-29-893-03-29',
        'Педиатр');
INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position)
VALUES (4, '2', 'Александр', 'Кузнецов', '1992-10-11', 'мужской', 'alex.kuznecov@medilux.by',
        '+375-29-289-19-45',
        'Стоматолог');
INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position)
VALUES (5, '3', 'Иван', 'Александров', '1979-12-12', 'мужской', 'ivan.alexandrov@medilux.by',
        '+375-44-173-92-17',
        'Лор');
INSERT INTO doctor (id, fk_clinic_id, first_name, last_name, birthday, gender, email, phone, position)
VALUES (6, '2', 'Наталья', 'Николаева', '1991-03-04', 'женский', 'natalia.nikolaeva@medilux.by',
        '+375-29-937-23-09',
        'Хирург');


INSERT INTO patient (id, clinic_id, first_name, last_name, birthday, gender, email, phone, country, city,
                     street,
                     building)
VALUES (1, '1', 'Виктория', 'Попова', '1971-05-04', 'женский', 'victoria.popova@mail.by',
        '+375-44-343-54-39',
        'Беларусь', 'Минск', 'Глебки', '46-3');
INSERT INTO patient (id, clinic_id, first_name, last_name, birthday, gender, email, phone, country, city,
                     street,
                     building)
VALUES (2, '2', 'Светлана', 'Васильева', '1969-12-12', 'женский', 'svetlana.vasileva@mail.by',
        '+375-29-125-56-94',
        'Беларусь', 'Гомель', 'Я. Коласа', '93-13');
INSERT INTO patient (id, clinic_id, first_name, last_name, birthday, gender, email, phone, country, city,
                     street,
                     building)
VALUES (3, '3', 'Геннадий', 'Сидоров', '1978-10-10', 'мужской', 'gena.sidorov@mail.by', '+375-44-822-64-34',
        'Беларусь',
        'Брест', 'Кирова', '9-2');
INSERT INTO patient (id, clinic_id, first_name, last_name, birthday, gender, phone, country, city, street,
                     building)
VALUES (4, '3', 'Андрей', 'Анндреев', '1998-01-02', 'мужской', '+375-44-826-38-20', 'Беларусь', 'Брест',
        'Главная',
        '46');

INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis, recipe)
VALUES (1, '1', '2019-01-03', 'Анализ крови, МРТ', 'Сердечная недостаточность. Направление к кардиологу', 'Лекарства');
INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis, recipe)
VALUES (2, '1', '2019-05-08', 'КТ, Узи сердца', 'Сердечная недостаточность', 'Лекарства, покой');
INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis, recipe)
VALUES (3, '1', '2020-10-15', 'Анализ крови', 'Сердечная недостаточность', 'Лекарства, покой');
INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis, recipe)
VALUES (4, '2', '2020-10-15', 'Анализ крови, Узи почек', 'Почечная недостаточность', 'Лекарства');
INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis, recipe)
VALUES (5, '2', '2020-10-18', 'Анализ крови', 'Повторный прием', 'Лекарства новые');
INSERT INTO diagnosis (id, patient_id, date, analyzes, diagnosis)
VALUES (6, '3', '2019-09-11', 'Анализ крови, Узи всех органов', 'Диагноз не ясен');

INSERT INTO role (id, value)
VALUES (1, 'admin');
INSERT INTO role (id, value)
VALUES (2, 'patient');
INSERT INTO role (id, value)
VALUES (3, 'doctor');

INSERT INTO user (id, login, email, password, status)
VALUES (1, 'elena', 'elena.grib@gmail.com', '12345', 'doctor');
INSERT INTO user (id, login, email, password, status)
VALUES (2, 'ivan', 'ivan.ivanov@gmail.com', '54321', 'patient');
