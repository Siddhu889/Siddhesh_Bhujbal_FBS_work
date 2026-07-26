package p1;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="S")
public class SalesPerson extends Emp {

	float target;
	
	public SalesPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public SalesPerson(int v1, String v2, float v3, float v4)
	{
		super(v1,v2,v3);
	}

	public float getTarget() {
		return target;
	}

	public void setTarget(float target) {
		this.target = target;
	}
	
	
}
