package candy;

public class Lindt extends CandyBox{
    private float boxSize;
    private String boxType;

    public Lindt() {
        super();
        boxType = "Parallelepiped";
        boxSize = 3f;
    }

    public Lindt(String flavour, String origin) {
        super(flavour, origin);
        boxType = "Parallelepiped";
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
