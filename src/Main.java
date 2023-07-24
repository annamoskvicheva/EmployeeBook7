public class Main {
    private final static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees [0] = new Employee("ivanov ivan", 1, 10_000);
        employees [1] = new Employee("ivanov sasha", 2, 15_000);
        employees [2] = new Employee("ivanov arteb", 3, 20_000);
        employees [3] = new Employee("ivanova ivanca", 4, 25_000);
        employees [4] = new Employee("ivanoa ira", 5, 30_000);
        employees [5] = new Employee("petrov ivan", 1, 100_000);
        employees [6] = new Employee("petrov daniil", 2, 150_000);
        employees [7] = new Employee("petrova yana", 3, 200_000);
        employees [8] = new Employee("petrova nastiy", 4, 250_000);
        employees [9] = new Employee("petrova janna", 5, 300_000);


        //increaseSalary(50);
       // printAll();
        //System.out.println(sum());
        //System.out.println(min());
        //System.out.println(max());
        //System.out.println(average());
       // printAllNames();
        //System.out.println(average(6));
        printEmployeeWithSalaryLess(10000);
        System.out.println();
        printEmployeeWithSalaryMore(300000);
        System.out.println();
        System.out.println(sum(5));
        System.out.println(min(4));
        System.out.println(max(3));
        System.out.println(average(2));
        System.out.println();

        increaseSalary(50,1);
        printAll();
        System.out.println();

    }
    private static  void printAll(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    private static  void printAll(int department){
        for (Employee employee : employees){
            if (employee.getDepartment() == department) {
                System.out.println("name: " + employee.getFullName() + "salary: " + employee.getSalary());
            }
        }
    }
    private static double sum(){
        double sum = 0.0;
        for (Employee employee : employees){
            sum += employee.getSalary();
        }
        return sum;
    }
        private static double sum(int department){
            double sum = 0.0;
            for (Employee employee : employees){
                if (employee.getDepartment() == department) {
                    sum += employee.getSalary();
                }
            }
            return sum;
        }
    private static Employee min (){
        Employee minEmployee = employees[0];
        for (Employee employee : employees){
            if (employee.getSalary() < minEmployee.getSalary()){
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    private static Employee min (int department){
        Employee minEmployee = null;
        for (Employee employee : employees){
            if (employee.getDepartment() != department) {
                continue;
            }
            if (minEmployee == null || employee.getSalary() < minEmployee.getSalary()){
                minEmployee = employee;
            }
        }
        return minEmployee;
    }
    private static Employee max (){
        Employee maxEmployee = employees[0];
        for (Employee employee : employees){
            if (employee.getSalary() > maxEmployee.getSalary()){
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    private static Employee max (int department){
        Employee maxEmployee = null;
        for (Employee employee : employees){
            if (employee.getDepartment() != department) {
                continue;
            }
            if (maxEmployee == null || employee.getSalary() > maxEmployee.getSalary()){
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    private static double average(){
        return sum() / employees.length;
    }
    private static double average (int department){
        int count = 0;
        double sum = 0.0;
        for (Employee employee : employees){
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
    private static  void printAllNames(){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }
    private static void increaseSalary(double percent){
        for (Employee employee : employees){
            double addition = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + addition);
        }
    }
    private static void increaseSalary(double percent, int department){
        for (Employee employee : employees){
            if (employee.getDepartment() != department){
                continue;
            }
            double addition = employee.getSalary() / 100 * percent;
            employee.setSalary(employee.getSalary() + addition);
        }
    }
    private  static  void printEmployeeWithSalaryLess(double salary){
        for (Employee employee : employees){
            if (employee.getSalary() < salary){
                System.out.printf("id: %s, full_name: %s, salary: %s",
                        employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }
    private  static  void printEmployeeWithSalaryMore(double salary){
        for (Employee employee : employees){
            if (employee.getSalary() >= salary){
                System.out.printf("id: %s, full_name: %s, salary: %s",
                        employee.getId(), employee.getFullName(), employee.getSalary());
            }
        }
    }
}