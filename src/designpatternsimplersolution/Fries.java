/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternsimplersolution;

/**
 *
 * @author johnp
 */
public abstract class Fries {
    protected int packet;

    public abstract void prepareFries(); 
    public abstract double price(); 

    public void setSize(int packet) { 
        this.packet = packet;
        System.out.println("Size set to: " + packet);
    }
}
