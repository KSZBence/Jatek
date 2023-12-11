/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kunszekely.bence
 */
public class Karakter {
    Random rnd = new Random();
    ArrayList<Targy>felszereles;
    int eletero, ugyesseg, szerencse;

    public Karakter() {
        this.eletero = d6()+d6()+12;
        this.ugyesseg = d6() + 6;
        this.szerencse = d6() + 6;
    }
    
    private int d6(){
        return rnd.nextInt(6)+1;
    }
    
    public void felvesz(Targy targy){
        felvesz(targy, 1);
    }
    
    public void felvesz(Targy targy, int darab){
        for (int i = 0; i < darab; i++) {
            felszereles.add(targy);
        }
    }
    
}
