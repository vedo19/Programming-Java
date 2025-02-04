/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the size of pizza: ");
       String size = input.nextLine();
       System.out.println("Enter the number of cheese toppings: ");
       int numberCheeseToppings = input.nextInt();
       System.out.println("Enter the number of pepperoni toppings: ");
       int numberPepperoniToppings = input.nextInt();
       
       Pizza pizza = new Pizza (size, numberCheeseToppings, numberPepperoniToppings);
       
       System.out.println(pizza.getDescription());
    } 
    
}
