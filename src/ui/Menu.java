package ui;
import model.*;
import java.util.*;
public class Menu{
	private Club club;
	Scanner sc=new Scanner(System.in);
	
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
	
	public void contractClubAssisstan(){
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