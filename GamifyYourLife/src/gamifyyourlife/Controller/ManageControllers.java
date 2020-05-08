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
        this.commandsV.next();
        switch(this.commandsV.getNextCommand()){
            case "p":
                this.pC.show();
                this.nextCommand();
                break;
            case "h":
                this.historyC.show();
                this.nextCommand();
                break;
            case "n":
                this.createC.create();
                this.nextCommand();
                break;
            case "d":
                this.doneC.done();
                this.nextCommand();
                break;
            case "del":
                this.deleteC.delete();
                this.nextCommand();
                break;
            case "ex":
                this.commandsV.bye();
                break;
            default:
                this.commandsV.error();
                this.nextCommand();
                break;
        }      
    }
}
