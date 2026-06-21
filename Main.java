import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NGOManager ngo = new NGOManager();

        int choice;

        do {

            System.out.println("\n===== NGO MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Beneficiary");
            System.out.println("2. View Beneficiaries");
            System.out.println("3. Search Beneficiary");
            System.out.println("4. Add Donor");
            System.out.println("5. View Donors");
            System.out.println("6. Record Donation");
            System.out.println("7. View Donations");
            System.out.println("8. Generate Report");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Beneficiary ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String bname = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Program: ");
                    String program = sc.nextLine();

                    ngo.addBeneficiary(
                        new Beneficiary(bid, bname, age, program)
                    );
                    break;

                case 2:
                    ngo.viewBeneficiaries();
                    break;

                case 3:
                    System.out.print("Enter Beneficiary ID to search: ");
                    int searchId = sc.nextInt();
                    ngo.searchBeneficiary(searchId);
                    break;

                case 4:
                    System.out.print("Enter Donor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Donor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    ngo.addDonor(
                        new Donor(did, dname, email)
                    );
                    break;

                case 5:
                    ngo.viewDonors();
                    break;

                case 6:
                    System.out.print("Enter Donor ID: ");
                    int donorId = sc.nextInt();

                    System.out.print("Enter Donation Amount: ");
                    double amount = sc.nextDouble();

                    ngo.recordDonation(
                        new Donation(donorId, amount)
                    );
                    break;

                case 7:
                    ngo.viewDonations();
                    break;

                case 8:
                    ngo.generateReport();
                    break;

                case 9:
                    System.out.println("Thank you for using NGO Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 9);

        sc.close();
    }
}