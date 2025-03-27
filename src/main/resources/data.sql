INSERT IGNORE INTO tb_tipo_usuario (idTipoUsuario,nome).VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3,'Vendedor'),
(4, 'Gerente');

-- Inserindo Categorias
INSERT IGNORE INTO tb_categoria_produto (idCategoria, nome, descricao) VALUES
(1, 'Anéis', 'Acesório para os dedos'),
(2, 'Colares', 'Acesório para o pescoço'),
(3, 'Brincos', 'Acesório para as orelhas'),
(4, 'Pulseiras', 'Acessorio para os braços'),
(5, 'Relógios', 'Acesório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo (idTipo, nome, descricao) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');