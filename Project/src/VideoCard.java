public class VideoCard extends Hardware {
    private float frequency;
    private int vram;
    private int numberOfVents;
    private String outputResolution;

    public VideoCard(float price, String title, String description, int powerConsumption, float boxSize, float frequency, int vram, int numberOfVents, String outputResolution) {
        super(price, title, description, powerConsumption, boxSize);
        this.frequency = frequency;
        this.vram = vram;
        this.numberOfVents = numberOfVents;
        this.outputResolution = outputResolution;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }

    public int getNumberOfVents() {
        return numberOfVents;
    }

    public void setNumberOfVents(int numberOfVents) {
        this.numberOfVents = numberOfVents;
    }

    public String getOutputResolution() {
        return outputResolution;
    }

    public void setOutputResolution(String outputResolution) {
        this.outputResolution = outputResolution;
    }

    @Override
    public String toString() {
        return super.toString() +"\nVideoCard{" +
                "frequency=" + frequency +
                ", vram=" + vram +
                ", numberOfVents=" + numberOfVents +
                ", outputResolution='" + outputResolution + '\'' +
                '}';
    }
}
