/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author saipr
 */
public class CPnlAcercaDe extends javax.swing.JDialog
{

    /**
     * Creates new form CPnlAcercaDe
     */
    public CPnlAcercaDe(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de este programa.");
        setMaximumSize(new java.awt.Dimension(469, 511));
        setMinimumSize(new java.awt.Dimension(469, 511));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(469, 511));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(469, 511));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(469, 511));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n\n  Universidad Autonoma del Estado de Mexico\n\n Unidad Academica Profesional Tianguistenco\n\n       Carrera: Ingenieria de Software\n\n Alumno: Sandro de Jesus Hernandez Del Angel\n\n     Maestro: Martin Carlos Vera Estrada\n\n      Semestre: 6     Fecha: 21/02/2020\n\nPrograma   desarrollado   para aplicar   los\nconocimientos  de  los  componentes  de Java\nSwing, por  lo  que este  programa  contiene\nunicamente  elementos   graficos   con  usos\nque  pueden  ejemplificar  perfectamente  su\nfuncionalidad y utilidad  en  el  desarrollo\nde interfaces.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 153), 4));
        jTextArea1.setMaximumSize(new java.awt.Dimension(469, 511));
        jTextArea1.setMinimumSize(new java.awt.Dimension(469, 511));
        jTextArea1.setPreferredSize(new java.awt.Dimension(469, 511));
        jTextArea1.setSelectedTextColor(new java.awt.Color(153, 0, 51));
        jTextArea1.setSelectionColor(new java.awt.Color(255, 153, 255));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
