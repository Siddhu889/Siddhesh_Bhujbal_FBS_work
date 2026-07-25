class AIRobot
{
	int id;
	String model,power_source;
	
	public AIRobot() {
		this.id = 101;
		this.model = "Default";
		this.power_source = "Electricity";
	}
	
	public AIRobot(int id, String model, String powerSource) {
		this.id = id;
		this.model = model;
		this.power_source = powerSource;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPowerSource() {
		return power_source;
	}

	public void setPowerSource(String powerSource) {
		this.power_source = powerSource;
	}
	
	void display()
	{
		System.out.println();
		System.out.println("Id:"+this.id);
		System.out.println("Model:"+this.model);
		System.out.println("Power Source:"+this.power_source);
	}
}//AI robot ends here

class MedicalBot extends AIRobot
{
	boolean surgerymode;

	public MedicalBot() {
		super();
		this.surgerymode = false;
	}
	
	public MedicalBot(int id, String model, String powerSource,boolean surgerymode) {
		super(id,model,powerSource);
		this.surgerymode = surgerymode;
	}

	public boolean isSurgerymode() {
		return surgerymode;
	}

	public void setSurgerymode(boolean surgerymode) {
		this.surgerymode = surgerymode;
	}
	
	void display()
	{
		super.display();
		System.out.println("Surgery Mode: "+this.surgerymode);
	}
}//MedicalBot ends here

class CombactBot extends AIRobot
{
	String weapon_type,armor_type;

	public CombactBot() {
		super();
		this.weapon_type = "Armour";
		this.armor_type = "Danger";
	}
	
	public CombactBot(int id, String model, String powerSource,String weapontype, String armortype) {
		super();
		this.weapon_type = weapontype;
		this.armor_type = armortype;
	}

	public String getWeapontype() {
		return weapon_type;
	}

	public void setWeapontype(String weapontype) {
		this.weapon_type = weapontype;
	}

	public String getArmortype() {
		return armor_type;
	}

	public void setArmortype(String armortype) {
		this.armor_type = armortype;
	}
	
	void display()
	{
		super.display();
		System.out.println("Weapon Type:"+this.weapon_type);
		System.out.println("Armor Type Mode:"+this.armor_type);
	}
}//CombactBot ends here

public class TestAIRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AIRobot a1 = new AIRobot();
        a1.display();
        AIRobot a2 = new AIRobot(101, "Alpha-X","Solar");
        a2.display();
        
        MedicalBot m1 = new MedicalBot();
        m1.display();
        MedicalBot m2 = new MedicalBot(202, "Medicare","Battery",true);
        m2.display();
        
        CombactBot c1 = new CombactBot();
        c1.display();
        CombactBot c2 = new CombactBot(202, "Warrior-X", "Nuclear","Laser","Titanium");
        c2.display();
	}//main ends here

}//TestAIRobot ends here
