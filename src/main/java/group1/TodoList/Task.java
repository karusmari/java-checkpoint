package group1.TodoList;

enum TaskStatus {
    NEW, IN_PROGRESS, COMPLETED
}

public class Task {
    private String description;
    private TaskStatus status;

    public Task(String description) {
        this.description = description;
        this.status = TaskStatus.NEW;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

}
