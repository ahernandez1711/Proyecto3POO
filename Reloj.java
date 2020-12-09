/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class Reloj extends Thread{
    public Fantasma Blue;
    public Fantasma Red;
    public Fantasma Pink;
    public Fantasma Purple;

    public Reloj(Fantasma Blue, Fantasma Red, Fantasma Pink, Fantasma Purple) {
        this.Blue = Blue;
        this.Red = Red;
        this.Pink = Pink;
        this.Purple = Purple;
    }
    public void run(){
        Blue.Nombre=Pink.Nombre=Red.Nombre=Purple.Nombre="Vulnerable";
        Blue.vulnerable=Pink.vulnerable=Red.vulnerable=Purple.vulnerable=true;
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
        }
        Blue.Nombre="Blue";
        Pink.Nombre="Pink";
        Red.Nombre="Red";
        Purple.Nombre="Purple";
        Blue.vulnerable=Pink.vulnerable=Red.vulnerable=Purple.vulnerable=false;
        System.out.println("afawfasfawfaw");
    }
}
