/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compuwork2;
import compuwork2.Presentacion.iniciarSesion;
import compuwork2.Presentacion.interfaceCompuwork2;

/**
 *
 * @author gerob
 */
public class Compuwork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Departamento departamento = new Departamento ();
        
        Administrador admin = new Administrador ("Geronimo","Gero101028");
        
             
        interfaceCompuwork2 present = new interfaceCompuwork2();
        
        iniciarSesion ini=new iniciarSesion(present,true);
        
        
        
        ini.setVisible(true);
        
        
 
    }
    
}
