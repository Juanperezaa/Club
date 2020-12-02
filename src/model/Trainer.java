package model;
public abstract class Trainer extends Employer{
	private int experienceYears;
	
	public Trainer(String name, String iD, double salary, boolean state, int experienceYears){
		super(name,iD,salary,state);
		this.experienceYears=experienceYears;
	}
	public int getExperienceYears(){
		return experienceYears;
	}
	
	public void setExperienceYears(int experienceYears){
		this.experienceYears=experienceYears;
	}
	
	public abstract String getEmployersInfo();
	
}