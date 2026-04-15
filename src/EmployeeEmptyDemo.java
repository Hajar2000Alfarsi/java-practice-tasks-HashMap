import java.util.HashMap;
import java.util.Map;

public class EmployeeEmptyDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>(); //create HashMap

        System.out.println("Is map empty? " + employees.isEmpty());

        //Add employees id and name
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        //Display all employees details
        System.out.println("Display employees id and name:");
        for (Map.Entry<Integer, String> x : employees.entrySet()) {
            System.out.println("ID: " + x.getKey() + " , Name: " + x.getValue());
        }

        System.out.println("Is map empty now? " + employees.isEmpty());

        employees.clear();
        System.out.println("Display employees id and name after clear:");
        for (Map.Entry<Integer, String> x : employees.entrySet()) {
            System.out.println("ID: " + x.getKey() + " , Name: " + x.getValue());
        }
        System.out.println("Is map empty after clear? " + employees.isEmpty());
    }
}
