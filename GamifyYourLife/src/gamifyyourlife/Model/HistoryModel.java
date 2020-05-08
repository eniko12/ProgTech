package gamifyyourlife.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class HistoryModel {
    private static HistoryModel uniqueInstance=null;
    private ArrayList<String> list = new ArrayList();;
    
    private HistoryModel() {}
    
    public static HistoryModel getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new HistoryModel();
        }
        uniqueInstance.list = new ArrayList();
        return uniqueInstance;
    }
   
        public void addToHistory(String event){
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date d = new Date(System.currentTimeMillis());
        String date = formatter.format(d);
        list.add(list.size()+1 +". " + date + " " + event);
    }
    
    public int listLength(){
        return list.size();
    }
    
    public String getListElement(int i){
        return list.get(i);
    }
    
    public ArrayList<String> getList(){
        return this.list;
    }
}
