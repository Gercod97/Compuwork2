/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

/**
 *
 * @author gerob
 */
public class Empleado {
    
    private static int contadorEmpleados=1;
    
    private String nombre;
    private long id;
    private int salario;
    private String departamento;
    public int numeroEmpleados;

    
    public Empleado (String nombre, int salario, String departamento){
        
        this.nombre=nombre;
        this.id=contadorEmpleados;
        this.salario=salario;
        this.departamento=departamento;
        contadorEmpleados++;
    }
    
    public Empleado (String nombre, long id, int salario, String departamento)
    {
        this.nombre=nombre;
        this.id=id;
        this.salario=salario;
        this.departamento=departamento;
    }
    
    public Empleado (){
        
    }
    
       

    public String getNombre() {
        return nombre;
    }

    public long getId() {
        return id;
    }

    public int getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void mostrarInfo() {
        System.out.println("\nNombre: " + nombre + " \nId: " + id + " \nSalario: " + salario + "\nDepartamento: " + departamento + "\n");
    }
    
    public void modificarEmpleado 
        (String nombre, long id, int salario,
         String departamento)
        {
        this.nombre=nombre;
        this.id=id;
        this.salario=salario;
        this.departamento=departamento;
        
    
    
    }
        
    @Override
    public String toString (){
     
        return "Empleado " + id + "\n" +
               "Nombre " + nombre + "\n" +
               "Salario " + salario + "\n" +
               "Departamento" + departamento;
    }
    


}
    