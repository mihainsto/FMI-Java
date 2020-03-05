import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        var ints = new int[2][];
        ints[0] = new int[]{3,5,7};
        ints[1] = new int[]{1,2,3,4,5};
        System.out.println(Arrays.hashCode(ints));

    }
}
