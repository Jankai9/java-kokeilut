import java.io.InputStream;
import java.util.Properties;

public class HelloWorld {
    public static void main(String[] args) {
        // HelloWorld helloWorld = new HelloWorld();
        // helloWorld.printMessage();
        foo();
    }

    private static void foo() {
        int a = 100;
        Integer b = 25;
        a = b;
        b = null;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }

    public static String bar() {
         return "bar";
    }

    public void printMessage() {
        try {
            Properties properties = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("./config.properties");
            if (inputStream != null) {
                properties.load(inputStream);
                String message = properties.getProperty("message");
                System.out.println(message);
            } else {
                System.out.println("Sorry, unable to find config.properties");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}