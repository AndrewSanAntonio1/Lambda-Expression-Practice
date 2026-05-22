package ProductDiscount;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
@FunctionalInterface
interface Product {
    Map<String,Double> product();
}
public class Main {
    public static void main(String[] args) {
        Product product = () -> Map.of(
            "Perfume",20.0,
            "T'Shirt", 10.0,
            "Pants",12.5
        );

        Map<String, Double> products = product.product();

        // System.out.println(products);

        product.product().entrySet().stream().forEach(data -> {
            double discount = data.getValue() * 0.10;
            double finalPrice = data.getValue() - discount;

            System.out.println("Product: " + data.getKey());
            System.out.println("Price: $" + data.getValue());
            System.out.println("Discount: $" + discount);
            System.out.println("Total price: $" + finalPrice);
            System.out.println();
        });
    }
}
