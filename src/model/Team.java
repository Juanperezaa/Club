package model;
import java.util.*;
public class Team{
	private String name;
	private MainTrainer mainTrainer;
	private TechAssistant[] techAssistant;
	private Footballer[] footballer;
	private int iLineUp;
	private ArrayList<LineUp> lineUp;
	
	public Team(String name, MainTrainer mainTrainer){
		this.name=name;
		this.mainTrainer=mainTrainer;
		techAssistant=new TechAssistant[3];
		footballer=new Footballer[25];
		iLineUp=0;
		lineUp=new ArrayList<LineUp>();
	}
	
	public String getNameMainTrainer(MainTrainer maintrain){
		String temp=maintrain.getName();
		return temp;
	}
	
	public int getILineUp(){
		return iLineUp;
	}
	
	public void setILineUp(int iLineUp){
		this.iLineUp=iLineUp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setMainTrainer(MainTrainer mainTrainer){
		this.mainTrainer=mainTrainer;
	}
	
	
	public MainTrainer getMainTrainer(){
		return mainTrainer;
	}
	
	
	public boolean existFootballer(Footballer player){
		boolean temp=false;
		for(int i=0;i<footballer.length;i++){
			if(footballer[i]!=null){
				if(player.getName().equalsIgnoreCase(footballer[i].getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean addFootballer(Footballer player){
		if(!existFootballer(player)){
			for(int i=0;i<footballer.length;i++){
				if(footballer[i]==null){
					footballer[i]=player;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean existAssisstantTrainer(TechAssistant player){
		boolean temp=false;
		for(int i=0;i<techAssistant.length;i++){
			if(techAssistant[i]!=null){
				if(player.getName().equalsIgnoreCase(techAssistant[i].getName())){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean addTechAssisstant(TechAssistant player){
		boolean temp=false;
		if(!existAssisstantTrainer(player)){
			for(int i=0;i<techAssistant.length;i++){
				if(techAssistant[i]==null){
					techAssistant[i]=player;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean existLineUp(LineUp player){
		if(!(lineUp.isEmpty())){
				for(int i=0;i<iLineUp;i++){
					if(player.getFormationIndicator().equals(lineUp.get(i).getFormationIndicator()))
						return true;
				}
		}
		return false;
	}
	
	public boolean addLineUP(LineUp player){
		if(!existLineUp(player)){
			lineUp.add(player);
			iLineUp++;
			return true;
		}
		return false;
	}
	
	public String getTeamInfo(){
		String temp="";
		String info="";
		temp+="*****************TEAM*****************\n";
		temp+="*** Team name: "+getName()+"\n";
		temp+="*** Main trainer: "+getMainTrainer().getName()+"\n";
		for(int i=0;i<techAssistant.length;i++){
			if(techAssistant[i]!=null){
			info+= "\n"+techAssistant[i].getName()+"\n";
			}
		}
		temp+="***Trainer Assisstents: "+info;	
		
		return temp;
		
	}
	
	public String getFootballersInfo(){
		String temp="*************Team Footballers*************";
		for(int i=0;i<footballer.length;i++){
			if(footballer[i]!=null){
			temp+="\n"+footballer[i].getName()+" Number: "+footballer[i].getNumberT();
				
			}
		}
		return temp;
	}
	public String getAssisstantInfo(){
		String temp="*************Assisstant*********************\n";
		for(int i=0;i<techAssistant.length;i++){
			if(techAssistant[i]!=null){
				temp+="\n"+techAssistant[i].getEmployersInfo()+"\n";
			}
		}
		return temp;
	}
	
	public String getLineUpInformation(){
		String temp="";
		for(int i=0;i<iLineUp;i++){
		temp+=lineUp.get(i).getLineUpInfo();
		temp+=lineUp.get(i).getMatrixFormation();
		}
		return temp;
	}
	
	
}