--GET ME UNIQUE JOB_IDS
SELECT DISTINCT JOB_ID
FROM EMPLOYEES;


--get me avarage salary or IT_PROG
SELECT avg(SALARY)
FROM EMPLOYEES
WHERE JOB_ID = 'AC_ACCOUNT';

SELECT JOB_ID, avg(SALARY), COUNT(*), sum(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID;

--GET ME JOBIDS WHERE THEIR AVG SALARY IS MORE THAN 5K
SELECT JOB_ID, avg(SALARY), COUNT(*), sum(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING avg(SALARY) > 5000;

--GET ME JOBIDS WHERE THEIR AVG SALARY IS MORE THAN 5K
SELECT JOB_ID, avg(SALARY), COUNT(*), sum(SALARY)
FROM EMPLOYEES
WHERE SALARY > 5000
GROUP BY JOB_ID

