import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo {
    public static void main(String[] args) {
        Map<String, Double> products= new HashMap<>();

        products.put("Laptop", 450.0);
        products.put("Phone", 300.0);
        products.put("Tablet", 200.0);
        products.put("Headphones", 50.0);
        products.put("Keyboard", 25.0);

        System.out.println("all products: ");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("product: " + x.getKey() + ", Price: " + x.getValue());
        }

        System.out.println("price of Laptop: " + products.get("Laptop"));

        System.out.println("Does Laptop exist? " + products.containsKey("Laptop"));

        products.put("Phone", 280.0);
        System.out.println("updated products: ");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("product: " + x.getKey() + ", Price: " + x.getValue());
        }

        products.remove("Tablet");
        System.out.println("removing Tablet products: ");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("product: " + x.getKey() + ", Price: " + x.getValue());
        }
        System.out.println("total products: " + products.size());
    }
}
