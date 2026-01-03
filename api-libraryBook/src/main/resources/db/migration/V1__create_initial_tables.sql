DROP TABLE IF EXISTS customer_catalog CASCADE;
CREATE TABLE customer_catalog
(
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    customer_name varchar(100) NOT NULL,
    customer_code varchar(20) NOT NULL,
    version bigint,
    created_at timestamp without time zone NOT NULL DEFAULT now(),
    updated_at timestamp without time zone NOT NULL DEFAULT now()
);

DROP TABLE IF EXISTS reservation CASCADE;
CREATE TABLE reservation
(
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    folio varchar(100) NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    description varchar(100) NOT NULL,
    customer_id bigint DEFAULT NULL,
    version bigint,
    created_at timestamp without time zone NOT NULL DEFAULT now(),
    updated_at timestamp without time zone NOT NULL DEFAULT now()
);

DROP TABLE IF EXISTS book CASCADE;
CREATE TABLE book
(
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    title varchar(100) NOT NULL,
    author varchar(50),
    description varchar(100),
    isbn varchar(30),
    book_type varchar(20),
    number_copies int DEFAULT NULL,
    year varchar(20),
    editorial varchar(50),
    reservation_id bigint DEFAULT NULL,
    version bigint,
    created_at timestamp without time zone NOT NULL DEFAULT now(),
    updated_at timestamp without time zone NOT NULL DEFAULT now()
);

ALTER TABLE customer_catalog ADD CONSTRAINT "PK_customer_catalog" PRIMARY KEY (id);

ALTER TABLE reservation ADD CONSTRAINT "PK_reservation" PRIMARY KEY (id);
CREATE INDEX "IXFK_reservation_customer" ON reservation (customer_id ASC);
ALTER TABLE reservation ADD CONSTRAINT "FK_reservation_customer"
    FOREIGN KEY (customer_id) REFERENCES customer_catalog (id) ON DELETE Cascade ON UPDATE No Action;

ALTER TABLE book ADD CONSTRAINT "PK_book" PRIMARY KEY (id);
CREATE INDEX "IXFK_book_reservation" ON book (reservation_id ASC);

ALTER TABLE book ADD CONSTRAINT "FK_book_reservation"
    FOREIGN KEY (reservation_id) REFERENCES reservation (id) ON DELETE Cascade ON UPDATE No Action;