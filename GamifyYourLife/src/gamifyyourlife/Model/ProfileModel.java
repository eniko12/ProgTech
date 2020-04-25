
package gamifyyourlife.Model;

import java.util.ArrayList;


public class ProfileModel implements IObserver, IDisplayElement {
    
    private String name;
    private int jobLevel;
    private int hobbyLevel;
    private int otherLevel;
    private int gold;
    private ISubject TasksContainer;
    private ArrayList<TaskModel> myTasks;
    
    public ProfileModel(String name, ISubject TasksContainer){
        this.name = setName(name);
        this.jobLevel = 0;
        this.hobbyLevel=0;
        this.otherLevel=0;
        this.gold = 50;
        this.myTasks = new ArrayList<TaskModel>();
        this.TasksContainer = TasksContainer;
        TasksContainer.registerObserver(this);
    }
    
    public String setName(String name){
        String n = name.toLowerCase();
        n = n.substring(0,1).toUpperCase() + n.substring(1);
        return n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setGold(int gold){
        if(gold > 0){
            this.gold = gold;
        }
        else{
            this.gold = 0;
        }
    }
    
    public int getGold(){
        return this.gold;
    }
    
    public void setJobLevel(int points){
        if(points>0){
            this.jobLevel = points;
        }
        else{
            this.jobLevel=0;
        }
    }
    
    public int getJobLevel(){
        return this.jobLevel;
    }
    
    public void setHobbyLevel(int points){
        if(points>0){
            this.hobbyLevel = points;
        }
        else{
            this.hobbyLevel=0;
        }
    }
      
    public int getHobbyLevel(){
        return this.hobbyLevel;
    }
    
    public void setOtherLevel(int points){
        if(points>0){
            this.otherLevel = points;
        }
        else{
            this.otherLevel=0;
        }
    }
    
    public int getOtherLevel(){
        return this.otherLevel;
    }
    
    
    
    @Override
    public void update(ArrayList<TaskModel> tasks) {
        this.myTasks = tasks;
        display();        
    }

    @Override
    public void display() {
        System.out.println("Frissült feladatok: ");
          for(int i = 0; i< myTasks.size(); i++){
            System.out.println(myTasks.get(i));
        }
    }
}
