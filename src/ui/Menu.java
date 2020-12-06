package ui;
import model.*;
import java.util.*;
public class Menu{
	private Club club;
	Scanner sc=new Scanner(System.in);
	private final static int CLUB_INFO=1;
	private final static int HIRE=2;
	private final static int START_TEAM=3;
	private final static int FIRE=4;
	private final static int SPECIFIC_INFO=5;
	private final static int EXIT=6;
	
	private final static int MAIN_TRAINER=1;
	private final static int FOOTBALLER=2;
	private final static int ASSISSTANT=3;
	
	private final static int A_EMPLOYER=1;
	private final static int ALL_EMPLOYERS=2;
	private final static int TEAM_PLAYERS=3;
	private final static int TEAM_ASSISSTANTS=4;
	private final static int TEAM_TRAINER=5;
	private final static int FORMATION=6;
	private final static int EXIT2=7;
	public Menu(){
		Club club=startingClub();
	}

	public Club startingClub(){
		System.out.println("Hey nice to meet u, come on and start a club.");
		System.out.println("Please tell us the name of the new club.");
		String name=sc.nextLine();
		System.out.println("Please tell us the NIT of your club");
		String NIT=sc.nextLine();
		System.out.println("Now tell us the club foundation date writing something like this MM/DD/AAAA");
		String date=sc.nextLine();
		Club club=new Club(name, NIT, date);
		return club;
	}
	
	public void showMenu1(){
		startingClub();
		sc.nextLine();
		System.out.println("Ok, now choose an option.");
		System.out.println("1 to show all club info(employers and teams).");
		System.out.println("2 to Hire an employer(Footballers, trainers and assisstants) .");
		System.out.println("3 to start a team.");
		System.out.println("4 fire an employe.");
		System.out.println("5 to open specific information menu.");
		System.out.println("6 to exit.");
	}
	
	public void showMenu2(){
		System.out.println("1 to look for an employer information.");
		System.out.println("2 to show all employers.");
		System.out.println("3 to show all team players.");
		System.out.println("4 to show all team assisstants.");
		System.out.println("5 to show team trainer.");
		System.out.println("6 to show team formation.");
		System.out.println("7 to exit.");
	}
	
