package interfaces;
import java.lang.*;
import classes.*;


public interface EmployeeOperation
{
	boolean insertEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}