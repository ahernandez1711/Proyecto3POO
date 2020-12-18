/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopacman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author pablo
 */
public class TetrisControl{
    public GUI UI=new GUI();
    public JButton[][] MatrizTablero= new JButton[10][14];
    public int[][] Tablero = new int[10][14];
    public CuatroFiguras C;

    public TetrisControl() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                Tablero[i][j]=0;
            }
        }
        generarBotones();
        C=new FiguraL(new Figura(3,2, "Yellow"),new Figura(4,2, "Yellow"), new Figura(5,2, "Yellow"),new Figura(5, 1, "Yellow"),MatrizTablero,Tablero);
        C.C=this;
        C.start();
        UI.setVisible(true);
    }
    public void generarBotones(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                JButton Boton= new JButton();
                MatrizTablero[i][j]=Boton;
                Border emptyBorder = BorderFactory.createEmptyBorder();
                Boton.setBorder(emptyBorder);
                Boton.setSize(50, 50);
                 Boton.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                UI.PnlFondo.add(Boton);
                Boton.setLocation(75+(i*50),12+(j*50));
            }
        }
    }
    public void linea(){
        for (int i = 0; i < 14; i++) {
            if(Tablero[0][i]!=0&&Tablero[1][i]!=0&&Tablero[2][i]!=0&&Tablero[3][i]!=0&&Tablero[4][i]!=0&&Tablero[5][i]!=0&&Tablero[6][i]!=0&&Tablero[7][i]!=0&&Tablero[8][i]!=0&&Tablero[9][i]!=0){
                Tablero[0][i]=Tablero[1][i]=Tablero[2][i]=Tablero[3][i]=Tablero[4][i]=Tablero[5][i]=Tablero[6][i]=Tablero[7][i]=Tablero[8][i]=Tablero[9][i]=0;
                MatrizTablero[0][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[1][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[2][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[3][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[4][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[5][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[6][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[7][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[8][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                MatrizTablero[9][i].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                for (int p = i-1; p>0; p--) {
                    
                
                     if(Tablero[0][p]!=0){
                         Tablero[0][p+1]=Tablero[0][p];
                         MatrizTablero[0][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[0][p]=0;
                         pintar(0, p+1, Tablero[0][p+1]);
                     }
                     if(Tablero[1][p]!=0){
                         Tablero[1][p+1]=Tablero[1][p];
                         MatrizTablero[1][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[1][p]=0;
                         pintar(1, p+1, Tablero[1][p+1]);
                     }
                     if(Tablero[2][p]!=0){
                         Tablero[2][p+1]=Tablero[2][p];
                         MatrizTablero[2][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[2][p]=0;
                         pintar(2, p+1, Tablero[2][p+1]);
                     }
                     if(Tablero[3][p]!=0){
                         Tablero[3][p+1]=Tablero[3][p];
                         MatrizTablero[3][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[3][p]=0;
                         pintar(3, p+1, Tablero[3][p+1]);
                     }
                     if(Tablero[4][p]!=0){
                         Tablero[4][p+1]=Tablero[4][p];
                         MatrizTablero[4][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[4][p]=0;
                         pintar(4, p+1, Tablero[4][p+1]);
                     }
                     if(Tablero[5][p]!=0){
                         Tablero[5][p+1]=Tablero[5][p];
                         MatrizTablero[5][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[5][p]=0;
                         pintar(5, p+1, Tablero[5][p+1]);
                     }
                     if(Tablero[6][p]!=0){
                         Tablero[6][p+1]=Tablero[6][p];
                         MatrizTablero[6][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[6][p]=0;
                         pintar(6, p+1, Tablero[6][p+1]);
                     }
                     if(Tablero[7][p]!=0){
                         Tablero[7][p+1]=Tablero[7][p];
                         MatrizTablero[7][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[7][p]=0;
                         pintar(7, p+1, Tablero[7][p+1]);
                     }
                     if(Tablero[8][p]!=0){
                         Tablero[8][p+1]=Tablero[8][p];
                         MatrizTablero[8][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[8][p]=0;
                         pintar(8, p+1, Tablero[8][p+1]);
                     }
                     if(Tablero[9][p]!=0){
                         Tablero[9][p+1]=Tablero[9][p];
                         MatrizTablero[9][p].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Black"+".png"));
                         Tablero[9][p]=0;
                         pintar(9, p+1, Tablero[9][p+1]);
                     }
                     }
                }
            }
        
            
    
    }
    public void pintar(int x, int y, int color){
        switch(color){
            case 1:
                MatrizTablero[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Red"+".png"));
                break;
            case 2:
                MatrizTablero[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Blue"+".png"));
                break;
            case 3:
                MatrizTablero[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Green"+".png"));
                break;
            case 4:
                MatrizTablero[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Purple"+".png"));
                break;
            case 5:
                MatrizTablero[x][y].setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Yellow"+".png"));
                break;    
        }
    }


    
}
    
    
    
    
    
    


