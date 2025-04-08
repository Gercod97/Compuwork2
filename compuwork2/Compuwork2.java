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
        

           
        Administrador admin=new Administrador();   
        interfaceCompuwork2 principal = new interfaceCompuwork2(admin);
        Departamento departamento = new Departamento();
        iniciarSesion ini=new iniciarSesion(null, true, principal,admin,departamento);
        ini.setVisible(true);
        principal.setVisible(true);
        
        
 
    }
    
}
