package dataPersistance;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    private String path = "./src/data/";
    private static CSVReader single_instance = null;
    private File file;
    private FileReader reader;
    private BufferedReader br;

    public static CSVReader getInstance(String filename) throws IOException {
        if (single_instance == null)
            single_instance = new CSVReader(filename);
        return single_instance;

    }
    private CSVReader(String filename) throws IOException {
        file = new File(path + filename);
        br = new BufferedReader((new FileReader(path + filename))) ;
    }

    public void changeFile(String filename) throws IOException{
        file = new File(path + filename);
        br = new BufferedReader((new FileReader(path + filename))) ;
    }
    public List<String> readLine() throws IOException {
        String line = "";
        List<String> values = new ArrayList<>();

        while((line = br.readLine()) != null){
            var l = line.split(",");
            values.addAll(Arrays.asList(l));
            break;
        }
        return values;
    }
}
