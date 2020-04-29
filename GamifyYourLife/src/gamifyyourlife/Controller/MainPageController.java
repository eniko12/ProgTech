package gamifyyourlife.Controller;

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
    private TasksContainerModel everyTask = new TasksContainerModel();
    private ProfileModel profile;
    private  TaskCreateModel create = new TaskCreateModel(everyTask.history); 
    
    public MainPageController(MainPageView mainView, ProfileModel profile){        
        this.profile = profile;
        this.profile.TasksContainer = everyTask;
        
        this.mainView = mainView;
        this.mainView.setName(this.profile.getName());
        this.mainView.setHobbyLevel(this.profile.getHobbyLevel());
        this.mainView.setJobLevel(this.profile.getJobLevel());
        this.mainView.setOtherLevel(this.profile.getOtherLevel());
        this.mainView.setGold(this.profile.getGold());
        this.nextDialog();
          
    }
    
    public void nextDialog(){
        System.out.println(); 
        this.mainView.next();
        switch(mainView.next) {
            case "p":
              System.out.println(); 
              this.mainView.showProfile();
              this.nextDialog();
              break;
            case "h":
              System.out.println(); 
              this.mainView.showHistory();
              this.nextDialog();
              break;
            case "n":
              System.out.println(); 
              this.mainView.createNewTask();
              if("j".equals(mainView.getNewTaskType())){
                  everyTask.addTask(new TaskJobModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint()));
              }
              if ("h".equals(mainView.getNewTaskType())){
                everyTask.addTask(new TaskHobbyModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint()));  
              }
             if ("o".equals(mainView.getNewTaskType())){
                  everyTask.addTask(new TaskOtherModel(mainView.getNewTaskName(),mainView.getNewTaskGold(),mainView.getNewTaskPoint())); 
              }                
              this.nextDialog();
              break;
            case "d":
              System.out.println();   
              this.mainView.doneTask();
              this.nextDialog();
              break;
            case "del":
              System.out.println();   
              this.mainView.deleteTask();
              this.nextDialog();
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
