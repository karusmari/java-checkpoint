package group1.TodoList;

public class TodoList {
    private Task[] tasks;
    private int capacity;
    private int count;

    public TodoList(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        this.tasks = new Task[capacity];
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
        System.out.println("Tasks: ");
        for (int i = 0; i < count; i++) {
            String desc = tasks[i].getDescription();
            String status = tasks[i].getStatus().toString();
            System.out.printf("%-30s | %s%n", desc, status);
        }
    }
}

// teen klassi millel on massiiv taskidest, ma annan talle ka capacity ja count
// konstruktoris annan capacity väärtuse, loon uue massiivi taskidest ja count on 0
// teen meetodi addTask, mis võtab descriptioni, kui count on väiksem kui capacity, siis loon uue taski ja lisan selle massiivi, seejärel suurendan counti
// teen meetodi setStatus, mis võtab indexi ja statusi, kui index on kehtiv, siis muudan taski staatust
// teen meetodi setDescription, mis võtab indexi ja uue descriptioni, kui index on kehtiv, siis muudan taski descriptioni
// teen meetodi displayTasks, mis loopib läbi kõik taskid ja prindib descriptioni ja staatuse kindlas vormis