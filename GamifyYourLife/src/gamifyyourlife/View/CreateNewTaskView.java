package gamifyyourlife.View;

import java.util.Scanner;

public class CreateNewTaskView {
    Scanner in = new Scanner(System.in); 
    private String newTaskName;
    private int newTaskGold;
    private String newTaskType;
    private int newTaskPoint;  
    
    public CreateNewTaskView(){
        
    }
    public void create(){
        System.out.println("----------------------------------------");
        System.out.println("Új feladat hozzáadása");
        System.out.print("Feladat neve: ");
        this.newTaskName = in.nextLine();        
        System.out.println("Adja meg a feladat típusát!");
        System.out.print("Munka - j, Hobbi - h, egyéb - o: ");
        this.newTaskType = in.nextLine();
        if(this.newTaskType.toLowerCase().equals("j") || this.newTaskType.toLowerCase().equals("h") || this.newTaskType.toLowerCase().equals("o") ){
            System.out.print("Arany jutalom: ");
            try{
            this.newTaskGold = Integer.parseInt(in.nextLine());
            }catch(NumberFormatException e){
                 System.out.println("Kötelező mező! Az érték autómatikusan 0-ra állítva.");
                 this.newTaskGold = 0;
            }
            System.out.print("Pont jutalom: ");
            try{
            this.newTaskPoint = Integer.parseInt(in.nextLine());
            System.out.println();
            }
            catch(NumberFormatException e){
                 System.out.println("Kötelező mező! Az érték autómatikusan 0-ra állítva.");
                 this.newTaskPoint = 0;
            }
            System.out.println("----------------------------------------"); 
        }
        else{
          this.error();
        }
    }
    
    public void added(){
        System.out.println("Új feladat hozzáaadva.");
    } 
    
    public void error(){
        System.out.println("Nincs ilyen típus.");
    }
    
    public String getNewTaskName(){
        return this.newTaskName;
    }
    
    public String getNewTaskType(){
        return this.newTaskType.toLowerCase();
    }
    
    public int getNewTaskGold(){
        return this.newTaskGold;
    }
    
    public int getNewTaskPoint(){
        return this.newTaskPoint;
    }
}
