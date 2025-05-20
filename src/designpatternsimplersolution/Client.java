/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatternsimplersolution;
import java.util.Scanner;

/**
 *
 * @author johnp
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);  
        Fries fries = null;

        System.out.println("Welcome to French King Fries!");

        System.out.println("Select Fries Size:");
        System.out.println("1. Small");
        System.out.println("2. Medium");
        System.out.println("3. Large");
        int sizeChoice = scanner.nextInt();

        System.out.println("\nSelect Sauce Option:");
        System.out.println("1. No Sauce");
        System.out.println("2. Ketchup");
        System.out.println("3. Chili Sauce");
        System.out.println("4. Ketchup and Chili Sauce");
        int sauceChoice = scanner.nextInt();

       
        switch (sizeChoice) {
            case 1: 
                switch (sauceChoice) {
                    case 1:
                        fries = new SmallFries();
                        break;
                    case 2:
                        fries = new SmallFriesWithKetchup();
                        break;
                    case 3:
                        fries = new SmallFriesWithChiliSauce();
                        break;
                    case 4:
                        fries = new SmallFriesWithKetchupAndChiliSauce();
                        break;
                    default:
                        System.out.println("Invalid sauce option. No sauce added.");
                        fries = new SmallFries();
                }
                break;

            case 2: 
                switch (sauceChoice) {
                    case 1:
                        fries = new MediumFries();
                        break;
                    case 2:
                        fries = new MediumFriesWithKetchup();
                        break;
                    case 3:
                        fries = new MediumFriesWithChiliSauce();
                        break;
                    case 4:
                        fries = new MediumFriesWithKetchupAndChiliSauce();
                        break;
                    default:
                        System.out.println("Invalid sauce option. No sauce added.");
                        fries = new MediumFries();
                }
                break;

            case 3: 
                switch (sauceChoice) {
                    case 1:
                        fries = new LargeFries();
                        break;
                    case 2:
                        fries = new LargeFriesWithKetchup();
                        break;
                    case 3:
                        fries = new LargeFriesWithChiliSauce();
                        break;
                    case 4:
                        fries = new LargeFriesWithKetchupAndChiliSauce();
                        break;
                    default:
                        System.out.println("Invalid sauce option. No sauce added.");
                        fries = new LargeFries();
                }
                break;

            default:
                System.out.println("Invalid size option. Defaulting to Small Fries without sauce.");
                fries = new SmallFries();
        }

        fries.prepareFries();
        fries.setSize(1); 

        double price = fries.price();
        System.out.println("Total Price: RM" + String.format("%.2f", price));

        
        System.out.println("\nSelect Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Online Banking");
        scanner.nextLine(); 
        int paymentChoice = scanner.nextInt();
        scanner.nextLine(); 

        Payment paymentMethod = null;
        switch (paymentChoice) {
            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = scanner.nextLine();
                paymentMethod = new CreditCardPayment(fries.price(), cardNumber); 
                break;
            case 2:
                System.out.print("Enter Bank Account Number: ");
                String bankAccount = scanner.nextLine();
                paymentMethod = new OnlineBankingPayment(fries.price(), bankAccount); 
                break;
            default:
                System.out.println("Invalid payment method. Defaulting to Credit Card.");
                paymentMethod = new CreditCardPayment(fries.price(), "0000-0000-0000-0000"); 
        }

        paymentMethod.makePayment();
        scanner.close();
    }
    
}
