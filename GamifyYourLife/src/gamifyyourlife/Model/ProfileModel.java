/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

import java.util.ArrayList;

/**
 *
 * @author Felhasználó
 */
public class ProfileModel {
    private String name;
    private int jobLevel;
    private int hobbyLevel;
    private int otherLevel;
    private int gold;
    private ArrayList myTasks;
    
    public ProfileModel(String name){
        this.name = setName(name);
        this.jobLevel = 0;
        this.hobbyLevel=0;
        this.otherLevel=0;
        this.gold = 50;
        this.myTasks = new ArrayList();
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
}
