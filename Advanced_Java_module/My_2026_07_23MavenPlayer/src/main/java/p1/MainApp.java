package p1;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Player> batters=new HashSet<>();
		Team t1=new Team(1,"Mumbai Indian(W)",batters);
		Player p1=new Player(1,"Harmanpreet Kaur",30,t1);
		Player p2=new Player(2,"Amelie Kerr",15,t1);
		t1.allBatters.add(p1);
		t1.allBatters.add(p2);

		Session session=new Configuration().configure("config.xml").buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.persist(t1);
		
		tr.commit();
		session.close();
	}

}
