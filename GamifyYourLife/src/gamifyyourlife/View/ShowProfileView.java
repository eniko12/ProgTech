
package gamifyyourlife.View;

import java.util.ArrayList;
import java.util.Scanner;


public class ShowProfileView {
    Scanner in = new Scanner(System.in); 
    private String name;
    private int gold;
    private int hobbyLevel;
    private int jobLevel;
    private int otherLevel;
    private ArrayList<String> taskList = new ArrayList<>();
    
    public ShowProfileView(){
        
    }
    
    public void show(){
        System.out.println("----------------------------------------");
        System.out.println("Szia " + this.name + "!");
        System.out.println();
        System.out.println("Munka szint: " + this.jobLevel);
        System.out.println("Hobbi szint: "+ this.hobbyLevel);
        System.out.println("Egyéb szint: "+ this.otherLevel);
        System.out.println("Arany egyenleg: "+ this.gold);
        System.out.println();
        System.out.println("Jelenlegi feladataim: ");
        for(int i = 0; i<this.taskList.size(); i++){
            System.out.println(i+1 + ". " + this.taskList.get(i));
        }  
        System.out.println("----------------------------------------");
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGold(int gold){
        this.gold = gold;        
    }
    
    public int getJobLevel(){
        return jobLevel;
    }
    
    public void setJobLevel(int point){
        this.jobLevel = point;
    }
    
     public int getHobbyLevel(){
        return hobbyLevel;
    }
    
    public void setHobbyLevel(int point){
        this.hobbyLevel = point;
    }
    
     public int getOtherLevel(){
        return otherLevel;
    }
    
    public void setOtherLevel(int point){
        this.otherLevel = point;
    }
    
    public void setTaskList(ArrayList<String> list){
        this.taskList = list;
    }
    
}
