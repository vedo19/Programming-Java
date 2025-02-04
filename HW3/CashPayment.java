/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author User
 */
public class CashPayment extends Payment {
    
    // inheritance
    public CashPayment (double amount) {
        super(amount);
    }
    
    public String paymentDetails () {
        return "The payment in cash is " + getAmount() + " dollars.";
    }
    
    // toString
    public String toString() {
        return getAmount() + " ";
    }
        
    // equals
    public boolean equals(Object other){
        if (other == null){
            return true;
        }
        if (getClass()!=this.getClass()){
            return false;
        }
        CashPayment cash = (CashPayment) other;
        return Double.compare(cash.getAmount(), getAmount())==0;
        
        }
}
    
