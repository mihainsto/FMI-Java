package hardware;
import products.Product;
import game.Game;
import hardware.Hardware;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class GameConsole extends Hardware {

    private int numberOfControllers;
    private List<Game> freeGames;
    private String outputResolution;



    public GameConsole(float price, String title, String description, int powerConsumption, float boxSize, int numberOfControllers, String outputResolution) {
        super(price, title, description, powerConsumption, boxSize);
        this.numberOfControllers = numberOfControllers;
        this.outputResolution = outputResolution;
        this.freeGames = new ArrayList<>();
    }

    public int getNumberOfControllers() {
        return numberOfControllers;
    }

    public void setNumberOfControllers(int numberOfControllers) {
        this.numberOfControllers = numberOfControllers;
    }

    public List<Game> getFreeGames() {
        return freeGames;
    }

    public void setFreeGames(List<Game> freeGames) {
        this.freeGames = freeGames;
    }

    public void addFreeGame(Game game){
        this.freeGames.add(game);
    }

    public String getOutputResolution() {
        return outputResolution;
    }

    public void setOutputResolution(String outputResolution) {
        this.outputResolution = outputResolution;
    }


    @Override
    public String toString() {
        return super.toString()+"\nhardware.GameConsole{" +
                "numberOfControllers=" + numberOfControllers +
                ", outputResolution='" + outputResolution + '\'' +
                ", freeGames=" + freeGames +
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
        values.add(String.valueOf(this.numberOfControllers));
        values.add(String.valueOf(this.outputResolution));

        return values;
    }
}
