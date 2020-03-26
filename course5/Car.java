package course_5;

public class Car implements Washable, Soakable {
    public void wash(){
        System.out.println("washing a car");
    }

    @Override
    public void soak() {
        System.out.println("car sitting in the sun");
    }
}
