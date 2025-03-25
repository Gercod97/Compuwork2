/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

/**
 *
 * @author gerob
 */
public class ReporteDesempeno {
    
    private int idEmpleado;
    private int calificacionEmpleado;
    private String nombreEmpleado;

    public ReporteDesempeno(int idEmpleado, int calificacionEmpleado, String nombreEmpleado) {
        this.idEmpleado = idEmpleado;
        this.calificacionEmpleado = calificacionEmpleado;
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public int getCalificacionEmpleado() {
        return calificacionEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setCalificacionEmpleado(int calificacionEmpleado) {
        this.calificacionEmpleado = calificacionEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }
    
    
    
    
}
