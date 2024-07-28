package com.tech;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tech.Student;

public class Select {

	public static void main(String[] args) {

		System.out.println("1111111111111");
		Configuration cfg = new Configuration();
		cfg.configure("HB.cfg.xml");
		System.out.println("2222222222222");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		System.out.println("3333333333333");

		String HQL = " from Student where id = 3";//from Employee where id =2
	
		Student s= (Student)
		session.get(Student.class, new Integer(1));
//		System.out.println(s.getName("Pagal"));
//		Query query = session.createQuery(HQL);
//
//	
//
//		Student singleResult =(Student) query.getSingleResult();
//
//		System.out.println(singleResult);
//
//		

	}

}
