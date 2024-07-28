package com.tech;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Selectall {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("HB.cfg.xml");
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		String hql="from Student";
		Query query=s.createQuery(hql);
		
		List <Student> std=query.list();
		
		for ( Student st:std){
			System.out.println(st);
		}

	}

}
