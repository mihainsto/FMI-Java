package game;
import products.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Game extends Product {

    private List<String> genres;
    private String developer;
    private String type;
    private int reviewsNote;
    private String platform;
    private int size;

    public Game(float price, String title, String description, String developer, String type, int reviewsNote, String platform, int size) {
        super(price, title, description);
        this.developer = developer;
        this.type = type;
        this.reviewsNote = reviewsNote;
        this.platform = platform;
        this.genres = new ArrayList<>();
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void addGenere(String genere){
        this.genres.add(genere);
    }

    public List<String> getGenere(){
        return this.genres;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReviewsNote() {
        return reviewsNote;
    }

    public void setReviewsNote(int reviewsNote) {
        this.reviewsNote = reviewsNote;
    }

    @Override
    public String toString() {
        return super.toString() +"\ngame.Game{" +
                "genres=" + genres +
                ", developer='" + developer + '\'' +
                ", type='" + type + '\'' +
                ", reviewsNote=" + reviewsNote +
                ", platform='" + platform + '\'' +
                ", size=" + size +
                '}';
    }
}
