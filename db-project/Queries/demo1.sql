-- I want to see firstname last name phone number of david(s)

SELECT FIRST_NAME,LAST_NAME,PHONE_NUMBER FROM EMPLOYEES
WHERE FIRST_NAME='David' AND LAST_NAME='Lee';

--GET ME ALL INFORMATION WO IS MAKING MORE THAN 7000 SALARY
SELECT * FROM EMPLOYEES
WHERE SALARY>7000;

--GET ME EMAİL OF WHO IS MAKING LESS THAN 4000 SALARY
SELECT EMAIL,SALARY FROM EMPLOYEES
WHERE SALARY<4000;

--GET ME ALL INFO WHO IS WORKING AS IT_PROG OR SA_REP
SELECT * FROM EMPLOYEES
WHERE JOB_ID='IT_PROG' OR JOB_ID='SA_REP' ;

--GET ME FIRST NAME LAST NAME,SALARY WHO IS MAKING MORE THAN 5000 AND LESS TAHN 10000
SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES
WHERE SALARY>= 5000 AND SALARY <=10000;
--OR==> WHERE SALARY BETWEEN 5000 AND 10000

SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID BETWEEN 130 AND 170 ;

--get me all info where employee_id 135 176 154 129
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID= 135 OR EMPLOYEE_ID=176 OR EMPLOYEE_ID= 154 OR EMPLOYEE_ID= 129;
-------------------------->>>>>>>>OR<<<<<<<--------------------------------
SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID IN(135,176,154,129);

--get me city of where country_id IT;US,UK
SELECT CITY,COUNTRY_ID FROM LOCATIONS WHERE COUNTRY_ID IN('IT','US','UK');
