public class Donation {
    private int donorId;
    private double amount;

    public Donation(int donorId, double amount) {
        this.donorId = donorId;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "Donor ID: " + donorId +
               ", Amount: Rs." + amount;
    }
}