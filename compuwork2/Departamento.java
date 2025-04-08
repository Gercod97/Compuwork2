/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

import java.util.ArrayList;

public class Departamento {
    private long id;
    private String nombreDepartamento;
    private ArrayList<Empleado> listaEmpleados;
    private Administrador admin;

    public Departamento(String nombreDepartamento, ArrayList<Empleado> listaEmpleados) {
        this.admin = new Administrador ("Geronimo","Gero101028");
        if (nombreDepartamento == null || listaEmpleados == null) {
            throw new IllegalArgumentException("El nombre del departamento y la lista de empleados no pueden ser nulos.");
        }
        this.nombreDepartamento = nombreDepartamento;
        this.listaEmpleados = new ArrayList<>();
    }

    public Departamento(String nombreDepartamento) {
        this.admin = new Administrador ("Geronimo","Gero101028");
        if (nombreDepartamento == null) {
            throw new IllegalArgumentException("El nombre del departamento no puede ser nulo.");
        }
        this.nombreDepartamento = nombreDepartamento;
    }

    public Departamento() {this.admin = new Administrador ("Geronimo","Gero101028");
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        if (nombreDepartamento == null || nombreDepartamento.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del departamento no puede estar vacío o nulo.");
        }
        this.nombreDepartamento = nombreDepartamento;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        if (this.listaEmpleados==null) {
            this.listaEmpleados= new ArrayList<>();
        }
        return this.listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        if (listaEmpleados == null) {
            throw new IllegalArgumentException("La lista de empleados no puede ser nula.");
        }
        this.listaEmpleados = listaEmpleados;
    }

    public void mostrarInfo() {
        try {
            System.out.println("\nNombre: " + nombreDepartamento);
        } catch (Exception e) {
            System.out.println("Error al mostrar información del departamento: " + e.getMessage());
        }
    }

    public boolean iniciarSesion(String user, String password) {
        
        return (this.admin.getUser().equals(user) && this.admin.getPassword().equals(password));

    }
    

    }


    
