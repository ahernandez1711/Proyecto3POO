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
public class FiguraCuadrado extends CuatroFiguras {

    public FiguraCuadrado(Figura uno, Figura Dos, Figura Tres, Figura Cuatro, JButton[][] a, int [][] b) {
        super(uno, Dos, Tres, Cuatro,a,b);
        super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png"));
        super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
        super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
        super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
    }
    

    @Override
    public void movimientoIzquierda(){
        if(uno.x==0||Matriz[uno.x-1][uno.y]!=0&&Tres.x==0||Matriz[Tres.x-1][Tres.y]!=0){
            if(uno.x==0){
                System.out.println("1");
            }
            if(uno.x-1!=0){
                System.out.println("1");
            }
            if(Tres.x==0){
                System.out.println("1");
            }
            if(Tres.x-1!=0){
                System.out.println("1");
            }
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
    @Override
    public void movimientoDerecha(){
        try{
        if(Dos.x==9||Matriz[Dos.x+1][Dos.y]!=0&&Cuatro.x==9||Matriz[Cuatro.x+1][Cuatro.y]!=0){
            if(Dos.x==9){
                System.out.println("1");
            }
            if(Matriz[Dos.x+1][Dos.y]!=0){
                System.out.println("1");
            }
            if(Cuatro.x==9){
                System.out.println("1");
            }
            if(Matriz[Cuatro.x+1][Cuatro.y]!=0){
                System.out.println("1");
            }
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
    }catch(Exception e){
        
    }
    }

    @Override
    public void Girar() {
        
    }
}

