import java.util.HashMap;
import java.util.Map;

public class StudentMarksDemo {
    public static void main(String[] args) {
    Map<Integer, Integer> students = new HashMap<>();

    students.put(1, 85);
    students.put(2, 90);
    students.put(3, 75);
    students.put(4, 88);
    students.put(5, 92);

    System.out.println("all students: ");
    for (Map.Entry<Integer,Integer> x:students.entrySet()){
        System.out.println("ID: " + x.getKey() + ", Mark: " + x.getValue());
    }

   System.out.println("marks of student 3: " + students.get(3));

    System.out.println("Does student 2 exist? " + students.containsKey(2));

    students.put(3,80);
    System.out.println("mark after updating student 3: " + students.get(3));

    students.remove(4);
    System.out.println("all students after remove student 4: ");
    for (Map.Entry<Integer,Integer> x:students.entrySet()){
        System.out.println("ID: " + x.getKey() + ", Mark: " + x.getValue());
    }
    System.out.println("number of students after remove student 4: " + students.size());
}
}
