package model;
public class MainTrainer extends Trainer implements Calculate{
	private int teamNumbers;
	private int championships;
	
	public MainTrainer(String name, String iD, double salary, boolean state, int experienceYears, int teamNumbers, int championships){
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
	public double calculatePrice(){
		double price = (getSalary()*10)+(getExperienceYears()*100)+(getChampionships()*50);
		return price;
	}
	
	@Override
	public double calculateLevel(){
		double level = 5+(getChampionships()/10);
		return level;
	}
	
	
	
	@Override
	public String getEmployersInfo(){
		double salaryy=calculatePrice();
		double levell=calculateLevel();
		String temp;
		temp="*******************************************\n";
		temp+="***** "+getName()+"\n";
		temp+="***** ID: "+getID()+"\n";
		temp+="***** Salary: "+getSalary()+"\n";
		temp+="***** State: "+getState()+"\n";
		temp+="***** Experience years: "+getExperienceYears()+"\n";
		temp+="***** Teams: "+getTeamNumbers()+"\n";
		temp+="***** Championships: "+getChampionships()+"\n";
		temp+="***** Salary: "+salaryy+" $\n";
		temp+="***** Level: "+levell;
		
		
		return temp;
	}
	
}