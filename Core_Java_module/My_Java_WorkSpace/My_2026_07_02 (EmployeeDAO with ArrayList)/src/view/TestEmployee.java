package view;

import java.util.Scanner;

import controller.dao.EmployeeDAO;
import model.*;

public class TestEmployee {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        
	        EmployeeDAO dao = new EmployeeDAO();
	        
	        int choice;
	        do {
	        	System.out.println("\n---------------Managment Menu--------------");
	        	System.out.println("1. Add Employee");
	        	System.out.println("2. Search Employee");
	        	System.out.println("3. Update Employee");
	        	System.out.println("4. Delete Employee");
	        	System.out.println("5. Display All Employees");
	        	System.out.println("6. Calculate Salary for Every Employee");
	        	System.out.println("0. Exit");
	        	choice = sc.nextInt();
	        	
	            switch(choice)
	            {
	            case 1:
	            	System.out.println("Enter Employee Type(1:HR, 2:Admin, 3:Sales Manager) :");
	            	int empType = sc.nextInt();
	            	
	            	System.out.println("Enter ID:");
	            	int id = sc.nextInt();
	            	sc.nextLine();
	            	System.out.println("Enter Name:");
	            	String name = sc.nextLine();
	            	System.out.println("Enter Salary:");
	            	double salary = sc.nextDouble();
	            	
	            	switch(empType)
	            	{
	            	case 1:
	            		System.out.println("Enter Commission:");
	            		double commission = sc.nextDouble();
	            		dao.addEmployee(new HR(id,name,salary,commission));
	            		System.out.println("HR added successfully!");
	            		break;
	            		
	            	case 2:
	            		System.out.println("Enter Allowance:");
	            		double allowance = sc.nextDouble();
	            		dao.addEmployee(new Admin(id,name,salary,allowance));
	            		System.out.println("Admin added successfully!");
	            		break;
	            		
	            	case 3:
	            	    System.out.println("Enter Incentive:");
	            	    double incentive = sc.nextDouble();
	            	    System.out.println("Enter Target:");
	            	    int target = sc.nextInt();
	            	    dao.addEmployee(new SalesManager(id,name,salary,incentive,target));
	            	    System.out.println("Sales Manager added successfully!");
	            	    break;
	            	    
	            	 default:
	            		 System.out.println("Invalid choice!");
	            	}
	            	break;
	            	
	            case 2:
	            	System.out.println("Enter ID to Search:");
	            	id = sc.nextInt();
	            	Employee emp =  dao.searchEmployeeById(id);
	            	if(emp!=null)
	            	{            		
	            		System.out.println("Employee Found!\n"+emp);
	            	}
	            	else
	            		System.out.println("Employee Not Found");
	            	break;
	            	
	            case 3:
	            	System.out.println("Enter ID to Update:");
	            	id = sc.nextInt();
	            	Employee employee = dao.searchEmployeeById(id);
	            	if(employee != null)
	            	{
	            		System.out.println("Enter New Salary:");
	            		salary = sc.nextDouble();
	            		dao.updateEmployee(id, salary);
	            		System.out.println("Salary Updated Successfully");
	            	}
	            	else
	            	{
	            		System.out.println("Employee Not Found");
	            	}
	            	break;
	            	
	            case 4:
	            	System.out.println("Enter ID to Delete:");
	            	id  =sc.nextInt();
	            	if(dao.deleteEmployee(id))
	            		System.out.println("Employee Deleted.");
	            	else
	            		System.out.println("Employee Not Found.");
	            	break;
	            	
	            case 5:
	            	dao.displayAllEmployee();
	            	break;
	            	
	            case 6:
	            	for(Employee employee1:EmployeeDAO.getEmpArr()) {
            			System.out.println(employee1.getName()+" :: Total Salary :: "+dao.calculateSalary(employee1));
            		}
            		break;
	            	
	            case 0:
	                System.out.println("Exiting...");
	                break;
	                
	                default:
	                	System.out.println("Invalid choice!");
	            }
	        } while(choice != 0);
	        sc.close();
		}
	}
	            


