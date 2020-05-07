
package gamifyyourlife.View;

import java.util.ArrayList;
import java.util.Scanner;


public class DoneTaskView {
    Scanner in = new Scanner(System.in); 
    private int delIndex;
    private String confirm;
    private ArrayList<String> taskList = new ArrayList<>();
    
    public DoneTaskView(){
        
    }
     public void done(){
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
     
    public void setTaskList(ArrayList<String> list){
        this.taskList = list;
    }
    
}
