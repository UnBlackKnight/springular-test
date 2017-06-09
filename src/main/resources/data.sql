INSERT INTO who (id, name) VALUES (1, 'Kevin');
INSERT INTO who (id, name) VALUES (2, 'Tabi');

INSERT INTO category (title) VALUES ('Versicherung');
INSERT INTO category (title) VALUES ('Auto');
INSERT INTO category (title) VALUES ('Haushalt');

INSERT INTO money_movement (amount, article, message, payed_at, category_id, who_id) VALUES (10, 'Brot', '', CURRENT_DATE, 3, 2);