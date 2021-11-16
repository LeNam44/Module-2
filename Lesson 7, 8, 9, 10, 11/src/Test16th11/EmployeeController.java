package Test16th11;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeController {

    static Scanner scanner = new Scanner(System.in);

    public static void controller(Employee[] employees) {
        while (true) {
            System.out.println("Quan ly nhan vien:");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Xoa nhan vien");
            System.out.println("3. Hien thi nhan vien");
            System.out.println("4. Sua nhan vien");
            System.out.println("5. Tim nhan vien theo ID");
            System.out.println("6. Thoat");
            System.out.println("Chon thao tac:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    employees = addEmployee(employees);
                    break;
                case 2:
                    employees = deleteById(employees);
                    break;
                case 3:
                    showEmployee(employees);
                    break;
                case 4:
                    editEmployeeInfor(employees);
                    break;
                case 5:
                    searchEmployeeById(employees);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    public static Employee createEmployee() {
        System.out.println("Nhap ten nhan vien: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi nhan vien: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so dien thoai nhan vien: ");
        String phoneNumber = scanner.nextLine();
        return new Employee(name, address, phoneNumber);
    }

    public static Employee[] addEmployee(Employee[] employees) {
        Employee[] newEmployeesList = new Employee[employees.length + 1];
        System.arraycopy(employees, 0, newEmployeesList, 0, employees.length);
        newEmployeesList[employees.length] = createEmployee();
        return newEmployeesList;
    }

    public static Employee[] deleteById(Employee[] employees) {
        System.out.println("Nhap id nhan vien can xoa:");
        int id = scanner.nextInt();
        boolean hasSameId = false;
        for (Employee employee: employees) {
            if (id == employee.getId()) {
                hasSameId = true;
                break;
            }
        }
        if (!hasSameId) {
            return employees;
        } else {
            Employee[] newEmployeesList = new Employee[employees.length - 1];
            int newID = 0;
            for (Employee employee : employees) {
                if (hasSameId) {
                    newEmployeesList[newID] = employee;
                    newID++;
                }
            }
            return newEmployeesList;
        }
    }

    public static void searchEmployeeById(Employee[] employees) {
        System.out.println("Nhap Id nhan vien can tim");
        int id = scanner.nextInt();
        for (Employee employee: employees) {
            if (id == employee.getId()) {
                System.out.println(employee);
            } else {
                System.out.println("Khong tim thay nhan vien nay");
            }
        }
    }

    public static void editEmployeeInfor(Employee[] employees) {
        System.out.println("Nhap id cua nhan vien muon sua");
        int id = scanner.nextInt();
        for (Employee employee: employees) {
            if (id == employee.getId()) {
                employee = createEmployee();
            }
        }
    }

    public static void showEmployee(Employee[] employees) {
        System.out.println(Arrays.toString(employees));
    }
}
