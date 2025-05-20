package designpatternsimplersolution;


import designpatternsimplersolution.Fries;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johnp
 */
public class SmallFries extends Fries {
    public SmallFries() {
        System.out.println("Preparing Small Fries...");
    }

    @Override
    public void prepareFries() {
        System.out.println("Small Fries are being prepared.");
    }

    @Override
    public double price() {
        return 3.0; // Small Fries price
    }
}
