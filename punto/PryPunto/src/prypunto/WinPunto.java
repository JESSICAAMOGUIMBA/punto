
package prypunto;


public class WinPunto extends javax.swing.JFrame {

   
    public WinPunto() {
        initComponents();
    }
    //declarativa de variables
    int x,y;
    //instancias le la cls punto solo sabe q existira x y
    ClsPunto p,q;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TxtPantalla = new javax.swing.JTextField();
        BtnCx = new javax.swing.JButton();
        BtnCy = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPantallaActionPerformed(evt);
            }
        });

        BtnCx.setBackground(new java.awt.Color(255, 255, 0));
        BtnCx.setFont(new java.awt.Font("Vani", 0, 11)); // NOI18N
        BtnCx.setText("Coordenada X");
        BtnCx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCxActionPerformed(evt);
            }
        });

        BtnCy.setBackground(new java.awt.Color(255, 255, 0));
        BtnCy.setFont(new java.awt.Font("Vani", 0, 11)); // NOI18N
        BtnCy.setText("Coordenada Y");
        BtnCy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCx)
                        .addGap(78, 78, 78)
                        .addComponent(BtnCy)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCx)
                    .addComponent(BtnCy))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPantallaActionPerformed

    private void BtnCxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCxActionPerformed
        // leer datos
        x=Integer.parseInt(TxtPantalla.getText());
        TxtPantalla.setText(null);//limpia la pantalla
        TxtPantalla.requestFocus();//enfoque en txtPantalla
        
        
    }//GEN-LAST:event_BtnCxActionPerformed

    private void BtnCyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCyActionPerformed
       y=Integer.parseInt(TxtPantalla.getText());
       //crear la instancia punto con cls punto 
       q=new ClsPunto(x,y);
       TxtPantalla.setText(null);//limpia la pantalla
       TxtPantalla.requestFocus();//enfoque en txtPantalla
    }//GEN-LAST:event_BtnCyActionPerformed

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
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinPunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinPunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCx;
    private javax.swing.JButton BtnCy;
    private javax.swing.JTextField TxtPantalla;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
