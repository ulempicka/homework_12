package companyStatistics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PersonalInfo {
    private Employee[] employees;

    public void generateEmployees() {
        String fileName = "src\\companyStatistics\\employees.csv";
        employees = new Employee[4];

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            int i = 0;
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {

                String[] line = nextLine.split(";");
                employees[i] = new Employee(line[0], line[1], Integer.valueOf(line[2]), line[3], Integer.valueOf(line[4]));
                i++;
            }
            System.out.println("Ile pracownikow? " + i);
            System.out.println(Arrays.toString(employees));
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
