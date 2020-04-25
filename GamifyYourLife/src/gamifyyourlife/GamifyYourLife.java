/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife;

import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.TaskCreateModel;
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import gamifyyourlife.View.CharacterView;
import gamifyyourlife.View.MainPageView;
import gamifyyourlife.View.PanelParentView;
import gamifyyourlife.View.ProfileView;

/**
 *
 * @author Felhasználó
 */
public class GamifyYourLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HistoryModel history1 = HistoryModel.getInstance();
        HistoryModel history2 = HistoryModel.getInstance();
        
        ProfileModel p = new ProfileModel("Regina");
        history1.addToHistory("Új profil létrehozva " + p.getName() + " névvel.");
        System.out.println("Szia " + p.getName());
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println();
        TaskJobModel jobT = new TaskJobModel("Email-ek kiküldése", 10, 10);
        System.out.println(jobT.toString());
        TaskHobbyModel hobbyT = new TaskHobbyModel("Olvasás", 5, 10);
        System.out.println(hobbyT.toString());
        TaskOtherModel otherT = new TaskOtherModel("Mosogatás", 15, 10);
        System.out.println(otherT.toString());      
       
        System.out.println("---------------------------");
        TaskCreateModel create = new TaskCreateModel(); 
        create.TaskType(jobT);
        history1.addToHistory("Új feladat hozzáadva.");
        create.taskDone(p);
        history1.addToHistory("Feladat teljesítve.");
        
        System.out.println();
        System.out.println("A munka feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
        create.TaskType(hobbyT);
        history1.addToHistory("Új feladat hozzáadva.");
        create.taskDone(p);
        history1.addToHistory("Feladat teljesítve.");
        
        System.out.println();
        System.out.println("A hobbi feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
        create.TaskType(otherT);
        history1.addToHistory("Új feladat hozzáadva.");
        create.taskDone(p);        
        history1.addToHistory("Feladat teljesítve.");
        
        System.out.println();
        System.out.println("Az egyéb feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println("---------------------------");
          
        if(history1 == history2){
            System.out.println("Ugyanaz a kettő");
        }
          
        if(history1 != history2){
            System.out.println("Nem ugyanaz.");
        }
          
        for(int i = 0; i<history1.listLength(); i++)  
        {
            System.out.println(history1.getListElement(i));
        }
        
        
        System.out.println(history1.listLength());
        
        for(int i=0; i<history1.listLength(); i++){
            System.out.println(history1.getListElement(i));
        }
        
        
     
    }
    
}
