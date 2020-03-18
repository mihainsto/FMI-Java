package candy;

public class test {

    public static void main(String[] args) {
        var c = new CandyBox("Chocolate", "Vanilla");
        System.out.println(c.toString());

        var mlka = new Milka("Chocolate", "Chocolate");
        System.out.println(mlka.toString());

        var bag = new CandyBag(3);
        bag.addCandy(c);
        bag.addCandy(mlka);

        System.out.println(bag.toString());
    }
}
