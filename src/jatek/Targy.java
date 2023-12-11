/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jatek;

import java.util.UUID;

/**
 *
 * @author kunszekely.bence
 */
public class Targy {
    String nev, leiras;
    UUID uuid;

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.uuid = UUID.randomUUID();
    }
    
    
    
}
