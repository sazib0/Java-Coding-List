import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}


public class SortExample {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 999.99),
            new Product("Smartphone", 699.99),
            new Product("Tablet", 299.99),
            new Product("Smartwatch", 199.99)
        );

        products.sort(Comparator.comparingDouble(Product::getPrice));

        System.out.println("Products sorted by price: " + products);
    }
}