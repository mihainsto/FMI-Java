import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static final AtomicInteger count = new AtomicInteger(0);
    private String username;
    private ShoppingCart cart;
    private final int id;

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

}
