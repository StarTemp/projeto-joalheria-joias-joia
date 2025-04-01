INSERT IGNORE INTO tb_tipo_usuario (id_tipo_usuario, nome) VALUES
(1, 'Admin'),
(2, 'Cliente'),
(3,'Vendedor'),
(4, 'Gerente');

-- Inserindo Categorias
INSERT IGNORE INTO tb_categoria_produto (id_Categoria, nome, descricao) VALUES
(1, 'Anéis', 'Acessório para os dedos'),
(2, 'Colares', 'Acessório para o pescoço'),
(3, 'Brincos', 'Acessório para as orelhas'),
(4, 'Pulseiras', 'Acessório para os braços'),
(5, 'Relógios', 'Acessório para não atrasar no SENAI');

-- Inserindo Tipos (se não existirem)
INSERT IGNORE INTO tb_tipo (id_Tipo, nome, descricao) VALUES
(1, 'Ouro', '18k'),
(2, 'Prata', '750'),
(3, 'Bijuteria', 'É biju mas é de rico');