package productBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestProductReader {
    public static void main(String[] args) {
        String fileName = "src\\productBase\\products.csv";
        Product[] products = new Product[3];

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int lines = 0;
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ile linijek? " + lines);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
