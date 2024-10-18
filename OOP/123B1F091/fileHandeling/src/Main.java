import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File myObj = new File("D:\\123B1F091\\myFile.txt");
            if(myObj.createNewFile()) {
                System.out.println("File has been created."+ myObj.getName());
            }else {
                System.out.println("File already Exists.");
            }
        } catch (IOException e) {
            System.out.println("An error");
            e.printStackTrace();
        }
//        File obj = new File("D:\\123B1F091\\myFile.txt");
//        System.out.println("File has been created.");
    }
}