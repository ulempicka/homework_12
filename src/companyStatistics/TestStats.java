package companyStatistics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestStats {
    public static void main(String[] args) {

        PersonalInfo personalInfo = new PersonalInfo(4);
        personalInfo.generateEmployees();
        Employee[] employees = personalInfo.getEmployees();

        CalculateStats calculateStats = new CalculateStats(employees);
        double avgSalary = calculateStats.avgSalary();
        double minSalary = calculateStats.minSalary();
        double maxSalary = calculateStats.maxSalary();
        calculateStats.employeeCountPerDept();

        String fileName = "src\\companyStatistics\\companyStats.txt";
        File newFile = new File(fileName);

        try (
                var fileWriter = new FileWriter(newFile);
                var bufferedWriter = new BufferedWriter(fileWriter)
        ) {
                bufferedWriter.write("Średnia wypłata: " + avgSalary);
                bufferedWriter.newLine();
                bufferedWriter.write("Najmniejsza wypłata: " + minSalary);
                bufferedWriter.newLine();
                bufferedWriter.write("Największa wypłata: " + maxSalary);
                bufferedWriter.newLine();
                bufferedWriter.write("Łączna liczba pracowników: " + employees.length);
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale IT: " + calculateStats.getCountIT());
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale Management:  " + calculateStats.getCountManage());
                bufferedWriter.newLine();
                bufferedWriter.write("Liczba pracowników w dziale Support: " + calculateStats.getCountSupport());

        } catch (IOException e) {
            System.err.println("nie mozna odczytac pliku");
        }
    }
}

