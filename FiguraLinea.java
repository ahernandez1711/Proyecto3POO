/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author pablo
 */
public class FiguraLinea extends CuatroFiguras{
    boolean girar=true;
    public FiguraLinea(Figura uno, Figura Dos, Figura Tres, Figura Cuatro, JButton[][] a, int[][] b) {
        super(uno, Dos, Tres, Cuatro, a, b);
        super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png"));
        super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
        super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
        super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
    }

    @Override
    public void movimientoIzquierda() {
        if(girar){
            if(uno.x==0||super.Matriz[uno.x-1][uno.y]!=0){
                
            }else{
                super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x-1;
            Dos.x=Dos.x-1;
            Tres.x=Tres.x-1;
            Cuatro.x=Cuatro.x-1;
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
            }
        }else{
            if(uno.x==0||super.Matriz[uno.x-1][uno.y]!=0&&Dos.x==0||super.Matriz[Dos.x-1][Dos.y]!=0&&Tres.x==0||super.Matriz[Tres.x-1][Tres.y]!=0&&Cuatro.x==0||super.Matriz[Cuatro.x-1][Cuatro.y]!=0){
                
            }else{
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x-1;
            Dos.x=Dos.x-1;
            Tres.x=Tres.x-1;
            Cuatro.x=Cuatro.x-1;
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
            }
        }
    }

    @Override
    public void movimientoDerecha() {
        if(girar){
            if(Cuatro.x==9||super.Matriz[Cuatro.x+1][Cuatro.y]!=0){
                
            }else{
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x+1;
            Dos.x=Dos.x+1;
            Tres.x=Tres.x+1;
            Cuatro.x=Cuatro.x+1;
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
            }
        }else{
            if(uno.x==9||super.Matriz[uno.x+1][uno.y]!=0&&Dos.x==0||super.Matriz[Dos.x+1][Dos.y]!=0&&Tres.x==9||super.Matriz[Tres.x+1][Tres.y]!=0&&Cuatro.x==9||super.Matriz[Cuatro.x+1][Cuatro.y]!=0){
            }else{
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x+1;
            Dos.x=Dos.x+1;
            Tres.x=Tres.x+1;
            Cuatro.x=Cuatro.x+1;
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
            }
        }
    }

    @Override
    public void Girar() {
        try{
        if(girar){
            if(Matriz[uno.x][uno.y+1]==0&&Matriz[uno.x][uno.y+2]==0&&Matriz[uno.x][uno.y+3]==0){
                System.out.println("sasdas");
                super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                uno.x=uno.x;
                Dos.x=uno.x;
                Tres.x=uno.x;
                Cuatro.x=uno.x;
                Dos.y=Dos.y+1;
                Tres.y=Tres.y+2;
                Cuatro.y=Cuatro.y+3;
                super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
                super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
                super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
                super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
                girar=!girar;
            }
        }else{
            if(Matriz[uno.x+1][uno.y]==0&&Matriz[uno.x+2][uno.y]==0&&Matriz[uno.x+3][uno.y]==0){
                super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                uno.x=uno.x;
                Dos.y=uno.y;
                Dos.x=Dos.x+1;
                Tres.y=uno.y;
                Tres.x=Tres.x+2;
                Cuatro.y=uno.y;
                Cuatro.x=Cuatro.x+3;
                super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
                super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
                super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
                super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
                girar=!girar;
            }
        }
    }catch(Exception f){
    }
    }
    
}
    
    
    

