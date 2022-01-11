CREATE TABLE task
(
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    done BIT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE tag
(
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    tag VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

-- CREATE TABLE `hibernate_sequence` (
--     `next_val` bigint DEFAULT NULL AUTO_INCREMENT
-- );