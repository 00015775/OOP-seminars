package TaskManagmentSystem;

public class Task {
    private StringBuilder description = new StringBuilder();
    private String status;


    public void setDescription(String descriptions){
        description.append(descriptions);
    }

    public Memento save(){
        return new Memento(description.toString());
    }

    public void restore(Memento memento){
        if(memento!= null){
            description = new StringBuilder(memento.getState());
        } else{
            System.out.println("No previous state available.");
        }
    }

    public String getDescription(){
        return description.toString();
    }

}
