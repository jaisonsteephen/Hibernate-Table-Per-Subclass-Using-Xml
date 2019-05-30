# Hibernate-Table-Per-Subclass-Using-Xml

Hibernate: select max(id) from table_per_subclass_employee

Hibernate: insert into table_per_subclass_employee (name, id) values (?, ?)

Hibernate: insert into table_per_subclass_employee (name, id) values (?, ?)

Hibernate: insert into table_per_subclass_emp_reg (salary, bonus, id) values (?, ?, ?)

Hibernate: insert into table_per_subclass_employee (name, id) values (?, ?)

Hibernate: insert into table_per_subclass_emp_ctr (pay_per_hour, contract_duration, id) values (?, ?, ?)

SQL> select * from table_per_subclass_employee;

	ID NAME
	 1 jis
	 2 joe
	 3 jil

SQL> select * from table_per_subclass_emp_reg;

	ID     SALARY	   BONUS
	 2	50000	       5

SQL> select * from table_per_subclass_emp_ctr;

	ID PAY_PER_HOUR CONTR
	 3	   1000 15 hr
