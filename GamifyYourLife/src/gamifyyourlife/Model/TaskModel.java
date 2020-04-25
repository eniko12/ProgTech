/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

/**
 *
 * @author Felhasználó
 */
public abstract class TaskModel {
    protected String taskName;
    protected int goldReward;
    protected int pointReward;
    public void addGold(ProfileModel p){
       p.setGold(p.getGold() + goldReward);
    }
    public abstract void addPoints(ProfileModel p);
 
    
    
}
