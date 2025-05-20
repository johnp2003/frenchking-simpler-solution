/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class OnlineBankingPayment implements Payment {
    private double amount;
    private String bankAccount;

    public OnlineBankingPayment(double amount, String bankAccount) {
        this.amount = amount;
        this.bankAccount = bankAccount;
    }

    @Override
    public void makePayment() {
        System.out.println("Paying RM" + amount + " using Online Banking: " + bankAccount);
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
}
