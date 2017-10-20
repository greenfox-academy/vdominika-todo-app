import java.time.LocalDateTime;

import static java.time.MonthDay.now;

public class Task {

    public String name;
    public int ID;
    public boolean isCompleted;
    public static int taskCounter;
    public LocalDateTime createdAt;
    public LocalDateTime completedAt;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
        taskCounter++;
        this.ID = taskCounter;
        this.createdAt = LocalDateTime.now();
    }
    public void setCompleted() {
        this.isCompleted = true;
        this.completedAt = LocalDateTime.now();
    }
   public boolean getCompletedStatus(){
        return isCompleted;
   }


}
