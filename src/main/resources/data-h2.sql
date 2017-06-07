INSERT INTO who(id, name) values (1, 'Kevin');
INSERT INTO who(id, name) values (2, 'Tabi');

INSERT INTO category(title) values ('Versicherung');
INSERT INTO category(title) values ('Auto');
INSERT INTO category(title) values ('Haushalt');

INSERT INTO money_movement(amount, article, message, payed_at, category_id, who_id) values (10,'Brot','',CURRENT_DATE, 3,2);