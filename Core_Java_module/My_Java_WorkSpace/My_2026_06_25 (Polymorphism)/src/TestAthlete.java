class Athlete {
	String name;
	int age;
	String country;

	Athlete() {
		this.name = "Default";
		this.age = 20;
		this.country = "India";
	}

	Athlete(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	String getCountry() {
		return country;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setCountry(String country) {
		this.country = country;
	}

	// Polymorphic Behavior
	void play() {
		System.out.println("Athlete is playing.");
	}

	void display() {
		System.out.println();
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Country : " + this.country);
	}
} // Athlete ends here


class Cricketer extends Athlete {
	int runs;
	String team;

	Cricketer() {
		super();
		this.runs = 5000;
		this.team = "India";
	}

	Cricketer(String name, int age, String country,
			  int runs, String team) {
		super(name, age, country);
		this.runs = runs;
		this.team = team;
	}

	int getRuns() {
		return runs;
	}

	String getTeam() {
		return team;
	}

	void setRuns(int runs) {
		this.runs = runs;
	}

	void setTeam(String team) {
		this.team = team;
	}

	// Polymorphic Behavior
	void play() {
		System.out.println("Cricketer is batting and bowling.");
	}

	void display() {
		super.display();
		System.out.println("Runs : " + this.runs);
		System.out.println("Team : " + this.team);
	}
} // Cricketer class ends here


class FootballPlayer extends Athlete {
	int goals;
	String position;

	FootballPlayer() {
		super();
		this.goals = 50;
		this.position = "Forward";
	}

	FootballPlayer(String name, int age, String country,
				   int goals, String position) {
		super(name, age, country);
		this.goals = goals;
		this.position = position;
	}

	int getGoals() {
		return goals;
	}

	String getPosition() {
		return position;
	}

	void setGoals(int goals) {
		this.goals = goals;
	}

	void setPosition(String position) {
		this.position = position;
	}

	// Polymorphic Behavior
	void play() {
		System.out.println("Football player is scoring goals.");
	}

	void display() {
		super.display();
		System.out.println("Goals : " + this.goals);
		System.out.println("Position : " + this.position);
	}
} // FootballPlayer ends here

public class TestAthlete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Athlete a;

		a = new Athlete("Sport Person", 25, "India");
		a.display();
		a.play();

		a = new Cricketer("Virat", 36, "India", 14000, "RCB");
		a.display();
		a.play();

		a = new FootballPlayer("Messi", 38, "Argentina", 850, "Forward");
		a.display();
		a.play();

	} // main ends here

} // TestAthlete ends here
	