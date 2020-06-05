package userInteraction;

import products.Product;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String username;
    private final int id;

    private ShoppingCart cart;

    public User(String username) {
        this.username = username;
        this.id = count.incrementAndGet();
        cart = new ShoppingCart();
    }

    public String getUsername() {
        return username;
    }
    public void addItemToCart(Product product){
        this.cart.addProduct(product);
    }
    public float buy(){
        return this.cart.buy();
    }
    public ShoppingCart getCartList(){return this.cart;}

    public List<String> CSVHeader(){
        List<String> header = new ArrayList<>();
        header.add("username");
        header.add("id");

        return header;
    }

    public List<String> CSVValues(){
        List<String> values = new ArrayList<>();
        values.add(username);
        values.add(String.valueOf(id));

        return values;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", cart=" + cart +
                '}';
    }
}
