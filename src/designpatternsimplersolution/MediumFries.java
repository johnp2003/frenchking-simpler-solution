/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class MediumFries extends Fries {
    public MediumFries() {
        System.out.println("Preparing Medium Fries...");
    }

    @Override
    public void prepareFries() {
        System.out.println("Medium Fries are being prepared.");
    }

    @Override
    public double price() {
        return 4.0;
    }
}
