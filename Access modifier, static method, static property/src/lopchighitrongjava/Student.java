package accessmodifier;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {

    }
    protected String getName() {
        return this.name;
    }
    protected String setName(String name) {
        return this.name = name;
    }

    protected String getClasses() {
        return this.classes;
    }
    protected String setClasses(String classes) {
        return this.classes = classes;
    }

}
