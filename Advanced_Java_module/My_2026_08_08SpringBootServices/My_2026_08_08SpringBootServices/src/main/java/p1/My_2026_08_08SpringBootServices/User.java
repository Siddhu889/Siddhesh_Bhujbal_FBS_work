package p1.My_2026_08_08SpringBootServices;


public class User {

	String userid;
	String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String v1, String v2)
	{
		userid=v1;
		password=v2;
	}
	
	public String getUserid()
	{
		return userid;
	}
	
	public void setuserid(String userid)
	{
		this.userid = userid;
	}
	
	public String getPassword()
	{
		return password;
	}
}
