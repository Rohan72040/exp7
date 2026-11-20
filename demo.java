import java.util.ArrayList;
import java.util.List;

// Save this file as SampleApp.java (must match the public class name)
public class SampleApp {

    private String appName;

    // Constructor
    public SampleApp(String appName) {
        this.appName = appName;
    }

    // Method to greet a user
    public String greet(String user) {
        return "Hello, " + user + "! Welcome to " + appName + ".";
    }

    // Main entry point of the program
    public static void main(String[] args) {
        SampleApp app = new SampleApp("Java Starter");
        System.out.println(app.greet("Developer"));

        // Working with a list and a loop
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        System.out.println("\nPopular Languages:");
        for (int i = 0; i < languages.size(); i++) {
            System.out.println((i + 1) + ". " + languages.get(i));
        }
    }
}
