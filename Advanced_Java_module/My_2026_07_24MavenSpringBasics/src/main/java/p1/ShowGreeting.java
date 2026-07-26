package p1;

public class ShowGreeting implements Greetable{

	String msg;
	
	
	public ShowGreeting() {
		// TODO Auto-generated constructor stub
	}
	
	public ShowGreeting(String v1) {
	     msg = v1;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
	    System.out.println(msg);	
	}
}
