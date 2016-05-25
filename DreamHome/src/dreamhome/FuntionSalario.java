package dreamhome;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class FuntionSalario extends javax.swing.JFrame {
    static Connection cn;
    static Statement st;
    static ResultSet rs;
    int cantidadColumnas;
    int cantidadFilas;
    DefaultTableModel model;
    
    String estado;

    public FuntionSalario() {
        initComponents();
        listbox();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        mostrar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        cboOficina = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DREAM HOME");
        setBackground(new java.awt.Color(69, 71, 97));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero Oficina ");

        btnLimpiar.setText("Mostrar");
        btnLimpiar.setToolTipText("");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Salario Total Por Oficina");

        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        cboOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addGap(30, 30, 30)
                            .addComponent(cboOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(btnLimpiar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnLimpiar)
                    .addComponent(cboOficina, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnVolver1)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        totalSalario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
       Home nhome = new Home();
        nhome.setVisible(true);
        FuntionSalario.this.dispose();  
    }//GEN-LAST:event_btnVolver1ActionPerformed
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
            java.util.logging.Logger.getLogger(FuntionSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuntionSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuntionSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuntionSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuntionSalario().setVisible(true);
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
public void totalSalario()
{
    try 
    {
        conectar();
        String result="select SalariosPorOficina('"+cboOficina.getSelectedItem()+"') as es from dual";
        ResultSet rs=st.executeQuery(result);
        while(rs.next())
        {
            mostrar.setText(rs.getString("es"));
        }
        cn.close();
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
        String resulta="select numoficina from oficina";
        ResultSet rs=st.executeQuery(resulta);
        while(rs.next())
        {
               String tmpStrObtenido = rs.getString("numoficina");
               cboOficina.addItem(tmpStrObtenido);
        }
        cn.close();
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "No a sido posible editar \n"+e);
        }
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JComboBox<String> cboOficina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mostrar;
    // End of variables declaration//GEN-END:variables
}
