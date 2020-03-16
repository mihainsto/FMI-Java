package zoo.carnivor;

public class Leu extends Carnivor {
    @Override
    public void scoateSunet() {
        System.out.println("leul" + sunetSpecific);
    }

    public Leu(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "rage";
    }
}
