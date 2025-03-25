/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;

public class Departamento {
    private long id;
    private String nombreDepartamento;
    private String[] listaEmpleados;
    private Administrador admin = new Administrador();

    public Departamento(String nombreDepartamento, String[] listaEmpleados) {
        if (nombreDepartamento == null || listaEmpleados == null) {
            throw new IllegalArgumentException("El nombre del departamento y la lista de empleados no pueden ser nulos.");
        }
        this.nombreDepartamento = nombreDepartamento;
        this.listaEmpleados = listaEmpleados;
    }

    public Departamento(String nombreDepartamento) {
        if (nombreDepartamento == null) {
            throw new IllegalArgumentException("El nombre del departamento no puede ser nulo.");
        }
        this.nombreDepartamento = nombreDepartamento;
    }

    public Departamento() {}

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

    public String[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(String[] listaEmpleados) {
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
        try {
            return admin.getUser() != null && admin.getUser().equals(user) && 
                   admin.getPassword() != null && admin.getPassword().equals(password);
        } catch (Exception e) {
            System.out.println("Error al iniciar sesión: " + e.getMessage());
            return false;
        }
    }
}