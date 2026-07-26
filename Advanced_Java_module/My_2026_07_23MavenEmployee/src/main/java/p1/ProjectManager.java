package p1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="PM")
public class ProjectManager extends Developer {

	int teamSize;
	
	public ProjectManager() {
		// TODO Auto-generated constructor stub
	}

	public ProjectManager(int v1 ,String v2, float v3, String v4, int v5) {
		super(v1,v2,v3,v4);
		teamSize=v5;
	}
	
	
}
