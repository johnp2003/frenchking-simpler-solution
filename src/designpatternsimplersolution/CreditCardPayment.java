/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class CreditCardPayment implements Payment {
    private double amount;
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        this.amount = amount;
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Paying RM" + amount + " using Credit Card: " + cardNumber);
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
