-- demo.users definition

CREATE TABLE users (
  user_id int NOT NULL,
  username varchar(100) DEFAULT NULL,
  created_by varchar(100) DEFAULT NULL,
  created_date date DEFAULT NULL,
  password varchar(45) DEFAULT NULL,
  PRIMARY KEY (user_id)
)