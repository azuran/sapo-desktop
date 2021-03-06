import javax.swing.JOptionPane;
/*
 * CalibraEscalaXPanel.java
 *
 * Created on 8 de Fevereiro de 2005, 01:22
 */

/**
 *
 * @author Edison Puig Maldonado
 */

public class CalibraEscalaXPanel extends javax.swing.JPanel {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 5193223898596739138L;
	SAPO sapo;
    
    /** Creates new form CalibraEscalaXPanel */
    public CalibraEscalaXPanel(SAPO sapo) {
        this.sapo = sapo;
        initComponents();
    }
    
    private void aplicaEscalaX() {
        float scX, scY;
        scX = scY = sapo.jif[sapo.numImg].zoom / 100.0F;
        try {
            int X1 = Integer.parseInt(jlCEXX1.getText());
            int Y1 = Integer.parseInt(jlCEXY1.getText());
            int X2 = Integer.parseInt(jlCEXX2.getText());
            int Y2 = Integer.parseInt(jlCEXY2.getText());
            double dist = Math.sqrt(Math.pow(((X2-X1)/scX),2) + Math.pow(((Y2-Y1)/scY),2));
            sapo.paciente.dados.imgData[sapo.numImg].setEscalaX(sapo.doubleLoc(jtfEX.getText())/dist);
            jlCEX8.setText("definido");
            sapo.paciente.escreveDB();
            sapo.paciente.salvarAlteracoes = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(sapo,
                    "Erro aritmético !",
                    "Erro", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public void limpar() {
        jlCEXX1.setText("");
        jlCEXY1.setText("");
        jlCEXX2.setText("");
        jlCEXY2.setText("");
        jlCEX8.setText("");
        sapo.jif[sapo.numImg].jaiP.resetMousePosition();
        sapo.jif[sapo.numImg].jaiP.repaint();
        //        calEscX.iniciar();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpCalEscalaX = new javax.swing.JPanel();
        jlCEX1 = new javax.swing.JLabel();
        jlCEX2 = new javax.swing.JLabel();
        jlCEX3 = new javax.swing.JLabel();
        jlCEX4 = new javax.swing.JLabel();
        jlCEX5 = new javax.swing.JLabel();
        jlCEX6 = new javax.swing.JLabel();
        jlCEX7 = new javax.swing.JLabel();
        jpnCEX = new javax.swing.JPanel();
        jlCEXX = new javax.swing.JLabel();
        jlCEXY = new javax.swing.JLabel();
        jlCEXX1 = new javax.swing.JLabel();
        jlCEXY1 = new javax.swing.JLabel();
        jlCEXX2 = new javax.swing.JLabel();
        jlCEXY2 = new javax.swing.JLabel();
        jtfEX = new javax.swing.JTextField();
        jbCEXAplicar = new javax.swing.JButton();
        jlCEX8 = new javax.swing.JLabel();
        jbCEXClear = new javax.swing.JButton();
        jbCEXOk = new javax.swing.JButton();
        jbCEXAjuda = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jpCalEscalaX.setLayout(new java.awt.GridBagLayout());

        jpCalEscalaX.setMaximumSize(new java.awt.Dimension(2147483647, 250));
        jpCalEscalaX.setMinimumSize(new java.awt.Dimension(11, 36));
        jpCalEscalaX.setPreferredSize(new java.awt.Dimension(150, 250));
        jlCEX1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX1.setText("Clique e arraste o mouse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX1, gridBagConstraints);

        jlCEX2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX2.setText("na imagem e entre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX2, gridBagConstraints);

        jlCEX3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX3.setText("com o valor medido,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX3, gridBagConstraints);

        jlCEX4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX4.setText("conforme unidade em");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX4, gridBagConstraints);

        jlCEX5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX5.setText("Dados -> Prefer\u00eancias,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX5, gridBagConstraints);

        jlCEX6.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12));
        jlCEX6.setText("p/ definir a escala-X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX6, gridBagConstraints);

        jlCEX7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12));
        jlCEX7.setText("para esta imagem SAPO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jpCalEscalaX.add(jlCEX7, gridBagConstraints);

        jpnCEX.setLayout(new java.awt.GridBagLayout());

        jpnCEX.setMinimumSize(null);
        jpnCEX.setOpaque(false);
        jpnCEX.setPreferredSize(null);
        jlCEXX.setText("X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXX, gridBagConstraints);

        jlCEXY.setText("Y");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXY, gridBagConstraints);

        jlCEXX1.setFont(new java.awt.Font("Dialog", 0, 11));
        jlCEXX1.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXX1, gridBagConstraints);

        jlCEXY1.setFont(new java.awt.Font("Dialog", 0, 11));
        jlCEXY1.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXY1, gridBagConstraints);

        jlCEXX2.setFont(new java.awt.Font("Dialog", 0, 11));
        jlCEXX2.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXX2, gridBagConstraints);

        jlCEXY2.setFont(new java.awt.Font("Dialog", 0, 11));
        jlCEXY2.setText("  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jpnCEX.add(jlCEXY2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        jpCalEscalaX.add(jpnCEX, gridBagConstraints);

        jtfEX.setMinimumSize(new java.awt.Dimension(72, 21));
        jtfEX.setPreferredSize(new java.awt.Dimension(72, 21));
        jtfEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEXActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
        jpCalEscalaX.add(jtfEX, gridBagConstraints);

        jbCEXAplicar.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEXAplicar.setText("Aplicar");
        jbCEXAplicar.setToolTipText("Escreve escala X na base de dados do projeto e encerra esta opera\u00e7\u00e3o");
        jbCEXAplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEXAplicar.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEXAplicar.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEXAplicar.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEXAplicar.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEXAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEXAplicarActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscalaX.add(jbCEXAplicar, gridBagConstraints);

        jlCEX8.setFont(new java.awt.Font("MS Sans Serif", 0, 10));
        jlCEX8.setForeground(new java.awt.Color(0, 102, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        jpCalEscalaX.add(jlCEX8, gridBagConstraints);

        jbCEXClear.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEXClear.setText("Limpar");
        jbCEXClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEXClear.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEXClear.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEXClear.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEXClear.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEXClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEXClearActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscalaX.add(jbCEXClear, gridBagConstraints);

        jbCEXOk.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEXOk.setText("Voltar");
        jbCEXOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEXOk.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEXOk.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEXOk.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEXOk.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEXOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEXOkActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscalaX.add(jbCEXOk, gridBagConstraints);

        jbCEXAjuda.setFont(new java.awt.Font("MS Sans Serif", 0, 12));
        jbCEXAjuda.setText("Ajuda");
        jbCEXAjuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCEXAjuda.setMargin(new java.awt.Insets(0, 7, 0, 7));
        jbCEXAjuda.setMaximumSize(new java.awt.Dimension(72, 23));
        jbCEXAjuda.setMinimumSize(new java.awt.Dimension(72, 23));
        jbCEXAjuda.setPreferredSize(new java.awt.Dimension(72, 23));
        jbCEXAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCEXAjudaActionPerformed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.insets = new java.awt.Insets(3, 6, 3, 6);
        jpCalEscalaX.add(jbCEXAjuda, gridBagConstraints);

        add(jpCalEscalaX, java.awt.BorderLayout.CENTER);

    }
    // </editor-fold>//GEN-END:initComponents

    private void jbCEXAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEXAjudaActionPerformed
        
    }//GEN-LAST:event_jbCEXAjudaActionPerformed

    private void jbCEXOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEXOkActionPerformed
        sapo.inserePainelEmInternalFrame(sapo.jpCalEscala, "WEST");
    }//GEN-LAST:event_jbCEXOkActionPerformed

    private void jbCEXClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEXClearActionPerformed
        limpar();
    }//GEN-LAST:event_jbCEXClearActionPerformed

    private void jtfEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEXActionPerformed
        if(sapo.isNumber(jtfEX.getText())) aplicaEscalaX();
    }//GEN-LAST:event_jtfEXActionPerformed

