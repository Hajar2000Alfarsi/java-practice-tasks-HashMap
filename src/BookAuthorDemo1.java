import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo1 {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        books.put("The Alchemist", "Paulo Coelho");
        books.put("Harry Potter", "J.K. Rowling");
        books.put("1984", "George Orwell");
        books.put("Pride and Prejudice", "Jane Austen");
        books.put("The Hobbit", "J.R.R. Tolkien");

        System.out.println("All Books:");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nAuthor of '1984':" + books.get("1984"));

        System.out.println("\nDoes 'Harry Potter' exist?" + books.containsKey("Harry Potter"));
        System.out.println("\nDoes 'Unknown Book' exist?" + books.containsKey("Unknown Book"));

        books.put("The Hobbit", "J.R.R. Tolkien Updated");

        System.out.println("\nAfter updating 'The Hobbit':");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        books.remove("The Alchemist");
        System.out.println("\nAfter removing 'The Alchemist':");
        for (Map.Entry<String,String> x:books.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nTotal number of books:" + books.size());

    }
}
