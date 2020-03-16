package zoo.irebivor;

public class Cal extends Ierbivor {
    @Override
    public void scoateSunet() {
        System.out.println("Calul " + sunetSpecific);

    }

    public Cal(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "necheza";
    }
}
