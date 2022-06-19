INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Hamburguer', 5, 'hamguerguer_foto', 'Pão, Carne Angus 120Gr, Alface, Tomate e Batata Palha.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('CheeseBurguer', 7, 'cheeseburguer_foto', 'Pão, Carne Angus 120Gr, Cheddar, Alface, Tomate e Batata Palha.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Cheese Bacon', 8, 'cheesebacon_foto', 'Pão, Carne Angus 120Gr, Cheddar, Bacon, Alface, Tomate e Batata Palha.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('X Tudo', 10, 'xtudo_foto', 'Pão, 2 x Carne Angus 120Gr, Cheddar, Bacon, Presunto, Alface, Tomate e Batata Palha.');
INSERT INTO tb_product (name, price, image_Uri, description) VALUES ('Coca-Cola', 2, 'coca-cola_foto', 'Pão, Carne Angus 120Gr, Alface, Tomate e Batata Palha.');

INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (0, 'Jhonata', '27999998888', 'España 456, Rosário', TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z');
INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (3, 'Jackson', '27999998888', 'España 697, Rosário', TIMESTAMP WITH TIME ZONE '2021-01-01T16:00:00Z');
INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (1, 'Philipe', '27777776666', 'España 135, Rosário', TIMESTAMP WITH TIME ZONE '2021-01-01T12:05:00Z');
INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (2, 'Bruna', '27777776666', 'España 212, Rosário', TIMESTAMP WITH TIME ZONE '2021-01-02T12:05:00Z');
INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (1, 'Janusia', '27777776666', 'España 258, Rosário', TIMESTAMP WITH TIME ZONE '2021-06-03T12:05:00Z');
INSERT INTO tb_order (status, name, phone_Number, address, moment) VALUES (2, 'Ananias', '3599998888', 'Brasil Penta 123, Vitória', TIMESTAMP WITH TIME ZONE '2022-01-03T12:05:00Z');

INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 5);
INSERT INTO tb_order_product (order_id, product_id) VALUES (1 , 3);
INSERT INTO tb_order_product (order_id, product_id) VALUES (2 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (3 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (4 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 2);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 3);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (5 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 1);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 4);
INSERT INTO tb_order_product (order_id, product_id) VALUES (6 , 5);