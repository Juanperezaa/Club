package model;
public class Footballer extends Employers implements Calculate{
	private String numberT;
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
	public double calculatePrice(){
		double price;
		switch(positionI){
			case 1:
				price = (getSalary()*12)+(getAQualification()*150);
				break;
			case 2:
				price = (getSalary()*13)+(getAQualification()*125)+(getAmountGoals()*100);
				break;
			case 3:
				price = (getSalary()*14)+(getAQualification()*135)+(getAmountGoals()*125);
				break;
			case 4:
				price = (getSalary()*15)+(getAQualification()*145)+(getAmountGoals()*150);
				break;
			default:
				price=0;
				break;
		}
		return price;
	}
	
	@Override
	public double calculateLevel(){
		double level;
		switch(positionI){
			case 1:
				level = aQualification*0.9;
				break;
			case 2:
				level = (aQualification*0.9)+(amountGoals/100);
				break;
			case 3:
				level = (aQualification*0.9)+(amountGoals/90);
				break;
			case 4:
				level = (aQualification*0.9)+(amountGoals/80);
				break;
			default:
				level=0;
				break;
		}
		return level;
	}
	
	@Override
	public String getEmployersInfo(){
		double level= calculateLevel();
		double price=calculatePrice();
		
		String temp;
		temp="*******************************************\n";
		temp+="***** "+getName()+"\n";
		temp+="***** ID: "+getID()+"\n";
		temp+="***** Salary: "+getSalary()+"\n";
		temp+="***** State: "+getState()+"\n";
		temp+="***** T-Shirt Number: "+getNumberT()+"\n";
		temp+="***** Amount of goals: "+getAmountGoals()+"\n";
		temp+="***** Average Mark: "+getAQualification()+"\n";
		temp+="***** Position: "+Position.values()[positionI-1]+"\n";
		temp+="***** Price: "+price+"\n";
		temp+="***** level: "+level;
		
		return temp;
	}
}