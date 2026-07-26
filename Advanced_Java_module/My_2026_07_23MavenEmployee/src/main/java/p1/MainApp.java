package p1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e1=new Developer(1,"X",12345,"Java");
		Emp e2=new ProjectManager(2,"Y",52344,"Java",4);
		Emp e3=new SalesPerson(3,"Z",2342,543);
		
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tr.commit();
		session.close();
	}

}
