package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Updatepk {

	public static void main(String[] args) {
		System.out.println("11111111111");
		Configuration cfg=new Configuration();
		cfg.configure("HB.cfg.xml");
		System.out.println("22222222222");
		 
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction txn=s.beginTransaction();
		
		String hql="update Student set id=57"+"where id=52";
		Query query= s.createQuery(hql);
	
		int result= query.executeUpdate();
		System.out.println(result);
		 
		txn.commit();
		
		
	}

}
