package Test16th11;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Nam", "Ha noi", "0987654321");
        employees[1] = new Employee("Nu", "Ha noi", "0123456789");
        EmployeeController.controller(employees);
    }
}
