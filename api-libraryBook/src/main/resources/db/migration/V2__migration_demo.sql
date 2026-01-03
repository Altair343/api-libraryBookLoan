insert into customer_catalog (customer_name, customer_code)
    values ('Perez','P13');
insert into reservation (folio,start_date,end_date,description,customer_id)
    values ('S1','2026-01-01','2026-01-10','Prueba',1);
insert into book (title,author,description,isbn,book_type,number_copies,year,editorial,reservation_id)
    values ('Libro 1','DA','Demo','1234567','Electronico',5,'2020','S.A.',1);
insert into book (title,author,description,isbn,book_type,number_copies,year,editorial,reservation_id)
    values ('Libro 2','AS','Demo','7654321','Electronico',2,'2016','V.S.',1);

