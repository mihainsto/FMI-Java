package zoo;

public class Zoo {

    private final int nrMaximAnimale;
    Animal[] animalZoo;
    private int indexCurent;
    public Zoo(int nrMaximAnimale) {
        if (nrMaximAnimale > 0) {
            this.nrMaximAnimale = nrMaximAnimale;
            this.animalZoo = new Animal[nrMaximAnimale];
        } else{
            throw new RuntimeException(
                    "Nu ati introdus un nr valid");
        }
    }

    public void adaugaAnimal(Animal animal){
        if (indexCurent < animalZoo.length){
           animalZoo[indexCurent++] = animal;
            System.out.println("Adaugat animal "
                    + animal.getClass().getSimpleName() + " la pozitia "
            + indexCurent);
        }
    }

}
