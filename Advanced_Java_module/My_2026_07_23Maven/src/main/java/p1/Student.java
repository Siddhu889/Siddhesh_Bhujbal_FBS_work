package p1;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")

public class Student {

    @Id
    @Column(name="stid")
	int studentId;
	String studentName;
	@Embedded
	Address studAdr;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int v1, String v2, Address v3) {
		this.studentId = v1;
		this.studentName = v2;
		this.studAdr = v3;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getStudAdr() {
		return studAdr;
	}

	public void setStudAdr(Address studAdr) {
		this.studAdr = studAdr;
	}
	
}
