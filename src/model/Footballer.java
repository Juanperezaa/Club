package model;
public class Footballer extends Employers{
	private String numberT:
	private int amountGoals;
	private double aQualification;
	private Position position;
	private int positionI;
	
	public Footballer(String name, String iD, double salary, boolean state, String numberT, int amountGoals, double aQualification, int positionI){
		super(name,iD,salary,state);
		this.numberT=numberT;
		this.amountGoals=amountGoals;
		this.aQualification=aQualification;
		position=Position.values()[positionI-1];
	}
	
	public String getNumberT(){
		return numberT;
	}
	
	public void setNumberT(String numberT){
		this.numberT=numberT;
	}
	
	public int getAmountGoals(){
		return amountGoals;
	}
	
	public void setAmountGoals(int amountGoals){
		this.amountGoals=amountGoals;
	}
	
	public double getAQualification(){
		return aQualification;
	}
	
	public void setAQualification(double aQualification){
		this.aQualification=aQualification;
	}
	
	public int getPositionIndicator(){
		return positionI;
	}
	
	@Override
	public String getEmployersInfo(){
		String temp;
		temp="*******************************************\n";
		temp+="***** "+getName()+"\n";
		temp+="***** ID: "+getID()+"\n";
		temp+="***** Salary: "+getSalary()+"\n";
		temp+="***** State: "+getState()+"\n";
		temp+="***** T-Shirt Number: "+getNumberT()+"\n";
		temp+="***** Amount of goals: "+getAmountGoals()+"\n";
		temp+="***** Average Mark: "+getAQualification()+"\n";
		temp+="***** Position: "+Position.values()[positionI-1];
		
		return temp;
	}
}