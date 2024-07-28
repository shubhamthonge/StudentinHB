package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		System.out.println("111111111111111");
		
		Configuration cfg = new Configuration();
		cfg.configure("HB.cfg.xml");
		System.out.println("222222222222222");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		System.out.println("3333333333333333");
		
		Transaction txn =s.beginTransaction();
		
		Student s1=new Student(93, "Pagal", "Agara");
//		Student s2=new Student(55, "Swapnil", "Noida");
//		Student s3=new Student(99, "Pournima", "Nagpur");
//		Student s4=new Student(88, "Vaishnavi", "Yavatmal");
//		Student s5=new Student(77, "Ashwini", "Pune");
//		Student s6=new Student(33, "Sita", "Indapur");
//		
//		s.save(s1);
//		s.save(s2);
//		s.save(s3);
//		s.save(s4);
//		s.save(s5);
		s.save(s1);
		
		int a= (int) s.save(s1);
		System.out.println(a);
		txn.commit();
	

	}

}
