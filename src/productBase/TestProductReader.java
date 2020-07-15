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
//                String name = nextLine.substring(0, nextLine.indexOf(";"));
//                System.out.println(name);
//                String producer = nextLine.substring(nextLine.indexOf(";")+1,nextLine.lastIndexOf(";"));
//                System.out.println(producer);
//                String priceS = name.substring(nextLine.indexOf(";"));
//                double price = Double.valueOf(priceS);
//                products[lines].setName(name);
//                products[lines].setProducer(producer);
//                products[lines].setPrice(price);

                String[] line = nextLine.split(";");
                System.out.println(Arrays.toString(line));
                products[i].setName(line[0]);
                System.out.println(products[i].getName());
                products[i].setProducer(line[1]);
                products[i].setPrice(Double.valueOf(line[2]));
                i++;
            }
            System.out.println(products);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
