import java.util.HashMap;
import java.util.Map;

public class EmployeeSizeDemo {
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
            System.out.println(x.getKey() + " --> " + x.getValue());
        }

        System.out.println("total employees: " + employees.size());

        employees.put(106, "Khalid");
        System.out.println("Display updated employees id and name:");
        for (Map.Entry<Integer, String> x : employees.entrySet()) {
            System.out.println(x.getKey() + " --> " + x.getValue());
        }
        System.out.println("new total employees: " + employees.size());
    }
    }
