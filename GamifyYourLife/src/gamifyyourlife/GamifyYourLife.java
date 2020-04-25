/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife;

import gamifyyourlife.Model.ProfileModel;
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
        ProfileModel p = new ProfileModel("Regina");
        System.out.println("Szia " + p.getName());
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println();
        TaskJobModel jobT = new TaskJobModel("Email-ek kiküldése", 10, 10);
        System.out.println(jobT.toString());
        jobT.addPoints(p);
        
        System.out.println();
        System.out.println("A feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println();
        TaskHobbyModel hobbyT = new TaskHobbyModel("Olvasás", 5, 10);
        System.out.println(hobbyT.toString());
        hobbyT.addPoints(p);
        
        System.out.println();
        System.out.println("A feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
        
        System.out.println();
        TaskOtherModel otherT = new TaskOtherModel("Mosogatás", 15, 10);
        System.out.println(otherT.toString());
        otherT.addPoints(p);
        
        System.out.println();
        System.out.println("A feladat elvégzése után:");
        System.out.println("Hobbi szint: "+ p.getHobbyLevel());
        System.out.println("Munka szint: "+ p.getJobLevel());
        System.out.println("Egyéb szint: "+ p.getOtherLevel());
        System.out.println("Arany egyenleg: "+ p.getGold());
      
    }
    
}
