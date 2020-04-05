public class Test {
    public static void main(String[] args) {
        // Defining the games that will be selling
        var Witcher3Steam = new DigitalGame(10, "The Witcher 3: Wild Hunt",
              "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.",
              "CD PROJEKT RED", "Single-Player", 10, "PC", 100, "Steam");
        Witcher3Steam.addGenere("Open World RPG");
        Witcher3Steam.addTag("Story Righ");
        Witcher3Steam.addTag("Atmospheric");

        var Witcher3PS4 = new PhysicalGame(30, "The Witcher 3: Wild Hunt",
                "As war rages on throughout the Northern Realms, you take on the greatest contract of your life — tracking down the Child of Prophecy, a living weapon that can alter the shape of the world.",
                "CD PROJEKT RED", "Single-Player", 10, "PS4", 60, 3);
        Witcher3PS4.addGenere("Open World RPG");
        Witcher3PS4.addTag("Story Righ");
        Witcher3PS4.addTag("Atmospheric");

        var Portal2 = new DigitalGame(8, "Portal 2",
              "The Perpetual Testing Initiative has been expanded to allow you to design co-op puzzles for you and your friends!",
              "Valve", "Single-Player / Co-op", 10, "PC", 20, "Steam");
        Portal2.addGenere("3D Platformer");
        Portal2.addGenere("Puzzle");
        Portal2.addTag("Steam Workshop");
        Portal2.addTag("Split Screen Co-op");

        // Defining the Hardware that will be selling
        // Defining game consoles
        var PS4 = new GameConsole(400, "Playstation 4 Slim",
                "Introducing the Playstation4 SLIM, 1TB hard drive, all greatest games, TV, music and more.",
                100, 0.5f, 2, "1080p");
        PS4.addFreeGame(Witcher3PS4);

        // Defining CPU's
        var i79700F = new Cpu(300, "i7 9700F", "9th generation 14 nm processor", 65,0.2f, 8,4.7f, 1151);
        var i99900k = new Cpu(600, "i9 9900k", "9th generation 14 nm processor", 95, 0.2f, 8, 3.6f, 1151);

        // Defining VideoCards
        var rtx2070Super = new VideoCard(700, "MSI GeForce RTX 2070 SUPER", "Play Hard Stay Silent with RTX 2070 SUPER from MSI", 200, 0.4f, 1770,8, 2, "8k");

        //System.out.println(i99900k);

        User uMihai = new User("Mihai");

        uMihai.addItemToCart(PS4);
        uMihai.addItemToCart(rtx2070Super);
        uMihai.addItemToCart(Portal2);

        System.out.println(uMihai.buy());

    }
}
