package com.gontuseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.fasterxml.classmate.AnnotationConfiguration;


public class Main {
	public static void main(String[] args) {
		Student_Info stu = new Student_Info();
		stu.setName("Aniket");
		stu.setRoll_no(1);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student_Info.class);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(stu);
		
		session.getTransaction().commit();
		session.close();
		sf.close();
		
		/*Student_Info stu = new Student_Info();

		stu.setName("Aniket");
		stu.setRoll_no(1);

		Configuration con = new Configuration().configure().addAnnotatedClass(Student_Info.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(stu);
		tx.commit();*/
	}
}
