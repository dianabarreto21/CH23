SELECT * FROM employee
ORDER BY last_name ASC;
-- FUNCIONES
-- MIN
SELECT MIN(salary) FROM employee;

-- MAX
SELECT MAX(salary) FROM employee;

-- AVG
SELECT AVG (salary) AS promedio_salario FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(DISTINCT(salary)) FROM employee;

SELECT * FROM employee;