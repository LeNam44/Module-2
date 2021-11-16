package Test16th11;

public class Employee {
    private int id;
    private String name;
    private String phoneNumber;
    private String address;
    private static int idNumber;

    public Employee() {
    }

    public Employee(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        id = ++idNumber;
    }

    public int getId() {
        return id;
    }
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id = " + id
                + ", Ten: " + name
                + ", Dia chi: " + address
                + ", So dien thoai: " + phoneNumber
                + "}";
    }
}
