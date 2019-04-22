create sequence seq_student start 1 increment 50;



create table t_student
(
  id         bigint      not null
    constraint pk_event primary key,
  event_name varchar(20) not null,
  age        int         not null,
  created    timestamp   not null,
  updated    timestamp   not null,
  deleted    timestamp
);
