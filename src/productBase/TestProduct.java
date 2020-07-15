package productBase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestProduct {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Czekolada", "Wedel", 3.5);
        products[1] = new Product("Mleko", "Mlekovita", 2);
        products[2] = new Product("Tost", "Oskroba", 5);

        String fileName = "src\\productBase\\products.csv";
        File newFile = new File(fileName);

        try (
                var fileWriter = new FileWriter(newFile);
                var bufferedWriter = new BufferedWriter(fileWriter)
        ){
            for (int i=0; i< products.length; i++) {
                bufferedWriter.write(products[i].getName() + ";" + products[i].getProducer() + ";" + products[i].getPrice());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
