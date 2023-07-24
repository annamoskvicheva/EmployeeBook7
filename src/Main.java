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

        printAll();
        System.out.println(sum());
        System.out.println(min());
        System.out.println(max());
        System.out.println(average());
        printAllNames();

    }
    private static  void printAll(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    private static double sum(){
        double sum = 0.0;
        for (Employee employee : employees){
            sum += employee.getSalary();
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
    private static Employee max (){
        Employee maxEmployee = employees[0];
        for (Employee employee : employees){
            if (employee.getSalary() > maxEmployee.getSalary()){
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }
    private static double average(){
        return sum() / employees.length;
    }
    private static  void printAllNames(){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
        }
    }
}