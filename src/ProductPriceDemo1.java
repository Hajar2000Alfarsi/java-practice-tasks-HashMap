import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo1 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 850.50);
        products.put("Smartphone", 450.75);
        products.put("Headphones", 120.00);
        products.put("Keyboard", 35.99);
        products.put("Mouse", 20.50);

        System.out.println("All Products:");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nPrice of 'Laptop':" + products.get("Laptop"));

        System.out.println("\nDoes 'Mouse' exist?" + products.containsKey("Mouse"));
        System.out.println("\nDoes 'Tablet' exist?" + products.containsKey("Tablet"));

        products.put("Keyboard", 40.00);
        System.out.println("\nAfter updating 'Keyboard':");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        products.remove("Headphones");
        System.out.println("\nAfter removing 'Headphones':");
        for (Map.Entry<String,Double> x:products.entrySet()){
            System.out.println("ID : " + x.getKey() + ", name: " + x.getValue());
        }

        System.out.println("\nTotal number of products:" + products.size());
    }
}
