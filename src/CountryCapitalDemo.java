import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("Oman", "Muscat");
        countries.put("UAE", "Abu Dhabi");
        countries.put("Saudi Arabia", "Riyadh");
        countries.put("Qatar", "Doha");
        countries.put("Kuwait", "Kuwait City");

        System.out.println("all countries: ");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("countries: " + x.getKey() + ", Capital: " + x.getValue());
        }

        System.out.println("\nDoes UAE exist? " + countries.containsKey("UAE"));

        countries.put("Qatar", "Doha City");

        System.out.println("\nAll countries After update Qater : ");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("countries: " + x.getKey() + ", Capital: " + x.getValue());
        }

        countries.remove("Kuwait");
        System.out.println("\nAll countries After delete Kuwait : ");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("countries: " + x.getKey() + ", Capital: " + x.getValue());
        }

        System.out.println("\nTotal countries left: " + countries.size());
    }
}
