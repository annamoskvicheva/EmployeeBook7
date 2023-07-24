public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public void add (Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null) {
                employees [i] = employee;
                break;
            }
        }
    }
    public void remove (String fullName){
        for (int i = 0; i < employees.length; i ++){
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getFullName().equalsIgnoreCase(fullName)){
                employees[i] = null;
                break;
            }
        }
    }
    public  void updateSalary (String fullName, double newSalary){
        for (Employee employee : employees){
            if (employee == null){
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)) {
                employee.setSalary(newSalary);
                break;
            }
        }
    }
    public  void updateDepartment (String fullName, int department){
        for (Employee employee : employees){
            if (employee == null){
                continue;
            }
            if (employee.getFullName().equalsIgnoreCase(fullName)){
                employee.setSalary(department);
                break;
            }
        }
    }
    public void printAll(){
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            System.out.println(employee);
        }
    }
    public void printAll(int department){
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println("name: " + employee.getFullName() + "salary: " + employee.getSalary());
            }
        }
    }
    public double sum(){
        double sum = 0.0;
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }
    public double sum(int department){
        double sum = 0.0;
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public Employee min (){
        Employee minEmployee = employees[0];
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getSalary() < minEmployee.getSalary()){
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public Employee min (int department){
        Employee minEmployee = null;
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()){
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    public Employee max (){
        Employee maxEmployee = employees[0];
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getSalary() > maxEmployee.getSalary()){
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    public Employee max (int department){
        Employee maxEmployee = null;
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getDepartment() != department) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()){
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    public double average(){
        int count = 0;
        double sum = 0.0;
        for (Employee employee : employees){
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
            count++;
        }
        if (count == 0){
            return -1;
        }
        return  sum / count;
    }
    public double average (int department){
        int count = 0;
        double sum = 0.0;
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            if (employee.getDepartment() == department){
                sum += employee.getSalary();
                count++;
            }
        }
        if (count == 0){
            throw new RuntimeException("сотрудников нет");
        }
        return  sum / count;
    }
    public void printAllNames(){
        for (Employee employee : employees){
            if ( employee == null){
                continue;
            }
            System.out.println(employee.getFullName());
        }
    }
    public void printAllNames(int department) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName());
            }
        }
    }
        public void increaseSalary( double percent) {
            for (Employee employee : employees) {
                if (employee == null) {
                    continue;
                }
                double addition = employee.getSalary() / 100 * percent;
                employee.setSalary(employee.getSalary() + addition);
            }
        }
        public void increaseSalary ( double percent, int department){
            for (Employee employee : employees) {
                if (employee == null) {
                    continue;
                }
                if (employee.getDepartment() != department) {
                    continue;
                }
                double addition = employee.getSalary() / 100 * percent;
                employee.setSalary(employee.getSalary() + addition);
            }
        }
        public void printEmployeeWithSalaryLess ( double salary){
            for (Employee employee : employees) {
                if (employee == null) {
                    continue;
                }
                if (employee.getSalary() < salary) {
                    System.out.printf("id: %s, full_name: %s, salary: %s",
                            employee.getId(), employee.getFullName(), employee.getSalary());
                }
            }
        }
        public void printEmployeeWithSalaryMore ( double salary){
            for (Employee employee : employees) {
                if (employee == null) {
                    continue;
                }
                if (employee.getSalary() >= salary) {
                    System.out.printf("id: %s, full_name: %s, salary: %s",
                            employee.getId(), employee.getFullName(), employee.getSalary());
                }
            }
        }



        public void groupByDepartment() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Сотрудники из отдела" + i);
                printAllNames(i);
            }
        }

}
