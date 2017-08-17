
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Zea, Oscar Juárez, Andrés Quan
 */
public class Orden extends javax.swing.JFrame {
    //Variables de instancia
    private int total;
    private String hora;
    private int HoraCe, HoraAb, nHora;
    Factura compra = new Factura();
    /**
     * Creates new form Orden sin parámetros
     */
    public Orden() {
        total = 0;
        hora = "";
        initComponents();
    }
    //Se crea el form con los parámetros del precio total del menú, la hora de apertura y la hora de cierre
    public Orden(int total, int horaAb, int horaCe) {
        initComponents();
        HoraAb = horaAb;
        HoraCe = horaCe;
        setTotal(total);
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
        OrdenLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        metodoPagoLbl = new javax.swing.JLabel();
        EfectivoLbl = new javax.swing.JLabel();
        tarjetaLbl = new javax.swing.JLabel();
        pagoLbl = new javax.swing.JLabel();
        totalLbl1 = new javax.swing.JLabel();
        horaEntregaTextField = new javax.swing.JTextField();
        AceptarBtn = new javax.swing.JButton();
        avisoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        OrdenLbl.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        OrdenLbl.setText("Orden");

        totalLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalLbl.setText("Total a pagar: Q");

        metodoPagoLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        metodoPagoLbl.setText("Por favor, seleccione su método de pago:");

        EfectivoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/efectivo.png"))); // NOI18N
        EfectivoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EfectivoLblMouseClicked(evt);
            }
        });

        tarjetaLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tarjeta.png"))); // NOI18N
        tarjetaLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjetaLblMouseClicked(evt);
            }
        });

        pagoLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        totalLbl1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalLbl1.setText("Ingrese la hora a la que irá a recibir a su pedido:");

        horaEntregaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaEntregaTextFieldActionPerformed(evt);
            }
        });
        horaEntregaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaEntregaTextFieldKeyTyped(evt);
            }
        });

        AceptarBtn.setText("Aceptar");
        AceptarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarBtnMouseClicked(evt);
            }
        });
        AceptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarBtnActionPerformed(evt);
            }
        });

        avisoLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        avisoLbl.setText("(Usar formato 24 horas)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avisoLbl)
                    .addComponent(metodoPagoLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horaEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AceptarBtn))
                    .addComponent(totalLbl1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(totalLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pagoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OrdenLbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(EfectivoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tarjetaLbl)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(OrdenLbl)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLbl))
                .addGap(35, 35, 35)
                .addComponent(totalLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horaEntregaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AceptarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avisoLbl)
                .addGap(1, 1, 1)
                .addComponent(metodoPagoLbl)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(EfectivoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tarjetaLbl)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EfectivoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EfectivoLblMouseClicked
        //Si le da clic a efectivo, que se mande el parámetro opción 0
        showDetails(0);
    }//GEN-LAST:event_EfectivoLblMouseClicked
    //NSU
    private void horaEntregaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaEntregaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaEntregaTextFieldActionPerformed
    //NSU
    private void AceptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarBtnActionPerformed
    //Si se da clic al botón aceptar
    private void AceptarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarBtnMouseClicked
        //Se ejecuta el método horacorrecta con los parámetros de hora apertura y hora de cierre
        horaCorrecta(HoraAb, HoraCe);
    }//GEN-LAST:event_AceptarBtnMouseClicked

    private void tarjetaLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaLblMouseClicked
        //Si le da clic a tarjeta, que se mande el parámetro opción 1
        showDetails(1);
    }//GEN-LAST:event_tarjetaLblMouseClicked

    private void horaEntregaTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaEntregaTextFieldKeyTyped
        //No deja que el usuario ponga más de 5 caracteres en el textbox de hora
         boolean max = horaEntregaTextField.getText().length() > 4;
             if (max){
                 evt.consume();
             } 
    }//GEN-LAST:event_horaEntregaTextFieldKeyTyped

    //Se pone el total de la orden (del form menu) en el resumen de la orden (form orden)
    public void setTotal (int total) {
        this.total = total;
        pagoLbl.setText(total+"");
        metodoPagoLbl.setVisible(false);
        tarjetaLbl.setVisible(false);
        EfectivoLbl.setVisible(false);
    }
    
    //Verifica si la hora está bien o mal
    public void horaCorrecta (int horaAb, int horaCe){ 
        //Obtiene la hora ingresada del textbox de la hora
        hora = horaEntregaTextField.getText();
        //Convierte la hora en un número
        nHora = Integer.parseInt(hora.substring(0,2) + hora.substring(3,5));
        //Si la hora contiene más de 4 caracteres entonces sí cumple con el formato
        if (hora.length()>4) {
            //Si el número de la hora que ingreso el usuario está entre la hora de apertura y cierre...
           if (nHora >= horaAb && nHora <= horaCe){
              //La hora es correcta y se muestran las opciones de pago
               JOptionPane.showMessageDialog(null, "Hora ingresada correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
              horaEntregaTextField.disable();
              AceptarBtn.setVisible(false);
              metodoPagoLbl.setVisible(true);
              tarjetaLbl.setVisible(true);
              EfectivoLbl.setVisible(true); 
           }else{
             //Se muestra el error que el restaurante no está abierto a esa hora
            JOptionPane.showMessageDialog(null, "El restaurante no está abierto a esa hora", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
           }
      
             
        } else {
            //Si el formato de la hora está equivocada, se muestra un error
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una hora valida", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    //Depende de si eligió pago en efectivo o tarjeta, que haga tal cosa
    public void showDetails(int x){ 
        //Si le da clic a efectivo
        if (x==0){
            compra.mostrarFactura(0, hora);
        //Si le da clic a tarjeta
        } else if (x==1) {
            compra.mostrarFactura(1, hora);
        }
        //Se muestra el form de factura
        compra.setVisible(true);
        this.hide();
    }
    
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
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Orden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarBtn;
    private javax.swing.JLabel EfectivoLbl;
    private javax.swing.JLabel OrdenLbl;
    private javax.swing.JLabel avisoLbl;
    private javax.swing.JTextField horaEntregaTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel metodoPagoLbl;
    private javax.swing.JLabel pagoLbl;
    private javax.swing.JLabel tarjetaLbl;
    private javax.swing.JLabel totalLbl;
    private javax.swing.JLabel totalLbl1;
    // End of variables declaration//GEN-END:variables
}
