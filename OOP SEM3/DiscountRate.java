/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discountrate;

/**
 *
 * @author User
 */
/*import java.util.Scanner; // Import class for user input

public class DiscountRate {

    public static void main(String[] args) {
        // Declare variable
        String itemName; 
        double price, totalPrice, discountRate, discountPrice;  
        int quantity; 

        Scanner out = new Scanner(System.in); // Create object for input

        // User enter item name
        System.out.print("Enter item name: ");
        itemName = out.nextLine(); // Read item name input

        // User enter price per item
        System.out.print("Enter price per item: RM");
        price = out.nextDouble(); // Read price per item input

        // User enter quantity
        System.out.print("Enter quantity: ");
        quantity = out.nextInt(); // Read quantity input

        // Display menu of discount rates based on color codes
        System.out.println("\nChoose a discount rate from the color code menu:");
        System.out.println("1. Red ");
        System.out.println("2. Blue ");
        System.out.println("3. Green ");
        System.out.println("4. Yellow ");
        System.out.println("5. Purple");

        // user need to choose a color code
        System.out.print("Enter your choice (1/2/3/4/5): ");
        int choice = out.nextInt(); // Read user's choice

        // Determine the discount rate based on user's choice
        switch (choice) {
            case 1:
                discountRate = 10.0;
                break;
            case 2:
                discountRate = 15.0;
                break;
            case 3:
                discountRate = 20.0;
                break;
            case 4:
                discountRate = 25.0;
                break;
            case 5:
                discountRate = 0.0;
                break;
            default:
                System.out.println("Invalid choice. No discount applied.");
                discountRate = 0.0;
                break;
        }

        // Calculate total price before discount
        totalPrice = price * quantity;

        // Calculate discount amount
        double discountAmount = totalPrice * (discountRate / 100);

        // Calculate price after discount
        discountPrice = totalPrice - discountAmount;

        // Output item details
        System.out.println("\nItem Details:");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: RM" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price before Discount: RM" + totalPrice);
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after Discount: RM" + discountPrice);

        // Close object
        out.close();
    }
}
*/