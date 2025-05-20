/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class Payment {
    private final double amount;
    private final String paymentMethod;

    public Payment(double amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        System.out.println("Processing payment of RM" + amount + " using " + paymentMethod);
    }

    public double getAmount() {
        return this.amount;
    }
}
