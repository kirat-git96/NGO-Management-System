import java.util.ArrayList;

public class NGOManager {

    private ArrayList<Beneficiary> beneficiaries;
    private ArrayList<Donor> donors;
    private ArrayList<Donation> donations;

    public NGOManager() {
        beneficiaries = new ArrayList<Beneficiary>();
        donors = new ArrayList<Donor>();
        donations = new ArrayList<Donation>();
    }

    public void addBeneficiary(Beneficiary b) {
        beneficiaries.add(b);
        System.out.println("Beneficiary added successfully.");
    }

    public void viewBeneficiaries() {
        if (beneficiaries.isEmpty()) {
            System.out.println("No beneficiaries found.");
            return;
        }

        for (Beneficiary b : beneficiaries) {
            System.out.println(b);
        }
    }

    public void searchBeneficiary(int id) {
        for (Beneficiary b : beneficiaries) {
            if (b.getId() == id) {
                System.out.println("Beneficiary Found:");
                System.out.println(b);
                return;
            }
        }

        System.out.println("Beneficiary not found.");
    }

    public void addDonor(Donor d) {
        donors.add(d);
        System.out.println("Donor added successfully.");
    }

    public void viewDonors() {
        if (donors.isEmpty()) {
            System.out.println("No donors found.");
            return;
        }

        for (Donor d : donors) {
            System.out.println(d);
        }
    }

    public void recordDonation(Donation d) {
        donations.add(d);
        System.out.println("Donation recorded successfully.");
    }

    public void viewDonations() {
        if (donations.isEmpty()) {
            System.out.println("No donations recorded.");
            return;
        }

        for (Donation d : donations) {
            System.out.println(d);
        }
    }

    public void generateReport() {

        double totalDonation = 0;

        for (Donation d : donations) {
            totalDonation += d.getAmount();
        }

        System.out.println("\n===== NGO REPORT =====");
        System.out.println("Total Beneficiaries : " + beneficiaries.size());
        System.out.println("Total Donors        : " + donors.size());
        System.out.println("Total Donations     : Rs." + totalDonation);
        System.out.println("======================");
    }
}