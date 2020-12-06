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
	
	public String showAllTeams(){
		String temp="";
		
		temp+="**********************Teams************************\n";
		for(int i=0;i<team.length:i++){
		if(team[i]!=null){
			temp+=team[i].getTeamInfo();
			temp+=team[i].getFootballersInfo();
			temp+=team[i].getLineUpInformation();
			temp+=team[i].getFormationMatrix();
			
		}
		}
		return temp;
	}
	
	public boolean startTeam(String name, MainTrainer mainTrainer){
		for(int i=0;i<team.length;i++){
			if(team[i]==null){
				team[i]=new Team(name, mainTrainer);
				return true;
			}
		}
		return false;
	}
	
	public int findPlayer(String name){
		int index;
		for(int i=0; i<iFootballer;i++){
			if(name.equalsIgnoreCase(footballer[i].getName())){
				index=i;
			}
		}
		if(!(index>-1)){
			index=-1;
		}
		return index;
	}
	
	public int findTrainer(String name){
		int index;
		for(int i=0;i<iTrainer;i++){
			if(name.equalsIgnoreCase(trainer[i].getName())){
				index=i;
			}
		}
		if(!(index>-1)){
			index=-1;
		}
		return index;
	}
	
	public int findAssisstant(String name){
		int index;
		for(int i=0;i<iAssisstant;i++){
			if(name.equalsIgnoreCase(assisstants[i].getName())){
				index=i;
			}
		}
		if(!(index>-1)){
			index=-1;
		}
		return index;
	}
	
	public Footballer findPIndex(int index){
		Footballer player;
		for(int i=0;i<iFootballer;I++){
			if(footballer[index]==footballer[i]){
				player=footballer[i];
				
			}
			else{
				player=null;
			}
		}
	return player;
	}
	
	public MainTrainer findMTIndex(int index){
		MainTrainer maTrainer;
		for(int i=0; i<iTrainer;i++){
			if(trainers[index]==trainers[i]){
				maTrainer=trainers[i];
			}
			else{
				maTrainer=null;
			}
		}
		return maTrainer;
	}
	
	public TechAssistant findAIndex(int index){
		TechAssistant assisstantT;
		for(int i=0;i<iAssisstant;i++){
			if(assisstants[index]==assisstants[i]){
				assisstantT=assisstants[i];
			}
			else{
				assisstantT=null;
			}
		}
		return assisstantT;
	}
	public int findTeam(String nameT){
		int index;
		for(int i=0;i<team.length;i++){
			if(name.equalsIgnoreCase(team[i].getName())){
				index=i;
			}
		}
		if(!(index>-1)){
			index=-1;
		}
		return index;
	}
	
	public Team getTeam(String nameT){
		int index=findTeam(nameT);
		Team team=team[index];
		return team;
	}
	
	public boolean addPlayerToATeam(String name, String nameT){
		int temp=findPlayer(name);
		Footballer player=findPIndex(int temp);
		int index=findTeam(nameT);
		if(team[index].addFootballer(player)){
			return true;
		}
			return false;
		}
		
	public boolean addAssisstantToTeam(String name, String nameT){
		int temp=findAssisstant(name);
		TechAssistant techAssisstant=findAIndex(int temp);
		int index=findTeam(nameT);
		if(team[index].addTechAssisstant(techAssisstant)){
			return true;
		}
			return false;
		}
		
		public boolean addLineUpToTeam(String nameT, LineUp lineUp){
		int temp=findTeam(nameT);
		if(team[temp].addLineUP(lineUp)){
			return true;
		}
		return false;
		
		}
		
		public boolean fireAFootballer(int index)){
			if(index!=-1){
				footballers.get(index).remove();
				return true;
			}
			return false;
		}
		
		public boolean fireAnAssisstant(int index)){
			if(index!=-1){
				assisstants.get(index).remove();
				return true;
			}
			return false;
		}
		
		public boolean fireATrainer(int index)){
			if(index!=-1){
				trainers.get(index).remove();
				return true;
			}
			return false;
		}
	


	}
	
	
	
	
	
}