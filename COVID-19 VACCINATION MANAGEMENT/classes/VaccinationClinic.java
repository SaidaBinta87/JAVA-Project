
package classes; 
import java.lang.*;
import interfaces.*;


public class VaccinationClinic implements PersonOperation,EmployeeOperation

{
	private Person person[] = new Person[1000];
	private Employee employees[] = new Employee [500];
	
	
	
	public boolean insertPerson( Person c)
	{
		boolean flag = false;
		for(int i=0; i<person.length; i++)
		{
			if(person[i]== null)
			{
				person[i]= c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removePerson( Person c)
	{
		boolean flag = false;
	for(int i=0; i<person.length; i++)
	{
		if(person[i]==c)
		{
			person[i]= null;
			flag = true;
			break;
		}
	}
	return flag;
	
	}
	
	
	public Person searchPerson( int nid)
	{
		Person c = null;
		for(int i=0; i<person.length; i++)
		{
			if(person[i] != null)
			{
				if(person[i].getNid()== nid)
				{
					c = person[i];
					break;
			    }
			}
		}
		return c;
	}
			
	
	
	
	public void showAllPerson()
	{
		for(int i=0; i<person.length; i++)
		{
			if(person[i] != null)
			{
				System.out.println("****************************");
				person[i].showDetails();
				person[i].showAllVaccine();
				System.out.println("****************************");
			}
		}
	}
				
	
		public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Employee searchEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	
	public void showAllEmployees()
	{
		System.out.println("--------------------------");
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
			   System.out.println("****************************");
			   employees[i].showAllEmployee();
			   System.out.println("****************************");
			}
		}
	}
			   
			  
	
}