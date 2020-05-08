package gamifyyourlife.Controller;

import gamifyyourlife.View.CommandsView;

public class ManageControllers {
    CreateNewTaskController createC;
    DeleteTaskController deleteC;
    DoneTaskController doneC;
    HistoryController historyC;
    ProfileController pC;
    CommandsView commandsV = new CommandsView();
    
    public ManageControllers(ProfileController pC, HistoryController historyC, DoneTaskController doneC, DeleteTaskController deleteC, CreateNewTaskController createC){
        this.pC = pC;
        this.historyC = historyC;
        this.doneC = doneC;
        this.deleteC = deleteC;
        this.createC = createC;
        
        this.nextCommand();
    }
    
    public void nextCommand(){
        boolean run = true;
        while(run){
             this.commandsV.next();
            switch(this.commandsV.getNextCommand()){
                case "p":
                    this.pC.show();
                    break;
                case "h":
                    this.historyC.show();
                    break;
                case "n":
                    this.createC.create();
                    break;
                case "d":
                    this.doneC.done();
                    break;
                case "del":
                    this.deleteC.delete();
                    break;
                case "ex":
                    this.commandsV.bye();
                    run = false;
                    break;
                default:
                    this.commandsV.error();
                    break;
            }      
        }
    }
}
