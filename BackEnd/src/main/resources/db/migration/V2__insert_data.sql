INSERT INTO categories(name) VALUES ('Phones');
INSERT INTO categories(name) VALUES ('Tablets');
INSERT INTO categories(name) VALUES ('Laptops');
INSERT INTO categories(name) VALUES ('Accessories');
INSERT INTO categories(name) VALUES ('Computers');
INSERT INTO categories(name) VALUES ('Others');
INSERT INTO products(name, price, stock, category_id)
VALUES ('Laptop', 5000, 4, (SELECT id FROM categories WHERE name = 'Laptops'));
INSERT INTO products(name, price, stock, category_id)
VALUES ('Phone', 2000, 10, (SELECT id FROM categories WHERE name = 'Phones'));
INSERT INTO products(name, price, stock, category_id)
VALUES ('Tablet', 3000, 5, (SELECT id FROM categories WHERE name = 'Tablets'));
INSERT INTO products(name, price, stock, category_id)
VALUES ('Headphones', 500, 20, (SELECT id FROM categories WHERE name = 'Accessories'));
INSERT INTO products(name, price, stock, category_id)
VALUES ('Desktop Computer', 4000, 3, (SELECT id FROM categories WHERE name = 'Computers'));