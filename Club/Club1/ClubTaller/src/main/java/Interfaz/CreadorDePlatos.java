package Interfaz;

import ClubMax.Club;
import Fabricacion.FabricaDeConsumos;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;

public class CreadorDePlatos extends javax.swing.JFrame {

    private Club club;

    public CreadorDePlatos(Club Club) {
        initComponents();
        this.club = Club;
    }

    private CreadorDePlatos() {
        initComponents();
        this.club = new Club();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TipoDePlatoFuerte = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TipoPlato = new javax.swing.JComboBox<>();
        PlatoSeleccionado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        TipoDePlatoFuerte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo de plato Fuerte", "plato mixto", "plato Vegano", " " }));
        TipoDePlatoFuerte.setEnabled(false);
        TipoDePlatoFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoDePlatoFuerteActionPerformed(evt);
            }
        });

        jButton1.setText("Crear plato");
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

        jButton3.setText("Regresar al consumo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TipoPlato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo plato:", "1. Plato Fuerte", "2. Postre", "3. Entrada" }));
        TipoPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPlatoActionPerformed(evt);
            }
        });

        PlatoSeleccionado.setEnabled(false);
        PlatoSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlatoSeleccionadoActionPerformed(evt);
            }
        });

        jLabel1.setText("Crear Platos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)
                        .addGap(52, 52, 52)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TipoDePlatoFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlatoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(TipoPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TipoDePlatoFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlatoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipoDePlatoFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoDePlatoFuerteActionPerformed

        if (TipoDePlatoFuerte.getSelectedIndex() == 1) {
            PlatoSeleccionado.removeAllItems();
            PlatoSeleccionado.setEnabled(true);
            PlatoSeleccionado.addItem("Mixto - Kebab");
            PlatoSeleccionado.addItem("Mixto - Spaghetti a la carbonara");
        }
        if (TipoDePlatoFuerte.getSelectedIndex() == 2) {
            PlatoSeleccionado.removeAllItems();
            PlatoSeleccionado.setEnabled(true);
            PlatoSeleccionado.addItem("Vegano - Tofu Con Berenjena");
            PlatoSeleccionado.addItem("Vegano - Sopas Veganas");

        }
    }//GEN-LAST:event_TipoDePlatoFuerteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /* FabricaDeConsumos fabrica = new FabricaDeConsumos();
        fabrica.creadorDePlatos(TipoDePlatoFuerte.getSelectedIndex(), TipoBebidaFria.getSelectedIndex(), BebidaSeleccionada.getSelectedIndex());// TODO add your handling code here:*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio Inicial = new Inicio(club);
        this.show(false);
        Inicial.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RegistrarConsumo consumo = new RegistrarConsumo(club);
        this.show(false);
        consumo.show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TipoPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPlatoActionPerformed
        if (TipoPlato.getSelectedIndex() != 0) {

            if (TipoPlato.getSelectedIndex() == 1) {
                TipoDePlatoFuerte.setEnabled(true);
            } else if (TipoPlato.getSelectedIndex() == 2) {
                PlatoSeleccionado.setEnabled(true);
                PlatoSeleccionado.removeAllItems();
                PlatoSeleccionado.addItem("Postre de Fresa");
                PlatoSeleccionado.addItem("Postre- tres leches");
            } else if (TipoPlato.getSelectedIndex() == 3) {
                PlatoSeleccionado.setEnabled(true);
                PlatoSeleccionado.removeAllItems();
                PlatoSeleccionado.addItem("Entrada - PAILFAN");
                PlatoSeleccionado.addItem("Entrada - Mariscos en Salsa");
            }

        } else {
            //PlatoSeleccionado.removeAllItems();
            PlatoSeleccionado.setEnabled(false);
            //TipoDePlatoFuerte.removeAllItems();
            TipoDePlatoFuerte.setEnabled(false);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_TipoPlatoActionPerformed

    private void PlatoSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlatoSeleccionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlatoSeleccionadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreadorDePlatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> PlatoSeleccionado;
    private javax.swing.JComboBox<String> TipoDePlatoFuerte;
    private javax.swing.JComboBox<String> TipoPlato;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
