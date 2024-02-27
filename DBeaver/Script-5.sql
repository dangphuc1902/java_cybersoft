CREATE DATABASE todo;
use todo;

CREATE TABLE  content (
    id INT NOT NULL AUTO_INCREMENT,
   	content VARCHAR(100),
   	isCompleted VARCHAR(100),
    PRIMARY KEY (id)
);
-- DROP TABLE content;
INSERT INTO content( content,isCompleted) VALUES ("Quản trị hệ thống","Success");
INSERT INTO content( content, isCompleted) VALUES ("Quản lý","Success");
INSERT INTO content( content, isCompleted) VALUES ("Nhân viên","Success");
INSERT INTO content( content, isCompleted) VALUES ("run crm app","Success");
