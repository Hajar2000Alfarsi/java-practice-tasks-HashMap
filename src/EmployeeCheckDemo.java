import java.util.HashMap;
import java.util.Map;

public class EmployeeCheckDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>(); //create HashMap
        //Add employees id and name
        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Omar");
        employees.put(104, "Noor");
        employees.put(105, "Maha");

        //Display all employees details
        for (Map.Entry<Integer, String> x : employees.entrySet()) {
            System.out.println(x.getKey() + " --> " + x.getValue());
        }

        System.out.println("Does ID 102 exist? " + employees.containsKey(102));
        System.out.println("Does ID 108 exist? " + employees.containsKey(108));

        System.out.println("Does name Ali exist? " + employees.containsValue("Ali"));
        System.out.println("Does name Ahmed exist? " + employees.containsValue("Ahmed"));
    }
}
