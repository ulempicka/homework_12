package companyStatistics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestStats {
    public static void main(String[] args) {
        String fileName = "src\\companyStatistics\\companyStats.txt";
        File newFile = new File(fileName);

        try (
                var fileWriter = new FileWriter(newFile);
                var bufferedWriter = new BufferedWriter(fileWriter)
        ) {
                bufferedWriter.write("Średnia wypłata: " );
                bufferedWriter.newLine();
                bufferedWriter.write("Najmniejsza wypłata: " );
                bufferedWriter.newLine();
                bufferedWriter.write("Największa wypłata: " );
                bufferedWriter.newLine();
                bufferedWriter.write("Łączna liczba pracowników: " );
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale IT: " );
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale Management:  " );
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale Support: " );

        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}

