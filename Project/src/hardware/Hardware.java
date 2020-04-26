package hardware;

import products.Product;

import java.lang.reflect.Field;
import java.sql.Array;
import java.text.MessageFormat;
import java.util.*;

public abstract class  Hardware extends Product {

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

    public List<String> CSVHeader(){
        var superHeader = super.CSVHeader();
        List<String> header = new ArrayList<>();

        header.addAll(superHeader);

        var varNames = Hardware.class.getDeclaredFields();
        for (Field field: varNames){
            header.add(field.getName());
        }

        return header;
    }

    public List<String> CSVValues(){
        var superList = super.CSVValues();
        List<String> values = new ArrayList<>();
        values.addAll(superList);

        values.add(String.valueOf(this.powerConsumption));
        values.add(String.valueOf(this.boxSize));
        return values;
    }


}
