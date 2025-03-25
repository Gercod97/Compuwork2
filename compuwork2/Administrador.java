/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compuwork2;
import java.util.*;

public class Administrador extends Empleado {
    private String user;
    private String password;
    private final ArrayList<Empleado> listaEmpleados = new ArrayList<>();
    private final ArrayList<Departamento> listaDepartamentos = new ArrayList<>();

    public Administrador(String nombre, long id, int salario, String departamento, String user, String password) {
        super(nombre, id, salario, departamento);
        this.user = user;
        this.password = password;
    }

    public Administrador() {}

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

    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo");
        }
        listaEmpleados.add(empleado);
    }

    public void agregarDepartamento(Departamento departamento) {
        if (departamento == null) {
            throw new IllegalArgumentException("El departamento no puede ser nulo");
        }
        listaDepartamentos.add(departamento);
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
