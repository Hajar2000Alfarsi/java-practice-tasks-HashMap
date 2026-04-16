import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ali");
        employees.put(102, "Sara");
        employees.put(103, "Ahmed");
        employees.put(104, "Mona");
        employees.put(105, "Khalid");

        System.out.println("All Employees:");
        for (Map.Entry<Integer,String> x:employees.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nEmployee with ID 103:" + employees.get(103));

        System.out.println("\nDoes ID 102 exist?" + employees.containsKey(102));
        System.out.println("\nDoes ID 200 exist?" + employees.containsKey(200));

        employees.put(104, "Mona Ali");
        System.out.println("\nAfter updating ID 104:");
        for (Map.Entry<Integer,String> x:employees.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        employees.remove(101);
        System.out.println("\nAfter removing ID 101:");
        for (Map.Entry<Integer,String> x:employees.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nTotal number of employees:" + employees.size());

    }
}
