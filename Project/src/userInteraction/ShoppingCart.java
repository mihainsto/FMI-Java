package userInteraction;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }


    public float buy(){
        float price = totalPrice();
        this.products.clear();
        return price;
    }
    @Override
    public String toString() {
        return "userInteraction.ShoppingCart{" +
                "products=" + products +
                '}';
    }

    private float totalPrice(){
        float price = 0;
        for(Product product: this.products){
            price += product.getPrice();
        }
        return price;
    }
}
