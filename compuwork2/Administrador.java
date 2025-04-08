/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;
import java.util.*;

public class Administrador extends Empleado {
    private String user;
    private String password;
    private ArrayList<Empleado> listaEmpleados;

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void setListaDepartamentos(ArrayList<Departamento> listaDepartamentos) {
        this.listaDepartamentos = listaDepartamentos;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public ArrayList<Departamento> getListaDepartamentos() {
        return listaDepartamentos;
    }
    private ArrayList<Departamento> listaDepartamentos;

    public Administrador(String nombre, long id, int salario, String departamento, String user, String password) {
        super(nombre, id, salario, departamento);
        this.user = user;
        this.password = password;
        this.listaEmpleados= new ArrayList<>();
    }

    public Administrador() {
        this.listaEmpleados= new ArrayList<>();
    }

    public Administrador(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Empleado buscarEmpleado (String nombre) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            
            Empleado emp=this.listaEmpleados.get(i);
            if(emp.getNombre().equals(nombre)){
                return emp;
            }
            
        } return null;
        
    }
    
    
    public boolean agregarEmpleado(Empleado empleado) {

       return listaEmpleados.add(empleado);
    }

    public boolean agregarDepartamento(Departamento departamento) {
       
       return listaDepartamentos.add(departamento);
    }

    public Empleado mostrarEmpleados(long id) {
        try {
            for (Empleado emp : listaEmpleados) {
                if (emp.getId() == id) {
                    return emp;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar empleado: " + e.getMessage());
        }
        return null;
    }

    public Empleado modificarEmpleado(long id, Empleado empleado) {
        try {
            int index = buscarIndice(id);
            if (index >= 0) {
                return listaEmpleados.set(index, empleado);
            }
        } catch (Exception e) {
            System.out.println("Error al modificar empleado: " + e.getMessage());
        }
        return null;
    }

    public Empleado eliminarEmpleado(long id) {
        try {
            int index = buscarIndice(id);
            if (index >= 0) {
                return listaEmpleados.remove(index);
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
        }
        return null;
    }

    public String mostrarEmpleado() {
        if (listaEmpleados.isEmpty()) {
            return "No hay empleados registrados.";
        }
        StringBuilder empleados = new StringBuilder();
        for (Empleado emp : listaEmpleados) {
            empleados.append(emp.toString()).append("\n");
        }
        return empleados.toString();
    }

    public Departamento mostrarDepartamentos(long id) {
        try {
            for (Departamento depto : listaDepartamentos) {
                if (depto.getId() == id) {
                    return depto;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar departamento: " + e.getMessage());
        }
        return null;
    }

    private int buscarIndice(long id) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void mostrarDepartamentos() {
        if (listaDepartamentos.isEmpty()) {
            System.out.println("No hay departamentos registrados.");
            return;
        }
        System.out.println("\nLista de departamentos:");
        for (Departamento departamento : listaDepartamentos) {
            departamento.mostrarInfo();
        }
    }
}
