package dataPersistance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;


public class Audit {
    private static Audit single_instance = null;

    private File file;
    private FileWriter writer;
    private String path = "./src/data/";
    private String filename = "log.csv";
    private Audit() throws IOException {
        file = new File(path + filename);
        if (file.exists()){
            writer = new FileWriter(file, true);
        }
        else{
            file.createNewFile();
            writer = new FileWriter(file, true);
        }
    }

    public static Audit getInstance() throws IOException {
        if (single_instance == null)
            single_instance = new Audit();
        return single_instance;
    }

    public void log(String what) throws IOException{
        Thread currentThread = Thread.currentThread();
        String stringLog = (LocalDateTime.now().toString()) + "," + currentThread.getName()+ "," + what;
        writer.append(stringLog);
        writer.append("\n");
        writer.flush();
    }


}
