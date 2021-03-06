/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prbs;

import java.awt.Dimension;

/**
 *
 * @author saipr
 */
public class CPrincipal extends javax.swing.JFrame
{

    Pnl1 pnl1 = new Pnl1();
    Pnl2 pnl2 = new Pnl2();

    /**
     * Creates new form Main
     */
    public CPrincipal()
    {
        initComponents();
        initMyComponents();
    }

    /**
     * Este metodo inicia mis componentes.
     */
    public void initMyComponents()
    {
        this.setSize(new Dimension(312, 212));
        this.setLocationRelativeTo(null);
        pnl1.setVisible(true);
        pnl2.setVisible(false);
        desactivarBotones();
        contenedor.add(pnl1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        vBtnAnterior = new javax.swing.JButton();
        vBtnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setLayout(new java.awt.BorderLayout());

        vBtnAnterior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vBtnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/previousBtn.png"))); // NOI18N
        vBtnAnterior.setText("Anterior");
        vBtnAnterior.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vBtnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(vBtnAnterior);

        vBtnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vBtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/nextBtn.png"))); // NOI18N
        vBtnSiguiente.setText("Siguiente");
        vBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        vBtnSiguiente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                vBtnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(vBtnSiguiente);

        contenedor.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void desactivarBotones()
    {
        if (pnl1.isVisible())
        {
            vBtnAnterior.setEnabled(false);
            vBtnSiguiente.setEnabled(true);
        } else if (pnl2.isVisible())
        {
            vBtnAnterior.setEnabled(true);
            vBtnSiguiente.setEnabled(false);
        }
    }

    private void vBtnAnteriorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vBtnAnteriorActionPerformed
    {//GEN-HEADEREND:event_vBtnAnteriorActionPerformed
        pnl2.setVisible(false);
        pnl1.setVisible(true);
        contenedor.add(pnl1);
        desactivarBotones();
        contenedor.validate();
    }//GEN-LAST:event_vBtnAnteriorActionPerformed

    private void vBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_vBtnSiguienteActionPerformed
    {//GEN-HEADEREND:event_vBtnSiguienteActionPerformed
        pnl1.setVisible(false);
        pnl2.setVisible(true);
        contenedor.add(pnl2);
        desactivarBotones();
        contenedor.validate();
    }//GEN-LAST:event_vBtnSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton vBtnAnterior;
    private javax.swing.JButton vBtnSiguiente;
    // End of variables declaration//GEN-END:variables
}
