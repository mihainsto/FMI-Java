package zoo.omnivor;

public abstract class Omnivor extends zoo.Animal{
    @Override
    public void seHraneste() {
        System.out.println(this + "se hraneste cu "
                + this.tipHrana);
    }

    public Omnivor(String nume, int varsta) {
        super(nume, varsta);
        this.tipHrana = "carne si vegetatie";
    }
}
