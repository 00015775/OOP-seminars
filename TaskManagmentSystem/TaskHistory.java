package TaskManagmentSystem;
import java.util.Stack;

public class TaskHistory {
    private Stack<Memento> history = new Stack<>();

    public void saveState(Memento memento){
        history.push(memento);
    }

    public Memento undo(){
        if(history.size()>1){
            history.pop();
            return history.peek();
        } else if(history.size()==1){
            history.pop();
            System.out.println("No more states left.");
            return new Memento("");
        } else{
            System.out.println("No states left to undo.");
            return null;
        }
    }

}
