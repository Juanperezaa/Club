package model;
public class LineUp{
	private String date;
	private Tactic tactic;
	private int tacticI;
	private int [][] fieldFormation;
	
	public LineUp(String date,int tacticI, int[][] fieldFormation){
		this.date=date;
		tactic=Tactic.values()[tacticI-1];
		fieldFormation=new int[10][7];
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date=date;
	}
	
	public int getTacticIndicator(){
		return tacticI;
	}
	
	
}