
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameInicio extends javax.swing.JFrame
{

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBCodifi_Programa = new javax.swing.JButton();
        jBDesc_Programa = new javax.swing.JButton();
        jBSair_do_Programa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teoria da Computação", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBCodifi_Programa.setText("Digitar Programa Monolitico");
        jBCodifi_Programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCodifi_ProgramaActionPerformed(evt);
            }
        });

        jBDesc_Programa.setText("Descodificar Programa Monolitico");
        jBDesc_Programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDesc_ProgramaActionPerformed(evt);
            }
        });

        jBSair_do_Programa.setText("Sair do Programa");
        jBSair_do_Programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSair_do_ProgramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBCodifi_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jBDesc_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSair_do_Programa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBCodifi_Programa)
                .addGap(18, 18, 18)
                .addComponent(jBDesc_Programa)
                .addGap(73, 73, 73)
                .addComponent(jBSair_do_Programa)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSair_do_ProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSair_do_ProgramaActionPerformed
    	dispose();
    }//GEN-LAST:event_jBSair_do_ProgramaActionPerformed

    private void jBCodifi_ProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCodifi_ProgramaActionPerformed
       new JFrameCodificar_programa().show();
    }//GEN-LAST:event_jBCodifi_ProgramaActionPerformed

    private void jBDesc_ProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDesc_ProgramaActionPerformed

    	try {
            
            if(JFrameInicio.getRotulo().carreharArquivo() == true)
            {
                new JFrameDescod_Programa().show();
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrameInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBDesc_ProgramaActionPerformed

    public JFrameInicio()
    {
    	 initComponents();// serve para iniciar os componentes da tela
    }
    
       
    public static Rotulo getRotulo()
    {
        return t;
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new JFrameInicio().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCodifi_Programa;
    private javax.swing.JButton jBDesc_Programa;
    private javax.swing.JButton jBSair_do_Programa;
    private javax.swing.JPanel jPanel1;
    private static Rotulo t = new Rotulo();
    // End of variables declaration//GEN-END:variables

}
