import java.util.HashMap;
import java.util.Map;

public class CourseMapDemo {
    public static void main(String[] args) {
        Map<String, String> courses = new HashMap<>();

        courses.put("CS101", "Introduction to Programming");
        courses.put("CS102", "Data Structures");
        courses.put("CS103", "Database Systems");
        courses.put("CS104", "Operating Systems");
        courses.put("CS105", "Computer Networks");

        System.out.println("All Courses:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nCourse with code CS102:" + courses.get("CS102"));

        System.out.println("\nDoes CS103 exist?" + courses.containsKey("CS103"));
        System.out.println("\nDoes CS103 exist?" + courses.containsKey("CS200"));

        courses.put("CS104", "Advanced Operating Systems");
        System.out.println("\nAfter updating CS104:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        courses.remove("CS101");
        System.out.println("\nAfter removing CS101:");
        for (Map.Entry<String,String> x:courses.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nTotal number of courses:" + courses.size());

    }
}
