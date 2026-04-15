import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>(); //create HashMap
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

        System.out.println("Current name for ID 102: " + employees.get(102));
        employees.put(102,"Safa");
        System.out.println("update name for ID 102: " + employees.get(102));

        System.out.println("Current name for ID 104: " + employees.get(104));
        employees.put(104, "Noora");
        System.out.println("Updated name for ID 104: " + employees.get(104));

        System.out.println("Display employees id and name:");
        for (Map.Entry<Integer, String> x : employees.entrySet()) {
            System.out.println("ID: " + x.getKey() + " , Name: " + x.getValue());
        }
    }
}
