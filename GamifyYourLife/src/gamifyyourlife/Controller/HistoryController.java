package gamifyyourlife.Controller;

import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.View.ShowHistoryView;

public class HistoryController {
    private ShowHistoryView historyV;
    private HistoryModel historyM;
    
    public HistoryController(HistoryModel historyM, ShowHistoryView historyV){
        this.historyM = historyM;
        this.historyV = historyV;
    }
    
    public void show(){
        this.historyV.setHistory(this.historyM.getList());
        this.historyV.show();
    }
    
}
