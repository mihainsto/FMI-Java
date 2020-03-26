package course_5;

public interface Washable {
    // public static final
    int IMPERVIOUS = 0;
    int RESISTANT = 1;
    int FRAGILE = 2;
    int EXPLOSIVE = 3;
    // public abstract
    void wash();

    default boolean needsWashing(){
        System.out.println("by default wash everything");
        return true;
    }
}
