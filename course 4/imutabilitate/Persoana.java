package imutabilitate;

public final class Persoana {
      final int id;
      final String nume;
    public Persoana(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }
}
