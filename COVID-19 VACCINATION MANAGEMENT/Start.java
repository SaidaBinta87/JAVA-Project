import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;
import java.io.*;


public class Start
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		
		VaccinationClinic v = new VaccinationClinic();
		
		
		
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		System.out.println("-------------------------------------------");
		System.out.println("-------------BSMMU HOSPITAL------------");
		System.out.println("WELCOME TO COVID-19 VACCINATION MANAGEMENT");
		System.out.println("-------------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat) 
		{
			System.out.println("-------------------------------------------");
			System.out.println("****CHOOSE AN OPTION****");
			System.out.println("\t1. Healthcare Employee Management");
			System.out.println("\t2. Vaccine Candidate Management");
			System.out.println("\t3. Vaccine Registration Management");
			System.out.println("\t4. Vaccine Dose Data");
			System.out.println("\t5. Exit");
		
			System.out.print("Your Choice: ");
			int choice = sc.nextInt();
			
			switch(choice)	
		    {      case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Healthcare Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options: ");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.print("Your option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Healthcare Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee Id: ");
							String empId1 =bfr.readLine();
							System.out.print("Enter Employee Name: ");
							String name1 = bfr.readLine();
							System.out.print("Enter Employee Duty: ");
							String duty1=bfr.readLine();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setDuty(duty1);
							e1.setSalary(salary1);
							
							if(v.insertEmployee(e1))
							{
								System.out.println("Employee Inserted________Employee ID: "+ e1.getEmpId());
							}
							else
							{
								System.out.println("Employee Can Not be Inserted________Employee ID: " + e1.getEmpId());
							}
							
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Healthcare Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Healthcare Employee Id: ");
							String empId2 = sc.next();
							
							Employee e2 = v.searchEmployee(empId2);
							
							if(e2 != null)
							{
								if(v.removeEmployee(e2))
								{
									System.out.println("Employee Removed_________Employee Id: " + e2.getEmpId());
								}
								else
								{
									System.out.println("Employee Not Removed_________ Employee Id: " + e2.getEmpId());
								}
							}
							else
							{
								System.out.println("Employee Not Found_________Empolyee Id: " + empId2);
							}
							break;
							case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Healthcare Employee");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Employee Id: ");
							String empId3 = bfr.readLine();
							
							Employee e3 = v.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("*****Healthcare Employee Found*****");
								e3.showAllEmployee();
								System.out.println();
							}
							else
							{
								System.out.println("Employee Not Found_________Empolyee Id: " + empId3);
							}
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Healthcare Employees");
							System.out.println("-------------------------------------------");
							
							v.showAllEmployees();							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("_______Going Back______");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("!!!!!!!!!Invalid Option!!!!!!!");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have choose Vaccine Candidate Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Candidate");
					System.out.println("\t2. Remove Existing Candidate");
					System.out.println("\t3. Search a Candidate");
					System.out.println("\t4. Show All Candidate");
					System.out.println("\t5.Go Back");
					
					System.out.print("Your Option:");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						
						case 1:
						 	System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert a New Candidate");
							System.out.println("-------------------------------------------");
						
			                System.out.print("Enter Candidate Name: ");
							String name1 = bfr.readLine();
							
							System.out.print("Enter Candidate Nid: ");
							int nid1 = sc.nextInt();
							System.out.print("Enter Candidate Age: ");
							int age1 = sc.nextInt();
							
							Person c1 = new Person(name1,nid1,age1);
							if(v.insertPerson(c1))
							{
									System.out.println("Candidate inserted.______Candidate nid: "+ c1.getNid());
							}
							else
							{
								System.out.println("Candidate can not be inserted.______Candidate Nid: "+ c1.getNid());
							}
							break;
							
							case 2:
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Candidate");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Candidate's nid: ");
							int nid2 = sc.nextInt();
							
							Person v2 = v.searchPerson(nid2);
							
							if(v2 != null)
							{
								if(v.removePerson(v2))
								{
									System.out.println("Candidate Removed_________Candidate nid: " + v2.getNid());
								}
								else
								{
									System.out.println("Candidate Not Removed_________Candidate nid: " + v2.getNid());
								}
							}
							else
							{
								System.out.println("Candidate Not Found_________Candidate nid: " + nid2);
							}
							
							
							break;
							
							case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Candidate");
							System.out.println("-------------------------------------------");
						
							System.out.print("Enter Candidate's Nid: ");
							int nid3 = sc.nextInt();
							
							Person v3 = v.searchPerson(nid3);
							
							if(v3 != null)
							{
								System.out.println("*****Candidate Found*****");
								v3.showDetails();
								System.out.println();
							}
							else
							{
								System.out.println("Candidate Not Found_________Candidate Nid: " + nid3);
							}
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Candidate");
							System.out.println("-------------------------------------------");
							
							v.showAllPerson();							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("_______Going Back______");
							System.out.println("-------------------------------------------");
							break;
							default:
							
							System.out.println("-------------------------------------------");
							System.out.println("!!!!!!!!!Invalid Option!!!!!!!");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
					case 3:
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Vaccine Registration Management");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Register for vaccine");
					System.out.println("\t2. Remove Existing vaccine Registration");
					System.out.println("\t3. Search a Vaccine Registration ");
					/*System.out.println("\t4. See a Vaccine Registration ");*/
					System.out.println("\t4. Go Back");
					
					System.out.print("Your Option:");
					int option3 = sc.nextInt();
					
							
					switch(option3)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to  Register for vaccine");
							System.out.println("-------------------------------------------");
							
							Vaccine a1 = null;
							
							System.out.println("There are Two Types of Vaccine: ");
							System.out.println("\t 1. Pfizer Vaccine");
							System.out.println("\t 2. Astrazeneca Vaccine");
							System.out.println("\t 3. Go Back");
							
							System.out.print("Enter Your Type: ");
							int type = sc.nextInt();
							
							if(type == 1)
							{
								System.out.println("-------------------------------------------");
								System.out.println("Selected pfizer vaccine");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Vaccine Name: ");
								String name1 = bfr.readLine();
								System.out.print("Enter Vaccine Candidate Mobile No: ");
								String mobile1 = bfr.readLine();
								
								System.out.print("Enter Vaccination ID: ");
								int d1 = sc.nextInt();
								System.out.print("Enter Required Vaccine Dose: ");
								int va1 = sc.nextInt();
								System.out.print("Enter Previous critical Disease: ");
								String ds1 = bfr.readLine();
								
								
								PfizerVaccine ca = new PfizerVaccine(name1,mobile1,d1,va1,ds1 );
								
								a1 = ca;
							}
							else if(type==2)
							{
								System.out.println("-------------------------------------------");
								System.out.println(" Selected Astrazeneca vaccine");
								System.out.println("-------------------------------------------");
								
								System.out.print("Enter Vaccine Name: ");
								String name2 = bfr.readLine();
								System.out.print("Enter Vaccine Candidate Mobile No: ");
								String mobile2 = bfr.readLine();
								System.out.print("Enter Vaccination ID: ");
								int d2 = sc.nextInt();
								System.out.print("Enter Required Vaccine Dose: ");
								int va2 = sc.nextInt();
								System.out.print("Enter Allergic Reaction Percentage: ");
								String ds2 = bfr.readLine();
								
								
								AstrazenecaVaccine aa = new AstrazenecaVaccine(name2,mobile2,d2,va2,ds2 );
								
								a1 = aa;
							}
							else if(type == 3)
							{
								System.out.println("-------------------------------------------");
								System.out.println("______Going Back______");
								System.out.println("-------------------------------------------");
							}
							else
							{
								System.out.println("-------------------------------------------");
								System.out.println("!!!!!!!!!!!!!Invalid Option!!!!!!!!!");
								System.out.println("-------------------------------------------");
								
							}
							
							System.out.print("Enter Candidate's nid: ");
							int nid1 = sc.nextInt();
							
							Person p1 = v.searchPerson(nid1);
							
							if(p1 != null)
							{
								if(p1.insertVaccine(a1))
								{
									System.out.println(" Vaccine Registration Done_________Vaccination ID: "+ a1.getVaccinationID()+ "Candidate's nid: " + p1.getNid());
								}
							}
							else
							{
								System.out.println("Vaccine Registration can not be Done_________Vaccination ID:  "+ a1.getVaccinationID());
							}
							
							break; 
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Existing Vaccine Registration");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Candidate Nid:");
							int nid00=sc.nextInt();
							Person cc = v.searchPerson(nid00);
							System.out.print("Enter Vaccination ID: ");
							int id00 = sc.nextInt();
							
							Vaccine v3 = cc.searchVaccine(id00);
							
							if(v3 != null)
							{
								if(cc.removeVaccine(v3))
								{
									System.out.println(" Removed Registration_________Vaccination ID: " + v3.getVaccinationID());
								}
								else
								{
									System.out.println("can not Remove Registration_________ Vacination ID: " + v3.getVaccinationID());
								}
							}
							else
							{
								System.out.println("Vaccination ID Not Found_________For Candidate Nid: " + nid00);
							}
							
							
							break;
							
							
							
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Existing Vaccine Registration");
							System.out.println("-------------------------------------------");
							System.out.print("Enter Candidate Nid: ");
							int nid3=sc.nextInt();
							
							
							Person pp = v.searchPerson(nid3);
						    System.out.print("Enter Vaccination ID: ");
							int id5 = sc.nextInt();
							
							Vaccine v4 = pp.searchVaccine(id5);
							
							if(v4 != null)
							{   System.out.println("*****Vaccination Id Found*****");
								v4.showDetails();
								System.out.println();
							}
							else
							{
								System.out.println("Vaccination Id Not Found_________Candidate Nid: " + nid3);
							}
							
								
							break;
		             
						
							/*case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have choose to See Vaccine Registration");
							System.out.println("-------------------------------------------");
							
							
							System.out.print("Enter Candidate's NID: ");
							int nid4 = sc.nextInt();
							
							Person p4 = v.searchPerson(nid4);
							
							if(p4 != null)
							{
								p4.showAllVaccine();
							}
							else
							{
								System.out.println("Invalid Candidate's NID");
							}
							break;	*/						
							
							
							

							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("_______Going Back______");
							System.out.println("-------------------------------------------");
							break;
							default:
							
							System.out.println("-------------------------------------------");
							System.out.println("!!!!!!!!!Invalid Option!!!!!!!");
							System.out.println("-------------------------------------------");
						
							break;	
							
							
					}
					
					break;
					case 4:
					System.out.println("-------------------------------------------");
					System.out.println("Covid-19 Vaccine Dose information");
					System.out.println("-------------------------------------------");
					
					System.out.println("You have the following options:");
					System.out.println("\t1. Entry Taken Dose information");
					System.out.println("\t2. See All dose related information");
					
					System.out.println("\t3. Go Back");
					
					System.out.print("Your option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						
						case 1:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Enter taken Dose information ");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Candidates NID: ");
							int nid1 = sc.nextInt();
							
							Person cc = v.searchPerson(nid1);
							
							if(cc != null)
							{
								System.out.print("Enter Vaccination ID: ");
								int an = sc.nextInt();
								
								Vaccine a = cc.searchVaccine(an);
								
								if(a != null)
								{
									System.out.println("Per-Person Required Dose: " + a.getDose());
									System.out.print("Enter Taken Dose Amount: ");
									int am = sc.nextInt();
									
									if(a.takenDose(am))
									{
										System.out.println("Information Entry Successful");
										String msg = am + " Dose Taken By Vaccination ID: " + a.getVaccinationID();
										String msg1= "Current Required Vaccine Dose: " + a.getDose();
										frwd.writeInFile(msg);
										frwd.writeInFile(msg1);
									}
									else
									{
										System.out.println("Can Not Enter Information");
									}
									System.out.println("Current Required Vaccine Dose: " + a.getDose());
								}
								else
								{
									System.out.println("Invalid Vaccination ID " + an);
								}
							}
							else
							{
								System.out.println("Invalid Person's NID" + nid1);
							}
							
							
							break;
							case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See All Information Regarding Vaccine Dose");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							
							break;
							
						case 3:
						
							System.out.println("-------------------------------------------");
							System.out.println("_________Going Back_________");
							System.out.println("-------------------------------------------");
							break;
							
						default:
							
							System.out.println("-------------------------------------------");
							System.out.println("!!!!!!!!!!!Invalid Option!!!!!!!!!!!!!");
							System.out.println("-------------------------------------------");
							break;	
					}
					
					break;
					
				case 5:
					System.out.println("-------------------------------------------");
					System.out.println("_________You have chose to Exit__________");
					System.out.println("-------------------------------------------");
					
					repeat = false;
				
					break;
					
				default:
					System.out.println("-------------------------------------------");
					System.out.println("!!!!!!!!!!Invalid Choice!!!!!!!");
					System.out.println("-------------------------------------------");
					break;
			
			}
		}
	}		
}