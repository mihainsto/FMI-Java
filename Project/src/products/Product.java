package products;

import hardware.Cpu;
import hardware.Hardware;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private float price;
    private String title;
    private String description;

    public Product(float price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
        this.id = count.incrementAndGet();
    }

    public Product(float price, String title, String description, int id) {
        this.price = price;
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "products.Product{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public List<String> CSVHeader(){
        List<String> header = new ArrayList<>();


        var varNames = Product.class.getDeclaredFields();
        for (Field field: varNames){
            if (!field.getName().equals("count"))
                header.add(field.getName());
        }

        return header;
    }

    public List<String> CSVValues(){
        List<String> values = new ArrayList<>();
        values.add(String.valueOf(this.id));
        values.add(String.valueOf(this.price));
        values.add(title);
        values.add(this.description);

        return values;
    }
}
