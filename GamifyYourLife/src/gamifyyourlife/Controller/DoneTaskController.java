package gamifyyourlife.Controller;

import gamifyyourlife.Model.HandleTaskModel;
import gamifyyourlife.Model.ProfileModel;
import gamifyyourlife.Model.TaskModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.DoneTaskView;

public class DoneTaskController {
    private DoneTaskView doneV;
    private HandleTaskModel handleTaskM;
    private TasksContainerModel container;
    private ProfileModel p;
    
    public DoneTaskController(ProfileModel p, HandleTaskModel handleTaskM, TasksContainerModel container, DoneTaskView doneV){
        this.p = p;
        this.handleTaskM = handleTaskM;
        this.container = container;
        this.doneV = doneV;        
    }
    
    public void done(){
        this.doneV.setTaskList(this.container.listTaskName());    
        this.doneV.done();
            if(this.doneV.getDelIndex()<this.container.getAll().size() && this.doneV.getConfirm().toLowerCase().equals("y")){
                TaskModel task;
                for(int i =0; i<this.container.getAll().size(); i++){
                    if(i  == this.doneV.getDelIndex()){
                        task = this.container.getAll().get(i);
                        this.handleTaskM.TaskType(task);
                        this.handleTaskM.taskDone(p,container);
                        this.doneV.TaskIsDone();
                    }
                }                
            }
    }
}
