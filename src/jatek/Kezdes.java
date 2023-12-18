/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author kunszekely.bence
 */
public class Kezdes extends Helyszin implements MasikIrany{
    
    @Override
    public String leiras(){
        return "Jobbra vagy balra";
    }

    @Override
    public Helyszin egyikirány() {
        return new Jobbra();
    }

    @Override
    public String egyikBtnFelirat() {
        return "Menj Jobbra.";
    }
    
    public String masikBtnFelirat() {
        return "Menj Balra.";
    }

    @Override
    public Helyszin masikirány() {
        return new Bal();
    }
    
    
}
