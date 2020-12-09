/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class Jugador extends Thread {
    public int[][] Tablero;
    public JButton[][] Matriz;
    public int x;
    public int y;
    public int movimiento;
    public int Vidas=3;
    public Fantasma Red;
    public Fantasma Blue;
    public Fantasma Pink;
    public Fantasma Purple;
    public GUIControl Control;
    public boolean control=true;

    public Jugador(int[][] Tablero,JButton[][] Matriz, int x, int y,Fantasma Red,Fantasma Blue,Fantasma Pink,Fantasma Purple, GUIControl C) {
        this.Tablero = Tablero;
        this.Matriz=Matriz;
        this.x = x;
        this.y = y;
        this.Tablero[x][y]=3;
        this.Blue=Blue;
        this.Red=Red;
        this.Purple=Purple;
        this.Pink=Pink;
        this.Control=C;
        Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
    }
    @Override
    public void run(){
        while(control){
            ganar();
            
            if(Red.x==x&&Red.y==y){
                if(Red.vulnerable){
                    Red.Muerte();
                    Control.Red= new Fantasma(Control.Tablero, Control.MatrizTablero, 11, 9,"Red",true);
                    this.Red=Control.Red;
                    Red.start();
                    }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=11;
                    y=16;
                    Tablero[x][y]=3;
                    Vidas-=1;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
                }
        }
            if(Blue.x==x&&Blue.y==y){
                if(Blue.vulnerable){
                    Blue.Muerte();
                    Control.Blue= new Fantasma(Tablero, Control.MatrizTablero, 11, 19,"Blue",true);
                    this.Blue=Control.Blue;
                    Blue.start();
                    }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=11;
                    y=16;
                    Tablero[x][y]=3;
                    Vidas-=1;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }}
            if(Pink.x==x&&Pink.y==y){
                if(Pink.vulnerable){
                    Pink.Muerte();
                                     
                    Control.Pink= new Fantasma(Tablero, Control.MatrizTablero, 11, 9,"Pink",true);
                    this.Pink=Control.Pink;
                    Pink.start();
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=11;
                    y=16;
                    Tablero[x][y]=3;
                    Vidas-=1;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }}
            if(Purple.x==x&&Purple.y==y){
                if(Purple.vulnerable){
                    Purple.Muerte();
                    Control.Purple= new Fantasma(Tablero, Control.MatrizTablero, 11, 19,"Purple",true);
                    this.Purple=Control.Purple;
                    Purple.start();
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=11;
                    y=16;
                    Tablero[x][y]=3;
                    Vidas-=1;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }}
            moverse();
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jugador.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(Vidas==0){
                control=false;
                Red.control=false;
                Blue.control=false;
                Pink.control=false;
                Purple.control=false;
                this.Control.UI.dispose();
            }
        }
    }
    public void moverse(){
        try{
            if(movimiento==0){
                if(Tablero[x+1][y]==1){
                    
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x+=1;
                    if(Tablero[x][y]==5){
                    Reloj R= new Reloj(Red, Blue, Pink, Purple);
                    R.start();
                }
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
                }
            }
            
            if(movimiento==1){
                if(Tablero[x-1][y]==1){
                    
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x-=1;
                    if(Tablero[x][y]==5){
                    Reloj R= new Reloj(Red, Blue, Pink, Purple);
                    R.start();
                }
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }
            }
            if(movimiento==2){
                if(Tablero[x][y-1]==1){
                    
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    y-=1;
                    if(Tablero[x][y]==5){
                    Reloj R= new Reloj(Red, Blue, Pink, Purple);
                    R.start();
                }
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }
            }
            if(movimiento==3){
                if(Tablero[x][y+1]==1){
                    
                }else{
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    y+=1;
                    if(Tablero[x][y]==5){
                    Reloj R= new Reloj(Red, Blue, Pink, Purple);
                    R.start();
                }
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }
            }
            
        }catch(ArrayIndexOutOfBoundsException e){
            if(movimiento==0){
                System.out.println("Intento movimiento derecha");
                if(this.x==25&&this.y==13){
                 
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=0;
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }
            }
            if(movimiento==1){
                System.out.println("Intento movimiento Izquierda");
                if(this.x==0&&this.y==13){
                 
                    Tablero[x][y]=2;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    x=25;
                    Tablero[x][y]=3;
                    Matriz[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"3"+".png"));
            }
                }
            
            if(movimiento==2){
                System.out.println("Intento movimiento Arriba");
            }
            if(movimiento==3){
                System.out.println("Intento movimiento Abajo");
            }
        }
        
    }
    public void ganar(){
        boolean ganar=true;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 29; j++) {
                if(Tablero[i][j]==0){
                    ganar=false;
                }
            }
        }
        if(ganar){
            Control.UI.dispose();
        }
    }    
    
}
