create table account (
  id bigint not null auto_increment,
  created_at datetime,
  created_by VARCHAR(50),
  updated_at datetime,
  updated_by VARCHAR(50),
  uuid varchar(255) not null,
  name varchar(50),
  primary key (id),
  UNIQUE KEY UK_ACCOUNT_UUID(uuid)
) ENGINE=InnoDB;