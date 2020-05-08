package gamifyyourlife.Model;

public class HandleTaskModel {
    private TaskModel task;
    private HistoryModel history;    
    
    public HandleTaskModel(HistoryModel history){
        this.history = history;
    }
    
    public void TaskType( TaskModel t){
        this.task = t;  
    }
    
    public void addToList(TasksContainerModel c){
        c.addTask(task);
        this.history.addToHistory("'" + task.taskName + "' feladat hozzáadva.");
    }
    
   public void deleteFromList(TasksContainerModel c){
        c.removeTask(task);
        this.history.addToHistory("'" + task.taskName + "' feladat törlésre került.");
        
    }
    public void taskDone(ProfileModel p, TasksContainerModel c){
        this.task.addPoints(p);   
        history.addToHistory("'" + task.taskName + "'" + " feladat elvégezve. --> "
                + task.goldReward + " arany és " + task.pointReward + " pont hozzáadva.");        
        c.removeTask(task);
    }   
    
    public String getTasktest(){
        return task.taskName;
    }
}
