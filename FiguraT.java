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
public class FiguraT extends CuatroFiguras{
    int girar=0;
     
    public FiguraT(Figura uno, Figura Dos, Figura Tres, Figura Cuatro, JButton[][] a, int[][] b) {
        super(uno, Dos, Tres, Cuatro, a, b);
        super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png"));
        super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
        super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
        super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
    }

    @Override
    public void movimientoIzquierda() {
        switch(girar){
            case 0:
                if(Dos.x==0||Matriz[Dos.x-1][Dos.y]!=0&&Matriz[Cuatro.x-1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 1:
                if(uno.x==0||Matriz[uno.x-1][uno.y]!=0&&Tres.x==0||Matriz[Tres.x-1][Tres.y]!=0&&Dos.x==0||Matriz[Dos.x-1][Dos.y]!=0&&Matriz[Cuatro.x-1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 2:
                if(Tres.x==0||Matriz[Tres.x-1][Tres.y]!=0&&Matriz[Cuatro.x-1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 3:
                if(Cuatro.x==0||Matriz[Cuatro.x-1][Cuatro.y]!=0&&Matriz[Dos.x-1][Dos.y]!=0&&Matriz[Tres.x-1][Tres.y]!=0){
                
            }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
        }
                
    }

    @Override
    public void movimientoDerecha() {
                switch(girar){
            case 0:
                if(Tres.x==9||Matriz[Tres.x+1][Tres.y]!=0&&Matriz[Cuatro.x+1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
            case 1:
                if(Cuatro.x==9||Matriz[Cuatro.x+1][Cuatro.y]!=0&&Matriz[Dos.x+1][Dos.y]!=0&&Matriz[Tres.x+1][Tres.y]!=0){
                    
                }else{
                    movimiento(1, 0,1, 0, 1, 0, 1, 0);
                }
                break;
            case 2:
                if(Dos.x==9||Matriz[Dos.x+1][Dos.y]!=0&&Matriz[Cuatro.x+1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
            case 3:
                if(Dos.x==9||Matriz[Dos.x+1][Dos.y]!=0&&uno.x==9||Matriz[uno.x+1][uno.y]!=0&&Tres.x==9||Matriz[Tres.x+1][Tres.y]!=0){
                
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
        }
    }

    @Override
    public void Girar() {
        try{
            switch(girar){
                case 0:
                    if(Matriz[uno.x-1][uno.y]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, 1, 1, -1, -1, 1, -1);
                        girar++;
                    }}
                    
                    break;
                case 1:
                    if(Matriz[uno.x][uno.y+1]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, 1, -1, -1, 1, -1, -1);
                        girar++;
                        }
                    }
                    
                    break;
                case 2:
                    if(Matriz[uno.x+1][uno.y]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, -1, -1, 1, 1, -1, 1);
                        girar++;
                        }
                    }
                    
                    break;
                case 3:
                    if(Matriz[uno.x][uno.y+1]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, -1, 1, 1, -1, 1, 1);
                        girar=0;
                        }
                    
                    break;    
            }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    public void movimiento(int ux,int uy, int dx, int dy, int tx, int ty,int cx, int cy){
        super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
            uno.x=uno.x+ux;
            Dos.x=Dos.x+dx;
            Tres.x=Tres.x+tx;
            Cuatro.x=Cuatro.x+cx;
            uno.y=uno.y+uy;
            Dos.y=Dos.y+dy;
            Tres.y=Tres.y+ty;
            Cuatro.y=Cuatro.y+cy;
            super.BtnMatriz[uno.x][uno.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+uno.color+".png")); 
            super.BtnMatriz[Dos.x][Dos.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Dos.color+".png"));
            super.BtnMatriz[Tres.x][Tres.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Tres.color+".png"));
            super.BtnMatriz[Cuatro.x][Cuatro.y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+Cuatro.color+".png"));
    }
}
