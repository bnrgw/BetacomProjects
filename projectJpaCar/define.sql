


    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);

    create table ammortizzatore (
        id integer not null,
        descrizione varchar(20) not null,
        primary key (id)
    ) engine=InnoDB;

    create table bici (
        ammortizzatore integer,
        assistita bit,
        id integer not null auto_increment,
        pieghevole bit,
        primary key (id)
    ) engine=InnoDB;

    create table colore (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table macchina (
        cilindrata integer not null,
        id integer not null auto_increment,
        numero_porte integer not null,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table marca (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table moto (
        cilindrata integer not null,
        id integer not null auto_increment,
        targa varchar(7) not null,
        primary key (id)
    ) engine=InnoDB;

    create table tipo_alimentazione (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table tipo_veicolo (
        id integer not null,
        descrizione varchar(20),
        primary key (id)
    ) engine=InnoDB;

    create table veicolo (
        bic_id integer,
        id integer not null auto_increment,
        id_code_colore integer,
        id_code_marca integer,
        id_tipo_alimentazione integer,
        id_tipo_veicolo integer,
        macchina_id integer,
        moto_id integer,
        numero_posti integer,
        numero_ruote integer,
        primary key (id)
    ) engine=InnoDB;

    alter table macchina 
       add constraint UK_adlvjltj5y5k8d7jh9dgla7hr unique (targa);

    alter table moto 
       add constraint UK_2i3efrjuh6fy8isx13wtioxpr unique (targa);

    alter table veicolo 
       add constraint UK_dh7dv3j1ljdes9u446q8w7hkr unique (bic_id);

    alter table veicolo 
       add constraint UK_t8nap2280m332vdx8f5c4wngh unique (macchina_id);

    alter table veicolo 
       add constraint UK_cwnyfh6iavq0omb0csh99arve unique (moto_id);

    alter table bici 
       add constraint FK2dfoaw1x46l6yi9u0t3vrb982 
       foreign key (ammortizzatore) 
       references ammortizzatore (id);

    alter table veicolo 
       add constraint FKau3ab63by34rxq359mqjtd91l 
       foreign key (bic_id) 
       references bici (id);

    alter table veicolo 
       add constraint FK4rti5x477witwjcvgy7fvwc4e 
       foreign key (id_code_colore) 
       references colore (id);

    alter table veicolo 
       add constraint FKldganrl4h4idq5sqcdo5r5xnr 
       foreign key (macchina_id) 
       references macchina (id);

    alter table veicolo 
       add constraint FKlgpit8exs5uh4ej1t9xku4srg 
       foreign key (id_code_marca) 
       references marca (id);

    alter table veicolo 
       add constraint FK2k8vsjq677bgc5n8vhv5dlucf 
       foreign key (moto_id) 
       references moto (id);

    alter table veicolo 
       add constraint FKrj8o67qn763qar4k32gabvevs 
       foreign key (id_tipo_alimentazione) 
       references tipo_alimentazione (id);

    alter table veicolo 
       add constraint FK8anvnj7a7qu0jfikivb1qi4g 
       foreign key (id_tipo_veicolo) 
       references tipo_veicolo (id);
