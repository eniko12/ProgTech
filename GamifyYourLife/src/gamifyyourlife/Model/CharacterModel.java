/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

import java.util.List;

/**
 *
 * @author Felhasználó
 */
public class CharacterModel {
    private String name;
    private int hobbiLevel;
    private int jobLevel;
    private int otherLevel;
    
    private List <TaskModel> MyTasks;
    
    public CharacterModel(String name){
        this.setName(name);
        this.hobbiLevel = 0;
        this.jobLevel = 0;
        this.otherLevel = 0;
        
        
    }
    
   public void addTask(){
        
    }
   
   public String getName(){
       return name;
   }
   
   public void setName(String name){
       this.name = name;
    }
       
    
    
}
