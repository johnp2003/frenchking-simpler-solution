/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public class LargeFriesWithChiliSauce extends LargeFries {
    public void addSauce() {
        System.out.println("Adding Chili Sauce to Large Fries.");
    }

    @Override
    public double price() {
        return super.price() + 0.7; 
    }
    
    @Override
    public String getSauces() {
        return "Chili Sauce";
    }
}
