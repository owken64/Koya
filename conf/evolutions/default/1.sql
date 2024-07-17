-- Users schema

-- !Ups

CREATE TABLE User (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    age bigint(20),
    PRIMARY KEY (id)
);

-- !Downs

DROP TABLE User;