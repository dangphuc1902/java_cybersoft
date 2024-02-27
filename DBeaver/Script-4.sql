-- CRM:
CREATE DROP database CRM_TEST;
USE CRM_TEST;

CREATE TABLE IF NOT EXISTS roles (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS users (
    id INT NOT NULL AUTO_INCREMENT,
    fullname VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    role_id INT NOT NULL,
    avatar_path  VARCHAR(250) NOT NULL,
    phone_no VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS status (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS jobs (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    start_date DATE,
    end_date DATE,
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS tasks (
    id INT NOT NULL AUTO_INCREMENT,
    name_task VARCHAR(250) NOT NULL,
    start_date DATE,
    end_date DATE,
    user_id INT NOT NULL,
    job_id INT NOT NULL,
    status_id INT NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE users ADD FOREIGN KEY (role_id) REFERENCES roles (id)  ON DELETE CASCADE;
ALTER TABLE tasks ADD FOREIGN KEY (user_id) REFERENCES users (id)  ON DELETE CASCADE;
ALTER TABLE tasks ADD FOREIGN KEY (job_id) REFERENCES jobs (id)  ON DELETE CASCADE;
ALTER TABLE tasks ADD FOREIGN KEY (status_id) REFERENCES status (id)  ON DELETE CASCADE;

INSERT INTO roles( name, description ) VALUES ("ROLE_ADMIN", "Quản trị hệ thống");
INSERT INTO roles( name, description ) VALUES ("ROLE_MANAGER", "Quản lý");
INSERT INTO roles( name, description ) VALUES ("ROLE_USER", "Nhân viên");

INSERT INTO status( name ) VALUES ("Chưa thực hiện");
INSERT INTO status( name ) VALUES ("Đang thực hiện");
INSERT INTO status( name ) VALUES ("Đã hoàn thành");


INSERT INTO users( fullname, email, password, firstname, lastname, role_id ) VALUES ("Dang Trong Phuc", "phuctrong1902@gmail.com", "123456", "Dang Trong", "Phuc", "1");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id ) VALUES ("Nguyen Van An", "nguyenvanan@gmail.com", "123456", "Nguyen Van", "An", "2");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id ) VALUES ("Tran Van Ba", "tranvanba@gmail.com", "123456", "Tran Van", "Ba", "3");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id ) VALUES ("Ho Thi Tu", "hothitu@gmail.com", "123456", "Ho Thi", "Tu", "3");

-- INSERT INTO tasks (name_task, start_date, end_date, user_id, job_id, status_id) VALUES ("Config Database","(SELECT start_date FROM jobs WHERE id = 2)","(SELECT end_date FROM jobs WHERE id = 2)","2","2","2");


-- Câu truy vấn cho chức năng login
-- SELECT * FROM users u 
-- WHERE u.email = 'email nguoi dung nhap vo' AND u.password = 'password nguoi dung nhap';

-- Câu chuyển đổi:
findByEmailAndPassword;
findByrole_id;

find

-- Xác định câu truy vấn:
-- INSET INTO roles(name, description) VALUES('ROle_TEST')