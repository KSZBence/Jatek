/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

/**
 *
 * @author kunszekely.bence
 */
public class Jobbra extends Helyszin{
    @Override
    public String leiras() {
        return "Ez jobbra van. Keletre vagy Nyugatra";
    }

    @Override
    public Helyszin egyikirány() {
        return new Bal();
    }

    @Override
    public String egyikBtnFelirat() {
        return "nyugat";
    }

    @Override
    public String masikBtnFelirat() {
        return "kelet";
    }

    @Override
    public Helyszin masikirány() {
        return new Bal();
    }
}
