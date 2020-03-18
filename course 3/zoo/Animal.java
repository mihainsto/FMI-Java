package zoo;

public abstract class Animal {
    private int nrIdentificare;
    private String nume;
    private int varsta;
    protected String tipHrana;
    protected String sunetSpecific;

    public abstract void seHraneste();
    public abstract void scoateSunet();
    public void afiseazaDetalii(){
        System.out.println("Acesta este " + this.toString());
    };

    public Animal(String nume, int varsta){
        nrIdentificare = hashCode();
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Animal din categoria " + this.getClass().getSuperclass().getSimpleName() +
                " Animal{" +
                "nrIdentificare=" + nrIdentificare +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    public String getNume() {
        return nume;
    }
}
