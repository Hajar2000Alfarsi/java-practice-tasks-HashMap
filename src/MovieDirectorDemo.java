import java.util.HashMap;
import java.util.Map;

public class MovieDirectorDemo {
    public static void main(String[] args) {
        Map<String, String> movies = new HashMap<>();

        movies.put("Inception", "Christopher Nolan");
        movies.put("Titanic", "James Cameron");
        movies.put("Avatar", "James Cameron");
        movies.put("The Matrix", "Wachowski Sisters");
        movies.put("Gladiator", "Ridley Scott");

        System.out.println("All Movies:");
        for (Map.Entry<String,String> x:movies.entrySet()){
            System.out.println("movie : " + x.getKey() + ", director: " + x.getValue());
        }

        System.out.println("\nDirector of Inception: " + movies.get("Inception"));

        System.out.println("\nDoes 'Titanic' exist? " + movies.containsKey("Titanic"));

        System.out.println("Does 'Frozen' exist? " + movies.containsKey("Frozen"));

        movies.put("Avatar", "James Cameron Updated");
        System.out.println("\nAfter updating Avatar director:");
        for (Map.Entry<String,String> x:movies.entrySet()){
            System.out.println("movie : " + x.getKey() + ", director: " + x.getValue());
        }

        movies.remove("Gladiator");
        System.out.println("\nAfter removing Gladiator:");
        for (Map.Entry<String,String> x:movies.entrySet()){
            System.out.println("movie : " + x.getKey() + ", director: " + x.getValue());
        }
        System.out.println("\nTotal movies left: " + movies.size());


    }
}
