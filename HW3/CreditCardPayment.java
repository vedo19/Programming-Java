/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw3;

/**
 *
 * @author User
 */
public class CreditCardPayment extends Payment {
    
    // instance variables
    private String nameCard;
    private String expirationDate;
    private String creditCardNumber;
    
    // constructor
    public CreditCardPayment (double amount, String nameCard, String expirationDate, String creditCardNumber) {
        super(amount);
        this.nameCard = nameCard;
        this.expirationDate = expirationDate;
        this.creditCardNumber = creditCardNumber;
    }
    
    // accessor
    public String getNameCard () {
        return nameCard;
    }
    
    public String getExpirationDate () {
        return expirationDate;
    }
    
    public String getCreditCardNumber () {
        return creditCardNumber;
    }
    
    // mutator
    public void setNameCard (String nameCard) {
        this.nameCard = nameCard;
    }
    
    public void setExpirationDate (String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    public void setCreditCardNumber (String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public String paymentDetails() {
        return "The credit card payment amount is " + getAmount() +
        "Name on card: " + nameCard +
        "Expiration date: " + expirationDate +
        "Credit card number: " + creditCardNumber;
        }
    
    // toString
    public String toString(){
        return getAmount() + " " + nameCard + " " + expirationDate + " " + creditCardNumber;
    }

    // equals
    public boolean equals(Object other){
        if (this == other){
            return true;
        }
        else if ((other==null) || (getClass()!=other.getClass())){
            return false;
        }
        CreditCardPayment otherPayment = (CreditCardPayment) other;
        return Double.compare(getAmount(), otherPayment.getAmount()) == 0 &&
                nameCard.equals(otherPayment.getNameCard()) &&
                expirationDate.equals(otherPayment.getExpirationDate()) &&
                creditCardNumber.equals(otherPayment.getCreditCardNumber());
    }
    
}
