package accessmodifier;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Cena");
        student.setClasses("C09");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
