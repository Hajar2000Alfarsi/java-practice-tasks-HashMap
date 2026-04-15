import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("Java Basics", "John Smith");
        books.put("Python Guide", "Alice Brown");
        books.put("Data Structures", "David Lee");
        books.put("Web Development", "Sarah Khan");
        books.put("Database Systems", "Michael Clark");

        System.out.println("all books: ");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("book : " + x.getKey() + ", Auther: " + x.getValue());
        }

        System.out.println("\nAuthor of 'Java Basics': " + books.get("Java Basics"));

        System.out.println("\nDoes 'Python Guide' exist? " + books.containsKey("Python Guide"));

        books.put("Python Guide", "Alice Johnson");
        System.out.println("\nAfter updating author of 'Python Guide':");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("book : " + x.getKey() + ", Auther: " + x.getValue());
        }

        books.remove("Database Systems");
        System.out.println("\nAfter removing 'Database Systems':");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("book : " + x.getKey() + ", Auther: " + x.getValue());
        }

        System.out.println("\nTotal books left: " + books.size());

    }
}
