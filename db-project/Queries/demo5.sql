--how can we rename the column that we dısplayed
SELECT FIRST_NAME AS "GIVEN_NAME", LAST_NAME AS "SURNAME"
FROM EMPLOYEES;

--TEXT FUNCTIONS,STRING MANI
--JAVA FIRST_NAME +" "+ LAST_NAME
--IN SQL CONCAT IS ||

SELECT FIRST_NAME || ' ' || LAST_NAME AS "FULL_NAME"
FROM EMPLOYEES;

--TASK;
--add @gmail.com and name new column to full_email
SELECT EMAIL
FROM EMPLOYEES;

SELECT EMAIL || '@gmail.com' AS "FULL_EMAIL"
FROM EMPLOYEES;

--MAKING ALL LOWERCASE
SELECT LOWER(EMAIL || '@gmail.com') AS "FULL_EMAIL"
FROM EMPLOYEES;

--MAKING UPPER CASE
SELECT UPPER(EMAIL || '@gmail.com') AS "FULL_EMAIL"
FROM EMPLOYEES;

--LENGTH(VALUE)
SELECT FIRST_NAME, LENGTH(FIRST_NAME) AS "LENGTH_NAME"
FROM EMPLOYEES
ORDER BY "LENGTH_NAME" DESC;

--substr(colName,begIndex,NumberOfChar)
SELECT SUBSTR(FIRST_NAME, 0, 1) || '.' || SUBSTR(LAST_NAME, 0, 1) AS "INITIALS"
FROM EMPLOYEES;

SELECT SUBSTR(FIRST_NAME, 0, 1) || '.' || SUBSTR(LAST_NAME, 0, 1) AS "INITIALS",
       FIRST_NAME || ' ' || LAST_NAME                             AS "FULL_NAME",
       LOWER(EMAIL || '@gmail.com')                               AS "FULL_EMAIL"
FROM EMPLOYEES;

--WIEW
CREATE VIEW EMAILLIST AS
SELECT SUBSTR(FIRST_NAME, 0, 1) || '.' || SUBSTR(LAST_NAME, 0, 1) AS "INITIALS",
       FIRST_NAME || ' ' || LAST_NAME                             AS "FULL_NAME",
       LOWER(EMAIL || '@gmail.com')                               AS "FULL_EMAIL"
FROM EMPLOYEES;

SELECT FULL_NAME FROM EMAILLIST;

--TO REMOVE THE VIEW
DROP VIEW EMAILLIST;