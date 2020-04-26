package game;

import game.Game;

public class PhysicalGame extends Game {
    private int numberOfDisks;

    public PhysicalGame(float price, String title, String description, String developer, String type, int reviewsNote, String platform, int size, int numberOfDisks) {
        super(price, title, description, developer, type, reviewsNote, platform, size);
        this.numberOfDisks = numberOfDisks;
    }

    public int getNumberOfDisks() {
        return numberOfDisks;
    }

    public void setNumberOfDisks(int numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    @Override
    public String toString() {
        return super.toString()+"\ngame.PhysicalGame{" +
                "numberOfDisks=" + numberOfDisks +
                '}';
    }
}
