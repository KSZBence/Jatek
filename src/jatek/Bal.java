/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author kunszekely.bence
 */
public class Bal extends Helyszin{

    @Override
    public String leiras() {
        return "Ez balra van. Délre vagy északra";
    }

    @Override
    public Helyszin egyikirány() {
        return new Bal();
    }

    @Override
    public String egyikBtnFelirat() {
        return "észak";
    }

    @Override
    public String masikBtnFelirat() {
        return "dél";
    }

    @Override
    public Helyszin masikirány() {
        return new Jobbra();
    }
    
}
