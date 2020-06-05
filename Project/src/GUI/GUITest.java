package GUI;

import dataPersistance.Audit;

public class GUITest {
    public static void main(String[] args) {
        try {
            Audit a = Audit.getInstance();
            a.log("Started execution of GUITest");
        } catch(Exception e){
            System.out.println(e);
        }
        GUIWindow window = new GUIWindow();
        window.runGui();
        //window.testGet();
    }
}
