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

//    double minSalary() {
//        return Math.min();
//    }
//
//    double maxSalary() {
//        return Math.max();
//    }

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
