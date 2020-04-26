import dataPersistance.CSVWriter;
import game.DigitalGame;
import game.PhysicalGame;
import hardware.Cpu;
import hardware.GameConsole;
import hardware.VideoCard;
import userInteraction.User;
import dataPersistance.CSVWriter;
import dataPersistance.CSVReader;

import java.io.IOException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        // Defining the games that will be selling
        var witcher3Steam = new DigitalGame(10, "The Witcher 3: Wild Hunt",
              "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.",
              "CD PROJEKT RED", "Single-Player", 10, "PC", 100, "Steam");
        witcher3Steam.addGenere("Open World RPG");

        var witcher3PS4 = new PhysicalGame(30, "The Witcher 3: Wild Hunt",
                "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.",
                "CD PROJEKT RED", "Single-Player", 10, "PS4", 60, 3);
        witcher3PS4.addGenere("Open World RPG");

        var portal2 = new DigitalGame(8, "Portal 2",
              "The Perpetual Testing Initiative has been expanded to allow you to design co-op puzzles for you and your friends!",
              "Valve", "Single-Player / Co-op", 10, "PC", 20, "Steam");
        portal2.addGenere("3D Platformer");
        portal2.addGenere("Puzzle");

        // Defining the hardware.Hardware that will be selling
        // Defining game consoles
        var ps4 = new GameConsole(400, "Playstation 4 Slim",
                "Introducing the Playstation4 SLIM, 1TB hard drive, all greatest games, TV, music and more.",
                100, 0.5f, 2, "1080p");
        ps4.addFreeGame(witcher3PS4);

        // Defining CPU's
        var i79700F = new Cpu(300, "i7 9700F", "9th generation 14 nm processor", 65,0.2f, 8,4.7f, 1151);
        var i99900k = new Cpu(600, "i9 9900k", "9th generation 14 nm processor", 95, 0.2f, 8, 3.6f, 1151);

        // Defining VideoCards
        var rtx2070Super = new VideoCard(700, "MSI GeForce RTX 2070 SUPER", "Play Hard Stay Silent with RTX 2070 SUPER from MSI", 200, 0.4f, 1770,8, 2, "8k");

        //System.out.println(i99900k);

        User uMihai = new User("Mihai");

        uMihai.addItemToCart(ps4);
        uMihai.addItemToCart(rtx2070Super);
        uMihai.addItemToCart(portal2);

        System.out.println(uMihai.buy());


        CSVWriter writer = CSVWriter.getInstance("test.csv");
        CSVReader reader = CSVReader.getInstance("test.csv");
        //writer.writeHeader(new ArrayList<String>(Arrays.asList("Hello", "World!", "How", "Are", "You")));
        //System.out.println(uMihai.CSVHeader());
        //System.out.println(uMihai.CSVValues());
        writer.write(uMihai.CSVHeader());
        writer.write(uMihai.CSVValues());

        //System.out.println(reader.readLine());
        //System.out.println(reader.readLine());
        System.out.println(reader.readLine());



    }
}