	public int choice(){
		int choice=sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	public void operationsMenu(int choice){
		switch(choice){
			int decision=0;
			case CLUB_INFO:
				System.out.println(club.getClubInfo());
				System.out.println(club.showAllTrainers());
				System.out.println(club.showAllFootballers());
				System.out.println(club.showAllAssisstants());
				System.out.println(club.showAllTeams());
				break;
			case HIRE:
				System.out.println("What kind of employer do you wanna hire? enter 1 to main trainer, 2 to footballer or 3 for assisstant");
				decision=choice();
				switch(decision){
					case MAIN_TRAINER:
						contractClubTrainer();
						break;
					case FOOTBALLER:
						contractClubFootballer();
						break;
					case ASSISSTANT:
						contractClubAssisstant();
						break;
					default: 
					System.out.println("Is not a valid option");		
				}
			case START_TEAM:
				initializingTeam();
						break;
			case FIRE:
				System.out.println("What kind of employer do you wanna fire? enter 1 to main trainer, 2 to footballer or 3 for assisstant");
				who=choice();
				sc.nextLine();
				System.out.println("And tell us the employe name");
				String name=sc.nextLine();
				switch(who){
					case MAIN_TRAINER:
						int index=club.findTrainer(name);
						if(club.fireATrainer(index){
							System.out.println("The employer was fire succesfully");
						}
						else{
							System.out.println("There was an error at the time of fire the employe");
						}
						break;
					case FOOTBALLER:
						int index=club.findPlayer(name);
						if(club.fireAFootballer(index)){
							System.out.println("The employer was fire succesfully");
						}
						else{
							System.out.println("There was an error at the time of fire the employer")
						}
						break;
					case ASSISSTANT:
						int index=club.findAssisstant(name);
						if(club.fireAnAssisstant(index)){
							System.out.println("The employer was fire succesfully")
						}
						else{
							System.out.println("There was an error at the time of fire the employer");
						}
						break;
					default: 
					System.out.println("Is not a valid option");	
					
				}
			case SPECIFIC_INFO:
				showMenu2();
				specific=choice();
						switch(specific){
							case A_EMPLOYER:
								System.out.println("Tell us the name of the employer to look for");
								String name=sc.nextLine();
								sc.nextLine();
								System.out.println("Now tell us if the employers is a main trainer enter 1");
								System.out.println("Now tell us if the employers is a footballer enter 3");
								System.out.println("Now tell us if the employers is an assisstant enter 3");
								temp=choice();
								switch (temp){
									case MAIN_TRAINER:
										int index=club.findTrainer(String name);
										MainTrainer mainer=club.findMTIndex(int index);
										System.out.println(mainer.getEmployersInfo());
										break;
									case FOOTBALLER:
										int index=club.findPlayer(name);
										Footballer fut=club.findPIndex(index);
										System.out.println(fut.getEmployersInfo());
										break;
									case ASSISSTANT:
										int index=club.findAssisstant(name);
										TechAssisstant tech=findAssisstant(index);
										System.out.println(tech.getEmployersInfo());
										break;
									default: 
									System.out.println("Enter a valid option);
								}
								break;
							case ALL_EMPLOYERS:
									System.out.println(club.showAllTrainers());
									System.out.println(club.showAllFootballers());
									System.out.println(club.showAllAssisstants());
								break;
							case TEAM_PLAYERS:
									System.out.println("Please give us the team name");
									String nameT=sc.nextLine();
									Team teamm=club.getTeam(nameT);
									System.out.println(teamm.getFootballersInfo());
								break;
							case TEAM_ASSISSTANTS:
									System.out.println("Please give us the team name");
									String nameT=sc.nextLine();
									Team teamm=club.getTeam(nameT);
									System.out.println(teamm.getAssisstantInfo());
								break;
							case TEAM_TRAINER:
									System.out.println("Please give us the team name");
									String nameT=sc.nextLine();
									Team teamm=club.getTeam(nameT);
									MainTrainer mainn=teamm.getMainTrainer();
									System.out.println(mainn.getEmployersInfo());
								break;
							case FORMATION: 
									
								
								
						}
				
				}
					
		}
	
	
	
	public void initializingTeam(){
		System.out.println("Now creating the Team");
		System.out.println("Tell us the team name");
		String nameT=sc.nextLine();
		System.out.println("Now tell us the main trainer name");
		String trainerName=sc.nextLine();
		System.out.println("Now tell us the main trainer ID");
		String ID=sc.nextLine();
		sc.nextLine();
		System.out.println("Now tell us the main trainer salary");
		double salary=sc.nextDouble();
		System.out.println("Now tell us if the main trainer is active put 1 or is the main traner isn't active put 2");
		int decision=sc.nextInt();
		boolean state=false;
		if(decision==1){
			state=true;
		}
		System.out.println("Now tell us how many experience years have the main trainer");
		int experienceYears=sc.nextInt();
		System.out.println("Now tell us how many teams have been guide by the main trainer");
		int teamss=sc.nextInt();
		System.out.println("Now tell us how many championships have the main trainer");
		int championships=sc.nextInt();
		club.contractEmployer(trainerName, ID, salary, state,experienceYears, teamss, championships);
		if(club.startTeam(namet, mTrainer)){
			System.out.println("The Team was added succesfully");
		}
		else{
			System.out.println("There was an error at the time adding the team");
		}
		

	} 
	
	public void contractClubFootballer(){
		System.out.println("If u wanna hire a footballer tell us the name");
		String nameF=sc.nextLine();
		System.out.println("Now tell us the footballer ID");
		String ID=sc.nextLine();
		System.out.println("Now tell us the footballer salary");
		double salary=sc.nextDouble;
		System.out.println("Now tell us ");
		System.out.println("Now tell us if the main trainer is active put 1 or is the main traner isn't active put 2");
		int decision=sc.nextInt();
		boolean state=false;
		if(decision==1){
			state=true;
		}
		System.out.println("Tell us the footballer T-shirt number");
		String tNumber=sc.nextLine();
		System.out.println("Tell us how many goals have the footballer");
		int gNumber=sc.nextInt();
		System.out.println("Tell us the qualification aroound this player remember since 1 to 5");
		double qualification=sc.nextDouble();
		System.out.println("Now choose the player position");
		System.out.println("Remember 1 to goalkepper, 2 to defender, 3 to volant or 4 to front");
		int indicator=sc.nextInt();
		club.contractEmployer(nameF,ID, salary, state, tNumber, gNumber, qualification);
		
	}
	
	public void contractClubTrainer(){
		System.out.println("If u wanna hire a new trainer tell us the name");
		String nameT=sc.nextLine();
		System.out.println("Tell us the trainer ID");
		String ID=sc.nextLine();
		System.out.println("Tell us the salary of the trainer");
		double salary=sc.nextDouble();
		System.out.println("Now tell us if the main trainer is active put 1 or is the main traner isn't active put 2");
		int decision=sc.nextInt();
		boolean state=false;
		if(decision==1){
			state=true;
		}
		System.out.println("Now tell us how many years have worked the trainer")
		int experienceYearss=sc.nextInt();
		System.out.println("Now tell us how many teams have been guide by the main trainer");
		int teamss=sc.nextInt();
		System.out.println("Now tell us how many championships have the main trainer");
		int championships=sc.nextInt();
		club.contractEmployer(nameT,ID, salary, state, experienceYearss, teamss, championships);
	}
	
	public void contractClubAssisstant(){
		System.out.println("If you wanna hire a new assisstant trainer tell us the name");
		String nameA=sc.nextLine();
		System.out.println("Now tell us the ID");
		String ID=sc.nextLine();
		System.out.println("Now tell us the salary of the assisstant");
		double salary=sc.nextDouble();
		System.out.println("Now tell us if the main trainer is active put 1 or is the main traner isn't active put 2");
		int decision=sc.nextInt();
		boolean state=false;
		if(decision==1){
			state=true;
		}
		System.out.println("Now tell us the experience years of the assisstant");
		int experienceYears=sc.nextInt();
		System.out.println("Now tell us if the assisstant trainer was a footballer put 1 or put 2 if it´s not");
		int decision=sc.nextInt();
		boolean past=false;
		if(decision==1){
			past=true;
		}
		System.out.println("Enter 1 to offensive, 2 to defensive, 3 possesion or 4 to laboratory plays");
		int expertiseI=sc.nextInt();
		club.contractEmployer(nameA, ID, salary, state, experienceYears, past, expertiseI);
	}
}