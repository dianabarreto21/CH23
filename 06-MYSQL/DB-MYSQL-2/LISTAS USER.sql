-- sELECCIONA TODO DE UNA TABLA--
SELECT * FROM users;
-- seleccionar solo una columna
SELECT first_name FROM users;

-- Insertar datos a tabla pets
INSERT INTO `pets`
(`name`, fav_food, type_pet, users_idusers)
VALUES
("Chimuelo", "gatitos", "dragon", 1),
("Mila", "uñas", "perro", 2),
("Yoko", "calzones", "perro", 3),
("QT", "semillas", "ninfa", 1);
 -- seleccionar todo de pets
 SELECT * FROM `pets`;
 
 -- Filtrar por FK para identificar a owners
 SELECT * FROM `pets`
 WHERE users_idusers = 1;
 
 SELECT * FROM `users`;
 
 INSERT INTO `users`
 (first_name, last_name, fav_food)
 VALUES
 ("Alex", "deLeon", "Mole"),
 ("Cris", "Trujillo", "Enchiladas Verdes"),
 ("Yael", "Gonzalez", "Mole verde"),
 ("Enrique", "Albarran", "Milanesa");
 
 SELECT * FROM `users`;
 
 INSERT INTO `pets`
 (`name`, fav_food, type_pet, users_idusers)
VALUES
("Cactus", "Sol y agua", "Tierra", 4),
("Benito", "Huesos", "Dogo", 5),
("Pantera", "Higado", "Dogo", 7),
("molly", "galletas", "Dogo", 6);

 SELECT * FROM `pets`;

 
 
 
