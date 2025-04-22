package printable;

public class Todo implements Printable {

    String taskName;
    String priority;
    boolean isDone;

    public Todo(String taskName, String priority, boolean isDone) {
        this.taskName = taskName;
        this.priority = priority;
        this.isDone = isDone;
    }


    @Override
    public void printAllFields() {
        System.out.println("Task: " + taskName + " | Priority: " + priority + " | Done: " + isDone);
    }
}
