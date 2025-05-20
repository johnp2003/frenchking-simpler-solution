/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class MediumFriesWithKetchupAndChiliSauce extends MediumFries {
    public void addSauce() {
        System.out.println("Adding Ketchup and Chili Sauce to Medium Fries.");
    }

    @Override
    public double price() {
        return super.price() + 1.0; 
    }
    
    @Override
    public String getSauces() {
        return "Ketchup, Chili Sauce";
    }
}
