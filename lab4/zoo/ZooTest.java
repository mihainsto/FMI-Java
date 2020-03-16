package zoo;

import zoo.carnivor.Leu;
import zoo.carnivor.Pisica;
import zoo.irebivor.Cal;
import zoo.irebivor.Elefant;
import zoo.omnivor.Caine;

import java.util.Scanner;

public class ZooTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Precizati nr maxim de animale:");
        int nrAnimaleZoo = scanner.nextInt();
        scanner.close();

        Zoo zooBucuresti = new Zoo(nrAnimaleZoo);
        var leu = new Leu("Simba", 7);
        zooBucuresti.adaugaAnimal(leu);
        var Elefant = new Elefant("Fram", 4);
        zooBucuresti.adaugaAnimal(Elefant);
        var pisica = new Pisica("Tom", 2);
        zooBucuresti.adaugaAnimal(pisica);
        var caine = new Caine("toto", 3);
        zooBucuresti.adaugaAnimal(caine);
        var cal = new Cal("Thuder", 3);
        zooBucuresti.adaugaAnimal(cal);

        for (int i=0; i<zooBucuresti.animalZoo.length &&
                zooBucuresti.animalZoo[i]!=null; i++){
            Animal animal = zooBucuresti.animalZoo[i];
            animal.afiseazaDetalii();
            animal.seHraneste();
            animal.scoateSunet();
        }

        var pisica1 = new Pisica("Tom", 3);
        var pisica2 = new Pisica("Tom", 3);
        System.out.println(pisica1.equals(pisica2));
    }


}
