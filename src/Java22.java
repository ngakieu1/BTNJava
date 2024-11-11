import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

//try{
//            int myInt = Integer.parseInt("12b");
//        }
//        catch (NumberFormatException _){
//            System.out.println("That is not number ");

//public void main(){
//    try {
//        String content = Files.readString(Path.of("/Users/kieuthinga/Documents/test.txt"));
//        System.out.println(content);
//    } catch (IOException _) {
//        System.out.println("Co loi khi doc file");
//    }
//}
//public class Java22 {
//    public static void main(String[] args) {
//        try {
//            String content = Files.readString(Path.of("/Users/kieuthinga/Documents/test.txt"));
//            System.out.println(content);
//        } catch (IOException _) {
//            System.out.println("Co loi khi doc file");
//        }
//    }
//}
//public class Java22 {
//    private int result;
//    public void main(String[] args) {
//        this.result = 0;
//        add(5);
//        subtract(2);
//        multiply(3);
//
//        System.out.println("Final result: " + result);
//    }
//
//    public void add(int value) {
//        result += value;
//    }
//
//    public void subtract(int value) {
//        result -= value;
//    }
//
//    public void multiply(int value) {
//        result *= value;
//    }
//}
public class Java22 {
    private int result;
    public void main(String[] args) {
        this.result = 0;
        add(5);
        subtract(2);
        multiply(3);

        System.out.println("Final result: " + result);
    }

    public void add(int value) {
        result += value;
    }

    public void subtract(int value) {
        result -= value;
    }

    public void multiply(int value) {
        result *= value;
    }
}

