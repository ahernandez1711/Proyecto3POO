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
public class GUIControl {
    public GUI UI=new GUI();
    public JButton[][] MatrizTablero= new JButton[26][29];
    public int[][] Tablero = new int[26][29];
    public Jugador Pacman;
    public Fantasma Red;
    public Fantasma Blue;
    public Fantasma Pink;
    public Fantasma Purple;
    public Server Servidor;
    
    public GUIControl(Server entrada){
        this.Servidor=entrada;
        _init_();
        generarBotones();
        this.Red= new Fantasma(Tablero, MatrizTablero, 11, 9,"Red",false);
        this.Blue= new Fantasma(Tablero, MatrizTablero, 11, 18,"Blue",false);
        this.Pink= new Fantasma(Tablero, MatrizTablero, 11, 9,"Pink",false);
        this.Purple= new Fantasma(Tablero, MatrizTablero, 11, 18,"Purple",false);
        this.Pacman=new Jugador(Tablero, MatrizTablero, 12, 16,Red,Blue,Pink,Purple,this);
        this.Pacman.start();
        this.Red.start();
        this.Purple.start();
        this.Blue.start();
        this.Pink.start();
    }
    
    public void generarBotones(){
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 29; j++) {
                JButton Boton= new JButton();
                MatrizTablero[i][j]=Boton;
                Border emptyBorder = BorderFactory.createEmptyBorder();
                Boton.setBorder(emptyBorder);
                Boton.setSize(25, 25);
                if(Tablero[i][j]==0){
                        Boton.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"0"+".png"));
                    }else{
                    if(Tablero[i][j]==1){
                        Boton.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"1"+".png"));
                    }else if(Tablero[i][j]==2){
                        Boton.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"2"+".png"));
                    }else{
                        Boton.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\JuegoPacman\\Img\\"+"5"+".png"));
                    }
                }
                UI.PnlFondo.add(Boton);
                Boton.setLocation(i*25, j*25);
            }
        }
    }
    public void _init_(){
        this.Tablero[1][1]=1;
        this.Tablero[2][1]=1;
        this.Tablero[3][1]=1;
        this.Tablero[4][1]=1;
        this.Tablero[1][2]=1;
        this.Tablero[2][2]=1;
        this.Tablero[3][2]=1;
        this.Tablero[4][2]=1;
        this.Tablero[1][3]=1;
        this.Tablero[2][3]=1;
        this.Tablero[3][3]=1;
        this.Tablero[4][3]=1;
        
        this.Tablero[6][1]=1;
        this.Tablero[7][1]=1;
        this.Tablero[8][1]=1;
        this.Tablero[9][1]=1;
        this.Tablero[10][1]=1;
        this.Tablero[6][2]=1;
        this.Tablero[7][2]=1;
        this.Tablero[8][2]=1;
        this.Tablero[9][2]=1;
        this.Tablero[10][2]=1;
        this.Tablero[6][3]=1;
        this.Tablero[7][3]=1;
        this.Tablero[8][3]=1;
        this.Tablero[9][3]=1;
        this.Tablero[10][3]=1;
        
        this.Tablero[12][0]=1;
        this.Tablero[13][0]=1;
        this.Tablero[12][1]=1;
        this.Tablero[13][1]=1;
        this.Tablero[12][2]=1;
        this.Tablero[13][2]=1;
        this.Tablero[12][3]=1;
        this.Tablero[13][3]=1;
        this.Tablero[12][7]=1;
        this.Tablero[13][7]=1;
        this.Tablero[12][8]=1;
        this.Tablero[13][8]=1;
        this.Tablero[12][9]=1;
        this.Tablero[13][9]=1;
        
        
        this.Tablero[15][1]=1;
        this.Tablero[16][1]=1;
        this.Tablero[17][1]=1;
        this.Tablero[18][1]=1;
        this.Tablero[19][1]=1;
        this.Tablero[15][2]=1;
        this.Tablero[16][2]=1;
        this.Tablero[17][2]=1;
        this.Tablero[18][2]=1;
        this.Tablero[19][2]=1;
        this.Tablero[15][3]=1;
        this.Tablero[16][3]=1;
        this.Tablero[17][3]=1;
        this.Tablero[18][3]=1;
        this.Tablero[19][3]=1;
        
        this.Tablero[21][1]=1;
        this.Tablero[22][1]=1;
        this.Tablero[23][1]=1;
        this.Tablero[24][1]=1;
        this.Tablero[21][2]=1;
        this.Tablero[22][2]=1;
        this.Tablero[23][2]=1;
        this.Tablero[24][2]=1;
        this.Tablero[21][3]=1;
        this.Tablero[22][3]=1;
        this.Tablero[23][3]=1;
        this.Tablero[24][3]=1;
        
        this.Tablero[1][5]=1;
        this.Tablero[2][5]=1;
        this.Tablero[3][5]=1;
        this.Tablero[4][5]=1;
        this.Tablero[1][6]=1;
        this.Tablero[2][6]=1;
        this.Tablero[3][6]=1;
        this.Tablero[4][6]=1;
        
        this.Tablero[0][8]=1;
        this.Tablero[1][8]=1;
        this.Tablero[2][8]=1;
        this.Tablero[3][8]=1;
        this.Tablero[4][8]=1;
        this.Tablero[4][9]=1;
        this.Tablero[4][10]=1;
        this.Tablero[4][11]=1;
        this.Tablero[4][12]=1;
        this.Tablero[3][12]=1;
        this.Tablero[2][12]=1;
        this.Tablero[1][12]=1;
        this.Tablero[0][12]=1;
        
        for (int i = 0; i < 4; i++) {
            this.Tablero[i][9]=2;
            this.Tablero[i][10]=2;
            this.Tablero[i][11]=2;
            
            this.Tablero[i+22][9]=2;
            this.Tablero[i+22][10]=2;
            this.Tablero[i+22][11]=2;
            
            this.Tablero[i][15]=2;
            this.Tablero[i][16]=2;
            this.Tablero[i][17]=2;
            
            this.Tablero[i+22][15]=2;
            this.Tablero[i+22][16]=2;
            this.Tablero[i+22][17]=2;
        }
        
        this.Tablero[25][8]=1;
        this.Tablero[24][8]=1;
        this.Tablero[23][8]=1;
        this.Tablero[22][8]=1;
        this.Tablero[21][8]=1;
        this.Tablero[21][9]=1;
        this.Tablero[21][10]=1;
        this.Tablero[21][11]=1;
        this.Tablero[21][12]=1;
        this.Tablero[22][12]=1;
        this.Tablero[23][12]=1;
        this.Tablero[24][12]=1;
        this.Tablero[25][12]=1;
        
        this.Tablero[25][14]=1;
        this.Tablero[24][14]=1;
        this.Tablero[23][14]=1;
        this.Tablero[22][14]=1;
        this.Tablero[21][14]=1;
        this.Tablero[21][15]=1;
        this.Tablero[21][16]=1;
        this.Tablero[21][17]=1;
        this.Tablero[21][18]=1;
        this.Tablero[22][18]=1;
        this.Tablero[23][18]=1;
        this.Tablero[24][18]=1;
        this.Tablero[25][18]=1;
        
        this.Tablero[19][18]=1;
        this.Tablero[19][14]=1;
        this.Tablero[19][15]=1;
        this.Tablero[19][16]=1;
        this.Tablero[19][17]=1;
        this.Tablero[18][18]=1;
        this.Tablero[18][14]=1;
        this.Tablero[18][15]=1;
        this.Tablero[18][16]=1;
        this.Tablero[18][17]=1;
        
        this.Tablero[6][18]=1;
        this.Tablero[6][14]=1;
        this.Tablero[6][15]=1;
        this.Tablero[6][16]=1;
        this.Tablero[6][17]=1;
        this.Tablero[7][18]=1;
        this.Tablero[7][14]=1;
        this.Tablero[7][15]=1;
        this.Tablero[7][16]=1;
        this.Tablero[7][17]=1;
        
        this.Tablero[9][17]=1;
        this.Tablero[9][18]=1;
        this.Tablero[10][17]=1;
        this.Tablero[10][18]=1;
        this.Tablero[11][17]=1;
        this.Tablero[11][18]=1;
        this.Tablero[12][17]=1;
        this.Tablero[12][18]=1;
        this.Tablero[13][17]=1;
        this.Tablero[13][18]=1;
        this.Tablero[14][17]=1;
        this.Tablero[14][18]=1;
        this.Tablero[15][17]=1;
        this.Tablero[15][18]=1;
        this.Tablero[16][17]=1;
        this.Tablero[16][18]=1;
        this.Tablero[12][19]=1;
        this.Tablero[13][19]=1;
        this.Tablero[12][20]=1;
        this.Tablero[13][20]=1;
        this.Tablero[12][21]=1;
        this.Tablero[13][21]=1;
        
        this.Tablero[9][17+6]=1;
        this.Tablero[9][18+6]=1;
        this.Tablero[10][17+6]=1;
        this.Tablero[10][18+6]=1;
        this.Tablero[11][17+6]=1;
        this.Tablero[11][18+6]=1;
        this.Tablero[12][17+6]=1;
        this.Tablero[12][18+6]=1;
        this.Tablero[13][17+6]=1;
        this.Tablero[13][18+6]=1;
        this.Tablero[14][17+6]=1;
        this.Tablero[14][18+6]=1;
        this.Tablero[15][17+6]=1;
        this.Tablero[15][18+6]=1;
        this.Tablero[16][17+6]=1;
        this.Tablero[16][18+6]=1;
        this.Tablero[12][19+6]=1;
        this.Tablero[13][19+6]=1;
        this.Tablero[12][20+6]=1;
        this.Tablero[13][20+6]=1;
        this.Tablero[12][21+6]=1;
        this.Tablero[13][21+6]=1;
        
        this.Tablero[10][21]=1;
        this.Tablero[10][20]=1;
        this.Tablero[9][21]=1;
        this.Tablero[9][20]=1;
        this.Tablero[8][21]=1;
        this.Tablero[8][20]=1;
        this.Tablero[7][21]=1;
        this.Tablero[7][20]=1;
        this.Tablero[6][21]=1;
        this.Tablero[6][20]=1;
        
        this.Tablero[15][21]=1;
        this.Tablero[15][20]=1;
        this.Tablero[16][21]=1;
        this.Tablero[16][20]=1;
        this.Tablero[17][21]=1;
        this.Tablero[17][20]=1;
        this.Tablero[18][21]=1;
        this.Tablero[18][20]=1;
        this.Tablero[19][21]=1;
        this.Tablero[19][20]=1;
        
        this.Tablero[21][21]=1;
        this.Tablero[21][20]=1;
        this.Tablero[22][21]=1;
        this.Tablero[22][20]=1;
        this.Tablero[23][21]=1;
        this.Tablero[23][20]=1;
        this.Tablero[24][21]=1;
        this.Tablero[24][20]=1;
        this.Tablero[21][22]=1;
        this.Tablero[21][23]=1;
        this.Tablero[22][22]=1;
        this.Tablero[22][23]=1;
        this.Tablero[22][24]=1;
        this.Tablero[21][24]=1;
        
        this.Tablero[4][21]=1;
        this.Tablero[4][20]=1;
        this.Tablero[3][21]=1;
        this.Tablero[3][20]=1;
        this.Tablero[2][21]=1;
        this.Tablero[2][20]=1;
        this.Tablero[1][21]=1;
        this.Tablero[1][20]=1;
        this.Tablero[4][22]=1;
        this.Tablero[4][23]=1;
        this.Tablero[3][22]=1;
        this.Tablero[3][23]=1;
        this.Tablero[3][24]=1;
        this.Tablero[4][24]=1;
        
        this.Tablero[0][24]=1;
        this.Tablero[0][23]=1;
        this.Tablero[1][23]=1;
        this.Tablero[1][24]=1;
        
        this.Tablero[25][24]=1;
        this.Tablero[25][23]=1;
        this.Tablero[24][23]=1;
        this.Tablero[24][24]=1;
        
        this.Tablero[6][24]=1;
        this.Tablero[6][23]=1;
        this.Tablero[7][23]=1;
        this.Tablero[7][24]=1;
        this.Tablero[6][25]=1;
        this.Tablero[6][26]=1;
        this.Tablero[7][25]=1;
        this.Tablero[7][26]=1;
        this.Tablero[6][27]=1;
        this.Tablero[7][27]=1;
        this.Tablero[8][27]=1;
        this.Tablero[9][27]=1;
        this.Tablero[10][27]=1;
        this.Tablero[10][26]=1;
        this.Tablero[8][26]=1;
        this.Tablero[9][26]=1;
        this.Tablero[7][26]=1;
        this.Tablero[7][27]=1;
        this.Tablero[6][26]=1;
        this.Tablero[6][27]=1;
        this.Tablero[5][26]=1;
        this.Tablero[5][27]=1;
        this.Tablero[4][26]=1;
        this.Tablero[4][27]=1;
        this.Tablero[3][26]=1;
        this.Tablero[3][27]=1;
        this.Tablero[2][26]=1;
        this.Tablero[2][27]=1;
        this.Tablero[1][26]=1;
        this.Tablero[1][27]=1;
        
        this.Tablero[6+12][24]=1;
        this.Tablero[6+12][23]=1;
        this.Tablero[7+12][23]=1;
        this.Tablero[7+12][24]=1;
        this.Tablero[6+12][25]=1;
        this.Tablero[6+12][26]=1;
        this.Tablero[7+12][25]=1;
        this.Tablero[7+12][26]=1;
        this.Tablero[6+12][27]=1;
        this.Tablero[7+14][27]=1;
        this.Tablero[8+14][27]=1;
        this.Tablero[9+14][27]=1;
        this.Tablero[10+14][27]=1;
        this.Tablero[10+14][26]=1;
        this.Tablero[8+14][26]=1;
        this.Tablero[9+14][26]=1;
        this.Tablero[7+14][26]=1;
        this.Tablero[7+14][27]=1;
        this.Tablero[6+14][26]=1;
        this.Tablero[6+14][27]=1;
        this.Tablero[5+14][26]=1;
        this.Tablero[5+14][27]=1;
        this.Tablero[4+14][26]=1;
        this.Tablero[4+14][27]=1;
        this.Tablero[3+14][26]=1;
        this.Tablero[3+14][27]=1;
        this.Tablero[2+14][26]=1;
        this.Tablero[2+14][27]=1;
        this.Tablero[1+14][26]=1;
        this.Tablero[1+14][27]=1;
        
        this.Tablero[25][13]=2;
        this.Tablero[24][13]=2;
        this.Tablero[23][13]=2;
        this.Tablero[22][13]=2;
        this.Tablero[21][13]=2;
        
        this.Tablero[4][14]=1;
        this.Tablero[3][14]=1;
        this.Tablero[2][14]=1;
        this.Tablero[1][14]=1;
        this.Tablero[0][14]=1;
        this.Tablero[4][15]=1;
        this.Tablero[4][16]=1;
        this.Tablero[4][17]=1;
        this.Tablero[4][18]=1;
        this.Tablero[3][18]=1;
        this.Tablero[2][18]=1;
        this.Tablero[1][18]=1;
        this.Tablero[0][18]=1;
        
        
        this.Tablero[4][13]=2;
        this.Tablero[3][13]=2;
        this.Tablero[2][13]=2;
        this.Tablero[1][13]=2;
        this.Tablero[0][13]=2;
        
        for (int i = 0; i < 10; i++) {
            Tablero[i+8][10]=2;
            Tablero[i+8][11]=2;
            Tablero[i+8][12]=2;
            Tablero[i+8][13]=2;
            Tablero[i+8][14]=2;
            Tablero[i+8][15]=2;
            Tablero[i+8][15]=2;
            Tablero[i+8][16]=2;
        }
        
        Tablero[9][11]=1;
        Tablero[9][12]=1;
        Tablero[9][13]=1;
        Tablero[9][14]=1;
        Tablero[9][15]=1;
        Tablero[9][15]=1;
        Tablero[10][11]=1;
        Tablero[11][11]=1;
        Tablero[12][11]=1;
        Tablero[13][11]=1;
        Tablero[14][11]=1;
        Tablero[15][11]=1;
        Tablero[16][11]=1;
        Tablero[10][15]=1;
        Tablero[11][15]=1;
        Tablero[12][15]=1;
        Tablero[13][15]=1;
        Tablero[14][15]=1;
        Tablero[15][15]=1;
        Tablero[16][15]=1;
        Tablero[16][14]=1;
        Tablero[16][13]=1;
        Tablero[16][12]=1;
        Tablero[16][11]=1;

        this.Tablero[6][5]=1;
        this.Tablero[7][5]=1;
        this.Tablero[6][6]=1;
        this.Tablero[7][6]=1;
        this.Tablero[6][7]=1;
        this.Tablero[7][7]=1;
        this.Tablero[6][8]=1;
        this.Tablero[7][8]=1;
        this.Tablero[6][9]=1;
        this.Tablero[7][9]=1;
        this.Tablero[6][10]=1;
        this.Tablero[7][10]=1;
        this.Tablero[6][11]=1;
        this.Tablero[7][11]=1;
        this.Tablero[6][12]=1;
        this.Tablero[7][12]=1;
        this.Tablero[8][8]=1;
        this.Tablero[8][9]=1;
        this.Tablero[9][8]=1;
        this.Tablero[9][9]=1;
        this.Tablero[10][8]=1;
        this.Tablero[10][9]=1;
        this.Tablero[10][9]=1;
        this.Tablero[10][9]=1;
        
        this.Tablero[9][5]=1;
        this.Tablero[10][5]=1;
        this.Tablero[11][5]=1;
        this.Tablero[12][5]=1;
        this.Tablero[13][5]=1;
        this.Tablero[14][5]=1;
        this.Tablero[15][5]=1;
        this.Tablero[16][5]=1;
        this.Tablero[9][6]=1;
        this.Tablero[10][6]=1;
        this.Tablero[11][6]=1;
        this.Tablero[12][6]=1;
        this.Tablero[13][6]=1;
        this.Tablero[14][6]=1;
        this.Tablero[15][6]=1;
        this.Tablero[16][6]=1;
        
        this.Tablero[18][5]=1;
        this.Tablero[19][5]=1;
        this.Tablero[18][6]=1;
        this.Tablero[19][6]=1;
        this.Tablero[18][7]=1;
        this.Tablero[19][7]=1;
        this.Tablero[18][8]=1;
        this.Tablero[19][8]=1;
        this.Tablero[18][9]=1;
        this.Tablero[19][9]=1;
        this.Tablero[18][10]=1;
        this.Tablero[19][10]=1;
        this.Tablero[18][11]=1;
        this.Tablero[19][11]=1;
        this.Tablero[18][12]=1;
        this.Tablero[19][12]=1;
        this.Tablero[17][8]=1;
        this.Tablero[16][8]=1;
        this.Tablero[15][8]=1;
        this.Tablero[17][9]=1;
        this.Tablero[16][9]=1;
        this.Tablero[15][9]=1;
        
        
        this.Tablero[21][5]=1;
        this.Tablero[22][5]=1;
        this.Tablero[23][5]=1;
        this.Tablero[24][5]=1;
        this.Tablero[21][6]=1;
        this.Tablero[22][6]=1;
        this.Tablero[23][6]=1;
        this.Tablero[24][6]=1;
        this.Tablero[0][2]=5;
        this.Tablero[25][2]=5;
        this.Tablero[0][22]=5;
        this.Tablero[25][22]=5;
    }


}
