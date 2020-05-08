package gamifyyourlife.Controller;
import gamifyyourlife.Model.HistoryModel;
import gamifyyourlife.Model.HandleTaskModel;
import gamifyyourlife.Model.TaskHobbyModel;
import gamifyyourlife.Model.TaskJobModel;
import gamifyyourlife.Model.TaskOtherModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.CreateNewTaskView;

public class CreateNewTaskController {
    private CreateNewTaskView createV;
    private HandleTaskModel handleTaskM;
    private TasksContainerModel container;
    
    public CreateNewTaskController(HandleTaskModel handleTaskM, TasksContainerModel container, CreateNewTaskView createV){
        this.handleTaskM = handleTaskM;
        this.container = container;
        this.createV = createV;
    }
    
    public void create(){
        this.createV.create();
        String type = createV.getNewTaskType();
        switch(type){
            case "j":
                this.handleTaskM.TaskType(new TaskJobModel(this.createV.getNewTaskName(),this.createV.getNewTaskGold(), this.createV.getNewTaskPoint()));
                this.handleTaskM.addToList(container);
                this.createV.added();
                break;
            case "h":
                this.handleTaskM.TaskType(new TaskHobbyModel(this.createV.getNewTaskName(),this.createV.getNewTaskGold(), this.createV.getNewTaskPoint()));
                this.handleTaskM.addToList(container);
                this.createV.added();
                break;
            case "o":
                this.handleTaskM.TaskType(new TaskOtherModel(this.createV.getNewTaskName(),this.createV.getNewTaskGold(), this.createV.getNewTaskPoint()));
                this.handleTaskM.addToList(container);
                this.createV.added();
                break;
            default:
                break;
        } 
        
    }
 }
