package BaiTapVN;

public class Worker extends Employee{
    @Override
    public double getSumSalary() {
        return super.getSalary()*super.getWorkingDay();
    }

    public Worker(int id, String name, int age, String address, double workingDay, double salary) {
        super(id, name, age, address, workingDay, salary);
    }
}
