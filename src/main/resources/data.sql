insert into customer(id, name, age, category) values(1, 'lucas', 10, 'enfant');
insert into customer(id, name, age, category) values(2, 'pierre', 21, 'ado');
insert into customer(id, name, age, category) values(3, 'louis', 32, 'adulte');
insert into customer(id, name, age, category) values(4, 'nicolas', 58, 'adulte');

insert into book(id,title,category,author,cover) values (1,'Fahrenheit 451','adulte','Ray Bradbury', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');
insert into book(id,title,category,author,cover) values (2,'1984','adulte','George Orwell', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');
insert into book(id,title,category,author,cover) values (3,'Dans l abime du temps' ,'adolescent','H P Lovecraft','https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');
insert into book(id,title,category,author,cover) values (4,'Metro 2035','adolescent','Dmitry Glukhovsky', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');
insert into book(id,title,category,author,cover) values (5,'tchoupi','enfant','Thierry Courtin', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');
insert into book(id,title,category,author,cover) values (6,'Bob l eponge','enfant','Patrick Pinney', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg');

insert into comment(id, title, content, customer_id, book_id) values (1, 'Époustouflant', 'Un livre incroyable plein de rebondissements.', 1, 1);
insert into comment(id, title, content, customer_id, book_id) values (2, 'Bof', 'Un livre plein de phrases, je pase mon tour.', 4, 1);
insert into comment(id, title, content, customer_id, book_id) values (3, 'Bien', 'Vraiment un bon livre.', 2, 2);
insert into comment(id, title, content, customer_id, book_id) values (4, 'Génial', 'Un chef d''oeuvre.', 3, 2);
insert into comment(id, title, content, customer_id, book_id) values (5, 'Je recommande', 'Quel livre, vraiment incroyable.', 1, 3);
insert into comment(id, title, content, customer_id, book_id) values (6, 'Pas ouf', 'Une belle histoire, mais une mauvaise fin.', 2, 3);
insert into comment(id, title, content, customer_id, book_id) values (7, 'Nul', 'Qui à osé écrire ça ?', 3, 4);
insert into comment(id, title, content, customer_id, book_id) values (8, 'Ringard', 'Un livre comme ça en 2020 ? Impensable.', 4, 4);
insert into comment(id, title, content, customer_id, book_id) values (9, 'Je ne recommande pas', 'Fuyer, l''histoire est à dormir debout.', 3, 5);
insert into comment(id, title, content, customer_id, book_id) values (10, 'Mauvais livre', 'Un livre qui n''as pas tenus ses promesses.', 1, 5);
insert into comment(id, title, content, customer_id, book_id) values (11, 'Un incontournable', 'Il ne faut pas le contourner, c''est un bon livre.', 4, 6);
insert into comment(id, title, content, customer_id, book_id) values (12, 'Lisez-le', 'Vraiment, le livre est bien.', 2, 6);