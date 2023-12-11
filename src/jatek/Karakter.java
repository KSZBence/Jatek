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
    ArrayList<Targy> felszereles;
    int eletero, ugyesseg, szerencse;

    public Karakter() {
        this.eletero = d6()+d6()+12;
        this.ugyesseg = d6() + 6;
        this.szerencse = d6() + 6;
        felszereles = new ArrayList<Targy>();
    }
    
    private int d6(){
        return rnd.nextInt(6)+1;
    }
    
    public void felvesz(Targy targy){
        felvesz(targy, 1);
    }
    
    public void felvesz(Targy targy, int darab){
        for (int i = 0; i < darab; i++) {
            this.felszereles.add(targy);
        }
    }
    
    public void hasznal(String targynev){
        hasznal(targynev, 1);
    }
    
    public void hasznal(String targynev, int darab){
        hasznal(targynev, darab, true);
    }
    
    public void hasznal(String targynev, int darab, boolean kevesebbVan){
        ArrayList<Targy> keresettek = new ArrayList<Targy>();
        for (Targy elem : felszereles) {
            if (elem.nev == targynev) {
                keresettek.add(elem);
            }
        }
        
        for (int i = 0; i < darab; i++) {
            if (keresettek.size() > 0) {
                Targy eltavolitando = keresettek.get(keresettek.size()-1);
                felszereles.remove(eltavolitando);
                keresettek.remove(eltavolitando);
            }
        }
        
        
        
        
        
        
    }

    @Override
    public String toString() {
        return "Karakter{" + "felszereles=" + felszereles + ", eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }
    
    
}
