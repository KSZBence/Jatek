/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;


public class Start extends Helyszin{

    public String leiras(){
        return "Ez a Start";
    }

    @Override
    public Helyszin egyikirány() {
        return new Start();
    }
}
