package dreamhome;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class CrudPropiedad extends javax.swing.JFrame {
    static Connection cn;
    static Statement st;
    static ResultSet rs=null;
    int cantidadColumnas;
    int cantidadFilas;
    DefaultTableModel model;
    
    String numpropiedad;
    String estado;
    String calle;
    String ciudad;
    String codpostal;
    String tipo;
    String habitaciones;
    String renta;
    String numpropietario;
    String numempleado;
   

    public CrudPropiedad() 
    {
        initComponents();
        listbox();
        listbox2();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnumpropiedad = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtCiudad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePropiedad = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtCodigoPostal = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtHabitaciones = new javax.swing.JTextField();
        txtrenta = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox<>();
        cboTipo = new javax.swing.JComboBox<>();
        cboidpropietario = new javax.swing.JComboBox<>();
        cbonumempleado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DREAM HOME");
        setBackground(new java.awt.Color(69, 71, 97));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero Propiedad: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Estado: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Calle ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Ciudad: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Codigo Postal: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CRUD PROPIEDAD");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        tablePropiedad.setBorder(new javax.swing.border.MatteBorder(null));
        tablePropiedad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Propietario", "Nombre", "Apellido", "Direccion", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablePropiedad);
        if (tablePropiedad.getColumnModel().getColumnCount() > 0) {
            tablePropiedad.getColumnModel().getColumn(0).setHeaderValue("ID Propietario");
            tablePropiedad.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            tablePropiedad.getColumnModel().getColumn(2).setHeaderValue("Apellido");
            tablePropiedad.getColumnModel().getColumn(3).setHeaderValue("Direccion");
            tablePropiedad.getColumnModel().getColumn(4).setHeaderValue("Telefono");
        }

        btnListar.setText("Listar");
        btnListar.setToolTipText("");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tipo: ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Habitaciones: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Renta: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Numero de Empleado: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Numero Propietario: ");

        txtHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHabitacionesActionPerformed(evt);
            }
        });

        txtrenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentaActionPerformed(evt);
            }
        });

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Arrendada", "Reservada"}));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Departamento" }));

        cboidpropietario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        cboidpropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboidpropietarioActionPerformed(evt);
            }
        });

        cbonumempleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        cbonumempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonumempleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(186, 186, 186))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtnumpropiedad, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(txtCalle, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                                    .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cbonumempleado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jLabel12)
                                                                    .addGap(62, 62, 62))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                    .addComponent(jLabel11)
                                                                    .addGap(112, 112, 112)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtHabitaciones)
                                                                .addComponent(cboTipo, 0, 87, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel15)
                                                                .addComponent(jLabel13))
                                                            .addGap(20, 20, 20)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtrenta)
                                                                .addComponent(cboidpropietario, 0, 87, Short.MAX_VALUE)))))))
                                        .addGap(0, 93, Short.MAX_VALUE)))))
                        .addGap(48, 48, 48)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumpropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)
                            .addComponent(btnListar)
                            .addComponent(btnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtrenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cboidpropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cbonumempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(validarCamposVacios()==true)
        {
            ingresoPropiedad();
            listarPropiedad();
        } 
        else
        {
            JOptionPane.showMessageDialog(this, "No es posible ingresar propiedad");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtnumpropiedad.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese ID propiedad");
            JOptionPane.showMessageDialog(this, "No es posible eliminar propiedad");
        }
        else
        {
            eliminarPropiedad();
            listarPropiedad();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(validarCamposVacios()==true)
        {
            editarPropiedad();
            listarPropiedad();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No es posible editar propiedad");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarPropiedad();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCalle.setText("");
        txtCiudad.setText("");
        txtCodigoPostal.setText("");
        txtHabitaciones.setText("");
        txtnumpropiedad.setText("");
        txtrenta.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPostalActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Home nhome = new Home();
        nhome.setVisible(true);
        CrudPropiedad.this.dispose();           
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHabitacionesActionPerformed

    private void txtrentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentaActionPerformed

    private void cboidpropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboidpropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboidpropietarioActionPerformed

    private void cbonumempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonumempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbonumempleadoActionPerformed
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
            java.util.logging.Logger.getLogger(CrudPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudPropiedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudPropiedad().setVisible(true);
            }
        });
    }
