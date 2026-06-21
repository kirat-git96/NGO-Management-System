public class Beneficiary {
    private int id;
    private String name;
    private int age;
    private String program;

    public Beneficiary(int id, String name, int age, String program) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Age: " + age +
               ", Program: " + program;
    }
}