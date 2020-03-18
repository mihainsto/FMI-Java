package zoo.carnivor;

public class Pisica extends Carnivor{
    public void scoateSunet() {
        System.out.println("pisica " + sunetSpecific);
    }

    public Pisica(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "meow";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Pisica){
            Pisica pisica = (Pisica)obj;
            return pisica.getNume().equals(this.getNume());
        }
        return super.equals(obj);
    }
}
