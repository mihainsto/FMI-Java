package asociere;

public class Main {
    public static void main(String[] args) {

        var profesorPrincipalMate = new Profesor(1, "Popescu");
        var profesorSecundarMate = new Profesor(2, "Ionescu");
        var profesorInfo = new Profesor(3, "Anghel");
        var profesorMateSiInfo = new Profesor(4, "Petrescu");
        var profesorInfoSiMate = new Profesor(5, "Andrei");

        var info = new Departament("info");
        info.setProfesori(new Profesor[]{profesorInfo, profesorInfoSiMate, profesorMateSiInfo});
        var mate = new Departament("mate");
        mate.setProfesori(new Profesor[]{profesorPrincipalMate, profesorSecundarMate, profesorInfoSiMate, profesorMateSiInfo});

        var unibuc = new Universitate("UNIBUC", new Departament[]{info, mate});
        info = null;
        System.out.println(unibuc);
        System.out.println(mate);
        mate.getProfesori()[1] = null;
        System.out.println(mate);
    }
}
