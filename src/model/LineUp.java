package model;
public class LineUp{
	private String date;
	private String formationIndicator;
	private Tactic tactic;
	private int tacticI;
	private int [][] fieldFormation;
	
	public LineUp(String date,String formationIndicator, int tacticI){
		this.date=date;
		this.formationIndicator=formationIndicator;
		this.tacticI=tacticI;
		tactic=Tactic.values()[tacticI-1];
		fieldFormation=new int[10][7];
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDate(String date){
		this.date=date;
	}
	
	public String getFormationIndicator(){
		return formationIndicator;
	}
	
	
	
	public int getTacticIndicator(){
		return tacticI;
	}
	
	public String getLineUpInfo(){
		String temp="";
		temp+="*********Line Up**********\n";
		temp+="* Date: "+getDate()+"\n";
		temp+="* Tactic: "+getEnumeration()+"\n";
		temp+="* Formation: "+countPlayers();
		
		return temp;
		
	}
	
	public String getEnumeration(){
		String temp="";
		temp=tactic.toString();
		return temp;
	}
	

	
	public String showFormation(){
	String temp="*"+formationIndicator+"\n";
		for(int i=0;i<10;i++){
			for(int j=0;j<7;j++){
				
				temp+=fieldFormation[i][j]+" ";
			}
			temp+="\n";
		}
		return temp;
	}
	
	public int[] knowFormation(){
		String[] temp=formationIndicator.split("-");
		int[] digits=new int[temp.length];
		for(int i=0;i<temp.length;i++){
			digits[i]=Integer.parseInt(temp[i]);
		}
		return digits;
	}
	
	public String getMatrixFormation(){
		setFormationColumns();
		String temp=showFormation();
		return temp;
	}
	
	
	
	public int[] setFormationColumns(){
		
		int[] temp=knowFormation();
		for(int i=0;i<10;i++){
			for(int j=0;j<7;j++){
				fieldFormation[i][j]=0;
			}
		}
		switch(temp.length){
			case 3:
					setFormationRow(2,temp[2]);
					setFormationRow(5,temp[1]);
					setFormationRow(8,temp[0]);
			break;
			case 4:
					setFormationRow(2,temp[3]);
					setFormationRow(4,temp[2]);
					setFormationRow(6,temp[1]);
					setFormationRow(8,temp[0]);
			break;
			case 5:
					setFormationRow(2,temp[4]);
					setFormationRow(4,temp[3]);
					setFormationRow(6,temp[2]);
					setFormationRow(8,temp[1]);
					setFormationRow(9,temp[0]);
			break;
			case 6: 
					setFormationRow(2,temp[5]);
					setFormationRow(3,temp[4]);
					setFormationRow(5,temp[3]);
					setFormationRow(6,temp[2]);
					setFormationRow(8,temp[1]);
					setFormationRow(9,temp[0]);
			break;
			default:
			break;
		}
		return temp;
	}
	
	public void setFormationRow(int row,int temp){
		switch(temp){
			case 1: 
					fieldFormation[row][3]=1;
			break;
			case 2: 
					fieldFormation[row][1]=1;
					fieldFormation[row][5]=1;
			break;
			case 3:
					fieldFormation[row][1]=1;
					fieldFormation[row][3]=1;
					fieldFormation[row][5]=1;
			break;
			case 4:
					fieldFormation[row][1]=1;
					fieldFormation[row][2]=1;
					fieldFormation[row][4]=1;
					fieldFormation[row][5]=1;
			break;
			case 5:
					fieldFormation[row][1]=1;
					fieldFormation[row][2]=1;
					fieldFormation[row][3]=1;
					fieldFormation[row][4]=1;
					fieldFormation[row][5]=1;
			break;
			case 6:
					fieldFormation[row][0]=1;
					fieldFormation[row][1]=1;
					fieldFormation[row][2]=1;
					fieldFormation[row][4]=1;
					fieldFormation[row][5]=1;
					fieldFormation[row][6]=1;
			break;
			case 7:
					fieldFormation[row][0]=1;
					fieldFormation[row][1]=1;
					fieldFormation[row][2]=1;
					fieldFormation[row][3]=1;
					fieldFormation[row][4]=1;
					fieldFormation[row][5]=1;
					fieldFormation[row][6]=1;
			break;
			default: 
			break;
					
			
			
		}
	}
	
	public String countPlayers(){
		setFormationColumns();
		int defenders=0;
		int mid=0;
		int front=0;
		String players=formationIndicator;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<7;j++){
				if(fieldFormation[i][j]==1){
					front++;
				}
			}
		}
		for(int i=4;i<7;i++){
			for(int j=0; j<7;j++){
				if(fieldFormation[i][j]==1){
					mid++;
				}
			}
		}
		for(int i=7;i<10;i++){
			for(int j=0;j<7;j++){
			if(fieldFormation[i][j]==1){
				defenders++;
			}
			}
		}
		
		players+="\nDefenders:  "+defenders+"\n";
		players+="Medium players: "+mid+"\n";
		players+="Front players: "+front;
		
		return players;
	}
	
}