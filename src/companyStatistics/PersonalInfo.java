package companyStatistics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PersonalInfo {
    private Employee[] employees;
    int i = 0;

    public PersonalInfo(int length) {
        this.employees = new Employee[length];      //czy zamiast length mozna tu przeslac i?
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void generateEmployees() {
        String fileName = "src\\companyStatistics\\employees.csv";
        employees = new Employee[4];

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader)
        ) {
            String nextLine = "";
            while ((nextLine = bufferedReader.readLine()) != null) {

                String[] line = nextLine.split(";");
                employees[i] = new Employee(line[0], line[1], Double.valueOf(line[2]), line[3], Double.valueOf(line[4]));
                System.out.println(employees[i].toString());
                i++;
            }
            System.out.println("Ile pracownikow? " + i);
        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}
