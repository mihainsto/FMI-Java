import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        char[] chars = {'a', 'b', 'c', 'd'};

        for(var c : chars){
            System.out.println(c);
        }
        var x = 5;
        System.out.println(chars);

        var m = new int[5][5];

        m[3][4] = 7;

        System.out.println(m[3][4]);

        for(var i: m){
            for (var j:i){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        var ints = new int[]{23, 35, 12, 14};

        System.out.println(Arrays.toString(ints));

        char[][] ar2dchar = {{'c'}, {'a', 'b'}};
        for(var i: ar2dchar){
            for (var j:i){
                System.out.print(j);
            }
            System.out.print("\n");
        }

        var intm = new int[3][];

        intm[0] = new int[2];
        intm[0][0] = 1;
        intm[0][1] = 2;
        intm[1] = new int[]{4, 6, 67};
        intm[2] = new int[]{1, 2, 3, 4, 5, 6};
        displayArrayValues(intm);

        var y = new int[]{1,2,3};
        var z = new int[]{4,5,6};
        z = y.clone();
        System.out.println(Arrays.toString(z));
        System.arraycopy(ints, 0, z, 0, 3);
        System.out.println(Arrays.toString(z));


    }


    private static void displayArrayValues(int[][] arr){
        for(var i: arr){
            for (var j:i){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }


}
