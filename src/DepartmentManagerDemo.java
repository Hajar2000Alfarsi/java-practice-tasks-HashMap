import java.util.HashMap;
import java.util.Map;

public class DepartmentManagerDemo {
    public static void main(String[] args) {
        Map<String, String> departments = new HashMap<>();

        departments.put("HR", "Sara");
        departments.put("IT", "Ahmed");
        departments.put("Finance", "Khalid");
        departments.put("Marketing", "Mona");
        departments.put("Sales", "Ali");

        System.out.println("All Departments and Managers:");
        for (Map.Entry<String,String> x:departments.entrySet()){
            System.out.println("Departments : " + x.getKey() + ", Managers: " + x.getValue());
        }

        System.out.println("\nManager of IT Department:" + departments.get("IT"));

        System.out.println("\nDoes 'Finance' exist?" + departments.containsKey("Legal"));
        System.out.println("\nDoes 'Finance' exist?" + departments.containsKey("Finance"));

        departments.put("Marketing", "Mona Ali");
        System.out.println("\nAfter updating Marketing Department:");
        for (Map.Entry<String,String> x:departments.entrySet()){
            System.out.println("Departments : " + x.getKey() + ", Managers: " + x.getValue());
        }

        departments.remove("Sales");
        System.out.println("\nAfter removing Sales Department:");
        for (Map.Entry<String,String> x:departments.entrySet()){
            System.out.println("Departments : " + x.getKey() + ", Managers: " + x.getValue());
        }
        System.out.println("\nTotal number of departments:" + departments.size());

    }
}
