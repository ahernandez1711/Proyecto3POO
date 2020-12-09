/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class Fantasma extends Thread{
    public int[][] Tablero;
    public JButton[][] Matriz;
    public int x;
    public int y;
    public String Nombre;
    public int movimiento;
    public boolean control=true;
    public boolean vulnerable=false;
    public boolean incio;

    public Fantasma(int[][] Tablero,JButton[][] Matriz, int x, int y, String N, boolean Inicio) {
        this.Tablero = Tablero;
        this.Matriz=Matriz;
        this.x = x;
        this.y = y;
        this.incio=Inicio;
        this.Nombre=N;
        
        CambiarDireccion();
    }
        public void run(){
            if(incio){
                try {
                    sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Fantasma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Nombre+".png"));
        while(control){
            
            moverse();
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void moverse(){
        try{
            if(movimiento==0){
                if(Tablero[x+1][y]==1){
                    CambiarDireccion();
                    
                }else{
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Tablero[x][y]+".png"));
                    x+=1;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Nombre+".png"));
                }
            }
            
            if(movimiento==1){
                if(Tablero[x-1][y]==1){
                    CambiarDireccion();
                    
                }else{
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Tablero[x][y]+".png"));
                    x-=1;
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Nombre+".png"));
            }
            }
            if(movimiento==2){
                if(Tablero[x][y-1]==1){
                    CambiarDireccion();
                   
                }else{
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Tablero[x][y]+".png"));
                    y-=1;
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Nombre+".png"));
            }
            }
            if(movimiento==3){
                if(Tablero[x][y+1]==1){
                    CambiarDireccion();
                    
                }else{
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Tablero[x][y]+".png"));
                    y+=1;
                    
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+Nombre+".png"));
            }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            CambiarDireccion();
            moverse();
        }
        
    }
    public void CambiarDireccion(){
        Random R= new Random();
        int a= R.nextInt(100);
        if(a<=25){
            movimiento=0;
        }else if(a<=50){
            movimiento=1;
        } else if(a<=75){
            movimiento=2;
        }else{
            movimiento=3;
        }
    }
    public void Muerte(){
        this.stop();
        
    }
}
