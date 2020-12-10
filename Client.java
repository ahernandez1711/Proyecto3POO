/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pablo
 */
public class Client {
    public Socket socket;
    public DataInputStream input;
    public DataInputStream in;
    public DataOutputStream out;
    public String mensaje;
    
    public Client(String address, int port,String mensaje){
        this.mensaje=mensaje;
        //Estableciendo conexion
        try{
            
            socket= new Socket(address, port);
            System.out.println("Conectado");
            
            //Toma el input
            input = new DataInputStream(System.in);
            in= new DataInputStream(socket.getInputStream());
            //Envia el output
            out = new DataOutputStream(socket.getOutputStream());
            
            
            
        } catch(UnknownHostException e){
            System.out.println(e);
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        //Leer hasta que diga "fin"
       try{
               
                out.writeUTF(mensaje);
                
                
                out.writeUTF("Fin");
                
       }
            catch(IOException a){
                
            }
            
            
            try{
                input.close();
                out.close();
                socket.close();
            }catch(IOException f){
                System.out.println(f);
            }
            
            
        
        
    }
}

