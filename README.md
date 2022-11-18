# Spring Boot Rest API with Jdbi 3



https://boottechnologies-ci.medium.com/spring-boot-rest-api-with-jdbi-3-353037a0cc8a



docker run --name db-jdbi -e POSTGRES_PASSWORD=9FXmXsTcPFydjZ4bLN6o -p 5432:5432 -d postgres


When you want to stop the Postgres Docker Container run:
docker start db-jdbi

When you want to start the Postgres Docker Container run:
docker start db-jdbi


If you want to delete the container:
docker rm db-jdbi

If you want to list the existing container:
docker container list

If you want to create the table, you need to create the database book-jdbi and create the table :

```
create table book
(
id          integer not null,
title       varchar(100),
page        integer,
isbn        varchar,
description varchar,
price       numeric
);

alter table book
owner to postgres;

create table author
(
id         integer,
first_name varchar,
last_name  varchar
);

alter table author
owner to postgres;
```

