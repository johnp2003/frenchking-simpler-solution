/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
class SmallFriesWithKetchupAndChiliSauce extends SmallFries {
    public void addSauce() {
        System.out.println("Adding Ketchup and Chili Sauce to Small Fries.");
    }

    @Override
    public double price() {
        return super.price() + 1.0; 
    }
}