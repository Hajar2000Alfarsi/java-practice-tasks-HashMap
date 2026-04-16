import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo1 {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("Oman", "Muscat");
        countries.put("Saudi Arabia", "Riyadh");
        countries.put("UAE", "Abu Dhabi");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");

        System.out.println("All Countries and Capitals:");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("Countries : " + x.getKey() + ", Capitals: " + x.getValue());
        }

        System.out.println("\nCapital of Oman:" + countries.get("Oman"));

        System.out.println("\nDoes 'Egypt' exist?" + countries.containsKey("Egypt"));
        System.out.println("\nDoes 'Japan' exist?" + countries.containsKey("Japan"));

        countries.put("UAE", "Abu Dhabi City");
        System.out.println("\nAfter updating UAE:");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("Countries : " + x.getKey() + ", Capitals: " + x.getValue());
        }

        countries.remove("France");
        System.out.println("\nAfter removing France:");
        for (Map.Entry<String,String> x:countries.entrySet()){
            System.out.println("Countries : " + x.getKey() + ", Capitals: " + x.getValue());
        }
        System.out.println("\nTotal number of countries:" + countries.size());
    }
}
