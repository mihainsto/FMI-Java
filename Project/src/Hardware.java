public abstract class  Hardware extends Product{
    private int powerConsumption;
    private float boxSize;

    public Hardware(float price, String title, String description, int powerConsumption, float boxSize) {
        super(price, title, description);
        this.powerConsumption = powerConsumption;
        this.boxSize = boxSize;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getBoxSize() {
        return boxSize;
    }

    public void setBoxSize(int boxSize) {
        this.boxSize = boxSize;
    }

    @Override
    public String toString() {
        return super.toString()+"\nHardwareObj{" +
                "powerConsumption=" + powerConsumption +
                ", boxSize=" + boxSize +
                '}';
    }
}
