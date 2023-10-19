/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_tarea1_3_josemariagomezcereto;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "departamento")
@XmlType(propOrder = {"nombre", "direccion", "empleados"})

/**
 *
 * @author josegomez
 */
public class Departamento {

    //Declaración de variables
    String nombre;
    String direccion;
    private ArrayList<Empleado> empleados = new ArrayList();

    //Constructor genérico sin parámetros
    public Departamento() {
    }

    //Declaramos los elementos
    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    @XmlElement(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    //Con sus setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Especificamos que la lista de empleados (empleados) estará conformada como un elemento XML llamado "empleados"
    //Y cada elemento es un elemento "empleado"
    @XmlElementWrapper(name = "empleados")
    @XmlElement(name = "empleado")
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    //Con su setter
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
