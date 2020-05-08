/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.CreateNewTaskView;
import gamifyyourlife.View.DeleteTaskView;
import gamifyyourlife.View.DoneTaskView;
import gamifyyourlife.View.MainPageView;
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
       
        
        
        
        
        /*
        System.out.println("Szia " + p.getName());
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println();
        TaskJobModel jobT = new TaskJobModel("Email-ek kiküldése", 10, 10);
        everyTask.addTask(jobT);
        TaskHobbyModel hobbyT = new TaskHobbyModel("Olvasás", 5, 10);
        everyTask.addTask(hobbyT);
        TaskOtherModel otherT = new TaskOtherModel("Mosogatás", 15, 10);
        everyTask.addTask(otherT);
        
        
        
      
       
        System.out.println("---------------------------");
        TaskCreateModel create = new TaskCreateModel(everyTask.history); 
        create.TaskType(jobT);
        create.taskDone(p,everyTask);
        
        System.out.println();
        System.out.println("A munka feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
        create.TaskType(hobbyT);
        create.taskDone(p,everyTask);
        
        System.out.println();
        System.out.println("A hobbi feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
        create.TaskType(otherT);
        create.taskDone(p, everyTask);      
        
        System.out.println();
        System.out.println("Az egyéb feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
        TaskJobModel jobT2 = new TaskJobModel("Szerződések aláírása", 5, 10);
        everyTask.addTask(jobT2);
        
        for(int i = 0; i<everyTask.history.listLength(); i++){
            System.out.println(everyTask.history.getListElement(i));
        }
                */
        
       
        
    }
    
}
