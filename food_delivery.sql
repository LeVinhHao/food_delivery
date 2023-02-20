CREATE DATABASE food_delivery
USE food_delivery
CREATE TABLE IF NOT EXISTS users (
    id INT NOT NULL AUTO_INCREMENT,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    address VARCHAR(100),
    role_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (role_id) REFERENCES roles(id)
);
CREATE TABLE IF NOT EXISTS roles (
    id INT NOT NULL AUTO_INCREMENT,
    roles_name VARCHAR(50) NOT NULL,
    description VARCHAR(100),
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS rating_restau (
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    res_id INT NOT NULL,
    star INT NOT NULL,
    comment VARCHAR(255),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id),
	FOREIGN KEY (res_id) REFERENCES restaurant(id)
);
CREATE TABLE IF NOT EXISTS restaurant (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(50),
	address VARCHAR(100),
    description VARCHAR(100),
    rating INT NOT NULL,
    content VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS category_restaurant (
    id INT NOT NULL AUTO_INCREMENT,
	cate_id INT NOT NULL,
    restau_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (cate_id) REFERENCES category(id),
	FOREIGN KEY (restau_id) REFERENCES restaurant(id)
);
CREATE TABLE IF NOT EXISTS category (
    id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50),
	description VARCHAR(100),
    PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS food (
    id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(50),
	description VARCHAR(100),
    price FLOAT,
    cate_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (cate_id) REFERENCES category(id)
);
CREATE TABLE IF NOT EXISTS orders (
    id INT NOT NULL AUTO_INCREMENT,
	total_price FLOAT,
	user_id INT NOT NULL,
    date DATE,
    status VARCHAR(50),
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE IF NOT EXISTS order_item (
    order_id INT,
    food_id INT,
    amount INT,
    price FLOAT,
	coupon_id INT NOT NULL,
    PRIMARY KEY (order_id,food_id),
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (food_id) REFERENCES food(id),
     FOREIGN KEY (coupon_id) REFERENCES coupon(id)
    
);
CREATE TABLE IF NOT EXISTS rating_food (
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    food_id INT NOT NULL,
    star INT NOT NULL,
    comment VARCHAR(255),
    PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (food_id) REFERENCES food(id)
);
CREATE TABLE IF NOT EXISTS rating_order (
    id INT NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    order_id INT NOT NULL,
    star INT NOT NULL,
    comment VARCHAR(255),
    PRIMARY KEY (id),
	FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);
CREATE TABLE IF NOT EXISTS coupon (
    id INT NOT NULL AUTO_INCREMENT,
    code VARCHAR(50),
    description VARCHAR(255),
    discount INT,
    cate_res_id INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (cate_res_id) REFERENCES category_restaurant(id)
);



