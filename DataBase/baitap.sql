-- Bài tập tự luyện.
CREATE DATABASE qlnv;
USE qlnv;
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10, 2),
    start_date DATE,
    department_id INT
);

CREATE TABLE access_rights (
    access_id INT PRIMARY KEY,
    employee_id INT,
    access_level VARCHAR(255),
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id)
);

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

INSERT INTO employees (employee_id, employee_name, salary, start_date, department_id)
VALUES
    (1, 'John Doe', 60000, '2021-01-15', 1),
    (2, 'Jane Smith', 70000, '2020-05-20', 2),
    (3, 'Bob Johnson', 55000, '2022-03-10', 1),
    (4, 'Alice Williams', 80000, '2021-08-05', 3),
    (5, 'Charlie Brown', 65000, '2020-12-01', 2);

INSERT INTO departments (department_id, department_name)
VALUES
    (1, 'IT'),
    (2, 'Sales'),
    (3, 'HR');

INSERT INTO access_rights (access_id, employee_id, access_level)
VALUES
    (1, 1, 'Admin'),
    (2, 2, 'User'),
    (3, 3, 'User'),
    (4, 4, 'Admin'),
    (5, 5, 'User');
    
 -- 1,Hiển thị tất cả thông tin của bảng "employees"
SELECT * FROM employees e;
-- SELECT * FROM departments d ;
-- 2,Hiển thị tên và lương của tất cả nhân viên
SELECT employee_name, salary FROM employees e ;
-- 3,Hiển thị thông tin của những nhân viên có lương lớn hơn 50000
SELECT * FROM employees e WHERE salary > 50000;
-- 4,Hiển thị số lượng nhân viên trong mỗi phòng ban
SELECT COUNT(e.department_id)soluong ,d.department_name  FROM employees e 
JOIN departments d ON  e.department_id = d.department_id GROUP BY e.department_id, d.department_name;
-- 5)Sắp xếp danh sách nhân viên theo tên từ A-Z
SELECT * FROM employees e 
ORDER BY e.employee_name ASC ;
-- 6)Hiển thị tên, lương và phòng ban của những nhân viên có lương từ 40000 đến 60000, sắp xếp theo lương giảm dần
SELECT employee_name,salary,department_id 
FROM employees e WHERE salary >= 40000 AND salary <= 60000 ORDER BY salary DESC;
-- 7)Tính tổng lương của tất cả nhân viên
SELECT SUM(salary) FROM employees e ;
-- 8)Hiển thị tên của nhân viên và tên phòng ban của họ
SELECT e.employee_name,d.department_name FROM employees e 
JOIN departments d ON e.department_id = d.department_id; 	-- Liên kết dữ liệu với bảng departments và employees.	
-- 9)Tìm những phòng ban có ít nhất 3 nhân viên
SELECT  d.department_id,d.department_name  FROM employees e
JOIN departments d ON e.department_id  = d.department_id 
GROUP BY d.department_id	-- Group by để gom các dữ liệu trùng lặp thành 1 
 HAVING COUNT(e.employee_id) >= 3; 
-- 10)Hiển thị tên nhân viên và lương của những nhân viên ở phòng ban "IT" hoặc "Sales"
SELECT e.employee_name,e.salary,d.department_name  FROM employees e 
JOIN departments d ON e.department_id = d.department_id 
WHERE  d.department_id = 1 OR  d.department_id = 2;

-- 11)Hiển thị tên và ngày bắt đầu làm việc của những nhân viên được tuyển dụng sau năm 2020
SELECT e.employee_name, e.start_date FROM employees e 
WHERE e.start_date > 2020;
-- 12)Tính trung bình lương của nhân viên.
SELECT SUM(salary)/COUNT(e.employee_id)  FROM employees e ;
SELECT AVG(salary) FROM employees e ; 
