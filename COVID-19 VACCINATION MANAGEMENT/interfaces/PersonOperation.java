package interfaces;
import java.lang.*;
import classes.*;

public interface PersonOperation
{
	
	boolean insertPerson( Person c);
	boolean removePerson( Person c);
	Person searchPerson( int nid);
	 void showAllPerson();
}