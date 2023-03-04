select * from Testers;

select * from Developers;

select * from testers
union
select * from developers;

select * from testers
union all
select * from developers;

select names from testers
union
select names from developers;

select names from developers
intersect
select names from testers;

select names from developers
minus
select names from testers;


select  first_name,count(*)
from employees
group by first_name;

--how to find duplicate names in employees table

select  first_name,count(*)
from employees
group by first_name
having count(*) >1;

