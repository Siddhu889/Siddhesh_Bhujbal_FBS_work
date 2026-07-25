package p1;

class VoterAgeException extends Exception
{
	private static final long serialVersionUID = 1L; 
	
	public String toString()
	{
		return "Invalid Age to Vote";
	}
}
class Voter
{
	int age;

	Voter(int age) {
		super();
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	void validate()
	{
		try
		{
			if(this.age < 18)
			{
				throw new VoterAgeException();
			}
			
			else
			{
				System.out.println("You are eligible to vote");
			}
		}
		catch(VoterAgeException vae)
		{
			System.out.println(vae);
		}
	}	
}//Voter Class ends here

public class TestVoter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Voter v1 = new Voter(42);
        v1.validate();
        Voter v2 = new Voter(14);
        v2.validate();
	}

}
