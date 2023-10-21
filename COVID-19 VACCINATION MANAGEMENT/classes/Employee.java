package classes; 
import java.lang.*;

public class Employee
{
	private String empId;
	private String name;
	private String duty;
	private double salary;
	
	public void setEmpId(String empId){this.empId = empId;}
	public void setName(String name){this.name = name;}
	public void setDuty(String duty){this.duty = duty;}
	public void setSalary(double salary){this.salary = salary;}
	
	public String getEmpId(){return empId;} 
	public String getName(){return name;}
	public String getDuty(){return duty;}
	public double getSalary(){return salary;} 
	
	public void showAllEmployee()
	
	{
		System.out.println("**************Information of Employee*****************");
		System.out.println("Employee Id: " +empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Duty: " + duty);
		System.out.println("Employee Salary: " + salary);
	}
		
}