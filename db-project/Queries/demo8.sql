SELECT * FROM scrumteam1;

--adding new column
ALTER TABLE scrumteam1 ADD SALARY Integer;

--update existing employees salary

UPDATE scrumteam1 SET SALARY = 100000 WHERE EMP_ID = 1;

UPDATE scrumteam1 SET SALARY = 90000 WHERE EMP_ID = 2;

UPDATE scrumteam1 SET SALARY = 120000 WHERE EMP_ID = 3;

UPDATE scrumteam1 SET SALARY = 150000 WHERE EMP_ID = 4;

--rename the column
ALTER TABLE scrumteam1 RENAME COLUMN SALARY TO ANNUAL_SALARY;

--delete, drop column
ALTER TABLE scrumteam1 DROP COLUMN ANNUAL_SALARY;

--how to change table name ?
ALTER TABLE scrumteam1 RENAME TO agileteam;

select * from agileteam;

ALTER TABLE agileteam  RENAME TO scrumteam1;

commit;

--truncate, if we want to delete all data from the table, but still keep the table structure, we use truncate

TRUNCATE TABLE scrumteam1;

--If we want to delete the table and data together
DROP TABLE scrumteam1;




