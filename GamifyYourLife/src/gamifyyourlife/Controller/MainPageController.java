package gamifyyourlife.Controller;

import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.MainPageViewJFrame;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import gamifyyourlife.View.MainPageView;

public class MainPageController {
    public MainPageView mainView;
    public ProfileModel profile;
    private  TaskCreateModel create;
    HistoryModel history = HistoryModel.getInstance();
    TasksContainerModel everyTask = new TasksContainerModel();
    
    public MainPageController(MainPageView mainView, ProfileModel profile){        
        this.profile = profile;        
        this.create = new TaskCreateModel(this.history);
        
              
        
        this.mainView = mainView;
        this.mainView.setName(this.profile.getName());
        this.mainView.setHobbyLevel(this.profile.getHobbyLevel());
        this.mainView.setJobLevel(this.profile.getJobLevel());
        this.mainView.setOtherLevel(this.profile.getOtherLevel());
        this.mainView.setGold(this.profile.getGold());       
      }
    
    public void Start(){
        TaskJobModel minta = new TaskJobModel("Email-ek kiküldése", 10, 10);
        TaskOtherModel minta2 = new TaskOtherModel("Mosogatás",10,5);
        everyTask.addTask(minta);
        everyTask.addTask(minta2);
        this.mainView.setTaskList(this.profile.listEveryTask());
        
        this.nextDialog();
    }
    
    public void nextDialog(){
        System.out.println(); 
        this.mainView.next();
        switch(mainView.nextC) {
            case "p":
              System.out.println(); 
              this.mainView.showProfile();
              break;
            case "h":
              System.out.println(); 
              this.mainView.showHistory();
              break;
            case "n":
              System.out.println(); 
              this.mainView.createNewTask();
              if("j".equals(mainView.getNewTaskType())){
                  everyTask.addTask(new TaskJobModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint()));
                  this.mainView.setTaskList(this.profile.listEveryTask());
              }
              if ("h".equals(mainView.getNewTaskType())){
                everyTask.addTask(new TaskHobbyModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint()));  
              }
             if ("o".equals(mainView.getNewTaskType())){
                  everyTask.addTask(new TaskOtherModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint()));                    
              }      
              this.mainView.taskAdded();
              break;
            case "d":
              System.out.println();   
              this.mainView.doneTask();
              break;
            case "del":
              System.out.println();   
              this.mainView.deleteTask();
              break;
            case "ex":
              System.out.println(); 
              System.out.println("Viszlát!");
              break;
            default:
              System.out.println(); 
              System.out.println("Ilyen parancs nincsen.");
              this.mainView.next();
          }
        
    }
      
  
}
