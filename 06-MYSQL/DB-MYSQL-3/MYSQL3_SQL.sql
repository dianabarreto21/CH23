-- USE `bussiness`;

-- Revisar employee

SELECT *FROM employee;

-- ALIAS
SELECT employee_id AS "ID",
 first_name AS "nombre",
 last_name AS "Apellido",
 deparment AS "Departamento"
FROM employee;

-- Filtrar por nombre
-- BUSCAR a Monika
SELECT *FROM employee
WHERE first_name ="Monika";

-- Filtrar dobe
SELECT * FROM employee
WHERE salary = 500000 AND first_name = "Vivek";

-- Filtrar por NOT
SELECT * FROM employee
WHERE NOT first_name = "Barrack";

-- fILTRAR por doble negacion
SELECT * FROM employee
WHERE NOT first_name = "Santiago" AND NOT first_name = "Ian";

-- ordenamiento
-- ORDER BY
-- Defoult es orden Alfabetico
SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;

-- IN 
SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- BETWEEN
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- NOT BETWEEN
SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT
SELECT * FROM employee
LIMIT 5;

-- LIMIT + OFFSET
SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- LIKE
SELECT * FROM employee
WHERE last_name LIKE "B%";

SELECT * FROM employee
WHERE last_name LIKE "%A";

SELECT * FROM employee
WHERE last_name LIKE BINARY "%a";

-- LIKE ++
SELECT * FROM employee
WHERE join_date LIKE "%02%";

UPDATE employee
	SET salary = 300000
    WHERE employee_id = 5;
    
SELECT * FROM employee;

UPDATE employee
	SET salary = 400000
    WHERE employee_id = 8;
    
    UPDATE employee
	SET salary = 400000
    WHERE employee_id = 8;
    
SELECT * FROM employee; 
UPDATE employee
	SET salary = 500000
    WHERE employee_id = 7;
    
    UPDATE employee
	SET salary = 500000
    WHERE employee_id = 1;
    
    SELECT * FROM employee; 
    
INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES ('Diana', 'Barreto', 800000, '2022-03-17', 'IT'),
    ('Cristina', 'Trujillo', 500000, '2017-09-22', 'Admin'),
    ('Enrique', 'Albarrán', 100000, '2016-09-22', 'IT'),
    ('Yael', 'Gonzalez', 600000, '2016-09-22', 'IT');
    
    SELECT * FROM employee;
    
    


