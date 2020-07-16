package companyStatistics;

public class CalculateStats {
    Employee[] employees;
    private static final String DEPT_MANAGE = "Management";
    private static final String DEPT_IT = "it";
    private static final String DEPT_SUPPORT = "Support";
    int countManage = 0;
    int countIT = 0;
    int countSupport = 0;

    public CalculateStats(Employee[] employees) {
        this.employees = employees;
    }

    public double avgSalary() {
        double sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary / employees.length;
    }

    public double minSalary() {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if(employee.getSalary() < minSalary){
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public double maxSalary() {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if(employee.getSalary() > maxSalary){
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public void employeeCountPerDept() {
        for (Employee employee : employees) {
            if(employee.getDepartment().equals(DEPT_MANAGE)){
                countManage++;
            }
            if(employee.getDepartment().equals(DEPT_IT)){
                countIT++;
            }
            if(employee.getDepartment().equals(DEPT_SUPPORT)){
                countSupport++;
            }

        }
    }
}
