/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class Server {
    public Socket socket;
    public ServerSocket server;
    public DataInputStream in;
    public boolean fin=true;
    public DataOutputStream out;
    public Socket AlaPantalla;
    
    public Server(int port){
        try {
            //Inicio de servidor y esperar coneccion
            server = new ServerSocket(port);
            System.out.println("Servidor inicializado");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        while(true){
        try{
            
            
            System.out.println("Esperando cliente...");
            socket= server.accept();
            System.out.println("Cliente aceptado");
            //Input del cliente
            in= new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());
            String line="";
            //lee el mensaje del cliente hasta leer fin
            while(fin){
                try{
                    
                    line=in.readUTF();
                    if(line.equals("Pacman")){
                        String Comando=in.readUTF();
                        if(Comando.equals("Arriba")){
                            Client c = new Client("127.0.0.1", 5600, "2");
                            System.out.println("Arriba");
                        }
                        if(Comando.equals("Abajo")){
                            Client c = new Client("127.0.0.1", 5600, "3");
                            System.out.println("Abajo");
                        }
                        if(Comando.equals("Derecha")){
                            Client c = new Client("127.0.0.1", 5600, "0");
                            System.out.println("Derecha");
                        }
                        if(Comando.equals("Izquierda")){
                            Client c = new Client("127.0.0.1", 5600, "1");
                            System.out.println("Izquierda");
                        }
                        if(Comando.equals("Pacman")){
                            System.out.println("Pacman");
                           Client c = new Client("127.0.0.1", 5600, "Pacman");
                        }
                        
                        
                        
                    }
                    if(line.equals("Fin")){
                        break;
                    }
                    
                    
                    
                }
                catch(IOException e){
                    
                }
            }
            System.out.println("Cerrando conexion");
            socket.close();
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }
}
