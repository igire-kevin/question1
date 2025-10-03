import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",};
            BufferedWriter writer = new BufferedWriter(new FileWriter("writer.txt"));
            writer.write("Igire");
            writer.write("\n Igire organization");
            for (String day : days) {
                writer.write("\n "+day);
            }
            writer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\readerExample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}