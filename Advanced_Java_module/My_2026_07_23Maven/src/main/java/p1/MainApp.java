package p1;

//import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		 
		Student s1=new Student(2,"Mahesh",new Address("Kothrud","Pune"));
		Session session=new Configuration().configure("config.xml").buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(s1);
		
		tr.commit();
		session.close();
		
	}
}
