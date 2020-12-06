package model;
public class TechAssistant extends Trainer{
	private boolean pastPlayer;
	private Expertise expertise;
	private int expertiseI;
	
	public TechAssistant(String name, String iD, double salary, boolean state, int experienceYears, boolean pastPlayer, int expertiseI){
		super(name, iD, salary, state, experienceYears);
		this.pastPlayer=pastPlayer;
		expertise=Expertise.values()[expertiseI-1];
	}
	
	public boolean getPastPlayer(){
		return pastPlayer;
	}
	
	public void setPastPlayer(boolean pastPlayer){
		this.pastPlayer=pastPlayer;
	}
	
		@Override
	public String getEmployersInfo(){
		String temp;
		temp="*******************************************\n";
		temp+="***** "+getName()+"\n";
		temp+="***** ID: "+getID()+"\n";
		temp+="***** Salary: "+getSalary()+"\n";
		temp+="***** State: "+getState()+"\n";
		temp+="***** Experience years: "+getExperienceYears()+"\n";
		temp+="***** Was a player?: "+getPastPlayer()+"\n";
		temp+="***** Expertise: "+Expertise.values()[expertiseI-1];
		
		return temp;
	}
}