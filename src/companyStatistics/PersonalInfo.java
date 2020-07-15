package companyStatistics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonalInfo {
    private Employee[] employees;

    public void generateEmployees() {
        String fileName = "src\\companyStatistics\\employees.csv";
        employees = new Employee[4];

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int lines = 0;          //tutaj zczytanie z pliku wartosci do tablicy
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ile linijek? " + lines);
        }catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }

        }
    }
