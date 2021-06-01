package homework5core;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamDemo {
    public static void main(String[] args) {
        File file = new File("./test_csv.txt");
        try(OutputStream out = new FileOutputStream(file, true)) {
            out.write(" I love Java; ".getBytes());
       } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
       }
        try(InputStreamReader in = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
           int x;
           while ((x = in.read()) != -1) {
               System.out.print((char) x);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
       } catch (IOException e) {
            e.printStackTrace();
        }
           try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String str = reader.readLine();
                System.out.println(str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
       }
    }




