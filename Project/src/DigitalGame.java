public class DigitalGame extends Game{
    private String digitalPlatform;

    public DigitalGame(float price, String title, String description, String developer, String type, int reviewsNote, String platform, int size, String digitalPlatform) {
        super(price, title, description, developer, type, reviewsNote, platform, size);
        this.digitalPlatform = digitalPlatform;
    }



    public String getDigitalPlatform() {
        return digitalPlatform;
    }

    public void setDigitalPlatform(String digitalPlatform) {
        this.digitalPlatform = digitalPlatform;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDigitalGame{" +
                "digitalPlatform='" + digitalPlatform + '\'' +
                '}';
    }
}
