package gamifyyourlife.View;

import java.util.ArrayList;

public class ShowHistoryView {
     private ArrayList<String> historyList = new ArrayList<>();
     
    public ShowHistoryView(){
      }
     
    public void show(){
        System.out.println("----------------------------------------");
        System.out.println("Előzmények: ");
        for(int i = 0; i<this.historyList.size(); i++){
            System.out.println(this.historyList.get(i));
        }  
        System.out.println("----------------------------------------");
    }
    
    public void setHistory(ArrayList<String> list){
        historyList = list;
    }
}
