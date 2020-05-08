package gamifyyourlife.View;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteTaskView {
    Scanner in = new Scanner(System.in); 
    private int delIndex;
    private String confirm;
    private ArrayList<String> taskList = new ArrayList<>();
    
    public DeleteTaskView(){
        
    }
    
    public void delete(){
        System.out.println("----------------------------------------");
        System.out.println("A feladatok listája: ");
        for(int i = 0; i<this.taskList.size(); i++){
            System.out.println(i+1 + ". " + this.taskList.get(i));
        }  
        System.out.println("Adja meg a törlendő feladat sorszámát: ");
        this.delIndex = Integer.parseInt(in.nextLine()) -1;        
        try{
        System.out.println("Erre gondoltál? ");
        System.out.println(this.taskList.get(delIndex));
        System.out.println("Igen -> y, Nem -> n: ");           
        this.confirm = in.nextLine();   
        if(this.confirm.toLowerCase().equals("y") || this.confirm.toLowerCase().equals("n")){
            if(this.confirm.toLowerCase().equals("y")){
                System.out.println("----------------------------------------");  
            }
            else{
                System.out.println("Törlés megszakítva.");
            }
        }
        else{
            this.error();
        }
        }catch(IndexOutOfBoundsException e){
        System.out.println("A(z) '"+ e + "' nem érvényes sorszám! Törlés megszakítva!");
        }        
    }
    
    public void deleted(){
         System.out.println("A feladat törölve.");  
    }
    
    public void error(){
        System.out.println("Sikertelen törlés. Vagy 'y' vagy 'n' karaktert írjon!");
    }
    
    public void setTaskList(ArrayList<String> list){
        this.taskList = list;
    }
    
    public int getDelIndex(){
        return delIndex;
    }
    
    public String getConfirm(){
        return this.confirm;
   }
    
}
