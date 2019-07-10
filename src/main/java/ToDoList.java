import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class ToDoList {

	Colour[] colours; 
	colours = new Colour[10];
	
	colours[0]= new Colour(Colour.red);
	colours[1]= new Colour(Colour.blue);	
	colours[2]= new Colour(Colour.yellow);
	colours[3]= new Colour(Colour.green);
	colours[4]= new Colours(Colour.white); 
	
    private HashMap<String, Task> tasks = new HashMap<String, Task>();

    public void addTask (Task task) {
        tasks.put(task.getDescription(), task);
    }
    public void completeTask(String description) {
        Task task = null;
        if ((task = tasks.get(description)) != null){
            task.setComplete(true);
        };
    }
    public boolean getStatus(String description) {
        Task task = null;
        if ((task = tasks.get(description)) != null){
            return task.isComplete();
        };
        return false;
    }
    public Task getTask(String description) {
        return tasks.get(description);
    }
    public Task removeTask(String description) {
        return tasks.remove(description);
    }
    public Collection<Task> getAllTasks() {
        return tasks.values();
    }
    public Collection<Task> getCompletedTasks() {
        Collection<Task> completedTasks = new ArrayList<Task> ();
        Collection<Task> allTasks = new ArrayList<Task> ();
        allTasks = getAllTasks();
        for (Task task: allTasks)
            if (task.isComplete() == true) completedTasks.add(task);
        return completedTasks;
    }
}
