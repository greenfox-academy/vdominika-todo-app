import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;

public class ToDoApp {
    public static void main(String[] args) {

        Task t = new Task("ujFeladat");

        t.setCompleted();
        System.out.println(("This task is completed? " + t.getCompletedStatus()));

        System.out.println(t.createdAt);
        System.out.println(t.ID);
        Task t2 = new Task("ufo");
        System.out.println(t2.ID);

        System.out.println();

    }
}
