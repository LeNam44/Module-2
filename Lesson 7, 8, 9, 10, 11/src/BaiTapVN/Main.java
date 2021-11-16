package BaiTapVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa nhân viên");
            System.out.println("5.Hiển thị nhân viên");
            System.out.println("6.Sắp xếp nhân viên");
            System.out.println("7.Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            Employee employee = EmployeeController.createEmployee(false);
                            EmployeeController.addEmployee(employee);
                            break;
                        case 2:
                            Employee engineer = EmployeeController.createEmployee(true);
                            EmployeeController.addEmployee(engineer);
                            break;
                    }
                    break;
                case 2:
                    EmployeeController.searchEmployee(EmployeeController.listNV);
                    break;
                case 3:
                    EmployeeController.deleteEmployee(EmployeeController.listNV);
                    break;
                case 5:
                    System.out.println("1. Worker");
                    System.out.println("2. Engineer");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            EmployeeController.showEmployee(1);
                            break;
                        case 2:
                            EmployeeController.showEmployee(2);
                            break;
                    }
                    break;
            }
        }

    }
}
