/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public abstract class CuatroFiguras extends Thread{
    Figura uno;
    Figura Dos;
    Figura Tres;
    Figura Cuatro;
    boolean salida=true;
    TetrisControl C;
    int[][] Matriz = new int[10][14];
    JButton[][] BtnMatriz = new JButton[10][14];

    public CuatroFiguras(Figura uno, Figura Dos, Figura Tres, Figura Cuatro,JButton[][] a, int [][] b) {
        this.Matriz=b;
        this.BtnMatriz=a;
        this.uno = uno;
        this.Dos = Dos;
        this.Tres = Tres;
        this.Cuatro = Cuatro;
         this.salida=true;
         
    }
    
public void run(){
    while(salida){
        try {
            bajar();
        } catch (InterruptedException ex) {
            Logger.getLogger(CuatroFiguras.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
public abstract void movimientoIzquierda();
public abstract void movimientoDerecha();
public abstract void Girar();
public void bajar() throws InterruptedException{
        sleep(1000);
    if(fondo()){
        cambiarfondo(uno.color);
    }else{
        movimiento(0, 1, 0, 1, 0, 1, 0, 1);
    }
}

public boolean fondo(){
    if(uno.y==13||Dos.y==13||Tres.y==13||Cuatro.y==13){
        System.out.println("Fondo");
        return true;
    }
    if(Matriz[uno.x][uno.y+1]!=0||Matriz[Dos.x][Dos.y+1]!=0||Matriz[Tres.x][Tres.y+1]!=0||Matriz[Cuatro.x][Cuatro.y+1]!=0){
        System.out.println("choco");
        return true;
    }
    return false;
}
public void movimiento(int ux,int uy, int dx, int dy, int tx, int ty,int cx, int cy){
            BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x+ux;
            Dos.x=Dos.x+dx;
            Tres.x=Tres.x+tx;
            Cuatro.x=Cuatro.x+cx;
            uno.y=uno.y+uy;
            Dos.y=Dos.y+dy;
            Tres.y=Tres.y+ty;
            Cuatro.y=Cuatro.y+cy;
            BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
    }
    public void next(){
        Random r = new Random();
        int n=r.nextInt(100);
        if(n<=20){
            if(C.Tablero[4][1]==0&&C.Tablero[3][1]==0&&C.Tablero[5][1]==0&&C.Tablero[4][2]==0){
            C.C=new FiguraT(new Figura(4,1, "Red"),new Figura(3,1, "Red"), new Figura(5,1, "Red"),new Figura(4, 2, "Red"),C.MatrizTablero,C.Tablero);
            C.C.C=C;
            C.linea();
            C.C.start();
            }else{
                C.UI.dispose();
            }
        }else
        if(n<=40){
             if(C.Tablero[4][0]==0&&C.Tablero[5][0]==0&&C.Tablero[5][1]==0&&C.Tablero[6][1]==0){
            C.C=new FiguraEscalera(new Figura(4,0, "Blue"),new Figura(5,0, "Blue"), new Figura(5,1, "Blue"),new Figura(6, 1, "Blue"),C.MatrizTablero,C.Tablero);
            C.C.C=C;
            C.linea();
            C.C.start();
             }else{
                 C.UI.dispose();
             }
        }else
        if(n<=60){
            if(C.Tablero[4][0]==0&&C.Tablero[5][0]==0&&C.Tablero[4][1]==0&&C.Tablero[5][1]==0){
            C.C=new FiguraCuadrado(new Figura(4,0, "Green"),new Figura(5,0, "Green"), new Figura(4,1, "Green"),new Figura(5, 1, "Green"),C.MatrizTablero,C.Tablero);
            C.C.C=C;
            C.linea();
            C.C.start();
            }else{
                C.UI.dispose();
            }
        }else
        if(n<=80){
             if(C.Tablero[3][0]==0&&C.Tablero[4][0]==0&&C.Tablero[5][0]==0&&C.Tablero[6][0]==0){
            C.C=new FiguraLinea(new Figura(3,0, "Purple"),new Figura(4,0, "Purple"), new Figura(5,0, "Purple"),new Figura(6,0, "Purple"),C.MatrizTablero,C.Tablero);
            C.C.C=C;
            C.linea();
            C.C.start();
             }else{
                 C.UI.dispose();
             }
        }else{
             if(C.Tablero[3][1]==0&&C.Tablero[4][1]==0&&C.Tablero[5][1]==0&&C.Tablero[5][0]==0){
            C.C=new FiguraL(new Figura(3,1, "Yellow"),new Figura(4,1, "Yellow"), new Figura(5,1, "Yellow"),new Figura(5,0, "Yellow"),C.MatrizTablero,C.Tablero);
            C.C.C=C;
            C.linea();
            C.C.start();
             }else{
                 C.UI.dispose();
             }
        }
        
    }
    public void cambiarfondo(String fondo){
        switch(fondo){
            case "Red":
                Matriz[uno.x][uno.y]=1;
                Matriz[Dos.x][Dos.y]=1;
                Matriz[Tres.x][Tres.y]=1;
                Matriz[Cuatro.x][Cuatro.y]=1; 
                salida=false;
                next();
                break;
            case "Blue":
                Matriz[uno.x][uno.y]=2;
                Matriz[Dos.x][Dos.y]=2;
                Matriz[Tres.x][Tres.y]=2;
                Matriz[Cuatro.x][Cuatro.y]=2; 
                salida=false;
                next();
                break;   
            case "Green":
                Matriz[uno.x][uno.y]=3;
                Matriz[Dos.x][Dos.y]=3;
                Matriz[Tres.x][Tres.y]=3;
                Matriz[Cuatro.x][Cuatro.y]=3; 
                salida=false;
                next();
                break;    
            case "Purple":
                Matriz[uno.x][uno.y]=4;
                Matriz[Dos.x][Dos.y]=4;
                Matriz[Tres.x][Tres.y]=4;
                Matriz[Cuatro.x][Cuatro.y]=4; 
                salida=false;
                next();
                break;    
            case "Yellow":
                Matriz[uno.x][uno.y]=5;
                Matriz[Dos.x][Dos.y]=5;
                Matriz[Tres.x][Tres.y]=5;
                Matriz[Cuatro.x][Cuatro.y]=5; 
                salida=false;
                next();
                break;    
        }
    }
}
