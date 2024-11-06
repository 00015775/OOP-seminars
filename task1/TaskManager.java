package task1;

public class TaskManager {
    public static void main(String[] args){
        Task task = new Task("Design pattern", "Not started");
        TaskHistory history = new TaskHistory();

        history.save(task);
        System.out.println("Initial state: "+ task);

        task.setStatus("In progress");
        history.save(task);
        System.out.println("Updated state: "+ task);

        task.setStatus("Completed");
        history.save(task);
        System.out.println("Updated state: "+ task);

        history.undo(task);
        System.out.println("Current state: "+ task);

    }
}
