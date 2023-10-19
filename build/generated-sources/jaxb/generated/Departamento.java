//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.10.19 a las 04:11:20 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="empleados"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="empleado" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="dni" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "direccion",
    "empleados"
})
@XmlRootElement(name = "departamento")
public class Departamento {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected Departamento.Empleados empleados;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad empleados.
     * 
     * @return
     *     possible object is
     *     {@link Departamento.Empleados }
     *     
     */
    public Departamento.Empleados getEmpleados() {
        return empleados;
    }

    /**
     * Define el valor de la propiedad empleados.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento.Empleados }
     *     
     */
    public void setEmpleados(Departamento.Empleados value) {
        this.empleados = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="empleado" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="dni" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "empleado"
    })
    public static class Empleados {

        @XmlElement(required = true)
        protected List<Departamento.Empleados.Empleado> empleado;

        /**
         * Gets the value of the empleado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the empleado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmpleado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Departamento.Empleados.Empleado }
         * 
         * 
         */
        public List<Departamento.Empleados.Empleado> getEmpleado() {
            if (empleado == null) {
                empleado = new ArrayList<Departamento.Empleados.Empleado>();
            }
            return this.empleado;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="puesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="dni" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "edad",
            "puesto"
        })
        public static class Empleado {

            @XmlElement(required = true)
            protected String nombre;
            @XmlElement(required = true)
            protected String edad;
            @XmlElement(required = true)
            protected String puesto;
            @XmlAttribute(name = "dni", required = true)
            protected String dni;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad edad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEdad() {
                return edad;
            }

            /**
             * Define el valor de la propiedad edad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEdad(String value) {
                this.edad = value;
            }

            /**
             * Obtiene el valor de la propiedad puesto.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPuesto() {
                return puesto;
            }

            /**
             * Define el valor de la propiedad puesto.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPuesto(String value) {
                this.puesto = value;
            }

            /**
             * Obtiene el valor de la propiedad dni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDni() {
                return dni;
            }

            /**
             * Define el valor de la propiedad dni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDni(String value) {
                this.dni = value;
            }

        }

    }

}
