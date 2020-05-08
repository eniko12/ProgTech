package gamifyyourlife;

import gamifyyourlife.Controller.CreateNewTaskController;
import gamifyyourlife.Controller.DeleteTaskController;
import gamifyyourlife.Controller.DoneTaskController;
import gamifyyourlife.Controller.HistoryController;
import gamifyyourlife.Controller.ManageControllers;
import gamifyyourlife.Controller.ProfileController;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.HandleTaskModel;
import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.CreateNewTaskView;
import gamifyyourlife.View.DeleteTaskView;
import gamifyyourlife.View.DoneTaskView;
import gamifyyourlife.View.ShowProfileView;
import gamifyyourlife.View.ShowHistoryView;

public class GamifyYourLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p = new ProfileModel("RegiNA", everyTask);
        HistoryModel historyM = HistoryModel.getInstance();       
        
        ShowProfileView showP = new ShowProfileView();
        ProfileController profileC = new ProfileController(p,showP);
        
        CreateNewTaskView createV = new CreateNewTaskView();
        HandleTaskModel handleM = new HandleTaskModel(historyM);        
        CreateNewTaskController createC = new CreateNewTaskController(handleM,everyTask,createV);
        
        
        DoneTaskView doneV = new DoneTaskView();
        DoneTaskController doneC = new DoneTaskController(p,handleM,everyTask,doneV);
       
        
        DeleteTaskView deleteV = new DeleteTaskView();
        DeleteTaskController deleteC = new DeleteTaskController(handleM,everyTask,deleteV);
        
        
        ShowHistoryView historyV = new ShowHistoryView();        
        HistoryController historyC = new HistoryController(historyM, historyV);
        
        ManageControllers manage = new ManageControllers(profileC,historyC, doneC, deleteC, createC);      
    }
}
