create table vendas(

    id bigint not null auto_increment,
    nomeVendedor varchar(100) not null,
    valor varchar(100) not null unique,
    dataVenda varchar(6) not null unique,

    primary key(id)

);