
package classes;
import java.lang.*;
import interfaces.*;

public abstract class Vaccine implements DoseOperation
{
	
	protected String VaccineName;
	protected String mobile;
	
	
	protected int VaccinationID; 
	protected int Dose;
	
	
	
	public Vaccine () {}
	
	public Vaccine( String VaccineName,String mobile,int VaccinationID,int Dose )
	{
	 this.VaccineName = VaccineName;
	 this.mobile = mobile;
	 
	 this.VaccinationID = VaccinationID;
	 this.Dose = Dose;
	}
	
	public void setVaccineName(String VaccineName){this.VaccineName = VaccineName;}
	public void setMobileNo(String mobile){this.mobile = mobile;}
	
	
	public void setVaccinationID(int VaccinationID){this.VaccinationID = VaccinationID;}
	public void setDose(int Dose){this.Dose = Dose;}
	
	
	public String getVaccineName( )
    {return VaccineName;}
   
	
    public int getVaccinationID()
    {return VaccinationID; }
	 public int getDose()
    {return Dose; }
	
	
	public boolean takenDose(int amount)
	{
      if(amount>=0 && amount<=Dose)
	  {
         Dose = Dose - amount;
		 return true;
	  }
      else
	  {
        System.out.println("invalid");
		return false;
	  }	
	}	  
	
	

   public abstract void showDetails();
   

	
	
	
	
	
}