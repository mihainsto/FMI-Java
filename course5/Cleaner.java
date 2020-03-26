package course_5;


public class Cleaner {
    public static void cleanObject(Object object){
        if (object instanceof Car){
            Car car = (Car)object;
            car.wash();
        } else if (object instanceof Window){
            Window window = (Window) object;
            window.wash();
        } else if (object instanceof Cup){
            Cup cup = (Cup) object;
            cup.wash();
        } else if (object instanceof Dog){
            Dog dog = (Dog) object;
            dog.wash();
        } else{
            throw new RuntimeException("unsupported object type");
        }
    }
    public static void clean(WashableObject washableObject){
        washableObject.wash();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        cleanObject(dog);
        //clean(dog);

        CoffeCup cup = new CoffeCup();
        cleanObject(cup);
        //clean(cup);

        Car car = new Car();
        cleanObject(car);
        //clean(car);
    }
}
