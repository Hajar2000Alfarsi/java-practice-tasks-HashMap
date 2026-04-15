import java.util.HashMap;
import java.util.Map;

public class CourseTrainerDemo {
    public static void main(String[] args) {
        Map<String, String> courses = new HashMap<>();

        courses.put("Java", "Ali");
        courses.put("Python", "Sara");
        courses.put("Database", "Omar");
        courses.put("Networking", "Noor");
        courses.put("Web Design", "Maha");

        System.out.println("All Courses:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("course : " + x.getKey() + ", trainer: " + x.getValue());
        }

        System.out.println("\nTrainer for Java: " + courses.get("Java"));

        System.out.println("\nDoes 'Python' exist? " + courses.containsKey("Python"));

        System.out.println("Does 'AI' exist? " + courses.containsKey("AI"));

        courses.put("Java", "Khalid");
        System.out.println("\nAfter updating Java trainer:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("course : " + x.getKey() + ", trainer: " + x.getValue());
        }

        courses.remove("Database");
        System.out.println("\nAfter removing Database:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("course : " + x.getKey() + ", trainer: " + x.getValue());
        }
        System.out.println("\nTotal courses left: " + courses.size());
    }
}
