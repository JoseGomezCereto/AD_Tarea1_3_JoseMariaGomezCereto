/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ad_tarea1_3_josemariagomezcereto;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author josegomez
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCabecera = new javax.swing.JPanel();
        etiMenu = new javax.swing.JLabel();
        etiTitulo = new javax.swing.JLabel();
        btnMostrar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMayores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        etiMostrar = new javax.swing.JLabel();
        etiAñadir = new javax.swing.JLabel();
        etiBorrar = new javax.swing.JLabel();
        etiMayores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiMenu.setText("Menú Principal");

        etiTitulo.setText("Lectura de Ficheros XML");

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(etiTitulo))
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(etiMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiTitulo)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMayores.setText("Mayores 25");
        btnMayores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayoresActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        etiMostrar.setText("Mostrar Contenido del XML");

        etiAñadir.setText("Añadir Empleado Nuevo");

        etiBorrar.setText("Eliminar Empleado");

        etiMayores.setText("Mostrar Mayores 25 años");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCabecera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMayores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiMayores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar)
                    .addComponent(etiMostrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(etiAñadir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(etiBorrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMayores)
                    .addComponent(etiMayores))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //Únicamente llamamos al método Mostrar que hemos definido.
        mostrarDatos();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Creamos una nueva pestaña de diálogo, y la mostramos
        DialogoDatos dialogo = new DialogoDatos(this, rootPaneCheckingEnabled);
        dialogo.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Creamos una nueva pestaña de diálogo y la mostramos.
        BorrarDatos dialogo = new BorrarDatos(this, rootPaneCheckingEnabled);
        dialogo.setVisible(true);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnMayoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayoresActionPerformed
        //Llamamos únicamente al método que hemos definido.
        mostrarMayores();
    }//GEN-LAST:event_btnMayoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Cerramos la pestaña actual. Me gusta más usar System.exit(0) (Salida estandar sin errores) antes que
        //Usar dispose, para que no se queden procesos en segundo plano ni nada de eso.
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    //Métodos 
    public void mostrarDatos() {
        //Como puede lanzar JAXB Exceptions necesitamos el bloque Try/Catch
        try {
            //Creamos nuestro contexto, nuestro unmarshaller y el objeto Departamento asociado al XML.
            JAXBContext contexto = JAXBContext.newInstance(Departamento.class);
            Unmarshaller leerxml = contexto.createUnmarshaller();
            Departamento departamento = (Departamento) leerxml.unmarshal(new File("empresa.xml"));
            //Creamos nuestro ArrayList de empleados, y en este caso un StringBuilder para construir el mensaje.
            ArrayList<Empleado> empleados = departamento.getEmpleados();
            StringBuilder mensaje = new StringBuilder();

            //Leemos el ArrayList
            for (Empleado empleado : empleados) {
                //Por cada empleado, construiremos nuestro mensaje usando .append. Por último, dos saltos de línea
                //Que mejoran la legibilidad.
                mensaje.append("Empleado:\n");
                mensaje.append("Dni: ").append(empleado.getDni()).append("\n");
                mensaje.append("Nombre: ").append(empleado.getNombre()).append("\n");
                mensaje.append("Edad: ").append(empleado.getEdad()).append("\n");
                mensaje.append("Puesto: ").append(empleado.getPuesto()).append("\n\n");
            }
            //Finalmente, mostramos el diálogo. Consiste en el nombre del departamento, la dirección del mismo,
            //y la lista de los empleados.
            JOptionPane.showMessageDialog(this, String.format("%s \n %s \n\n %s",
                    departamento.getNombre(), departamento.getDireccion(), mensaje.toString()),
                    "Contenido del documento XML", 1);

        } catch (JAXBException e) {
            e.getMessage();
        }
    }

    //Método para mostrar los mayores de 25 años. Es exactamente igual al anterior, pero con un "if" para comprobar
    public void mostrarMayores() {
        //De nuevo, al poder lanzar excepciones, necesitamos el bloque Try/Catch
        try {
            //Creamos nuestro contexto, nuestro unmarshaller, y nuestro objeto Departamento.
            JAXBContext contexto = JAXBContext.newInstance(Departamento.class);
            Unmarshaller leerxml = contexto.createUnmarshaller();
            Departamento departamento = (Departamento) leerxml.unmarshal(new File("empresa.xml"));
            //Creamos de nuevo la ArrayList de empleados, y el StringBuilder.
            ArrayList<Empleado> empleados = departamento.getEmpleados();
            StringBuilder mensaje = new StringBuilder();

            //El mismo bucle For-Each
            for (Empleado empleado : empleados) {
                //En este caso necesitamos una variable auxiliar para parsear la información, de String a Int.
                int edad = Integer.parseInt(empleado.getEdad());
                //Comprobamos que la edad sea mayor de 25. Mayor estricto según la tarea.
                if (edad > 25) {
                    //De ser así, añadimos al empleado al mensaje.
                    mensaje.append("Empleado:\n");
                    mensaje.append("Dni: ").append(empleado.getDni()).append("\n");
                    mensaje.append("Nombre: ").append(empleado.getNombre()).append("\n");
                    mensaje.append("Edad: ").append(empleado.getEdad()).append("\n");
                    mensaje.append("Puesto: ").append(empleado.getPuesto()).append("\n\n");
                }
            }
            //Una vez construido el mensaje, mostramos el mismo mensaje de antes, pero únicamente con los empleados
            //Que son mayores de 25 años.
            JOptionPane.showMessageDialog(this, String.format("%s \n %s \n\n %s",
                    departamento.getNombre(), "Mayores de 25 años:", mensaje.toString()),
                    "Contenido del documento XML", 1);
        } catch (JAXBException e) {
            e.getMessage();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnMayores;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel etiAñadir;
    private javax.swing.JLabel etiBorrar;
    private javax.swing.JLabel etiMayores;
    private javax.swing.JLabel etiMenu;
    private javax.swing.JLabel etiMostrar;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel panelCabecera;
    // End of variables declaration//GEN-END:variables
}