public void conectar()
{
    try 
    {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        cn=DriverManager.getConnection(url,"user1","user1");
        st=cn.createStatement();
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible conectarse \n"+e);
    }
}
public boolean validarCamposVacios()
{
    if(txtnumpropiedad.getText().trim().length()==0)
    {
       JOptionPane.showMessageDialog(this, "Ingrese ID propiedad");
       return false;
    }
    else
    {
        if(txtCalle.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese calle");
            return false;
        }
        else
    {
        if(txtCiudad.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese ciudad");
            return false;
        }
        else
    {
        if(txtCodigoPostal.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese codigo postal");
            return false;
        }
        else
    {
        if(txtrenta.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese renta");
            return false;
        }
        else
        {
    {
        if(txtHabitaciones.getText().trim().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Ingrese habitaciones");
            return false;
        }
        else
        {
            return true;
        }
    }
    }
    }
    }
        }
    
        }
    }

public void ingresoPropiedad()
{
    try 
    {
        conectar();
        String estado=(String)cboEstado.getSelectedItem();
        String tipo=(String)cboTipo.getSelectedItem();
        String result="insert into PROPIEDAD values('"+txtnumpropiedad.getText()
                +"','"+estado+"','"+txtCalle.getText()
                +"','"+txtCiudad.getText()+"','"+txtCodigoPostal.getText()
                +"','"+tipo+"','"+txtHabitaciones.getText()
                +"','"+txtrenta.getText()+"','"+cboidpropietario.getSelectedItem()
                +"','"+cbonumempleado.getSelectedItem()+"')";
        st.executeQuery(result);
        cn.close();
        JOptionPane.showMessageDialog(null, "Ingresado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No ha sido posible ingresar \n"+e);
    }
}
public void eliminarPropiedad()
{
    try 
    {
        conectar();
        String result="delete from propiedad where numpropiedad='"+txtnumpropiedad.getText()+"'";
        st.executeQuery(result);
        cn.close();
        JOptionPane.showMessageDialog(null, "eliminado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible eliminar \n"+e);
    }
}
public void editarPropiedad()  //falta editar aqui
{
    try 
    {
        conectar();
        String result="update propiedad set estado='"+cboEstado.getSelectedItem()+"',calle='"
                +txtCalle.getText()+"',ciudad='"+txtCiudad.getText()+"',codigopostal='"
                +txtCodigoPostal.getText()+"',tipo='"+cboTipo.getSelectedItem()+"',hab='"
                +txtHabitaciones.getText()+"',renta='"+txtrenta.getText()+"',numpropietario='"
                +cboidpropietario.getSelectedItem()+"',numempleado='"+cbonumempleado.getSelectedItem()+"' where numpropiedad='"
                +txtnumpropiedad.getText()+"'";
        st.executeQuery(result);
        cn.close();
        JOptionPane.showMessageDialog(null, "editado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible editar \n"+e);
    }
}
public void listbox()
    {
        try
        {
        conectar();
        String resulta="select numpropietario from propietario";
        ResultSet rs=st.executeQuery(resulta);
        while(rs.next())
        {
               String tmpStrObtenido = rs.getString("numpropietario");
               cboidpropietario.addItem(tmpStrObtenido);
        }
        cn.close();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "No a sido posible editar \n"+e);
        }
    }
public void listbox2()
    {
        try
        {
        conectar();
        String resulta="select numempleado from empleado";
        ResultSet rs=st.executeQuery(resulta);
        while(rs.next())
        {
               String tmpStrObtenido = rs.getString("numempleado");
               cbonumempleado.addItem(tmpStrObtenido);
        }
        cn.close();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "No a sido posible editar \n"+e);
        }
    }
public void listarPropiedad()
{
    try 
    {
        conectar();
        String [] titulos={"N° Propiedad","Estado","Calle","Ciudad","Cod Postal",
            "Tipo","Habitaciones","Renta","Propietario","Empleado"};
        String result="SELECT * FROM PROPIEDAD";
        
        model= new DefaultTableModel(null,titulos);
        ResultSet rs=st.executeQuery(result);
        String []fila=new String[10];
        while(rs.next())
        {
            fila[0]=rs.getString("numpropiedad");
            fila[1]=rs.getString("estado");
            fila[2]=rs.getString("calle");
            fila[3]=rs.getString("ciudad");
            fila[4]=rs.getString("codigopostal");
            fila[5]=rs.getString("tipo");
            fila[6]=rs.getString("hab");
            fila[7]=rs.getString("renta");
            fila[8]=rs.getString("numpropietario");
            fila[9]=rs.getString("numempleado");
            model.addRow(fila);
            
        }
        tablePropiedad.setModel(model);
        cn.close();
        JOptionPane.showMessageDialog(null, "listado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible listar \n"+e);
    }
}

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JComboBox<String> cboidpropietario;
    private javax.swing.JComboBox<String> cbonumempleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePropiedad;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtHabitaciones;
    private javax.swing.JTextField txtnumpropiedad;
    private javax.swing.JTextField txtrenta;
    // End of variables declaration//GEN-END:variables
}
