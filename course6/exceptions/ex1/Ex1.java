package exceptions.ex1;

public class Ex1 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("finally");
        }
    }

    static void m1(){
        System.out.println("in m1");
        m2();
    }
    static void m2(){
        System.out.println("in m2");
        throw new RuntimeException("exception in m2");
        //m3();
    }
    static void m3(){
        System.out.println("in m3");
        // throws NPE
        Object o = null;
        o.toString();
    }

}
