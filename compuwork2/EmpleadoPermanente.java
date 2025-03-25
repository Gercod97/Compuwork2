/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

/**
 *
 * @author gerob
 */
public class EmpleadoPermanente extends Empleado {
    
    
    private int antiguedad;
    
    public EmpleadoPermanente (String nombre, long id, int salario, String departamento, int antiguedad){
        
        super(nombre,id,salario,departamento);
        
        this.antiguedad=antiguedad;
    }
    
    public EmpleadoPermanente (){
        
    }
    
   
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void mostrarDatosEmpleado (){
        System.out.println("La antiguedad del empleado es: " +antiguedad);
    }
    
}
