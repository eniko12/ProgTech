/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.View;

import gamifyyourlife.Model.TaskOtherModel;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Felhasználó
 */
public class MainPageView {
    Scanner in = new Scanner(System.in); 
    private String name;
    private int gold;
    private int hobbyLevel;
    private int jobLevel;
    private int otherLevel;
    private ArrayList<String> taskList = new ArrayList<String>();
    
    public String next;
    
    
    //Előzmények
     private ArrayList<String> historyList = new ArrayList<String>();
     
    //Új feladat
    private String newTaskName;
    private int newTaskGold;
    private String newTaskType;
    private int newTaskPoint;  
    //feladat törlése
    private int delIndex;
    private String confirm;
    
    public MainPageView(){
       
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setGold(int gold){
        this.gold = gold;        
    }
    
    public int getJobLevel(){
        return jobLevel;
    }
    
    public void setJobLevel(int point){
        this.jobLevel = point;
    }
    
     public int getHobbyLevel(){
        return hobbyLevel;
    }
    
    public void setHobbyLevel(int point){
        this.hobbyLevel = point;
    }
    
     public int getOtherLevel(){
        return otherLevel;
    }
    
    public void setOtherLevel(int point){
        this.otherLevel = point;
    }
    
    public void setTaskList(ArrayList<String> list){
        this.taskList = list;
    }
    
    public void showProfile(){
        System.out.println("----------------------------------------");
        System.out.println("Szia " + this.name);
        System.out.println();
        System.out.println("Hobbi szint: "+ this.jobLevel);
        System.out.println("Egyéb szint: "+ this.otherLevel);
        System.out.println("Arany egyenleg: "+ this.gold);
        System.out.println();
        System.out.println("Jelenlegi feladataim: ");
        for(int i = 0; i<this.taskList.size(); i++){
            System.out.println(i+1 + ". " + this.taskList.get(i));
        }  
        System.out.println("----------------------------------------");
    }
    
    public void showHistory(){
        System.out.println("----------------------------------------");
        System.out.println("Előzmények: ");
        for(int i = 0; i<this.historyList.size(); i++){
            System.out.println(this.historyList.get(i));
        }  
        System.out.println("----------------------------------------");
    }
    
    public void createNewTask(){
        System.out.println("----------------------------------------");
        System.out.println("Új feladat hozzáadása");
        System.out.print("Feladat neve: ");
        this.newTaskName = in.nextLine();
        System.out.println("Adja meg a feladat típusát!");
        System.out.print("Munka - j, Hobbi - h, egyéb - o: ");
        this.newTaskType = in.nextLine();
        System.out.print("Arany jutalom: ");
        this.newTaskGold = in.nextInt();
        System.out.print("Pont jutalom: ");
        this.newTaskPoint = in.nextInt();       
        System.out.println();
        System.out.println("Új feladat sikeresen hozzáadva.");
        System.out.println("----------------------------------------");   
    }
    
    public void deleteTask(){
        System.out.println("----------------------------------------");
        System.out.println("A feladatok listája: ");
        for(int i = 0; i<this.taskList.size(); i++){
            System.out.println(i+1 + ". " + this.taskList.get(i));
        }  
        System.out.println("Adja meg a törlendő feladat sorszámát: ");
        this.delIndex = in.nextInt();
        System.out.println("Erre gondoltál? " + this.taskList.get(delIndex));
        System.out.println("Igen - y, Nem -n: ");
        this.confirm=in.nextLine();
        System.out.println("Kész");       
        System.out.println("----------------------------------------");  
    }
    
    public void doneTask(){
        System.out.println("----------------------------------------");
        System.out.println("A feladatok listája: ");
        for(int i = 0; i<this.taskList.size(); i++){
            System.out.println(i+1 + ". " + this.taskList.get(i));
        }  
        System.out.println("Adja meg a kész feladat sorszámát: ");
        this.delIndex = in.nextInt();
        System.out.println("Erre gondoltál? " + this.taskList.get(delIndex));
        System.out.println("Igen - y, Nem -n: ");
        this.confirm=in.nextLine();
        System.out.println("Kész");       
        System.out.println("----------------------------------------");  
    }
    
    
    public void next(){
        System.out.println("Parancsok: ");
        System.out.println("Profil megtekintése: p ");
        System.out.println("Előzmények megtekintése: h ");
        System.out.println("Új feladat hozzáadása: n ");
        System.out.println("Feladat késznek jelölése: d ");
        System.out.println("Feladat törlése (Nem teljesítve): del ");
        System.out.println("Kilépés: ex ");
        System.out.print("A választott parancs: ");
        next = in.nextLine();
    }
    
    public String getNewTaskName(){
        return this.newTaskName;
    }
    
    public String getNewTaskType(){
        return this.newTaskType;
    }
    
    public int getNewTaskGold(){
        return this.newTaskGold;
    }
    
    public int getNewTaskPoint(){
        return this.newTaskPoint;
    }
}