    private void jbCEXAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCEXAplicarActionPerformed
        if(sapo.isNumber(jtfEX.getText())) aplicaEscalaX();
    }//GEN-LAST:event_jbCEXAplicarActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCEXAjuda;
    private javax.swing.JButton jbCEXAplicar;
    private javax.swing.JButton jbCEXClear;
    private javax.swing.JButton jbCEXOk;
    private javax.swing.JLabel jlCEX1;
    private javax.swing.JLabel jlCEX2;
    private javax.swing.JLabel jlCEX3;
    private javax.swing.JLabel jlCEX4;
    private javax.swing.JLabel jlCEX5;
    private javax.swing.JLabel jlCEX6;
    private javax.swing.JLabel jlCEX7;
    private javax.swing.JLabel jlCEX8;
    private javax.swing.JLabel jlCEXX;
    public javax.swing.JLabel jlCEXX1;
    public javax.swing.JLabel jlCEXX2;
    private javax.swing.JLabel jlCEXY;
    public javax.swing.JLabel jlCEXY1;
    public javax.swing.JLabel jlCEXY2;
    private javax.swing.JPanel jpCalEscalaX;
    private javax.swing.JPanel jpnCEX;
    private javax.swing.JTextField jtfEX;
    // End of variables declaration//GEN-END:variables
    
}
