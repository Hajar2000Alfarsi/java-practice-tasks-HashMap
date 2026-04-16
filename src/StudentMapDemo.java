import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1001, "Ahmed");
        students.put(1002, "Sara");
        students.put(1003, "Khalid");
        students.put(1004, "Mona");
        students.put(1005, "Ali");

        System.out.println("All Students:");
        for (Map.Entry<Integer,String> x:students.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nStudent with ID 1003:" + students.get(1003));

        System.out.println("\nDoes ID 1002 exist?" + students.containsKey(1002));
        System.out.println("\nDoes ID 2000 exist?" + students.containsKey(2000));

        students.put(1004, "Mona Ali");
        System.out.println("\nAfter updating ID 1004:");
        for (Map.Entry<Integer,String> x:students.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        students.remove(1001);
        System.out.println("\nAfter removing ID 1001:");
        for (Map.Entry<Integer,String> x:students.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }
        System.out.println("\nTotal number of students:" + students.size());

    }
}
