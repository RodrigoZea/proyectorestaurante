
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Le despliega la factura de su orden al usuario
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 * @version 1.0
 */
public class Factura extends javax.swing.JFrame {
Random rn = new Random();
Calculos calculos = new Calculos();
Login login = new Login();
public static ArrayList<Ordenes> ordenesFactura = new ArrayList<Ordenes>();
public static ArrayList<users> usuariosFactura = new ArrayList<users>();
private int tipo;
private String hora;
    /**
     * Creates new form Factura
     */

    public Factura(){  
        initComponents();
    }

    /**
     * Crea una form Factura a partir de los parametros enviados
     * @param Tipo
     * @param Hora
     */
    public Factura(int Tipo, String Hora) {
        initComponents();
        tipo = Tipo;
        hora = Hora;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        FacturaLbl = new javax.swing.JLabel();
        CompraLbl = new javax.swing.JLabel();
        HoraLbl = new javax.swing.JLabel();
        tarjetaLbl = new javax.swing.JLabel();
        ordenLbl = new javax.swing.JLabel();
        numOrdenLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        efectivoLbl = new javax.swing.JLabel();
        acpBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        FacturaLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FacturaLbl.setText("Su pedido estará listo a las");

        CompraLbl.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        CompraLbl.setText("¡Gracias por su compra!");

        HoraLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tarjetaLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tarjetaLbl.setText("Por favor, presente su tarjeta de crédito y muestre el siguiente mensaje para pagar");

        ordenLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ordenLbl.setText("Orden:");

        numOrdenLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        numOrdenLbl.setText("122");

        fechaLbl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fechaLbl.setText("Fecha: 22/09/2017");

        efectivoLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        efectivoLbl.setText("Por favor, tenga el efectivo listo y muestre el siguiente mensaje para pagar");

        acpBtn.setText("Aceptar");
        acpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acpBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FacturaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HoraLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ordenLbl)
                                .addGap(18, 18, 18)
                                .addComponent(numOrdenLbl))
                            .addComponent(fechaLbl)
                            .addComponent(acpBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tarjetaLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(efectivoLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(CompraLbl)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(CompraLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FacturaLbl)
                    .addComponent(HoraLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(tarjetaLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(efectivoLbl)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOrdenLbl)
                    .addComponent(ordenLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaLbl)
                .addGap(30, 30, 30)
                .addComponent(acpBtn)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acpBtnActionPerformed
        //Si le da aceptar, que se cierre el programa porque ya se completó 
        JOptionPane.showMessageDialog(null, "¡Que tenga un buen día!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        login.setVisible(true);                 
        
    }//GEN-LAST:event_acpBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Se pone un número de orden para el usuario, que es un random entre 1 y 1000
        //int numOrden = rn.nextInt((1000-1)+1)+1;
        //El label toma el valor del random
        numOrdenLbl.setText(ordenesFactura.get(ordenesFactura.size()-1).getOrden()+"");                
        
        //Se esconde lo necesario
        tarjetaLbl.setVisible(false);
        efectivoLbl.setVisible(false);
        HoraLbl.setText(hora);
        
        //Se muestra la factura con toda su informacion
        if (tipo == 0){ 
            //Se pone el mensaje respectivo si el usuario paga con efectivo
            efectivoLbl.setVisible(true); 
        } else if (tipo == 1){
            //Se pone el mensaje respectivo si el usuario paga con tarjeta
            tarjetaLbl.setVisible(true);
        }
        
        ordenesFactura.get(ordenesFactura.size()-1).setHora(hora);
        
        
        login.ordenesLogin = ordenesFactura;
        login.usuarios = usuariosFactura;
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompraLbl;
    private javax.swing.JLabel FacturaLbl;
    private javax.swing.JLabel HoraLbl;
    private javax.swing.JButton acpBtn;
    private javax.swing.JLabel efectivoLbl;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numOrdenLbl;
    private javax.swing.JLabel ordenLbl;
    private javax.swing.JLabel tarjetaLbl;
    // End of variables declaration//GEN-END:variables
}
