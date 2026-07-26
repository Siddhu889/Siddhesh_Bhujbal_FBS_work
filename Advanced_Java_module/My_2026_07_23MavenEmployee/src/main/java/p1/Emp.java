package p1;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
//import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="emphierarchy")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emptype")
//@DiscriminatorValue(value="E")
public abstract class Emp {

	@Id
	@Column(name="empid")
	int empId;
	@Column(name="empname")
	String empName;
	@Column(name="salary")
	float salary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	public Emp(int v1, String v2, float v3)
	{
		empId=v1;
		empName=v2;
		salary=v3;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}
