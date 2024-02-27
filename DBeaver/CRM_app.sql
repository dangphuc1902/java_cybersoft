-- CRM:
-- DROP database crm_app;
CREATE database crm_app;
USE crm_app;

CREATE TABLE IF NOT EXISTS roles (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    PRIMARY KEY (id)
);
-- Delete many column
-- ALTER TABLE users 
-- DROP COLUMN phone_no,
-- DROP COLUMN country;

CREATE TABLE IF NOT EXISTS users (
    id INT NOT NULL AUTO_INCREMENT,
    fullname VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    firstname VARCHAR(100) NOT NULL,
    lastname VARCHAR(100) NOT NULL,
    role_id INT NOT NULL,
    phonenumber VARCHAR(10) NOT NULL,
    avatar_path VARCHAR(250) NOT NULL,
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
    name VARCHAR(250) NOT NULL,
    description VARCHAR(250) NOT NULL,
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

-- insert data for roles table
INSERT INTO roles( name, description ) VALUES ("ROLE_ADMIN", "Quản trị hệ thống");
INSERT INTO roles( name, description ) VALUES ("ROLE_MANAGER", "Quản lý");
INSERT INTO roles( name, description ) VALUES ("ROLE_USER", "Nhân viên");

-- insert data for status table
INSERT INTO status( name ) VALUES ("Chưa thực hiện");
INSERT INTO status( name ) VALUES ("Đang thực hiện");
INSERT INTO status( name ) VALUES ("Đã hoàn thành");

-- insert data for user table
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Dang Trong Phuc", "phuctrong1902@gmail.com", "123456", "Dang Trong", "Phuc", "1","0352832650","/plugins/images/users/arijit.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Nguyen Van An", "nguyenvanan@gmail.com", "123456", "Nguyen Van", "An", "2","0352145261","/plugins/images/users/genu.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Tran Van Ba", "tranvanba@gmail.com", "123456", "Tran Van", "Ba", "3","0951238415","/plugins/images/users/govinda.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Nguyen Van Bao", "nguyenvanbao123@gmail.com", "123456", "Nguyen Van", "Bao", "3","0352832651","/plugins/images/users/hritik.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Ho Thi Ky", "hothiky@gmail.com", "123456", "Ho Thi", "Ky", "3","0352342640","/plugins/images/users/pawandeep.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Ho Thi Tu", "hothitu@gmail.com", "123456", "Ho Thi", "Tu", "3","0352832651","/plugins/images/users/ritesh.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Nguyen Huu Nam", "nguyenhuunam@gmail.com", "123456", "Hoang Huu", "Nam", "3","0352333640","/plugins/images/users/sonu.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Hoang Ba Hong", "hohuuhong@gmail.com", "123456", "Ho Huu", "Hong", "3","0951777715","/plugins/images/users/varun.jpg");
INSERT INTO users( fullname, email, password, firstname, lastname, role_id, phonenumber ,avatar_path )
VALUES ("Tran Van Bon", "tranvanbon1234@gmail.com", "123456", "Tran Van", "Bon", "3","0333555263","/plugins/images/users/hinh-avatar-nam-deo-kinh.jpg");

-- insert data for jobs table
INSERT INTO jobs (name, start_date, end_date)VALUES ("E-commerce website selling shoes","2023-06-10","2023-06-24");
INSERT INTO jobs (name, start_date, end_date)VALUES ("Todo List Website check-note","2023-10-04","2023-11-04");
INSERT INTO jobs (name, start_date, end_date)VALUES ("CRM - customer relationship management","2023-12-15","2023-02-19");
INSERT INTO jobs (name, start_date, end_date)VALUES ("Receive hotel reservations","2024-04-04","2024-05-19");

-- insert data for tasks table
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Write FrontEnd selling shoes","Viết FrontEnd bán giày","2023-06-10","2023-06-20","1","1","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Test and upload source code to firebase","Kiểm tra và tải mã nguồn lên firebase","2023-06-20","2023-06-24","2","1","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Web project analysis and User Interface (UI) and User Experience (UX) Design for Todo-List Web","Phân tích dự án web và Thiết kế giao diện người dùng (UI) và Trải nghiệm người dùng (UX) cho Web Todo-List","2023-10-04","2023-10-07","3","2","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Write FrontEnd Todo-List web","Viết web FrontEnd Todo-List","2023-10-07","2023-10-19","4","2","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Write API for feature Back-end","Viết API cho tính năng Back-end","2023-10-19","2023-11-04","5","2","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Web project analysis and User Interface (UI) and User Experience (UX) Design for CRM project","Phân tích dự án web và Thiết kế giao diện người dùng (UI) và Trải nghiệm người dùng (UX) cho dự án CRM","2023-12-15","2023-12-17","6","3","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Write FrontEnd CRM","Viết FrontEnd CRM","2023-12-17","2023-12-21","7","3","3");
INSERT INTO tasks (name,description, start_date, end_date, user_id,job_id,status_id)
VALUES ("Write Back-end CRM","Viết Back-end CRM","2023-12-21","2023-12-29","8","3","3");
INSERT INTO tasks (name, description,start_date, end_date, user_id,job_id,status_id)
VALUES ("Write Controller for feature Back-end","Viết Controller cho tính năng Back-end","2023-12-29","2023-02-19","9","3","3");

-- ALTER TABLE tasks ADD COLUMN description VARCHAR(250);
-- ALTER TABLE jobs DROP COLUMN description;		Xoá cột
-- Câu truy vấn cho chức năng login
-- SELECT * FROM users u 
-- WHERE u.email = 'email nguoi dung nhap vo' AND u.password = 'password nguoi dung nhap';

-- Câu chuyển đổi:
findByEmailAndPassword;
findByrole_id;
-- 
-- find

-- Xác định câu truy vấn:
-- INSET INTO roles(name, description) VALUES('ROle_TEST')