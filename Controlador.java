/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlpacman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import pruebacliente.Client;

/**
 *
 * @author pablo
 */
public class Controlador implements ActionListener{
    public Control GUI;

    public Controlador(Control GUI) {
        this.GUI = GUI;
        GUI.BtnPacman.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Pacman"+".png"));
        GUI.BtnDerecha.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Derecha"+".png"));
        GUI.BtnIzquierda.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Izquierda"+".png"));
        GUI.BtnAbajo.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Abajo"+".png"));
        GUI.BtnArriba.setIcon(new ImageIcon("C:\\Users\\pablo\\OneDrive\\Documentos\\NetBeansProjects\\ControlPacman\\Img\\"+"Arriba"+".png"));
        GUI.BtnAbajo.addActionListener(this);
        GUI.BtnArriba.addActionListener(this);
        GUI.BtnDerecha.addActionListener(this);
        GUI.BtnIzquierda.addActionListener(this);
        GUI.BtnPacman.addActionListener(this);
        GUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(GUI.BtnAbajo)){
            System.out.println("Abajo");
            Client Salida = new Client("127.0.0.1", 5500, "Abajo");
        }
        if(e.getSource().equals(GUI.BtnArriba)){
            Client Salida = new Client("127.0.0.1", 5500, "Arriba");
            System.out.println("Arriba");
        }
        if(e.getSource().equals(GUI.BtnDerecha)){
            Client Salida = new Client("127.0.0.1", 5500, "Derecha");
            System.out.println("Derecha");
        }
        if(e.getSource().equals(GUI.BtnIzquierda)){
            Client Salida = new Client("127.0.0.1", 5500, "Izquierda");
            System.out.println("Izquierda");
        }
        if(e.getSource().equals(GUI.BtnPacman)){
            Client Salida = new Client("127.0.0.1", 5500, "Pacman");
            System.out.println("Pacman");
        }
    }
    
    
    
}
