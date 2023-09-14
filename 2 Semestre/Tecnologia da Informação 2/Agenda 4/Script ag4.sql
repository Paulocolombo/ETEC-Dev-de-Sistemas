insert into sindico (nome, endereco, telefone)
values ('Claudio Aparecido', 'Rua Eugenio dell agnolo netto,970','14997585858');
insert into sindico (nome, endereco, telefone)
values ('Dinei dos Santos', 'Av Francisco Alves de Almeida, 1500','11998989090');
select * from sindico;

insert into proprietario (rg, nome, telefone, email)
values 
('555555555', 'Carlos Alberto de Nobrega', '11998989898', 'carlim@outlook.com'),
('222222222', 'Roberto Carlos', '11998089898', 'robertim@outlook.com'),
('333333333', 'Ze roberto', '13998989898', 'zezinho@outlook.com'),
('444444444', 'Julio Cesar', '14998000098', 'Julioc@outlook.com'),
('666666666', 'Rodinei Do Santos', '14998989999', 'Rodisantos@outlook.com'),
('777777777', 'Lourenço Silva', '12998777777', 'Lourosilva@outlook.com'),
('888888888', 'Bruno Prado', '11998505050', 'brunprado@outlook.com'),
('999999999', 'Carla Silveira', '14996223398', 'carlasil@outlook.com'),
('111111111', 'Amanda Bueno', '11996445566', 'bueamanda@outlook.com'),
('121231231', 'Lucilena Cecci', '11997808080', 'ceccilu@outlook.com'),
('213213211', 'Maria das Dores', '11999101010', 'mariadores@outlook.com');

select * from proprietario;


insert into garagem (tipo, numero_ap)
values 
('coberta', '150'),
('coberta', '150'),
('padrão', '160'),
('padrão', '160'),
('padrão', '170'),
('padrão', '170'),
('padrão', '100'),
('padrão', '100'),
('padrão', '145'),
('padrão', '145'),
('padrão', '200'),
('coberta', '220'),
('padrão', '275'),
('padrão', '250'),
('padrão', '205');

select * from garagem;

insert into condominio (nome, endereco, matricula_sind)
values
('Condominio Centro de Piraju', 'Avenida Major Mariano, 1600', '2'),
('Condominio fazenda Shangrila', 'Rua das Garças, 150', '1');

select * from condominio;

insert into apartamento (numero, tipo, codigo_cond)
values 
('150', 'cobertura', '1'),
('160', 'padrao', '1'),
('170', 'padrao', '1'),
('100', 'padrao', '1'),
('145', 'padrao', '1'),
('200', 'padrao', '2'),
('220', 'cobertura', '2'),
('275', 'padrao', '2'),
('250', 'padrao', '2'),
('205', 'padrao', '2');
select * from apartamento

select * from proprietario;

insert into proprietario_apartamento (numero_ap, rg_prop)
values 
('205', '888888888'),
('250', '222222222'),
('275', '213213211'),
('220', '555555555'),
('200', '999999999'),
('145', '111111111'),
('100', '333333333'),
('170', '666666666'),
('160', '444444444'),
('150', '121231231');
select * from proprietario_apartamento;

select * from apartamento;

insert into proprietario_apartamento (numero_ap, rg_prop)
values ('145', '444444444');

update proprietario_apartamento
set rg_prop = '111111111'
where prop_ap_id = 2;

update proprietario_apartamento
set rg_prop = '888888888'
where prop_ap_id = 4;

select * from proprietario;




delete from proprietario
where rg = 222222222;

