public class Donor {
    private int id;
    private String name;
    private String email;

    public Donor(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Email: " + email;
    }
}