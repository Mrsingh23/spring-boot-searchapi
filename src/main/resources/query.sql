CREATE TABLE tbl_products(
                             id int primary key not null auto_increment,
                             product_name VARCHAR(40) UNIQUE not null,
                             item_price DECIMAL(10,2) NOT NULL ,
                             item_description VARCHAR(100) NOT NULL
);

DROP TABLE tbl_products;
show tables ;

describe tbl_products;

SELECT * FROM tbl_products;

INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Mini Modwari', 150, 'Some sort of jewelery')
    INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Medium Modwari', 200, 'Some sort of jewelery')
INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Big Modwari', 250, 'Some sort of jewelery')
INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Mini/Kanchi Tilhari', 100, 'Some sort of jewelery')
INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Saili Tilhari', 180, 'Some sort of jewelery')
INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Maili Tilhari', 200, 'Some sort of jewelery')
INSERT INTO tbl_products(PRODUCT_NAME, ITEM_PRICE, ITEM_DESCRIPTION)
VALUES ('Chetki Tilhari', 300, 'Some sort of jewelery')