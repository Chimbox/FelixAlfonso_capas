/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.BarcoDAOImpl;
import DAO.SocioDAOImpl;
import control.Modelos;
import java.awt.Dimension;
import java.awt.Point;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.Barco;
import negocio.Socio;
import persistencia.MySQLConnectionFactory;

/**
 *
 * @author Invitado
 */
public class FrmBarcos extends javax.swing.JDialog {

    BarcoDAOImpl barcoDao;
    SocioDAOImpl socioDao;
    List<Barco> lstBarcos;
    Barco barcoEdit;

    /**
     * Creates new form FrmSocios
     */
    public FrmBarcos(java.awt.Frame parent) throws Exception {
        super(parent);
        initComponents();
        centraCuadroDialogo(parent);
        setVisible(true);
    }

    private void updateTable() throws Exception {
        lstBarcos = barcoDao.getAll();
        cbxSocios.setModel(Modelos.sociosComboBoxModel(socioDao.getAll()));
        tblBarcos.setModel(Modelos.barcoTableModel(lstBarcos));
    }

    private void centraCuadroDialogo(java.awt.Frame parent) {

        Dimension frameSize = parent.getSize();
        Point loc = parent.getLocation();

        Dimension dlgSize = getPreferredSize();

        setLocation((frameSize.width - dlgSize.width) / 2 + loc.x,
                (frameSize.height - dlgSize.height) / 2 + loc.y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        lblNumMatricula = new javax.swing.JLabel();
        txtNumMatricula = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNumAmarre = new javax.swing.JLabel();
        txtNumAmarre = new javax.swing.JTextField();
        lblCuota = new javax.swing.JLabel();
        txtCuota = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblSocio = new javax.swing.JLabel();
        cbxSocios = new javax.swing.JComboBox<>();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarcos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Barcos");

        lblNumMatricula.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblNumMatricula.setText("Núm. Matrícula");

        txtNumMatricula.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

        lblNumAmarre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblNumAmarre.setText("Núm. Amarre");

        txtNumAmarre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

        lblCuota.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblCuota.setText("Cuota   $");

        txtCuota.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

        btnLimpiar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblSocio.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblSocio.setText("Socio");

        cbxSocios.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        cbxSocios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Socio", " " }));

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(57, 57, 57))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addComponent(lblNumAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addGroup(pnlDatosLayout.createSequentialGroup()
                                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCuota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNumMatricula)
                                .addGap(21, 21, 21)))
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar)
                            .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxSocios, 0, 301, Short.MAX_VALUE)
                                .addComponent(txtNumAmarre)
                                .addComponent(txtNombre)
                                .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(202, 202, 202)))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumAmarre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuota)
                    .addComponent(txtCuota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSocio)
                    .addComponent(cbxSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(25, 25, 25))
        );

        tblBarcos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblBarcos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Núm. Matrícula", "Nombre", "Núm. Amarre", "Cuota", "Socio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBarcos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarcosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarcos);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(pnlTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

    private void limpiarCampos() {
        txtNumMatricula.setText("");
        txtNombre.setText("");
        txtNumAmarre.setText("");
        txtCuota.setText("");
        txtNumMatricula.setEditable(true);
        btnGuardar.setText("Agregar");
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!txtNumMatricula.getText().isEmpty()) {
            Barco barcoConsulta = new Barco(Integer.valueOf(txtNumMatricula.getText()));
            if (!lstBarcos.contains(barcoConsulta)) {
                if (!txtNombre.getText().isEmpty()
                        && !txtNumAmarre.getText().isEmpty()
                        && !txtCuota.getText().isEmpty()
                        && !txtNumMatricula.getText().isEmpty()) {
                    Barco barco = new Barco(Integer.valueOf(txtNumMatricula.getText()),
                            txtNombre.getText(),
                            Short.valueOf(txtNumAmarre.getText()),
                            Double.valueOf(txtCuota.getText()),
                            (Socio) cbxSocios.getSelectedItem());

                    try {
                        barcoDao.add(barco);
                        updateTable();
                        limpiarCampos();
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "No puede dejar campos vacíos.");
                }
            } else {
                if (barcoEdit != null) {
                    try {
                        barcoEdit.setNombre(txtNombre.getText());
                        barcoEdit.setNumAmarre(Short.valueOf(txtNumAmarre.getText()));
                        barcoEdit.setCuota(Double.valueOf(txtCuota.getText()));
                        barcoEdit.setSocio((Socio) cbxSocios.getSelectedItem());
                        barcoDao.update(barcoEdit);
                        updateTable();
                    } catch (Exception ex) {

                    }
                }

            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNumMatricula.getText().isEmpty()) {

        } else {
            if (barcoEdit != null) {
                try {
                    barcoDao.delete(barcoEdit.getNumMatricula());
                    updateTable();
                    limpiarCampos();
                } catch (Exception ex) {

                }
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblBarcosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarcosMouseClicked
        txtNumMatricula.setEditable(false);
        int row = tblBarcos.rowAtPoint(evt.getPoint());

        barcoEdit = lstBarcos.get(lstBarcos.indexOf(new Barco((Integer) tblBarcos.getValueAt(row, 0))));

        txtNumMatricula.setText(String.valueOf(barcoEdit.getNumMatricula()));
        txtNombre.setText(barcoEdit.getNombre());
        txtNumAmarre.setText(String.valueOf(barcoEdit.getNumAmarre()));
        txtCuota.setText(String.valueOf((barcoEdit.getCuota())));
        cbxSocios.setSelectedItem(barcoEdit.getSocio());
        btnGuardar.setText("Actualizar");
    }//GEN-LAST:event_tblBarcosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        barcoDao = new BarcoDAOImpl(new MySQLConnectionFactory("localhost",
                "club_nautico", 3306, "root", "1234"));
        socioDao = new SocioDAOImpl(barcoDao.getCONNECTION_FACTORY());
        try {
            updateTable();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxSocios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCuota;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumAmarre;
    private javax.swing.JLabel lblNumMatricula;
    private javax.swing.JLabel lblSocio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblBarcos;
    private javax.swing.JTextField txtCuota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumAmarre;
    private javax.swing.JTextField txtNumMatricula;
    // End of variables declaration//GEN-END:variables
}
