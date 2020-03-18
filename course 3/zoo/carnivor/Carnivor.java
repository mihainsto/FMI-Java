package zoo.carnivor;

import zoo.Animal;

public abstract class Carnivor extends zoo.Animal {
    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu "
                + this.tipHrana);
    }

    public Carnivor(String nume, int varsta){
        super(nume, varsta);
        this.tipHrana = "carne";
    }

}
