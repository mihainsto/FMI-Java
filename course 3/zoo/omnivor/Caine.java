package zoo.omnivor;

public class Caine extends Omnivor {
    @Override
    public void scoateSunet() {
        System.out.println("Cainele " + sunetSpecific);

    }

    public Caine(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "latra";
    }
}
