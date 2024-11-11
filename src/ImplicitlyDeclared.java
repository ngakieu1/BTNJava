import java.nio.file.Files;
import java.nio.file.Path;
public class ImplicitlyDeclared {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

public void main(){
    System.out.println("Hello World");
}
