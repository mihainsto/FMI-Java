package dataPersistance;

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
    }
}
