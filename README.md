Datos de base de datos


-- Inserción de datos en la tabla clientes
INSERT INTO clientes (nombre, apellido) VALUES 
('Aarón', 'Rivero'),
('Adela', 'Salas'),
('Adolfo', 'Rubio'),
('Adrián', 'Suárez'),
('Marcos', 'Loyola'),
('María', 'Santana'),
('Pilar', 'Ruiz'),
('Pepe', 'Ruiz'),
('Guillermo', 'López'),
('Daniel', 'Santana'),
('Julia', 'Méndez'),
('Sofía', 'Pérez'),
('Lucas', 'García'),
('Mateo', 'Fernández'),
('Martín', 'Gómez'),
('Valentina', 'Martínez'),
('Lucía', 'Rodríguez'),
('Pedro', 'Hernández'),
('Emilio', 'Díaz'),
('Gabriel', 'Vega');


-- Inserción de datos en la tabla productos
INSERT INTO productos (nombre) VALUES 
('Producto A'),
('Producto B'),
('Producto C'),
('Producto D'),
('Producto E'),
('Producto F'),
('Producto G'),
('Producto H'),
('Producto I'),
('Producto J'),
('Producto K'),
('Producto L'),
('Producto M'),
('Producto N'),
('Producto O'),
('Producto P'),
('Producto Q'),
('Producto R'),
('Producto S'),
('Producto T');



-- Inserción de datos en la tabla compras
INSERT INTO compras (id_cliente) VALUES 
(1), (2), (3), (4), (5), (6), (7), (8), (9), (10),
(11), (12), (13), (14), (15), (16), (17), (18), (19), (20);

-- Creación de la tabla compras_productos


-- Inserción de datos en la tabla compras_productos
INSERT INTO compras_productos (id_compra, id_producto) VALUES 
(1, 1), (1, 2), (2, 3), (2, 4), (3, 5), (3, 6), (4, 7), (4, 8), 
(5, 9), (5, 10), (6, 11), (6, 12), (7, 13), (7, 14), (8, 15), 
(8, 16), (9, 17), (9, 18), (10, 19), (10, 20), (11, 1), (11, 2), 
(12, 3), (12, 4), (13, 5), (13, 6), (14, 7), (14, 8), (15, 9), 
(15, 10), (16, 11), (16, 12), (17, 13), (17, 14), (18, 15), 
(18, 16), (19, 17), (19, 18), (20, 19), (20, 20);
