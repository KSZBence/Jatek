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
        return "Balra";
    }

    @Override
    public Helyszin egyikirány() {
        return new Bal();
    }

    @Override
    public String egyikBtnFelirat() {
        return "egyik";
    }
    
}
