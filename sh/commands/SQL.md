# SQL

```SQL
-- Basic query
-- find all the detail about a person
SELECT * FROM people WHERE name = 'John Doe';
SELECT * FROM people WHERE name = 'John Doe' AND gender = 'male';

-- Find all the tables (sqlite only)
SELECT * FROM sqlite_master WHERE type = 'table';


-- find the structure of a table
SELECT sql FROM sqlite_master WHERE name = 'mytable';

-- limit number of results
SELECT * FROM people LIMIT 10;

-- sort results
SELECT * FROM people ORDER BY age ASC;

-- use DISTINCT to remove duplicate values
SELECT DISTINCT type FROM name_of_the_table;

-- with wildcards, use LIKE instead of =
-- wildcards % => regex .*
SELECT * FROM people WHERE name LIKE 'John D%';
-- wildcards _ => regex .
SELECT * FROM people WHERE name LIKE 'John D_e';

-- use ranges
SELECT DISTINCT job FROM people WHERE job BETWEEN 'B%' AND 'G%';
SELECT DISTINCT age FROM people WHERE age BETWEEN 0 AND 18;

-- use comparator (with words and numbers)
SELECT DISTINCT age FROM people WHERE age > 18;

-- Commands are not case-sensitive, but `WHERE` querie values for `=` and `LIKE` are
-- You might have to use LOWER() or UPPER()
SELECT DISTINCT nationality FROM people WHERE LOWER(nationality) ='french';

-- AGGREGATE FUNCTIONS
-- Finds the highest value
SELECT MAX(age) FROM people;
-- Finds the lowest value
SELECT MIN(age) FROM people;
-- calculates the sum of the specified column values
SELECT SUM(income) FROM people;
-- calculates the average of the specified column values
SELECT AVG(income) FROM people;
-- Count items in the table
SELECT COUNT(*) FROM people;

-- INNER JOINS
-- here we give 'people' the alias 'person' to make the query more natural
SELECT person.name, taxes.annual_income
FROM taxes JOIN people person
ON taxes.ssn = person.ssn WHERE annual_income > 450000;

-- more values, more aliases, more joins
SELECT name, annual_income as income,
gender, eye_color as eyes, hair_color as hair
FROM taxes tax
JOIN people person
  ON tax.ssn = person.ssn
JOIN drivers_license dl
  ON person.license_id = dl.id
WHERE annual_income > 450000;


SELECT DISTINCT TABLE_NAME
    FROM INFORMATION_SCHEMA.COLUMNS
    WHERE COLUMN_NAME IN ('columnA','ColumnB')
        AND TABLE_SCHEMA='YourDatabase';

```

# Ressources

https://selectstarsql.com/
https://mystery.knightlab.com/
