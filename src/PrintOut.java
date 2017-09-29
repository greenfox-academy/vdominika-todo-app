import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;

public class PrintOut {
    public static void main(String[] args) {

        if (args.length == 0){
            menu();
        } else if (args[0].equals ("-l")){
            listingFunction ( );}
//        }else if (args[0].equals ("-a")){
//            addElement ();
//        }else if (args[0].equals("-r")){
//            taskRemoval()
//        }else if (args[0].equals("-c")){
//            completionTask()


        public static void menu(){
        try {
            Path filePath = Paths.get("/Users/dvittay/greenfox/vdominika-todo-app/PrintUsage.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (int i = 0; i < lines.size (); i++) {
                System.out.println (lines.get(i) );
            }
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }

        public static void listingFunction(){
        Path filePath = Paths.get("/Users/dvittay/greenfox/vdominika-todo-app/src/testList.txt");
    }
        }
}

