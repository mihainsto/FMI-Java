package exceptions.ex1;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e){
            e.printStackTrace();
        } catch (NoSuchElementException e){
            System.out.println(e);
        }
        int a,b;
        Scanner scanner  = new Scanner("test.txt");
        a = scanner.nextInt();
        b = scanner.nextInt();
        double result = a / b;
        System.out.println(result);
        scanner.close();
    }

    static void createFile() throws IOException {
        File file = new File("text.txt");
        if (file.createNewFile()){
            System.out.println("File Created");
        }else {
            System.out.println("file already exists");
        }
    }
}
