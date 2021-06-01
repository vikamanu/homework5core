package homework5core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderUsers {
    public static void main(String[] args) {

        List<User> users = new ArrayList();

        try (BufferedReader in =
                     new BufferedReader(
                             new FileReader("users.csv")
                     )) {

            String line = null;
            in.readLine();
            while ((line = in.readLine()) != null) {
                String[] tokens = line.split("\\s");
                User user = new User(tokens[0], tokens[1], tokens[2]);
                users.add(user);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (User user: users) {
            System.out.println(user);
        }
    }
}
