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
    ArrayList<String>felszereles;

    public Karakter() {
        int eletero = d6()+d6()+12;
        int ugyesseg = d6() + 6;
        int szerencse = d6() + 6;
    }
    
    private int d6(){
        return rnd.nextInt(6)+1;
    }
    
    
}
