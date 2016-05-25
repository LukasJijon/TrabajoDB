package dreamhome;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class TriggerIngresaArriendo extends javax.swing.JFrame {
    static Connection cn;
    static Statement st;
    static ResultSet rs;
    int cantidadColumnas;
    int cantidadFilas;
    DefaultTableModel model;
    
    int numarriendo;
    String numpropiedad;
    String numcliente;
    char renta;
    String formaPago;
    char deposito;
    char pagado;
    Date inicioRenta;
    Date finRenta;
    

    public TriggerIngresaArriendo() {
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
        txtrenta = new javax.swing.JTextField();
        txtnumarriendo = new javax.swing.JTextField();
        txtpagado = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        txtformapago = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtdeposito = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        txtinicio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtfin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistar = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        cbonumpropiedad = new javax.swing.JComboBox<>();
        cbonumcliente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DREAM HOME");
        setBackground(new java.awt.Color(69, 71, 97));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero Arriendo: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Numero Propiedad : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Numero Cliente: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Pagado: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Forma Pago: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CRUD ARRIENDO");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtdeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepositoActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinicioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Deposito: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Renta: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Inicio Renta: ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Fin Renta: ");

        txtfin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfinActionPerformed(evt);
            }
        });

        tablalistar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Num Arriendo", "Num Propiedad", "Num Cliente", "Renta", "Forma Pago", "Deposito", "Pagado", "Inicio Renta", "Fin Renta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablalistar);

        btnListar.setText("Listar");
        btnListar.setToolTipText("");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        cbonumpropiedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        cbonumcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(txtnumarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(42, 42, 42)
                .addComponent(txtrenta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(53, 53, 53)
                .addComponent(txtpagado, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnAgregar)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addGap(148, 148, 148)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbonumcliente, 0, 87, Short.MAX_VALUE)
                    .addComponent(cbonumpropiedad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(4, 4, 4)
                        .addComponent(txtformapago, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(28, 28, 28)
                        .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(24, 24, 24)
                        .addComponent(txtdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addGap(42, 42, 42)
                        .addComponent(txtfin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtnumarriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtrenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtpagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(txtformapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbonumpropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(txtfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(cbonumcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAgregar)
                        .addComponent(btnListar))
                    .addComponent(btnLimpiar))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnVolver)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ingresoArriendo();
        listarArriendo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtdeposito.setText("");
        txtfin.setText("");
        txtformapago.setText("");
        txtinicio.setText("");
        txtnumarriendo.setText("");
        txtpagado.setText("");
        txtrenta.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepositoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepositoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Home nhome = new Home();
        nhome.setVisible(true);
        TriggerIngresaArriendo.this.dispose();           
    }//GEN-LAST:event_btnVolverActionPerformed
public void ingresoArriendo()
{
    try 
    {
        conectar();
        String result="insert into arriendo values('"+txtnumarriendo.getText()+"','"
                +cbonumpropiedad.getSelectedItem()+"','"+cbonumcliente.getSelectedItem()+"','"
                +txtrenta.getText()+"','"+txtformapago.getText()+"','"+txtdeposito.getText()+"','"+txtpagado.getText()+"','"+txtinicio.getText()+"','"+txtfin.getText()+"')";
        st.executeQuery(result);
        cn.close();
        JOptionPane.showMessageDialog(null, "Ingresado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible ingresar \n"+e);
    }
}
    private void txtinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinicioActionPerformed

    private void txtfinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfinActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        listarArriendo();        
    }//GEN-LAST:event_btnListarActionPerformed
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
            java.util.logging.Logger.getLogger(TriggerIngresaArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TriggerIngresaArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TriggerIngresaArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TriggerIngresaArriendo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new TriggerIngresaArriendo().setVisible(true);
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
public void listarArriendo()
{
    try 
    {
        conectar();
        String [] titulos={"Num Arriendo","Num Propiedad","Num Cliente","Renta","Forma Pago","Deposito","Pagado","Inicio Renta","Fin Renta"};
        String result="SELECT * FROM ARRIENDO";
        
        model= new DefaultTableModel(null,titulos);
        ResultSet rs=st.executeQuery(result);
        String []fila=new String[9];
        while(rs.next())
        {
            fila[0]=rs.getString("numarriendo");
            fila[1]=rs.getString("numpropiedad");
            fila[2]=rs.getString("numcliente");
            fila[3]=rs.getString("renta");
            fila[4]=rs.getString("formapago");
            fila[5]=rs.getString("deposito");
            fila[6]=rs.getString("pagado");
            fila[7]=rs.getString("iniciorenta");
            fila[8]=rs.getString("finrenta");
            model.addRow(fila);
            
        }
        tablalistar.setModel(model);
        cn.close();
        JOptionPane.showMessageDialog(null, "listado correctamente");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "No a sido posible listar \n"+e);
    }
}
public void listbox()
    {
        try
        {
        conectar();
        String resulta="select numpropiedad from propiedad";
        ResultSet rs=st.executeQuery(resulta);
        while(rs.next())
        {
               String tmpStrObtenido = rs.getString("numpropiedad");
               cbonumpropiedad.addItem(tmpStrObtenido);
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
        String resultad="select numcliente from cliente";
        ResultSet rs=st.executeQuery(resultad);
        while(rs.next())
        {
               String tmpStrObtenid = rs.getString("numcliente");
               cbonumcliente.addItem(tmpStrObtenid);
        }
        cn.close();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "No a sido posible editar \n"+e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbonumcliente;
    private javax.swing.JComboBox<String> cbonumpropiedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistar;
    private javax.swing.JTextField txtdeposito;
    private javax.swing.JTextField txtfin;
    private javax.swing.JTextField txtformapago;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextField txtnumarriendo;
    private javax.swing.JTextField txtpagado;
    private javax.swing.JTextField txtrenta;
    // End of variables declaration//GEN-END:variables
}
