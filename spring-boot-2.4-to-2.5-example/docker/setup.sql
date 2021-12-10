-- create the databases
CREATE DATABASE IF NOT EXISTS springboot24;

-- create the users for each database
CREATE USER 'schema_user'@'%' IDENTIFIED BY 'schema_pw';
GRANT CREATE, INSERT, ALTER ON `springboot24`.* TO 'schema_user'@'%';

CREATE USER 'data_user'@'%' IDENTIFIED BY 'data_pw';
GRANT ALL ON `springboot24`.* TO 'data_user'@'%';
#UPDATE, SELECT, INSERT
#CREATE USER 'db_user'@'%' IDENTIFIED BY 'db_pw';
#GRANT UPDATE, DELETE, SELECT, INSERT ON `springboot24`.* TO 'db_user'@'%';


FLUSH PRIVILEGES;