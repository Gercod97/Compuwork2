/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

/**
 *
 * @author gerob
 */
public class EmpleadoTemporal extends Empleado {
    
    private int fechaFinContrato;

    public void setFechaFinContrato(int fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }
    
    public EmpleadoTemporal (){
        
    }
    
    public EmpleadoTemporal (String nombre, long id, int salario, String departamento,int fechaFinContrato ){
        super (nombre,id,salario,departamento);
        
        this.fechaFinContrato=fechaFinContrato;
    }

    public int getFechaFinContrato() {
        return fechaFinContrato;
    }
    
    
    
}

