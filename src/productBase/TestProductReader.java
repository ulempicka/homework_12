package productBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TestProductReader {
    public static void main(String[] args) {
        String fileName = "src\\productBase\\products.csv";
        Product[] products = new Product[3];

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int i = 0;
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {

                String[] line = nextLine.split(";");
                products[i] = new Product(line[0], line[1], Double.valueOf(line[2]));
                i++;
            }
            System.out.println(products[0].toString());         //1 sposob
            System.out.println(products[1].toString());
            System.out.println(products[2].toString());
            System.out.println(Arrays.toString(products));      //2 sposob
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
