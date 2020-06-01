package dataPersistance;

import game.DigitalGame;
import game.PhysicalGame;
import hardware.Cpu;
import userInteraction.User;

public class SqlTest {
    public static void main(String[] args) {
        SqliteDB db = new SqliteDB();
        var users = db.readUsers();

        users.forEach((user) ->{
            System.out.println(user);
        });

        var cpus = db.readCpus();

        cpus.forEach((cpu) ->{
            System.out.println(cpu);
        });

        var dgames = db.readDigitalGames();

        dgames.forEach((dg)->{
            System.out.println(dg);
        });

        var pgames = db.readPsyhicalGames();

        pgames.forEach((pg)->{
            System.out.println(pg);
        });


        // Insert user
        var u = new User("Name2");
        db.createUser(u);

        // Insert CPU
        var i99900k = new Cpu(600, "i9 9900k", "9th generation 14 nm processor", 95, 0.2f, 8, 3.6f, 1151);
        db.createCpu(i99900k);

        var portal2 = new DigitalGame(8, "Portal 2",
                "The Perpetual Testing Initiative has been expanded to allow you to design co-op puzzles for you and your friends!",
                "Valve", "Single-Player / Co-op", 10, "PC", 20, "Steam");
        db.createDigitalGame(portal2);

        var witcher3PS4 = new PhysicalGame(30, "The Witcher 3: Wild Hunt",
                "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.",
                "CD PROJEKT RED", "Single-Player", 10, "PS4", 60, 3);
        db.createPhysicalGame(witcher3PS4);

        db.deleteUser(8);
    }
}
