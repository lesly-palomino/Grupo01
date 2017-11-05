/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author YPAREDES
 */
public class TestGatito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gatito g = new Gatito(5,"negro",15);
        //Gatito g;
        //g = new Gatito(0, "", 0);
        
        System.out.print("Color " + g.getColor() 
                + "\n Edad " + g.getEdad() + "meses" 
                + "\n Tamaño " + g.getTamaño()+ "centimetros");
        g.setEdad(50);
        g.setColor("red");
        g.setTamaño(25);
        System.out.print("Color " +g.getColor() 
                + "\n Edad " + g.getEdad() + "meses" 
                + "\n Tamaño " + g.getTamaño()+ "centimetros");
    }
    
}
