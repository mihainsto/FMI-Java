package course_5;

public class VirtualCoffee {
    public static void prepareCup(Cup cup){
        cup.wash();
    }

    // static polymorphism
    // dynamic polymorphism
    public static void main(String[] args) {
        Cup cup = new Cup();
        prepareCup(cup);

        Cup coffeCup = new CoffeCup();
        prepareCup(coffeCup);

        Cup teaCup = new TeaCup();
        prepareCup(teaCup);
    }
}
