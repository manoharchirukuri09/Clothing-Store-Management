import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // --- Setup ---
        Scanner scanner = new Scanner(System.in);
        String name;
        double cost = 0;
        int continueShopping;

        // --- Welcome Message ---
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("\nHello " + name + ", welcome to our clothing store :)");
        System.out.println("$$-- The Discount Sale is Here! --$$\n");

        // --- Main Shopping Loop ---
        do {
            System.out.println("----------------------------------------");
            System.out.println("Please select an option:");
            System.out.println("1. MENS WEAR");
            System.out.println("2. WOMENS WEAR");
            System.out.println("3. KIDS WEAR");
            System.out.println("----------------------------------------");
            System.out.print("What do you like to shop for? ");
            int categoryChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left-over

            switch (categoryChoice) {

                // --- MEN'S WEAR ---
                case 1:
                    System.out.println("\n-- Men's Wear Options --");
                    System.out.println("1. Shirts");
                    System.out.println("2. Pants");
                    System.out.println("3. T-Shirts");
                    System.out.print("Enter your choice: ");
                    int itemChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (itemChoice) {
                        case 1: // Shirts
                            System.out.println("\nAvailable brands in Shirts:");
                            System.out.println("1. U.S. Polo - Rs. 1300");
                            System.out.println("2. Netplay - Rs. 1800");
                            System.out.print("Which brand? ");
                            int brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 1300;
                            else if (brandChoice == 2) cost += 1800;
                            else System.out.println("Invalid brand choice.");
                            break;
                        case 2: // Pants
                            System.out.println("\nAvailable brands in Pants:");
                            System.out.println("1. Pepe Jeans - Rs. 1000");
                            System.out.println("2. Classic Polo - Rs. 750");
                            System.out.print("Which brand? ");
                            brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 1000;
                            else if (brandChoice == 2) cost += 750;
                            else System.out.println("Invalid brand choice.");
                            break;
                        case 3: // T-Shirts
                            System.out.println("\nAvailable brands in T-Shirts:");
                            System.out.println("1. Puma - Rs. 700");
                            System.out.println("2. Highlander - Rs. 750");
                            System.out.print("Which brand? ");
                            brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 700;
                            else if (brandChoice == 2) cost += 750;
                            else System.out.println("Invalid brand choice.");
                            break;
                        default:
                            System.out.println("Invalid item choice.");
                            break;
                    }
                    break;

                // --- WOMEN'S WEAR ---
                case 2:
                    System.out.println("\n-- Women's Wear Options --");
                    System.out.println("1. Saree");
                    System.out.println("2. Chudidhar");
                    System.out.print("Enter your choice: ");
                    itemChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (itemChoice) {
                        case 1: // Saree
                            System.out.println("\nAvailable brands in Sarees:");
                            System.out.println("1. Kalamandir - Rs. 900");
                            System.out.println("2. Fabindia - Rs. 1050");
                            System.out.print("Which brand? ");
                            int brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 900;
                            else if (brandChoice == 2) cost += 1050;
                            else System.out.println("Invalid brand choice.");
                            break;
                        case 2: // Chudidhar
                            System.out.println("\nAvailable brands in Chudidhar:");
                            System.out.println("1. Biba - Rs. 600");
                            System.out.println("2. Libas - Rs. 1000");
                            System.out.print("Which brand? ");
                            brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 600;
                            else if (brandChoice == 2) cost += 1000;
                            else System.out.println("Invalid brand choice.");
                            break;
                        default:
                            System.out.println("Invalid item choice.");
                            break;
                    }
                    break;

                // --- KID'S WEAR ---
                case 3:
                    System.out.println("\n-- Kid's Wear Options --");
                    System.out.println("1. Shorts");
                    System.out.println("2. Sweaters");
                    System.out.print("Enter your choice: ");
                    itemChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (itemChoice) {
                        case 1: // Shorts
                            System.out.println("\nAvailable brands in Shorts:");
                            System.out.println("1. Breakbounce - Rs. 400");
                            System.out.println("2. Levi's - Rs. 700");
                            System.out.print("Which brand? ");
                            int brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 400;
                            else if (brandChoice == 2) cost += 700;
                            else System.out.println("Invalid brand choice.");
                            break;
                        case 2: // Sweaters
                            System.out.println("\nAvailable brands in Sweaters:");
                            System.out.println("1. Redtape - Rs. 700");
                            System.out.println("2. Peter England - Rs. 1300");
                            System.out.print("Which brand? ");
                            brandChoice = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (brandChoice == 1) cost += 700;
                            else if (brandChoice == 2) cost += 1300;
                            else System.out.println("Invalid brand choice.");
                            break;
                        default:
                            System.out.println("Invalid item choice.");
                            break;
                    }
                    break;

                default:
                    System.out.println("Invalid category choice. Please try again.");
                    break;
            }

            System.out.println("\nYour purchase cost so far is: Rs. " + cost);
            System.out.print("Do you want to buy anything more? (Enter 1 to continue, or any other number to checkout): ");
            continueShopping = scanner.nextInt();
            scanner.nextLine(); // Consume newline

        } while (continueShopping == 1);

        // --- Cancellation Option ---
        if (cost > 0) {
            System.out.print("Do you want to cancel any items? (Enter 1 for Yes, any other number for No): ");
            int cancelChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            while (cancelChoice == 1) {
                System.out.println("\n--- Item Cancellation ---");
                System.out.println("Current total cost: Rs. " + cost);
                System.out.println("Please select the category of the item you wish to cancel:");
                System.out.println("1. MENS WEAR");
                System.out.println("2. WOMENS WEAR");
                System.out.println("3. KIDS WEAR");
                System.out.print("Enter category choice to cancel from: ");
                int cancelCategory = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter the approximate price of the item you want to cancel: Rs. ");
                double cancelAmount = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                if (cost >= cancelAmount) {
                    cost -= cancelAmount;
                    System.out.println("Item costing Rs. " + cancelAmount + " has been cancelled.");
                    System.out.println("New total cost: Rs. " + cost);
                } else {
                    System.out.println("Cancellation failed. The amount to cancel exceeds the current total cost or no such item found.");
                }

                System.out.print("\nDo you want to cancel another item? (Enter 1 for Yes, any other number for No): ");
                cancelChoice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            }
        }


        // --- Final Billing ---
        if (cost > 0) {
            System.out.println("\n------------------- FINAL BILL -------------------");
            System.out.println("Total cost (before discount): Rs. " + cost);
            double finalBill = cost - (cost * 0.15); // 15% discount
            System.out.printf("Your bill after a 15%% discount is: Rs. %.2f\n", finalBill);

            System.out.println("\nWhich payment method do you prefer?");
            System.out.println("1. UPI method");
            System.out.println("2. Bank transfer");
            System.out.println("3. Credit/Debit/ATM card");
            System.out.print("Enter your choice: ");
            int paymentChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (paymentChoice) {
                case 1:
                    System.out.print("Please enter your UPI ID: ");
                    String upiId = scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Please enter your Bank Account Number: ");
                    String bankAccount = scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Please enter your Card Number: ");
                    String cardNumber = scanner.nextLine();
                    break;
                default:
                    System.out.println("Invalid payment option selected.");
            }
            System.out.println("\nThank you! Your payment has been processed successfully.");
        } else {
            System.out.println("\nYour cart is empty. No payment is required.");
        }

        System.out.println("\nThank you, " + name + ", for choosing us. Please visit again! 👋");
        System.out.println("------------------------------------------------\n");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
