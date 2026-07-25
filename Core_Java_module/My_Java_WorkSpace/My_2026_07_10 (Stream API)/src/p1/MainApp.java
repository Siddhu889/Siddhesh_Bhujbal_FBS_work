package p1;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.stream.Collectors;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Student> allStudents = new ArrayList<>();
       
       allStudents.add(new Student(1,"Soham",80,"M"));
       allStudents.add(new Student(2,"Pranav",85,"M"));
       allStudents.add(new Student(3,"Geeta",90,"F"));
       allStudents.add(new Student(4,"Nita",95,"F"));
       
       //Iteration
       //forEach()
       //forEach(ref.getStudName());
       //allStudents.stream().forEach(ref->System.out.println(ref.getStudName()));
       
       //filtering
       //allStudents.stream().filter(merimarzi->merimarzi.getMarks()>83)
       //.forEach(ref->System.out.println(ref.getStudName()));
       
       //pipeline
       Double avgMarks=allStudents.stream().filter(ref->ref.getGender().equals("M"))
       .mapToDouble(ref->ref.getMarks()).average().getAsDouble();
       System.out.println(avgMarks);
       
//       HashMap<String, List<Student>> byName = (HashMap<String, List<Student>>)
//       allStudents.stream().collect(Collectors.groupingBy(Student::getStudName));
	}

}
