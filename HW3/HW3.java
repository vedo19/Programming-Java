/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // CashPayment objects
        System.out.println("Enter cash payment amounts:");
        double cashPayment1 = scanner.nextDouble();
        double cashPayment2 = scanner.nextDouble();
        CashPayment cashP1 = new CashPayment(cashPayment1);
        CashPayment cashP2 = new CashPayment(cashPayment2);

        // CreditCardPayment objects
        System.out.println("Enter credit card payment amounts, name on card, expiration date, and credit card number:");
        double creditCardPayment1 = scanner.nextDouble();
        String creditCardName1 = scanner.next();
        String creditCardExpDate1 = scanner.next();
        String creditCardNumber1 = scanner.next();
        double creditCardPayment2 = scanner.nextDouble();
        String creditCardName2 = scanner.next();
        String creditCardExpDate2 = scanner.next();
        String creditCardNumber2 = scanner.next();
        CreditCardPayment cc1 = new CreditCardPayment(creditCardPayment1, creditCardName1, creditCardExpDate1, creditCardNumber1);
        CreditCardPayment cc2 = new CreditCardPayment(creditCardPayment2, creditCardName2, creditCardExpDate2, creditCardNumber2);

        // paymentDetails()
        System.out.println("Payment details:");
        System.out.println(cashP1.paymentDetails());
        System.out.println(cashP2.paymentDetails());
        System.out.println(cc1.paymentDetails());
        System.out.println(cc2.paymentDetails());

        // toString() and equals() methods
        System.out.println("Testing toString() and equals() methods:");
        System.out.println(cashP1.toString());
        System.out.println(cashP2.toString());
        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println("cash1 equals cash2: " + cashP1.equals(cashP2));
        System.out.println("cc1 equals cc2: " + cc1.equals(cc2));
     
    }
    
}
