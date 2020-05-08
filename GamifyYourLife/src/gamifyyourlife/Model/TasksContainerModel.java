package gamifyyourlife.Model;

import java.util.ArrayList;

public class TasksContainerModel implements ISubject {
    private ArrayList<TaskModel> allTask;
    private ArrayList<IObserver> observers; 
    
    
    public TasksContainerModel(){
        
        this.observers = new ArrayList<>();
        this.allTask = new ArrayList<>();
    }
    
    public ArrayList<TaskModel> getAll(){
        ArrayList<TaskModel> all = new ArrayList();
            for(int i =0; i< allTask.size(); i++){
                TaskModel task =allTask.get(i);
                all.add(task);
            }
        return all;
    }
    
    public ArrayList<String> listTaskName(){
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<this.getAll().size(); i++){
            list.add(this.getAll().get(i).taskName);
        }
        return list;
    }
    
    public void addTask(TaskModel task){
        allTask.add(task);
        taskListChanged();
    }
    
    public void removeTask(TaskModel task){
        allTask.remove(task);
        taskListChanged();
    }

    @Override
    public void registerObserver(IObserver o) {
         observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
         int i = observers.indexOf(o); 
         if (i >= 0){ 
             observers.remove(o);
         }   
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
             IObserver observer = (IObserver)observers.get(i);
             observer.update(allTask); 
        }
    }
    
    public void taskListChanged(){
        notifyObservers();
    }
    
    public void setTaskList(ArrayList<TaskModel> list){
        this.allTask = list;
        taskListChanged();
    }
}
