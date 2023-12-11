/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jatek;

/**
 *
 * @author kunszekely.bence
 */
public class Jatek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Karakter k1 = new Karakter();
       Targy t1 = new Targy("kard", "kard...");
       
       k1.felvesz(t1, 4);
        System.out.println(k1);
       k1.hasznal("kard", 5);
        System.out.println(k1);
    }
    
}
