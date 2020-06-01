package dataPersistance;

import game.DigitalGame;
import game.Game;
import game.PhysicalGame;
import hardware.Cpu;
import userInteraction.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SqliteDB {
    Connection c = null;
    Statement stmt = null;

    SqliteDB(){
        // try connect to DB

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:gameManagement.sqlite");
            System.out.println("Connected to DB");

        } catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }
    }

    public List<User> readUsers() {
        List<User> users = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM USER");

            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                var user = new User(username);
                users.add(user);
            }
        }
        catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }

        return users;
    }

    public List<Cpu> readCpus() {
        List<Cpu> cpus = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CPU c JOIN Products p ON c.id = p.id");

            while(rs.next()){
                int id = rs.getInt("id");
                int powerConsumption = rs.getInt("powerConsuption");
                int boxSize = rs.getInt("boxSize");
                int numberOfCores = rs.getInt("numberOfCores");
                float frequency = rs.getFloat("frequency");
                String socket = rs.getString("socket");
                int price = rs.getInt("price");
                String title = rs.getString("title");
                String description = rs.getString("description");

                var cpu = new Cpu(price, title, description, powerConsumption, boxSize,
                        numberOfCores, frequency, Integer.parseInt(socket));

                cpus.add(cpu);
            }
            //c.close();
        }
        catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }

        return cpus;
    }

    public List<DigitalGame> readDigitalGames() {
        List<DigitalGame> digitalGames = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DigitalGame dg JOIN Game g ON dg.id = g.id JOIN Products p ON dg.id = p.id");

            while(rs.next()){
                int id = rs.getInt("id");
                String digitalPlatform = rs.getString("digitalPlatform");
                String developer = rs.getString("developer");
                String type = rs.getString("type");
                int reviewsNote = rs.getInt("reviewsNote");
                String platform = rs.getString("platform");
                int price = rs.getInt("price");
                int size = rs.getInt("size");
                String title = rs.getString("title");
                String description = rs.getString("description");

                var dg = new DigitalGame(price, title, description,
                        developer, type, reviewsNote, platform, size, digitalPlatform);
                digitalGames.add(dg);
            }
        }
        catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }

        return digitalGames;
    }

    public List<PhysicalGame> readPsyhicalGames() {
        List<PhysicalGame> physicalGames = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PhysicalGame dg JOIN Game g ON dg.id = g.id JOIN Products p ON dg.id = p.id");

            while(rs.next()){
                int id = rs.getInt("id");
                int numberDisks = rs.getInt("numberOfDisks");
                String developer = rs.getString("developer");
                String type = rs.getString("type");
                int reviewsNote = rs.getInt("reviewsNote");
                String platform = rs.getString("platform");
                int price = rs.getInt("price");
                int size = rs.getInt("size");
                String title = rs.getString("title");
                String description = rs.getString("description");

                var pg = new PhysicalGame(price, title, description,
                        developer, type, reviewsNote, platform, size, numberDisks);
                physicalGames.add(pg);
            }
        }
        catch (Exception e){
            System.out.printf("Error: " + e.getMessage());
        }

        return physicalGames;
    }
}
