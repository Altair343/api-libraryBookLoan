DROP TABLE IF EXISTS customer_catalog CASCADE;

CREATE TABLE customer_catalog
(
    id serial NOT NULL,
    customer_name varchar(100) NOT NULL,
    customer_code varchar(20) NOT NULL,
    created_at timestamp without time zone NOT NULL   DEFAULT now(),
    updated_at timestamp without time zone NOT NULL   DEFAULT now()
);