import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Product {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private float price;
    private String title;
    private String description;
    private List<String> tags;

    public Product(float price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
        this.tags = new ArrayList<>();
        this.id = count.incrementAndGet();
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

    public void addTag(String tag){
        this.tags.add(tag);
    }

    public List<String> getTags(){
        return tags;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }
}
