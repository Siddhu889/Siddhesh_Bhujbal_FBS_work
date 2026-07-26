package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Chetan","Pune");
		try{
			
		Configuration cfg=new Configuration();
		cfg.configure("config.xml");
		System.out.println("Program Started");
		System.out.println("Config Loaded");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.persist(s);
		
		tr.commit();
		session.close();
		
		System.out.println("Data Inserted");
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
