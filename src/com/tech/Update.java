package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		 System.out.println("1111111111111");
		 
		 Configuration cfg=new Configuration();
		 cfg.configure("HB.cfg.xml");
		 System.out.println("2222222222222");
		 
		 SessionFactory sf=cfg.buildSessionFactory();
		 Session s=sf.openSession();
		 System.out.println("3333333333333");
		 
		 Transaction txn=s.beginTransaction();
		 
		 String hql="update Student set city ='Pune' where id =8";
		 
		 Query query=s.createQuery(hql);
		 int result= query.executeUpdate();
		 System.out.println(result);
		 
		 txn.commit();
		 
	}

}
