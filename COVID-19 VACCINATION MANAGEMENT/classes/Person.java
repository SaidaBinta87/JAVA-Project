
package classes; 
import java.lang.*;
import interfaces.*;

public class Person implements VaccineOperation
{
	private String Name;
	private int nid ;
	private int age;
	private Vaccine vaccine[]= new Vaccine [200];
	
	
	public Person(){}
	
	public Person( String Name,int nid,int age)
	{
		this.Name = Name;
		this.nid = nid;
		this.age = age;
		
		
	}


    public void setName(String Name){this.Name=Name;}
	 public void setNid(int nid){this.nid=nid;}
	  public void setAge(int nid){this.age=age;}
	
	
	
    public String getName(){return Name;}
	 public int getNid(){return nid;}
	  public int getAge(){return age;}

    public void showDetails()
	{
		System.out.println("Candidate's Name: " + Name);
		System.out.println("Candidate's Nid: " + nid);
		System.out.println("Candidat's Age: " + age);
	}
	
	
	public boolean insertVaccine(Vaccine C)
	{
		boolean flag = false;
		for(int i = 0; i<vaccine.length; i++)
		{
			if(vaccine[i] == null)
			{
				vaccine[i] = C;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeVaccine(Vaccine C)
	{
		boolean flag = false;
		for(int i=0; i<vaccine.length; i++)
		{
			if(vaccine[i] == C)
			{
				vaccine[i] = null;
				flag = true;
				break;
			}
		}
		return flag;		
	}
	public void showAllVaccine()
	{
		for(int i=0; i<vaccine.length; i++)
		{
			if(vaccine[i] != null)
			{
				vaccine[i].showDetails();
				System.out.println();
			}
			
		}
	}
	public Vaccine searchVaccine(int VaccinationID)
	{
		Vaccine flag = null;
		for(int i=0; i<vaccine.length; i++)
		{
			if(vaccine[i] != null)
			{
				if(vaccine[i].getVaccinationID() == VaccinationID)
				{
					flag = vaccine[i];
					break;
				}
			}
		}
		return flag;
	}
}
	
	