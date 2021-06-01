package homework5core;

import java.io.File;
import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        File file = new File("./users.csv");
        System.out.println();
        file.createNewFile();
    }
}
