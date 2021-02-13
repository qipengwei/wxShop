create table USER(
   id bigint primary key auto_increment,
   name varchar(100),
   tel varchar(20) unique,
   avatar_url varchar(1024),
   create_at timestamp,
   update_at timestamp
)



