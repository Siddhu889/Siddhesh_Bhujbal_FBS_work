import java.util.Scanner;

class Player
{
	String name;
	int no_of_matches_played;
	int run_scored;
	int wickets;
	
	public Player(String name, int no_of_matches_played, int run_scored, int wickets) {
		this.name = name;
		this.no_of_matches_played = no_of_matches_played;
		this.run_scored = run_scored;
		this.wickets = wickets;
	}
	
	public Player() {
		this.name = "Siddhesh";
		this.no_of_matches_played = 5;
		this.run_scored = 102;
		this.wickets = 4;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo_of_matches_played() {
		return no_of_matches_played;
	}

	public void setNo_of_matches_played(int no_of_matches_played) {
		this.no_of_matches_played = no_of_matches_played;
	}

	public int getRun_scored() {
		return run_scored;
	}

	public void setRun_scored(int run_scored) {
		this.run_scored = run_scored;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	void display()
	{
		System.out.println("Player Name:"+this.name);
		System.out.println("Matches Player:"+this.no_of_matches_played);
		System.out.println("Runs Scored:"+this.run_scored);
		System.out.println("Wickets Taken:"+this.wickets);
		
		System.out.println();   //blank line
	}

}
public class PlayerProjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        Player p1[] = new Player[10];
        
        
        //accept information
        
        for(int i = 0; i < 10; i++)
        {
        	System.out.println("Enter Details Of Player:"+(i+1));
        	
        	System.out.println("Name : ");
        	String name = sc.next();
        	
        	System.out.println("Matches :");
        	int matches = sc.nextInt();
        	
        	System.out.println("Runs :");
        	int runs = sc.nextInt();
        	
        	System.out.println("Wickets :");
        	int wickets = sc.nextInt();
        	
        	System.out.println();
        	
        	p1[i] = new Player(name,matches,runs,wickets);
        }
        
        //Display information
        System.out.println("\nPlayer Details");
        
        for(int i = 0; i < 10; i++)
        {
        	p1[i].display();
        }
        
        int maxrunsindex = 0;
        
        for(int i = 1; i < 10;i++)
        {
        	if(p1[i].getRun_scored() > p1[maxrunsindex].getRun_scored())
        	{
        		maxrunsindex = i;
        	}
        }
        
        System.out.println("Player with Maximum Runs");
        System.out.println("Maximum Runs = " + p1[maxrunsindex].getRun_scored());
        p1[maxrunsindex].display();
	
	//maximum wickets
	    int maxwicketindex = 0;
	    
	    for(int i = 1; i < 10;i++)
	    {
	    	if(p1[i].getWickets() > p1[maxwicketindex].getWickets())
	    	{
	    		maxwicketindex = i;
	    	}
	    }
	    
	    System.out.println("Player with maximum wickets:");
	    System.out.println("Maximum Wickets = " + p1[maxwicketindex].getWickets());
	    p1[maxwicketindex].display();
	    
	    sc.close();
        
	}
}


