package BaiTapVN;

import java.util.Scanner;

public class EmployeeController {
    static Employee[] listNV = new Employee[0];
    static Scanner scanner = new Scanner(System.in);

    public static Employee createEmployee(boolean isEngineer) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double workingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isEngineer) {
            Worker worker = new Worker(id, name, age, address, workingDay, salary);
            return worker;
        } else {
            System.out.println("Nhập payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            Engineer engineer = new Engineer(id, name, age, address, workingDay, salary, payRateSalary);
            return engineer;
        }
    }

    public static void addEmployee(Employee employee) {
        Employee[] newArrNV = new Employee[listNV.length + 1];
        for (int i = 0; i < listNV.length; i++) {
            newArrNV[i] = listNV[i];
        }
        newArrNV[listNV.length] = employee;

        listNV = newArrNV;
    }

    public static void showEmployee(int choice) {
        if (choice == 1) {
            for (Employee nv : listNV) {
                if (nv instanceof Worker) {
                    System.out.println(nv.toString());
                }
            }
        } else if (choice == 2) {
            for (Employee nv : listNV) {
                if (nv instanceof Engineer) {
                    System.out.println(nv.toString());
                }
            }
        }
    }

    public static void searchEmployee(Employee[] listNV) {
        System.out.println("Điền tên nhân viên: ");
        String name = scanner.nextLine();

        boolean check = false;

        for (int i = 0; i < listNV.length; i++) {
            if (name.equals(listNV[i].getName())) {
                System.out.println(listNV[i]);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên");
        }
    }

    public static Employee[] deleteEmployee(Employee[] listNV) {
        System.out.println("Điền id nhân viên muốn xóa: ");
        int id = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < listNV.length; i++) {
            if (id == listNV[i].getId()) {
                index = i;
                break;
            }
        }

        Employee[] newEmployee = new Employee[listNV.length - 1];

        for (int i = index; i < listNV.length - 1; i++) {
            listNV[i] = listNV[i + 1];
        }

        for (int i = 0; i < newEmployee.length; i++) {
            newEmployee[i] = listNV[i];
        }

        for (Employee x : newEmployee) {
            System.out.println(x.toString());
        }
        return newEmployee;
    }

    public static void showAllEmployee() {
        for (Employee employee : listNV) {
            System.out.println(employee);
        }
    }
}
