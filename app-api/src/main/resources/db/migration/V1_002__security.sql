create table system_user (
  id bigint not null auto_increment,
  created_at datetime,
  created_by VARCHAR(50),
  updated_at datetime,
  updated_by VARCHAR(50),
  uuid varchar(255) not null,
  login varchar(250) not null,
  password varchar(250) not null,
  email varchar(250) not null,
  account_id BIGINT not null,
  primary key (id),
  UNIQUE KEY UK_USER_UUID(uuid)
) ENGINE=InnoDB;