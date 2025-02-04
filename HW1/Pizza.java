/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pizza {

    private String size;
    private int numberCheeseToppings;
    private int numberPepperoniToppings;
    
    public Pizza(String size,int numberCheeseToppings,int numberPepperoniToppings) {
        this.size = size;
        this.numberCheeseToppings = Math.max(0, numberCheeseToppings); //find this on internet, returns always greater number, so if any negative number user inputs, it will return 0.//
        this.numberPepperoniToppings = Math.max(0, numberPepperoniToppings);
    }
    
    public String getSize() {  //getter//
        return size;
    }
    public void setSize(String size) {  //setter//
        this.size = size;
    }
    
    public int getNumberCheeseToppings() {
        return numberCheeseToppings;
    }
    public void setNumberCheeseToppings(int numberCheeseToppings) {
        this.numberCheeseToppings = Math.max(0, numberCheeseToppings);
    }
    
    public int getNumberPepperoniToppings() {
        return numberPepperoniToppings;
    }
    public void setNumberPepperoniToppings(int numberPepperoniToppings) {
        this.numberPepperoniToppings = Math.max(0, numberPepperoniToppings);
    }
    
    public double calcCost() {  //determination of pizza cost//
        double originalCost=0;
        if (size.equals("small")) {
            originalCost = 10.0 + 2.0 * (numberCheeseToppings + numberPepperoniToppings);
            }
        else if (size.equals("medium")) {
            originalCost = 12.0 + 2.0 * (numberCheeseToppings + numberPepperoniToppings) ;
        }
        else if (size.equals("large")) {
            originalCost = 14.0 + 2.0 * (numberCheeseToppings + numberPepperoniToppings) ;
        }
        
    
        return originalCost;
    }
    
    public String getDescription() {
       String description = "Size: " + size + "\nCheese toppings: " + numberCheeseToppings + "\nPepperoni toppings: " + numberPepperoniToppings + "\nCost=" + calcCost();
       return description;
    }
    
    public String toString() {
        return "Pizza [size=" + size + ", numberCheeseToppings=" + numberCheeseToppings
                + ", numPepperoniToppings=" + numberPepperoniToppings + ", cost=" + calcCost() + "]"; 
    }
    
    public boolean equals(Pizza other) {
      if (other == null) {
            return false;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Pizza otherPizza = (Pizza) other;
        return this.size.equals(otherPizza.size) && 
               this.numberCheeseToppings == otherPizza.numberCheeseToppings && this.numberPepperoniToppings == otherPizza.numberPepperoniToppings;
    }
}

