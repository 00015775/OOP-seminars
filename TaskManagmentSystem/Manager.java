package TaskManagmentSystem;

public class Manager {
    public static void main(String[] args){
        Task task = new Task();
        TaskHistory history = new TaskHistory();

        task.setDescription("Hello, ");
        history.saveState(task.save());
        System.out.println("Current state: "+ task.getDescription());

        task.setDescription("World! ");
        history.saveState(task.save());
        System.out.println("Current state: "+ task.getDescription());

        task.setDescription(" Hurray!");
        history.saveState(task.save());
        System.out.println("Current state: "+ task.getDescription());

        task.restore(history.undo());
        System.out.println("Current state: "+ task.getDescription());

        task.restore(history.undo());
        System.out.println("Current state: "+ task.getDescription());

        task.restore(history.undo());
        System.out.println("Current state: "+ task.getDescription());

        task.restore(history.undo());
    }
}