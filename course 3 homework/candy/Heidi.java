package candy;

public class Heidi extends CandyBox {
    private float boxSize;
    private String boxType;

    public Heidi() {
        super();
        boxType = "Cube";
        boxSize = 1.4f;
    }

    public Heidi(String flavour, String origin) {
        super(flavour, origin);
        boxType = "Cube";
        boxSize = 1.4f;
    }

    @Override
    public float getVolume() {
        return boxSize*boxSize*boxSize;
    }

    @Override
    public String toString() {

        return super.toString() + " has volume " + Float.toString(getVolume());
    }
    public void printDim(){
        System.out.println(Float.toString(boxSize));
    }
}
