package model;
public abstract class Employers{
	private String name;
	private String iD;
	private double salary;
	private boolean state;
	
	public Employers(String name, String iD, double salary, boolean state){
		this.name=name;
		this.iD=iD;
		this.salary=salary;
		this.state=state;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getID(){
		return iD;
	}
	
	public void setID(String iD){
		this.iD=iD;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public boolean getState(){
		return state;
	}
	
	public void setState(boolean state){
		this.state=state;
	}
	
	public abstract String getEmployersInfo();
	
	
}