/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6_detodo;

import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Sosa
 */
public class GestionProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public GestionProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPrecio = new javax.swing.JTextField();
        jDescrip = new javax.swing.JTextField();
        jCodigo = new javax.swing.JTextField();
        jStock = new javax.swing.JTextField();
        jRubro = new javax.swing.JComboBox<>();
        jEliminar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jNuevo = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        jLabel1.setText("Gestion de productos");

        jLabel2.setText("Codigo");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Precio");

        jLabel5.setText("Rubro");

        jLabel6.setText("Stock");

        jPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrecioActionPerformed(evt);
            }
        });

        jDescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescripActionPerformed(evt);
            }
        });

        jCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodigoActionPerformed(evt);
            }
        });

        jRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLE", "PERFUMERIA", "LIMPIEZA" }));
        jRubro.setSelectedIndex(-1);
        jRubro.setToolTipText("");

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jNuevo.setText("Nuevo");
        jNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNuevoActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(Buscar)))
                .addGap(0, 142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jNuevo)
                .addGap(30, 30, 30)
                .addComponent(jGuardar)
                .addGap(27, 27, 27)
                .addComponent(jEliminar)
                .addGap(28, 28, 28)
                .addComponent(jSalir)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(12, 12, 12)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDescrip)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEliminar)
                    .addComponent(jGuardar)
                    .addComponent(jNuevo)
                    .addComponent(jSalir))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodigoActionPerformed

    private void jDescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescripActionPerformed

    private void jPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPrecioActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        try {
            limpiarceldas();
            boolean i = false;
            int codigo = Integer.parseInt(jCodigo.getText());
            for (Producto p : DeTodo.listaProducto) {
                if (codigo == p.getCodigo()) {
                    jPrecio.setText(String.valueOf(p.getPrecio()));
                    jStock.setText(String.valueOf(p.getStock()));
                    jDescrip.setText(p.getDescripcion());
                    jRubro.setSelectedItem(p.getRubro().toString());
                    i = true;
                }
            }
            if (!i) {
                JOptionPane.showMessageDialog(this, "Error, el producto no fue encontrado");
                limpiarceldas();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error, en codigo solo ingresar numeros");
        }


    }//GEN-LAST:event_BuscarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        // TODO add your handling code here:
        try {
            double precio;
            int stock;
            int codigo = Integer.parseInt(jCodigo.getText());
            boolean f = false;

            for (Producto p : DeTodo.listaProducto) {

                if (codigo == p.getCodigo()) {
                    JOptionPane.showMessageDialog(this, "Error, el producto ya esta regitrado");
                    f = true;
                }
                if (!f) {
                    f = false;
                    jCodigo.setText("");
                    precio = Double.parseDouble(jPrecio.getText());
                    stock = Integer.parseInt(jStock.getText());
                    DeTodo.listaProducto.add(new Producto(codigo, jDescrip.getText(), precio, stock, Categoria.valueOf(
                            jRubro.getSelectedItem().toString())));
                    JOptionPane.showMessageDialog(this, "El producto fue regitrado" + " codigo: " + codigo);
                    limpiarceldas();
                }
                
            }
            f = false;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error, datos invalidos");
        }

    }//GEN-LAST:event_jGuardarActionPerformed

    private void jNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNuevoActionPerformed
        // TODO add your handling code here:
        limpiarceldas();
        jCodigo.setText("");
    }//GEN-LAST:event_jNuevoActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        try {
            limpiarceldas();
            boolean i = false;
            int codigo = Integer.parseInt(jCodigo.getText());
            for (Producto p : DeTodo.listaProducto) {
                if (codigo == p.getCodigo()) {
                    DeTodo.listaProducto.remove(p);
                    i = true;
                    JOptionPane.showMessageDialog(this, "El producto fue eliminado(" + codigo + ")");
                }
            }
            if (!i) {
                JOptionPane.showMessageDialog(this, "Error, el producto no fue encontrado");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error, en codigo solo ingresar numeros");
        }
    }//GEN-LAST:event_jEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JTextField jDescrip;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jNuevo;
    private javax.swing.JTextField jPrecio;
    private javax.swing.JComboBox<String> jRubro;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jStock;
    // End of variables declaration//GEN-END:variables
private void limpiarceldas() {
        jPrecio.setText("");
        jStock.setText("");
        jDescrip.setText("");
        jRubro.setSelectedIndex(-1);

    }
}