package hardware;

import hardware.Hardware;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

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
        return super.toString() +"\nhardware.VideoCard{" +
                "frequency=" + frequency +
                ", vram=" + vram +
                ", numberOfVents=" + numberOfVents +
                ", outputResolution='" + outputResolution + '\'' +
                '}';
    }

    public List<String> CSVHeader(){
        var superHeader = super.CSVHeader();
        List<String> header = new ArrayList<>();

        header.addAll(superHeader);

        var varNames = VideoCard.class.getDeclaredFields();
        for (Field field: varNames){
            header.add(field.getName());
        }

        return header;
    }

    public List<String> CSVValues(){
        var superList = super.CSVValues();
        List<String> values = new ArrayList<>();

        values.addAll(superList);
        values.add(String.valueOf(this.frequency));
        values.add(String.valueOf(this.vram));
        values.add(String.valueOf(this.numberOfVents));
        values.add(this.outputResolution);
        return values;
    }

}
