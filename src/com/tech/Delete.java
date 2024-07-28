package com.tech;


import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		
		 Configuration cfg=new Configuration();
		 cfg.configure("HB.cfg.xml");
		 
		 SessionFactory sf=cfg.buildSessionFactory();
		 Session s =sf.openSession();
		 
		 Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to delete entry: ");
		int id = sc.nextInt();
		 Transaction txn= s.beginTransaction();
		 
		 String delete="DELETE FROM Student WHERE id = :studentId" ;
		 Query query=s.createQuery(delete);
		 query.setParameter("studentId", id);
		 sc.close();
		 int result=query.executeUpdate();
		 System.out.println(result);
		 
		 txn.commit();
		 
		 if(result >0) {
			 System.out.println("Delete done");
		 }else {
			 System.out.println("Delete unsuccesfull");
		 }
	}

}
