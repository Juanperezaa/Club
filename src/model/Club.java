package model;
import java.util.*;
public class Club{
	private String name;
	private String NIT;
	private String foundationDate;
	private int iTrainer;
	private int iAssisstant;
	private	int iFootballer;
	private ArrayList<MainTrainer> trainers;
	private ArrayList<TechAssistant> assisstants;
	private ArrayList<Footballer> footballers;
	private Team[] team;
	private int[][] dressingRoomA;
	private int[][] dressingRoomB;
	private int[][] trainersOffice;
	
	public Club(String name, String NIT, String foundationDate){
		trainers=new ArrayList<MainTrainer>();
		assisstants=new ArrayList<TechAssistant>();
		footballers=new ArrayList<Footballer>();
		team=new Team[2];
		dressingRoomA=new int[7][7];
		dressingRoomB=new int[7][6];
		trainersOffice=new int[6][6];
		iTrainer=0;
		iAssisstant=0;
		iFootballer=0;
	}
	public int getITrainer(){
		return iTrainer;
	}
	
	public void setITrainer(int iTrainer){
		this.iTrainer=iTrainer;
	}
	
	public int getIAssisstant(){
		return iAssisstant;
	}
	
	public void setIAssisstant(int iAssisstant){
		this.iAssisstant=iAssisstant;
	}
	
	public int getIFootballer(){
		return iFootballer;
	}
	public void setIFootballer(int iFootballer){
		this.iFootballer=iFootballer;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getNIT(){
		return NIT;
	}
	
	public void setNIT(String NIT){
		this.NIT=NIT;
	}
	
	public String getFoundationDate(){
		return foundationDate; 
	}
	
	public boolean contractEmployer(String nameE, String iD, double salary, boolean state, int experienceYears, int teamNumbers, int championships){
		MainTrainer mTrainer= new MainTrainer(nameE, iD, salary, state, experienceYears, teamNumbers, championships);
		trainers.add(mTrainer);
		iTrainer++;
		return true;
	}
	
	public boolean contractEmployer(String name, String iD, double salary, boolean state, int experienceYears, boolean pastPlayer, int expertiseI){
		TechAssistant tAssisstant= new TechAssistant(name, iD, salary, state, experienceYears, pastPlayer, expertiseI);
		assisstants.add(tAssisstant);
		iAssisstant++;
		return true;
	}
	
	public boolean contractEmployer(String name, String iD, double salary, boolean state, String numberT, int amountGoals, double aQualification, int positionI){
		Footballer player= new Footballer( name, iD, salary, state, numberT, amountGoals, aQualification, positionI);
		footballers.add(player);
		iFootballer++;
		return true;
	}
	
	public String getClubInfo(){
		String temp="";
		temp+="*****************Club*****************\n";
		temp+="* Club name: "+getName()+"\n";
		temp+="* Club NIT: "+getNIT()+"\n";
		temp+="* Club foundation date: "+getFoundationDate();
		return temp;
	}
	
	public String showAllTrainers(){
		String temp="";
		temp+="****************Trainers****************\n";
		if(!(trainers.isEmpty())){
			for(int i=0;i<iTrainer;i++){
			temp+="\n Trainer: "+trainers[i].getName();
				
			}
		}
		else{
			temp+="There is not any Trainer in the club";
		}
		return temp;
		
	}
	
	public String showAllFootballers(){
		String temp="";
		temp+="***************Footballers***************\n";
		if(!(footballers.isEmpty())){
			for(int i=0;i<iFootballer;i++){
				temp+="\n Footballer: "+footballers[i].getName();
			}
		}
		else{
			temp="There is not a footballer in the club, go and hire a few";
		}
		return temp;
	}
	
	public String showAllAssisstants(){
		String temp="";
		temp+="*******************Assisstants*******************";
		if(!(assisstants.isEmpty())){
			for(int i=0;i<iAssisstant;i++){
				temp+="*Trainer assisstant: "+assisstants[i].getName();
			}
		}
		else{
			temp="There is not a trainer assisstant at the club";
		}
		return temp;
	}
	
	public void initializingTeam(){
		Team team(String name, MainTrainer mainTrainer);
		
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
		MainTrainer mainTrainer=new MainTrainer(trainerName,ID, salary, state, experienceYears, championships);
		Team team=new Team(nameT,mainTrainer);

	} 
	
	/**public String addPlayer(Player playerToAdd, boolean team){
        space = false;
        for(int i = 0; i < column && !space; i++){
            for(int j = 0; j < row !space ; j++){
                if(userTeam == team){
                    if(lockerRoom[i][j-1] != 1 && lockerRoom[i-1][j] != 1){

                        lockerRoom[i][j+1] = 0;
                        lockerRoom[i+1][j] = 0;

                        lockerRoom[i][j] = 1;

                        space = true;
                        msg = "Jugador añadido correctamente.";
                    }
                    else{
                        msg = "No hay espacio suficiente.";
                    }
                }
                else{
                    msg = "El jugador es de un equipo distinto al equipo que ya lo está usando.";
                }
            }
        }
        return msg;
    }
	*/
	
}