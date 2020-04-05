public class Cpu extends Hardware{

    private int numberOfCores;
    private float frequency;
    private int socket;

    public Cpu(float price, String title, String description, int powerConsumption, float boxSize, int numberOfCores, float frequency, int socket) {
        super(price, title, description, powerConsumption, boxSize);
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.socket = socket;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public int getSocket() {
        return socket;
    }

    public void setSocket(int socket) {
        this.socket = socket;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCpu{" +
                "numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", socket=" + socket +
                '}';
    }
}
