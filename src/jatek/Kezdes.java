/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author kunszekely.bence
 */
public class Kezdes extends Helyszin{
    public String leiras(){
        return "Ez a Kezdes";
    }

    @Override
    public Helyszin egyikirány() {
        return new Kezdes();
    }

    @Override
    public String egyikBtnFelirat() {
        return "Menj balra.";
    }
    
    
}
