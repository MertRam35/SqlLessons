public class test {

    public static void main(String[] args) {


        System.out.println("hello");


    }
}
/*
select * from employees;

--.1 Show all job_id and average salary who work as any of these jobs IT_PROG, SA_REP, FI_ACCOUNT, AD_VP
select job_id, avg(salary) from employees group by job_id having job_id='IT_PROG' OR job_id='SA_REP' OR job_id='FI_ACCOUNT' OR job_id='AD_VP';

--2. Show all records whose last name contains 2 lowercase 'as'
SELECT * from employees where last_name like '%as';

--3. Display max salary  for each department
select  round(max(salary)),department_name  from employees e join departments d ON e.department_id =d.department_id group by d.department_id;

--4. Display total salary for each department except department_id 50, and where total salary >30000
select sum(salary),department_name from employees e join departments d on d.department_id = e.department_id  group by d.department_id having sum(salary) >30000 and d.department_id !=50;

--5. Write a SQL query that returns first and last name any employees who started job between 1-JAN-2000 and 3-SEP-2007 from the hr database
select first_name || ' ' || employees.last_name as fullName, hire_date  from employees where hire_date > '2000-01-01';
                                                                ;

--6. Display country_id, country name, region id, region name from hr database
select country_id,country_name, c.region_id, region_name from countries c join regions r on r.region_id = c.region_id;

--7. Display All cities, country names from hr database
select city, country_name from locations l join countries c on c.country_id = l.country_id;

--8. display the first name, last name, department number, and department name,  for all employees for departments 80 or 40.
select first_name,last_name,e.department_id,department_name from employees e join departments d on d.department_id = e.department_id;

--9. Display employees' first name, Lastname department id and all departments including those where do not have any employee.
select first_name,last_name,e.department_id,department_name from employees e right join departments d on d.department_id = e.department_id;

--10. Display the first name, last name, department number, and name, for all employees who have or have not any department
select first_name, last_name,e.department_id,department_name from employees e left join departments d on e.department_id = d.department_id;

--11. Display all employee and their manager's names
select employee_id, first_name, last_name, manager_id from employees;
select e.first_name || ' ' || e.last_name as employee , m.first_name || ' '|| m.last_name as manager from employees e join employees m  on e.manager_id= m.employee_id;
 */