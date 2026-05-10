import java.util.*;

class Product {
    String id;
    String name;
    String category;

    public Product(String id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " (" + category + ")";
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        List<Product> cartItems = new ArrayList<>();
        Set<String> uniqueCategories = new HashSet<>();
        Map<String, Integer> productQuantity = new HashMap<>();

        Product laptop = new Product("P101", "MacBook Pro", "Electronics");
        Product mouse = new Product("P102", "Logitech Mouse", "Electronics");
        Product book = new Product("P103", "Java Programming", "Books");

        addToCart(laptop, cartItems, uniqueCategories, productQuantity);
        addToCart(mouse, cartItems, uniqueCategories, productQuantity);
        addToCart(laptop, cartItems, uniqueCategories, productQuantity);

        System.out.println("--- Your Cart ---");
        cartItems.forEach(System.out::println);

        System.out.println("\n--- Unique Categories ---");
        System.out.println(uniqueCategories);

        System.out.println("\n--- Product Quantities ---");
        productQuantity.forEach((id, qty) -> System.out.println("ID: " + id + " | Qty: " + qty));
    }

    public static void addToCart(Product p, List<Product> list, Set<String> set, Map<String, Integer> map) {
        list.add(p);
        set.add(p.category);
        map.put(p.id, map.getOrDefault(p.id, 0) + 1);
    }
}
