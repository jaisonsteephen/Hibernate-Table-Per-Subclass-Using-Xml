package com.javatpoint.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StoreData {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("jis");

		Regular_Employee e2 = new Regular_Employee();
		e2.setName("joe");
		e2.setSalary(50000);
		e2.setBonus(5);

		Contract_Employee e3 = new Contract_Employee();
		e3.setName("jil");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hr");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}