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

    public SqliteDB() {
        // try connect to DB

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:gameManagement.sqlite");
            System.out.println("Connected to DB");

        } catch (Exception e) {
            System.out.printf("Error: " + e.getMessage());
        }
    }

    public List<User> readUsers() {
        List<User> users = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM USER");

            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                var user = new User(username);
                users.add(user);
            }
        } catch (Exception e) {
            System.out.printf("Error: " + e.getMessage());
        }

        return users;
    }

    public void createUser(User u) {
        try {
            this.stmt = c.createStatement();
            var querry = "INSERT INTO USER (username) VALUES  (\"" + u.getUsername() + "\")";
            stmt.executeUpdate(querry);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Adding User");
    }

    public void updateUser(int id, String username){
        try {
            this.stmt = c.createStatement();
            var querry = "UPDATE USER SET username = \"" + username + "\" WHERE id = " + id;
            stmt.executeUpdate(querry);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Updating User");
    }

    public List<Cpu> readCpus() {
        List<Cpu> cpus = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CPU c JOIN Products p ON c.id = p.id");

            while (rs.next()) {
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
        } catch (Exception e) {
            System.out.printf("Error: " + e.getMessage());
        }

        return cpus;
    }

    public void createCpu(Cpu cpu) {
        try {
            this.stmt = c.createStatement();
            var querry1 = "INSERT INTO PRODUCTS (id, price, title, description) VALUES " +
                    "(\"" + cpu.getId() + "\",\"" + cpu.getPrice() + "\",\""
                    + cpu.getTitle() +
                    "\",\"" + cpu.getDescription() + "\")";
            var querry2 = "INSERT INTO CPU (id, powerConsuption, boxSize, numberOfCores, frequency, socket) VALUES  " +
                    "(\"" + cpu.getId() + "\",\"" + cpu.getPowerConsumption() + "\",\"" + cpu.getBoxSize() + "\",\""
                    + cpu.getNumberOfCores() + "\",\"" +
                    cpu.getFrequency() + "\",\"" + cpu.getSocket() + "\")";
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Adding CPU");
    }

    public void updateCpu(int id, int price, String title, String description, int powerConsuption, int boxSize, int numberOfCores, float frequency, int socket){
        try {
            this.stmt = c.createStatement();
            var querry1 = "UPDATE PRODUCTS SET price = \"" + price + "\", title = \""+title+"\", description = \""+description+"\"" + "WHERE ID = " + id;

            var querry2 = "UPDATE PRODUCTS SET powerConsuption =" + "\""+powerConsuption+"\", " +
                    "boxSize = \""+boxSize+"\", numberOfCores =\""+numberOfCores+"\", frequency = \""+frequency+"\"" +
                    ", socket = \""+socket+"\" WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Updating CPU");
    }
    public List<DigitalGame> readDigitalGames() {
        List<DigitalGame> digitalGames = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM DigitalGame dg JOIN Game g ON dg.id = g.id JOIN Products p ON dg.id = p.id");

            while (rs.next()) {
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
        } catch (Exception e) {
            System.out.printf("Error: " + e.getMessage());
        }

        return digitalGames;
    }

    public void createDigitalGame(DigitalGame dg) {
        try {
            this.stmt = c.createStatement();
            var querry1 = "INSERT INTO PRODUCTS (id, price, title, description) VALUES " +
                    "(\"" + dg.getId() + "\",\"" + dg.getPrice() + "\",\""
                    + dg.getTitle() +
                    "\",\"" + dg.getDescription() + "\")";

            var querry2 = "INSERT INTO Game (id, developer, type, reviewsNote, platform, size) VALUES  " +
                    "(\"" + dg.getId() + "\",\"" + dg.getDeveloper() + "\",\"" + dg.getType() + "\",\""
                    + dg.getReviewsNote() + "\",\"" +
                    dg.getPlatform() + "\",\"" + dg.getSize() + "\")";

            var querry3 = "INSERT INTO DigitalGame (id, digitalPlatform) VALUES  " +
                    "(\"" + dg.getId() + "\",\"" + dg.getDeveloper() + "\")";

            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Adding Digital Game");
    }

    public void updateDigitalGame(int id, int price, String title, String description, String developer, String type, String reviewsNote, String platform, int size, String digitalPlatform){
        try {
            this.stmt = c.createStatement();
            var querry1 = "UPDATE PRODUCTS SET price = \"" + price + "\", title = \""+title+"\", description = \""+description+"\"" + "WHERE ID = " + id;

            var querry2 = "UPDATE Game SET developer = \""+developer+"\", " +
                    "type = \""+type+"\", reviewsNote =\""+reviewsNote+"\", platform = \""+platform+"\"" +
                    ", size = \""+size+"\" WHERE id = " + id;
            var querry3 = "UPDATE DigitalGame SET digitalPlatform = \""+digitalPlatform+"\", " +
                   "WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Updating DigitalGame");
    }
    public List<PhysicalGame> readPsyhicalGames() {
        List<PhysicalGame> physicalGames = new ArrayList<>();
        try {
            this.stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM PhysicalGame dg JOIN Game g ON dg.id = g.id JOIN Products p ON dg.id = p.id");

            while (rs.next()) {
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
        } catch (Exception e) {
            System.out.printf("Error: " + e.getMessage());
        }

        return physicalGames;
    }

    public void createPhysicalGame(PhysicalGame pg) {
        try {
            this.stmt = c.createStatement();
            var querry1 = "INSERT INTO PRODUCTS (id, price, title, description) VALUES " +
                    "(\"" + pg.getId() + "\",\"" + pg.getPrice() + "\",\""
                    + pg.getTitle() +
                    "\",\"" + pg.getDescription() + "\")";

            var querry2 = "INSERT INTO Game (id, developer, type, reviewsNote, platform, size) VALUES  " +
                    "(\"" + pg.getId() + "\",\"" + pg.getDeveloper() + "\",\"" + pg.getType() + "\",\""
                    + pg.getReviewsNote() + "\",\"" +
                    pg.getPlatform() + "\",\"" + pg.getSize() + "\")";

            var querry3 = "INSERT INTO PhysicalGame (id, numberOFDisks) VALUES  " +
                    "(\"" + pg.getId() + "\",\"" + pg.getNumberOfDisks() + "\")";

            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done adding physicalGame");
    }

    public void updatePhysicalGame(int id, int price, String title, String description, String developer, String type, String reviewsNote, String platform, int size, int numberOFDisks){
        try {
            this.stmt = c.createStatement();
            var querry1 = "UPDATE PRODUCTS SET price = \"" + price + "\", title = \""+title+"\", description = \""+description+"\"" + "WHERE ID = " + id;

            var querry2 = "UPDATE Game SET developer = \""+developer+"\", " +
                    "type = \""+type+"\", reviewsNote =\""+reviewsNote+"\", platform = \""+platform+"\"" +
                    ", size = \""+size+"\" WHERE id = " + id;
            var querry3 = "UPDATE DigitalGame SET numberOFDisks = \""+numberOFDisks+"\", " +
                    "WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done Updating DigitalGame");
    }


    /// Delete
    public void deleteUser(int id){
        try {
            this.stmt = c.createStatement();
            var querry = "DELETE FROM USER WHERE id = " + id;
            stmt.executeUpdate(querry);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done deleting user");
    }
    public void deleteCpu(int id){
        try {
            this.stmt = c.createStatement();
            var querry1 = "DELETE FROM PRODUCTS WHERE id = " + id;
            var querry2 = "DELETE FROM CPU WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done deleting cpu");
    }
    public void deleteDigitalGame(int id){
        try {
            this.stmt = c.createStatement();
            var querry1 = "DELETE FROM PRODUCTS WHERE id = " + id;
            var querry3 = "DELETE FROM Game WHERE id = " + id;
            var querry2 = "DELETE FROM DigitalGame WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done deleting DigitalGame");
    }
    public void deletePhysicalGame(int id){
        try {
            this.stmt = c.createStatement();
            var querry1 = "DELETE FROM PRODUCTS WHERE id = " + id;
            var querry2 = "DELETE FROM PhysicalGame WHERE id = " + id;
            var querry3 = "DELETE FROM Game WHERE id = " + id;
            stmt.executeUpdate(querry1);
            stmt.executeUpdate(querry2);
            stmt.executeUpdate(querry3);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Done deleting PhysicalGame");
    }
}