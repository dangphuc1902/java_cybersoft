 CREATE DATABASE uniclub_web;
 use uniclub_web;

CREATE TABLE review (
    id INT NOT NULL AUTO_INCREMENT,
    avatar_customer VARCHAR(255),
    name_customer VARCHAR(255),
    email_customer VARCHAR(255),
    review_content VARCHAR(255),
    ID_product INT NOT NULL,
    PRIMARY KEY (id)
);

-- Create products table
CREATE TABLE product (
    ID_product INT NOT NULL AUTO_INCREMENT,
    product_name VARCHAR(255),
    price DECIMAL(10,2),
    star INT,
    description VARCHAR(255),
    information VARCHAR(255),
    sku VARCHAR(255),
    PRIMARY KEY (ID_product)
);

-- Create tags table
CREATE TABLE tag (
    id INT NOT NULL AUTO_INCREMENT,
    tag_name VARCHAR(255),
    PRIMARY KEY (id)
);

-- Create categories table
CREATE TABLE category (
    id INT NOT NULL AUTO_INCREMENT,
    category_name VARCHAR(255),
    PRIMARY KEY (id)
);

-- Create colors table
CREATE TABLE color (
    id INT NOT NULL AUTO_INCREMENT,
    color_name VARCHAR(255),
    PRIMARY KEY (id)
);

-- Create sizes table
CREATE TABLE size (
    id INT NOT NULL AUTO_INCREMENT,
    size_name VARCHAR(255),
    PRIMARY KEY (id)
);

-- Create product details (junction table) for the many-to-many relationships
CREATE TABLE productDetail (
    id INT NOT NULL AUTO_INCREMENT,
    ID_product INT NOT NULL,
    ID_tag INT NOT NULL,
    ID_category INT NOT NULL,
    ID_color INT NOT NULL,
    ID_size INT NOT NULL,
    Soluong INT,
    PRIMARY KEY (id, ID_product, ID_tag, ID_category, ID_color, ID_size)
);



CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT,
    full_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY (id)
);
CREATE TABLE roles(
	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255),
	PRIMARY KEY(id)
);
CREATE TABLE wishlist (
    id INT NOT NULL AUTO_INCREMENT,
    ID_product INT NOT NULL,
    stock_status INT NOT NULL,
    user_id INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE contact (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255),
    email VARCHAR(255),
    phone_number VARCHAR(20),
    subject VARCHAR(255),
    message VARCHAR(255),
    PRIMARY KEY (id)
);
CREATE TABLE card(
    id INT NOT NULL AUTO_INCREMENT,
    ID_product INT NOT NULL,
    price DECIMAL(10, 2),
    quantity INT NOT NULL,
    id_user INT NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE orders (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    company_name VARCHAR(255),
    country_region VARCHAR(255),
    street_address VARCHAR(255),
    apartment VARCHAR(50),
    town_city VARCHAR(100),
    state VARCHAR(100),
    zip_code VARCHAR(20),
    phone VARCHAR(20),
    email_address VARCHAR(255),
    note VARCHAR(255),
    payment_method VARCHAR(50),
	id_user INT NOT NULL,
	PRIMARY KEY (id)
);
CREATE TABLE orderDetail (
    id INT NOT NULL AUTO_INCREMENT,
    ID_product INT,
    price DECIMAL(10, 2),
    quantity INT,
    size_name VARCHAR(50),
    PRIMARY KEY (id)
);

ALTER TABLE productDetail
ADD FOREIGN KEY (id) REFERENCES product (ID_product),
ADD FOREIGN KEY (ID_tag) REFERENCES tag (id),
ADD FOREIGN KEY (ID_category) REFERENCES category (id),
ADD FOREIGN KEY (ID_color) REFERENCES color (id),
ADD FOREIGN KEY (ID_size) REFERENCES size (id);


ALTER TABLE review ADD FOREIGN KEY (ID_product) REFERENCES product(ID_product);
ALTER TABLE wishlist ADD FOREIGN KEY (ID_product) REFERENCES product(ID_product);
ALTER TABLE card ADD FOREIGN KEY (ID_product) REFERENCES product(ID_product);
ALTER TABLE card ADD FOREIGN KEY (id_user) REFERENCES user(id);
ALTER TABLE orderDetail ADD FOREIGN KEY (ID_product) REFERENCES product(ID_product);
ALTER TABLE orderDetail ADD FOREIGN KEY (id) REFERENCES orders(id);
ALTER TABLE orders ADD FOREIGN KEY (id_user) REFERENCES user(id);
-- Thêm cột      id_roles int vào bảng user; 
ALTER TABLE user ADD COLUMN id_roles int;
ALTER TABLE user ADD CONSTRAINT FK_id_roles_user FOREIGN KEY (id_roles) REFERENCES roles(id);
