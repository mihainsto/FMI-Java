package zoo.omnivor;

public class Urs extends Omnivor {
    @Override
    public void scoateSunet() {
        System.out.println("Ursul " + sunetSpecific);

    }

    public Urs(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "mormaie";
    }
}
