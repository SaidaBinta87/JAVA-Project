package classes;

import java.lang.*;


public class AstrazenecaVaccine extends Vaccine

{
	public String AllergicPercentage;
	
	
	public AstrazenecaVaccine() { super();}

    public AstrazenecaVaccine( String VaccineName,String mobile,int VaccinationID,int Dose,String AllergicPercentage )	
	{
		super( VaccineName,mobile,VaccinationID,Dose);
		this.AllergicPercentage = AllergicPercentage;
	}
	
	public void setAllergicPercentage(String AllergicPercentage){this.AllergicPercentage=AllergicPercentage;}
	
	public String getAllergicPercentage(){return AllergicPercentage;}
	
	public void  showDetails()
	{
		
		System.out.println("Vaccine Name:"+VaccineName);
		System.out.println("Candidate's Mobile no:"+mobile);
		
		
		System.out.println("Vaccination ID:"+VaccinationID);
		System.out.println("Number of Dose need to take:"+Dose);
		System.out.println("Allergic Percentage:"+AllergicPercentage);
		
	}
	
	
		
}