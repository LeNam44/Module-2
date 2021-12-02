package StringAndRegex.ValidateClassName;

public class Test {

    private static Classroom classroom;

    public static final String[] validName = new String[] {"C0318G", "A1234H", "P0496I"};
    public static final String[] invalidName = new String[] {"M0318G", "P0323A", "AxyzzH"};

    public static void main(String[] args) {
        classroom = new Classroom();
        for (String name : validName) {
            boolean isvalid = classroom.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = classroom.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
    }

}
