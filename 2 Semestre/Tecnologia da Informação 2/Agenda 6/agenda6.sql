CREATE TABLE jogo
( `idjogo` INT NOT NULL AUTO_INCREMENT, `nome` VARCHAR(45) NOT NULL, `fabricante` VARCHAR(45) NOT NULL, PRIMARY KEY (`idjogo`));
select * from jogo;

INSERT INTO jogo (`nome`, `fabricante`)
values
('FIFA 2020', 'EA'),
('FINAL FANTASY', 'Square Enix'),
('GTA', 'Rockstar Games'),
('CS: GO', 'Valve');