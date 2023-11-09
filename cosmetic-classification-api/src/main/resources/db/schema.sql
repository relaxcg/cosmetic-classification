create table if not exists cc_class
(
    `id`   int auto_increment not null,
    `create_time` timestamp not null,
    `modify_time` timestamp not null,
    `deleted` boolean not null default false,
    `name` varchar(32) not null,
    primary key (id)
);

create table if not exists cc_function
(
    `id` int auto_increment not null,
    `create_time` timestamp not null,
    `deleted` boolean not null default false,
    `name` varchar(32) not null,
    primary key (id)
);

create table if not exists cc_cosmetic
(
    `id` int auto_increment not null,
    `create_time` timestamp not null,
    `deleted` boolean not null default false,
    `name` varchar(32) not null,
    `brand_id` int not null,
    `brand_name` varchar(32) not null,
    `purchase_time` date not null,
    `price` decimal not null,
    `expire_time` date not null,
    `use_status` tinyint not null default 0,
    primary key(id)
);

create table if not exists cc_brand
(
    `id` int auto_increment not null,
    `name` varchar(32) not null,
    primary key(id)
)