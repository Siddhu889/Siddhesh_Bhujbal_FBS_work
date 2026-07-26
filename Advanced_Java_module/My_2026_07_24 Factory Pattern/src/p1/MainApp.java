package p1;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DatabaseConnectivity ref=new DatabaseConnectivity();
//		ref.connectToDatabase();
		
		Connectivity ref=ConnectivityFactory.getObject();
		ref.connect();
	}

}
