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
public class FiguraL extends CuatroFiguras {
    int girar=0;

    public FiguraL(Figura uno, Figura Dos, Figura Tres, Figura Cuatro, JButton[][] a, int[][] b) {
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
                if(uno.x==0||Matriz[uno.x-1][uno.y]!=0&&Matriz[Cuatro.x-1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 1:
                if(Cuatro.x==0||Matriz[Cuatro.x-1][Cuatro.y]!=0&&Dos.x==0||Matriz[Dos.x-1][Dos.y]!=0&&Matriz[uno.x-1][uno.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 2:
                if(Tres.x==0||Matriz[Tres.x-1][Tres.y]!=0&&Cuatro.x==0||Matriz[Cuatro.x-1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(-1, 0, -1, 0, -1, 0, -1, 0);
                }
                break;
            case 3:
                if(uno.x==0||Matriz[uno.x-1][uno.y]!=0&&Dos.x==0||Matriz[Dos.x-1][Dos.y]!=0&&Tres.x==0||Matriz[Tres.x-1][Tres.y]!=0){
                
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
                if(Tres.x==9||Matriz[Tres.x+1][Tres.y]!=0&&Cuatro.x==9||Matriz[Cuatro.x+1][Cuatro.y]!=0/**/){
                    
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
            case 1:
                if(uno.x==9||Matriz[uno.x+1][uno.y]!=0&&Dos.x==9||Matriz[Dos.x+1][Dos.y]!=0&&Tres.x==9||Matriz[Tres.x+1][Tres.y]!=0){
                    
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
            case 2:
                if(uno.x==9||Matriz[uno.x+1][uno.y]!=0&&Matriz[Cuatro.x+1][Cuatro.y]!=0){
                    
                }else{
                    movimiento(1, 0, 1, 0, 1, 0, 1, 0);
                }
                break;
            case 3:
                if(Cuatro.x==9||Matriz[Cuatro.x+1][Cuatro.y]!=0&&Matriz[Dos.x+1][Dos.y]!=0&&Matriz[uno.x+1][uno.y]!=0){
                
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
                    if(Matriz[uno.x][uno.y-1]==0&&Matriz[uno.x][uno.y-2]==0&&Matriz[uno.x-1][uno.y-2]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, -1, -1, -2, -2, -3, -1);
                        girar++;
                    }}
                    
                    break;
                case 1:
                    if(Matriz[uno.x-1][uno.y]==0&&Matriz[uno.x-2][uno.y]==0&&Matriz[uno.x-2][uno.y+1]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, -1, 1, -2, 2, -1, 3);
                        girar++;
                        }
                    }
                    
                    break;
                case 2:
                    if(Matriz[uno.x][uno.y+1]==0&&Matriz[uno.x][uno.y+2]==0&&Matriz[uno.x+1][uno.y+2]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, 1, 1, 2, 2, 3, 1);
                        girar++;
                        }
                    }
                    
                    break;
                case 3:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                    if(Matriz[uno.x+1][uno.y]==0&&Matriz[uno.x+2][uno.y]==0&&Matriz[uno.x+2][uno.y-1]==0){
                        if(uno.x==0||uno.x==9){
                            
                        }else{
                        movimiento(0, 0, 1, -1, 2, -2, 1, -3);
                        girar=0;
                        }
                    
                    break;    
            }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
    
}
