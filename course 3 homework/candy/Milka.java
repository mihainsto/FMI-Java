package candy;

public class Milka extends CandyBox{
    private float boxSize;
    private String boxType;

    public Milka() {
        super();
        boxType = "Cilinder";
        boxSize = 2.4f;
    }

    public Milka(String flavour, String origin) {
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
