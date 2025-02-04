/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hw5;

/**
 *
 * @author User
 */
public class ArrayBagTest {

    public static void main(String[] args) {
    ArrayBag<String> stringBag = new ArrayBag<>(5); 
    System.out.println("Bag empty? " + stringBag.isEmpty());
    System.out.println("Size of the bag: " + stringBag.getCurrentSize());
    
    stringBag.add("Liverpool");
    stringBag.add("Liverpool");
    stringBag.add("Liverpool");
    
    stringBag.add("Barcelona");
    stringBag.add("Barcelona");
    stringBag.add("Barcelona");
    
    stringBag.add("Inter");
    stringBag.add("Inter");
    stringBag.add("Inter");
    stringBag.add("Inter");
    stringBag.add("Inter");
    
    System.out.println("Bag empty? " + stringBag.isEmpty());
    System.out.println("Size of the bag: " + stringBag.getCurrentSize());
    System.out.println("Now, removing string from the bag");
    stringBag.remove();
    System.out.println("Size of the bag: " + stringBag.getCurrentSize());
    System.out.println("Now, removing string from the bag");
    stringBag.remove();
    System.out.println("Size of the bag: " + stringBag.getCurrentSize());
    
    System.out.println("Test 'getFrequencyOf' method");
    System.out.println("Frequency of \"Liverpool\": " + stringBag.getFrequencyOf("Liverpool"));
    
    System.out.println("Test 'contains' method");
    
    System.out.println("Does the bag contain \"Liverpool\"? " + stringBag.contains("Liverpool"));
    
    System.out.println("Display the bag");
    stringBag.display();
    System.out.println("Clear the bag");
    stringBag.clear();
    
    System.out.println("Bag empty? " + stringBag.isEmpty());
    System.out.println("Size of the bag: " + stringBag.getCurrentSize()); 
    }
    
}
