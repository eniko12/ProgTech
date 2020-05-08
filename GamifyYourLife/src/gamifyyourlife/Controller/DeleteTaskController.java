package gamifyyourlife.Controller;

import gamifyyourlife.Model.HandleTaskModel;
import gamifyyourlife.Model.TaskModel;
import gamifyyourlife.Model.TasksContainerModel;
import gamifyyourlife.View.DeleteTaskView;

public class DeleteTaskController {     
    private DeleteTaskView deleteV;
    private HandleTaskModel handleTaskM;
    private TasksContainerModel container;
    
    public DeleteTaskController(HandleTaskModel handleTaskM, TasksContainerModel container, DeleteTaskView deleteV){
        this.handleTaskM = handleTaskM;
        this.container = container;
        this.deleteV = deleteV;
    }
    
    public void delete(){
        
     this.deleteV.setTaskList(this.container.listTaskName());
     this.deleteV.delete();
     if(this.deleteV.getDelIndex()<this.container.getAll().size() && this.deleteV.getConfirm().toLowerCase().equals("y")){
        TaskModel task;
        for(int i =0; i<this.container.getAll().size(); i++){
          if(i  == this.deleteV.getDelIndex()){
              task = this.container.getAll().get(i);
              this.handleTaskM.TaskType(task);
              this.handleTaskM.deleteFromList(container);
              this.deleteV.deleted();
           }
        }                
     }     
   }
}
