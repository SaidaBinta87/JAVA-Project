package classes; 
import java.lang.*;


public class PfizerVaccine extends Vaccine

{
	public String  CriticalDisease;
	
	
	public PfizerVaccine() { super ();}

    public PfizerVaccine( String VaccineName,String mobile,int VaccinationID,int Dose, String CriticalDisease )	
	{
		super( VaccineName,mobile,VaccinationID,Dose);
		this.CriticalDisease = CriticalDisease;
	}
	
	public void setCriticalDisease(String CriticalDisease){this.CriticalDisease=CriticalDisease;}
	
	public String getCriticalDisease(){return CriticalDisease;}
	
	public void  showDetails()
	{    
	   	
		System.out.println("Vaccine Name:"+VaccineName);
		System.out.println("Candidate's Mobile no:"+mobile);
		
		System.out.println("Vaccination ID:"+VaccinationID);
		System.out.println("Number of Dose need to take:"+Dose);
		System.out.println("Previous Critical Disease:"+CriticalDisease);
		
	}
	
	
		
}