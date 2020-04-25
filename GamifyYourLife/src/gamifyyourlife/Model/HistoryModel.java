/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamifyyourlife.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Felhasználó
 */
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
}
