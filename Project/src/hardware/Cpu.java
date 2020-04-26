package hardware;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Cpu extends Hardware {

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
        return super.toString()+"\nhardware.Cpu{" +
                "numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", socket=" + socket +
                '}';
    }


    public List<String> CSVHeader(){
        var superHeader = super.CSVHeader();
        List<String> header = new ArrayList<>();

        header.addAll(superHeader);

        var varNames = Cpu.class.getDeclaredFields();
        for (Field field: varNames){
            header.add(field.getName());
        }

        return header;
    }

    public List<String> CSVValues(){
        var superList = super.CSVValues();
        List<String> values = new ArrayList<>();

        values.addAll(superList);
        values.add(String.valueOf(this.numberOfCores));
        values.add(String.valueOf(this.frequency));
        values.add(String.valueOf(this.socket));
        return values;
    }

}
