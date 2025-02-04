/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author User
 */
public class Payment {
    
    private double amount;
    
    public Payment (double amount) {
        this.amount = amount;
    }
    
    // accessor
    public double getAmount () {
        return amount;
    }
    
    // mutator
    public void setAmount (double amount) {
        this.amount = amount;
    }
    
    // method paymentDetails
    public String paymentDetails () {
         return "The payment amount is " + amount + " dollars.";
    }
    
    // toString
    public String toString(){
        return amount + " ";
    }
    
    // equals
    public boolean equals(Object other){
        if (other == null){
            return true;
        }
        if (getClass()!=this.getClass()){
            return false;
        }
        Payment payment = (Payment) other;
        return Double.compare(payment.amount, amount)==0;
    }
}
