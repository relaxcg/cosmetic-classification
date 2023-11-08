create table if not exists `cc_class`(
    `id` integer primary key autoincrement NOT NULL,
    `create_time` timestamp default CURRENT_TIMESTAMP,
    `modify_time` timestamp default CURRENT_TIMESTAMP,
    `deleted` boolean default false,
    `name` varchar(255) not null
);