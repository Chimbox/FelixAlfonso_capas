/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DestinoDAOImpl;
import control.Modelos;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import negocio.Destino;
import persistencia.MySQLConnectionFactory;

/**
 *
 * @author Invitado
 */
public class FrmDestinos extends javax.swing.JDialog{

    DestinoDAOImpl destinoDao;
    List<Destino> lstDestinos;
    Destino destinoEdit;
    
    /**
     * Creates new form FrmDestinos
     */
    public FrmDestinos(java.awt.Frame parent, MySQLConnectionFactory conexion) throws Exception{
        super(parent);
        initComponents();
        destinoDao=new DestinoDAOImpl(conexion);
        setVisible(true);
        centraCuadroDialogo(parent);
    }
    
    private void updateTable() throws Exception{
        lstDestinos=destinoDao.getAll();
        tblDestinos.setModel(Modelos.destinoTableModel(lstDestinos));
    }
    
    private void updateTableBusqueda() throws Exception{
        lstDestinos=destinoDao.getAllWith(txtBusqueda.getText());
        tblDestinos.setModel(Modelos.destinoTableModel(lstDestinos));
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
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDestinos = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Destinos");

        lblId.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblId.setText("ID");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 204));
        txtId.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Consolas", 0, 22)); // NOI18N

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

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 166, Short.MAX_VALUE))
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnLimpiar)))
                        .addGap(33, 33, 33)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addComponent(txtNombre)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tblDestinos.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        tblDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDestinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDestinos);

        txtBusqueda.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addGroup(pnlTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarCampos(){
        txtId.setText("");
        txtNombre.setText("");
        btnGuardar.setText("Agregar");
        txtBusqueda.setText("");
        try {
            updateTable();
        } catch (Exception ex) {

        }
    }
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtId.getText().isEmpty()){
            if(!txtNombre.getText().isEmpty()){
                Destino destino=new Destino(txtNombre.getText());
                try {
                    destinoDao.add(destino);
                    updateTable();
                    limpiarCampos();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                
            }else{
                JOptionPane.showMessageDialog(this, "No puede dejar campos vacíos.");
            }
        }else{
            if(destinoEdit!=null){
                try {
                    destinoEdit.setNombre(txtNombre.getText());
                    destinoDao.update(destinoEdit);
                    updateTable();
                } catch (Exception ex) {
                   
                }
            }
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtId.getText().isEmpty()){
            
        }else{
            if(destinoEdit!=null){
                try {
                    destinoDao.delete(destinoEdit.getId());
                    updateTable();
                    limpiarCampos();
                } catch (Exception ex) {
                   JOptionPane.showMessageDialog(this, "No es posible"
                                + " eliminar este destino ya que existen salidas al mismo.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblDestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDestinosMouseClicked
        int row=tblDestinos.rowAtPoint(evt.getPoint());
        
        destinoEdit=lstDestinos.get(lstDestinos.indexOf(new Destino((Integer)tblDestinos.getValueAt(row, 0))));
        
        txtId.setText(String.valueOf(destinoEdit.getId()));
        txtNombre.setText(destinoEdit.getNombre());
        
        btnGuardar.setText("Actualizar");
    }//GEN-LAST:event_tblDestinosMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            updateTable();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_formWindowOpened

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{
                updateTableBusqueda();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            updateTableBusqueda();
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblDestinos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
