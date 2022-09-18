insert into t_cliente( nm_cliente, ds_email, ds_genero, ds_senha, dt_nascimento, nr_telefone, ds_cpf)
values('João Pedro', 'joao@rmail.com', 'M', '1233214!@#$',CURRENT_DATE(), 11965465465, '1234567897' );

insert into t_produtos(nm_produto, vl_produtos, tp_produtos)
values
('Bolacha maizena', 2.45,'bolachas e biscoitos' );

insert into t_produtos( nm_produto, vl_produtos, tp_produtos)
values
('Requeijão aviação', 7.85,'Laticínios e derivados');

insert into t_lista( cd_cliente, vl_total_produtos, qt_produtos) values
(1,3.85, 1);

insert into t_lista_produtos(cd_lista,cd_produto)
values(1,1);
insert into t_lista_produtos(cd_lista,cd_produto)
values(1,2);