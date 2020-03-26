package course_5;

public class Ex2 {
    public static void washIfPossible(Washable washable){
        if (washable.needsWashing()){
            washable.wash();
        }
    }

    public static void main(String[] args) {
        var car = new Car();
        washIfPossible(car);
    }
}
