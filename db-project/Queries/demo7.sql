/*
create table syntax:
    create table TableName(
        colName1 DataType Constraints,
        colName2 DataType Constraints(optional)
        colName3 DataType Constraints,
        ...
    );
*/
CREATE TABLE ScrumTeam1(
                          EMP_ID Integer Primary Key,
                          FIRSTNAME varchar(30) not null,
                          LASTNAME varchar(30),
                          JOBTITLE varchar(20)

);

select * from ScrumTeam1;

/*
INSERT INTO tableName (column1, column2,â€¦)
VALUES (value1, value2 â€¦ );
*/

INSERT INTO ScrumTeam1(EMP_ID, FIRSTNAME, LASTNAME, JOBTITLE)
VALUES (1,'SEVERUS','SNAPE','TESTER');

INSERT INTO ScrumTeam1 VALUES (2,'HAROLD','FINCH','DEVELOPER');

INSERT INTO ScrumTeam1 VALUES (3,'Phoebe','Buffay','ScrumMaster');

INSERT INTO ScrumTeam1 VALUES (4,'Michael','Scofield','PO');

--how to update data
/*
UPDATE table_name
SET column1 = value1,
column2 = value2 , â€¦
WHERE condition;
*/


UPDATE ScrumTeam1 SET FIRSTNAME='Harold' WHERE EMP_ID=2;
UPDATE ScrumTeam1 SET LASTNAME='Finch' WHERE EMP_ID=2;
UPDATE ScrumTeam1 SET JOBTITLE='Developer' WHERE EMP_ID=2;

--Delete from table
/*
DELETE FROM table_name
WHERE condition;
*/
DELETE FROM ScrumTeam1
WHERE EMP_ID = 3;

--saving changes
commit;
