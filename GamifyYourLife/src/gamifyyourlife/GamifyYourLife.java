/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife;

import gamifyyourlife.Controller.MainPageController;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.MainPageView;

public class GamifyYourLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TasksContainerModel everyTask = new TasksContainerModel();
        ProfileModel p =new ProfileModel("Regina", everyTask);   
        MainPageView mainView = new MainPageView();
        
        MainPageController controller = new MainPageController(mainView,p);
        controller.mainView.setVisible(true);
        
        /**
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
        
        **/
        
    }
    
}
