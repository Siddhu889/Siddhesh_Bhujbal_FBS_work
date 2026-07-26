package p1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="D")
public class Developer extends Emp {

	String skillSet;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	
	public Developer(int v1, String v2, float v3, String v4)
	{
		super(v1,v2,v3);
		skillSet=v4;
	}

	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	
	
}
