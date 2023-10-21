package interfaces;
import java.lang.*;
import classes.*;

public interface VaccineOperation
{
	boolean insertVaccine(Vaccine C);
	boolean removeVaccine(Vaccine C);
	void showAllVaccine();
	Vaccine searchVaccine(int VaccinationID);
	
	
}