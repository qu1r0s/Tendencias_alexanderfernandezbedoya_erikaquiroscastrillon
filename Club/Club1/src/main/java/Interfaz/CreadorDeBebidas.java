package Interfaz;

import ClubMax.Club;
import Fabricacion.FabricaDeConsumos;
import Validador.ValidadorRegistrarConsumo;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

public class CreadorDeBebidas extends javax.swing.JFrame {

    private Club Club;

    public CreadorDeBebidas(Club Club) {
        initComponents();
        this.Club = Club;
    }

    private CreadorDeBebidas() {
        initComponents();
        this.Club = new Club();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalle = new javax.swing.JPanel();
        TipoDeBebida = new javax.swing.JComboBox<>();
        BebidaSeleccionada = new javax.swing.JComboBox<>();
        TipoBebidaFria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TipoDeBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de bebida", "bebida fria", "bebida caliente" }));
        TipoDeBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDeBebidaActionPerformed(evt);
            }
        });

        BebidaSeleccionada.setEnabled(false);
        BebidaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BebidaSeleccionadaActionPerformed(evt);
            }
        });

        TipoBebidaFria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sleccione un tipo de bebida fria", "Alcoholica", "No Alcoholica" }));
        TipoBebidaFria.setEnabled(false);
        TipoBebidaFria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoBebidaFriaActionPerformed(evt);
            }
        });

        jButton1.setText("Crear bebida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar a consumo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detalleLayout = new javax.swing.GroupLayout(detalle);
        detalle.setLayout(detalleLayout);
        detalleLayout.setHorizontalGroup(
            detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleLayout.createSequentialGroup()
                .addGroup(detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detalleLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TipoBebidaFria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(detalleLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(detalleLayout.createSequentialGroup()
                                .addComponent(BebidaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cedula))
                            .addComponent(TipoDeBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(detalleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detalleLayout.setVerticalGroup(
            detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TipoDeBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TipoBebidaFria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BebidaSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoDeBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDeBebidaActionPerformed
        if (TipoDeBebida.getSelectedIndex() != 0) {

            if (TipoDeBebida.getSelectedIndex() == 1) {
                TipoBebidaFria.setEnabled(true);
            }
            if (TipoDeBebida.getSelectedIndex() == 2) {
                BebidaSeleccionada.setEnabled(true);
                BebidaSeleccionada.removeAllItems();
                BebidaSeleccionada.addItem("cafecito");
                BebidaSeleccionada.addItem("chocolatico");
            }
        } else {
            BebidaSeleccionada.removeAllItems();
            BebidaSeleccionada.setEnabled(false);
        }
    }//GEN-LAST:event_TipoDeBebidaActionPerformed

    private void BebidaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BebidaSeleccionadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BebidaSeleccionadaActionPerformed

    private void TipoBebidaFriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoBebidaFriaActionPerformed
        if (TipoBebidaFria.getSelectedIndex() == 0) {
            BebidaSeleccionada.removeAllItems();
            BebidaSeleccionada.setEnabled(false);
        }
        if (TipoBebidaFria.getSelectedIndex() == 1) {
            BebidaSeleccionada.removeAllItems();
            BebidaSeleccionada.setEnabled(true);

            BebidaSeleccionada.addItem("vodka");
            BebidaSeleccionada.addItem("tequila");

        }
    }//GEN-LAST:event_TipoBebidaFriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ValidadorRegistrarConsumo validador = new ValidadorRegistrarConsumo(Club);
        validador.validarBedida(cedula.getText(), TipoDeBebida.getSelectedIndex(), TipoBebidaFria.getSelectedIndex(), BebidaSeleccionada.getSelectedIndex());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio Inicial = new Inicio(Club);
        this.show(false);
        Inicial.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        //validar cedula
    }//GEN-LAST:event_cedulaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Club club = new Club();
                new CreadorDeBebidas(club).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BebidaSeleccionada;
    private javax.swing.JComboBox<String> TipoBebidaFria;
    private javax.swing.JComboBox<String> TipoDeBebida;
    private javax.swing.JTextField cedula;
    private javax.swing.JPanel detalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
