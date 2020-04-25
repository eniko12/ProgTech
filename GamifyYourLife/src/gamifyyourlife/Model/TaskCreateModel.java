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
public class TaskCreateModel {
    private TaskModel task;
    private HistoryModel history;    
    
    public TaskCreateModel(HistoryModel history){
        this.history = history;
    }
    
    public void TaskType( TaskModel t){
        this.task = t;  
    }
    public void taskDone(ProfileModel p, TasksContainerModel c){
        this.task.addPoints(p);   
        history.addToHistory("'" + task.taskName + "'" + " feladat elvégezve. --> "
                + task.goldReward + " arany és " + task.pointReward + " pont hozzáadva.");        
        c.removeTask(task);
    }
    
    
    
}
