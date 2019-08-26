import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World V2.1");
         System.out.println(newFunction());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String newFunction() {
        return "Testing";
    }
}
