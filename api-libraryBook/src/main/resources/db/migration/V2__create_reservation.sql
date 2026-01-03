DROP TABLE IF EXISTS reservation CASCADE;

CREATE TABLE reservation
(
    id serial NOT NULL,
    folio varchar(100) NOT NULL,
    start_date date NOT NULL,
    end_date date NOT NULL,
    description varchar(100) NOT NULL,
    customer_id bigint DEFAULT NULL,
    version bigint,
    created_at timestamp without time zone NOT NULL   DEFAULT now(),
    updated_at timestamp without time zone NOT NULL   DEFAULT now()
);