/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ad_tarea1_3_josemariagomezcereto;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

//Elemento Raíz y orden de los elementos del XML para "Empleado"
@XmlRootElement(name = "empleado")
@XmlType(propOrder = {"dni", "nombre", "edad", "puesto"})

/**
 *
 * @author josegomez
 */
public class Empleado {

    //Declaramos las variables
    String dni;
    String nombre;
    String edad;
    String puesto;

    //Constructor genérico sin parámetros
    public Empleado() {
    }

    //Declaramos el atributo
    @XmlAttribute(name = "dni")
    public String getDni() {
        return dni;
    }

    //Declaramos los elementos
    @XmlElement(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    @XmlElement(name = "edad")
    public String getEdad() {
        return edad;
    }

    @XmlElement(name = "puesto")
    public String getPuesto() {
        return puesto;
    }

    //Con sus setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
