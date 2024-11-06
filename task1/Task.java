package task1;

public class Task {
    private String description;
    private String status;

    public Task(String description,String status){
        this.description = description;
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public TaskMemento saveState(){
        return new TaskMemento(description, status);
    }

    public void restoreState(TaskMemento taskMemento){
        if(taskMemento!=null){
            description = taskMemento.getDescription();
            status = taskMemento.getStatus();
        }else{
            System.out.println("Nothing to restore.");
        }
    }

    @Override
    public String toString() {
        return "Task: "+ description + ". Status: "+ status;
    }
}