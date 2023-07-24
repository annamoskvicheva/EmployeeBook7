public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add(new Employee("ivanov ivan", 1, 10_000));
        employeeBook.add(new Employee("ivanov sasha", 2, 15_000));
        employeeBook.add(new Employee("ivanov arteb", 3, 20_000));
        employeeBook.add(new Employee("ivanova ivanca", 4, 25_000));
        employeeBook.add(new Employee("ivanoa ira", 5, 30_000));
        employeeBook.add(new Employee("petrov ivan", 1, 100_000));
        employeeBook.add(new Employee("petrov daniil", 2, 150_000));
        employeeBook.add(new Employee("petrova yana", 3, 200_000));
        employeeBook.add(new Employee("petrova nastiy", 4, 250_000));
        employeeBook.add(new Employee("petrova janna", 5, 300_000));


        employeeBook.remove("ivanov ivan");
        employeeBook.updateSalary("ivanov sasha", 20000);
        employeeBook.updateDepartment("ivanova ivanca", 1);
        employeeBook.printAll();
        employeeBook.max(1);
        System.out.println(employeeBook.average());
        employeeBook.groupByDepartment();



    }

}