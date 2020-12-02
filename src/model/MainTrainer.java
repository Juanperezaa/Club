package model;
public class MainTrainer extends Trainer{
	private int teamNumbers;
	private int championships;
	
	public MainTrainer(String name, String iD, String salary, boolean state, int experienceYears, int teamNumbers, int championships){
		super(name,iD,salary,state,experienceYears);
		this.teamNumbers=teamNumbers;
		this.championships=championships;
	}
	
	public int getTeamNumbers(){
		return teamNumbers;
	}
	
	public void setTeamNumbers(int teamNumbers){
		this.teamNumbers=teamNumbers;
	}
	
	public int getChampionships(){
		return championships;
	}
	
	public void setChampionships(int championships){
		this.championships=championships;
	}
	
	@Override
	public String getEmployersInfo(int positionI){
		String temp;
		temp="*******************************************\n";
		temp+="***** "+getName()+"\n";
		temp+="***** ID: "+getID()+"\n";
		temp+="***** Salary: "+getSalary()+"\n";
		temp+="***** State: "+getState()+"\n";
		temp+="***** Experience years: "+getExperienceYears()+"\n";
		temp+="***** Teams: "+getTeamNumbers()+"\n";
		temp+="***** Championships: "+getChampionships();
		
		return temp;
	}
}