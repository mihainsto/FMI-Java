package zoo.irebivor;

public class Elefant extends Ierbivor {

    @Override
    public void scoateSunet() {
        System.out.println("Elefantul " + sunetSpecific);

    }

    public Elefant(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "trambiteaza";
    }
}
