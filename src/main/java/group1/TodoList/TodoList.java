package group1.TodoList;

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.tasks = new Task[capacity];
        this.count = 0;
    }

    public void addTask(String description) {
        if (count < capacity) {
            tasks[count] = new Task(description);
            count++;
        }
    }

    public void setStatus(int index, TaskStatus status) {
        if (index >= 0 && index < count) {
            tasks[index].setStatus(status);
        }
    }

    public void setDescription(int index, String newDescription) {
        if (index >= 0 && index < count) {
            tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.print("Tasks:\n");
        for (int i = 0; i < count; i++) {
            String desc = tasks[i].getDescription();
            String status = tasks[i].getStatus().toString();
            System.out.printf("%-30s | %s%n", desc, status);
        }
    }
}