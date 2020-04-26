package dataPersistance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CSVWriter {
    private static CSVWriter single_instance = null;

    private File file;
    private FileWriter writer;
    private String path = "./src/data/";

    private CSVWriter(String filename) throws IOException {
        file = new File(path + filename);
        if (file.exists()){
            writer = new FileWriter(file, true);
        }
        else{
            file.createNewFile();
            writer = new FileWriter(file, true);
        }
    }

    public static CSVWriter getInstance(String filename) throws IOException {
        if (single_instance == null)
            single_instance = new CSVWriter(filename);
        return single_instance;
    }
    public void changeFile(String filename) throws IOException {
        file = new File(path + filename);
        if (file.exists()){
            writer = new FileWriter(file, true);
        }
        else{
            file.createNewFile();
            writer = new FileWriter(file, true);
        }
    }
    public void write(List<String> header) throws IOException {
        header.forEach((h) ->
        {
            try {
                writer.append(h+",");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.append("\n");
        writer.flush();
    }


}
