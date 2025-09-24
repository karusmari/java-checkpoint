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
        if (description.length() <= 30 && !description.isEmpty() && count < capacity) {
            tasks[count] = new Task(description);
            count++;
        }
    }

    public void setStatus(int index, TaskStatus status) {
        if (index <= count) {
            tasks[index].setStatus(status);
        }
    }

    public void setDescription(int index, String newDescription) {
        if (newDescription.length() <= 30 && !newDescription.isEmpty() && index <= count) {
            tasks[index].setDescription(newDescription);
        }
    }

    public void displayTasks() {
        System.out.print("Tasks:\n");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-33s | %s", tasks[i].getDescription(), tasks[i].getStatus());
            System.out.print("\n");
        }
    }
}