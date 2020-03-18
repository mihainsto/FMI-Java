package zoo.irebivor;

public abstract class Ierbivor extends zoo.Animal{
    @Override
    public void seHraneste() {
        System.out.println(this + "se hraneste cu "
                + this.tipHrana);
    }

    public Ierbivor(String nume, int varsta) {
        super(nume, varsta);
        this.tipHrana = "vegetatie";
    }
}
