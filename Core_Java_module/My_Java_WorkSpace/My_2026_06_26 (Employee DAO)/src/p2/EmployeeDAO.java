package p2;

import p1.*;

public class EmployeeDAO {
    private static Employee[] empArr;
    private static int empCount;
    
    static {
    	empArr = new Employee[20];
    	empCount = 0;
    	
    	empArr[empCount++] = new HR(104,"Priya",25000,4520);
    	empArr[empCount++] = new HR(105,"Vikas",65000,3200);
    	empArr[empCount++] = new HR(109,"Nisha",51000,7400);
    	
    	empArr[empCount++] = new SalesManager(201,"Om",5200,2500,12);
    	empArr[empCount++] = new SalesManager(203,"Tina",5488,5600,10);
    	empArr[empCount++] = new SalesManager(301,"Jia",7400,6500,24);
    	
    	empArr[empCount++] = new Admin(305,"Kavita",85000,3700);
    	empArr[empCount++] = new Admin(304,"Jai",74000,3200);
    	empArr[empCount++] = new Admin(361,"Omi",75314,9512);
    	empArr[empCount++] = new Admin(320,"Arjun",5196,3200);
    }

	public static Employee[] getEmpArr() {
		return empArr;
	}

	public static int getEmpCount() {
		return empCount;
	}
    
    public boolean addEmployee(Employee e)
    {
    	if(empCount >= empArr.length)
    	{
    		Employee[] newArr = new Employee[empArr.length + 5];
    		for(int i = 0;i < empArr.length;i++)
    		{
    			newArr[i] = empArr[i];
    		}
    		empArr = newArr;
    	}
    	empArr[empCount++]=e;
    	return true;
    }
    
    public void displayAllEmployee()
    {
    	for(int i= 0;i < empCount;i++)
    	{
    		System.out.println(empArr[i]);
    	}
    }
    
    public int searchEmployeeById(int id)
    {
    	for(int i = 0;i < empCount;i++)
    	{
    		if(empArr[i].getId() == id)
    		{
    			return i;
    		}
    	}
    	return -1;
    }
    
    public boolean updateEmployee(int id, double salary)
    {
    	int idx = searchEmployeeById(id);
    	empArr[idx].setSalary(salary);
    	return true;
    }
    
    public boolean deleteEmployee(int id)
    {
    	int idx = searchEmployeeById(id);
    	if(idx!=-1)
    	{
    		for(int i = idx;i < empCount;i++)
    		{
    			empArr[i] = empArr[i+1];
    		}
    		empArr[--empCount]=null;
    		return true;
    	}
    	return false;
    }
    
    public Employee getEmployeeById(int id)
    {
    	int idx = searchEmployeeById(id);
    	if(idx != 1)
    	{
    		return empArr[idx];
    	}
    	else
    		return null;
    }
}
