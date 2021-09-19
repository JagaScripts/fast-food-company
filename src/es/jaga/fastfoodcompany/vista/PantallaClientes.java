package es.jaga.fastfoodcompany.vista;

import es.jaga.fastfoodcompany.controlador.AccionClientes;
import es.jaga.fastfoodcompany.modelo.entidades.Cliente;
import es.jaga.fastfoodcompany.principal.FFCJFrame;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * Classe del panel de gestion de clientes.
 * @author Jose Antonio González Alcántara
 */
public class PantallaClientes extends javax.swing.JPanel {

    private final FFCJFrame frame;
    private final AccionClientes acciones;
    private Cliente cliente;
    
     /**
     * Creates new form PanelAltaClientes
     * @param frame
     */
    public PantallaClientes(FFCJFrame frame) {
        initComponents();
        cargarCombo();
        this.frame = frame;
        this.acciones = new AccionClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFormulario = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblGuion = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtLetraDni = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        lblSegundoApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrimerApellido = new javax.swing.JTextField();
        txtSegundoApellido = new javax.swing.JTextField();
        cmbTipoDeVia = new javax.swing.JComboBox();
        lblTipoDeVia = new javax.swing.JLabel();
        lblNombreDeVia = new javax.swing.JLabel();
        txtNombreDeVia = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblPiso = new javax.swing.JLabel();
        lblPuerta = new javax.swing.JLabel();
        lblLocalidad = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblCP = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtPiso = new javax.swing.JTextField();
        txtPuerta = new javax.swing.JTextField();
        txtLocalidad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtCP = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscarDNI = new javax.swing.JButton();
        chkHabitual = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout(5, 5));

        pnlFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones clientes"));

        lblDni.setText("DNI:");

        lblGuion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGuion.setText("-");

        lblPrimerApellido.setText("Primer apellido:");

        lblSegundoApellido.setText("Segundo apellido:");

        lblNombre.setText("Nombre:");

        lblTipoDeVia.setText("Tipo de vía:");

        lblNombreDeVia.setText("Nombre de la vía:");

        lblNumero.setText("Número:");

        lblPiso.setText("Piso:");

        lblPuerta.setText("Puerta:");

        lblLocalidad.setText("Localidad:");

        lblProvincia.setText("Provincia:");

        lblCP.setText("C.P.:");

        lblPais.setText("Pais:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscarDNI.setText("Buscar por DNI");
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        chkHabitual.setText("Cliente Habitual");

        jLabel1.setText("Id Cliente:");

        txtIdCliente.setEditable(false);

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblDni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtLetraDni, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrimerApellido)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                            .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblNombreDeVia)
                                                .addComponent(lblNumero)
                                                .addComponent(lblPiso)
                                                .addComponent(lblPuerta)
                                                .addComponent(lblLocalidad)
                                                .addComponent(lblProvincia)
                                                .addComponent(lblCP)
                                                .addComponent(lblPais))
                                            .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                            .addComponent(lblSegundoApellido)
                                            .addGap(21, 21, 21)))
                                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                                        .addComponent(lblTipoDeVia)
                                        .addGap(63, 63, 63)))
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbTipoDeVia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreDeVia)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPuerta)
                                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLocalidad)
                                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkHabitual)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                                .addComponent(btnBuscarDNI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar)))))
                .addContainerGap(341, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni)
                    .addComponent(lblGuion)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLetraDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimerApellido)
                    .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundoApellido)
                    .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoDeVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoDeVia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDeVia)
                    .addComponent(txtNombreDeVia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPiso)
                    .addComponent(txtPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuerta)
                    .addComponent(txtPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalidad)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProvincia)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCP)
                    .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHabitual)
                .addGap(17, 17, 17)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscarDNI))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        add(pnlFormulario, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(this.noEsVacioNombre() && this.esNumero() && this.noEsDNIVacio()){
            obtenerFormulario();
            if (this.acciones.insertar()) {
                this.vaciarFormulario();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(this.noEsVacioNombre() && this.esNumero() && this.noEsDNIVacio()){
            obtenerFormulario();
            if (this.acciones.actualizar()) {
                this.vaciarFormulario();
            }
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.noEsDNIVacio()){
            obtenerFormulario();
            if (this.acciones.borrar()) {
                this.vaciarFormulario();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        if(this.noEsDNIVacio()){
            String dni = this.txtDni.getText() + this.txtLetraDni.getText().charAt(0);
            if (this.acciones.buscar(dni)) {
                this.establecerFormulario();
            }
        }
    }//GEN-LAST:event_btnBuscarDNIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox chkHabitual;
    private javax.swing.JComboBox cmbTipoDeVia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCP;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblGuion;
    private javax.swing.JLabel lblLocalidad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDeVia;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPiso;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblPuerta;
    private javax.swing.JLabel lblSegundoApellido;
    private javax.swing.JLabel lblTipoDeVia;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtLetraDni;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDeVia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPiso;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtPuerta;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo(){
        ArrayList datosCombo = new ArrayList();
        datosCombo.add("Calle");
        datosCombo.add("Avenida");
        datosCombo.add("Paseo");
        datosCombo.add("Plaza");
        datosCombo.add("Rotonda");
        Iterator iteratorCombo = datosCombo.iterator();
        while (iteratorCombo.hasNext()) {
            this.cmbTipoDeVia.addItem(iteratorCombo.next());
        }
    }
    
    private void obtenerFormulario(){
        String direccion = this.cmbTipoDeVia.getSelectedItem().toString() + " - " +
                this.txtNombreDeVia.getText() + " - " + this.txtNumero.getText() + " - " +
                this.txtPiso.getText() + " - " + this.txtPuerta.getText() + " - " +
                this.txtCP.getText() + " - " + this.txtLocalidad.getText() + " - " +
                this.txtProvincia.getText() + " - " + this.txtPais.getText();
        Cliente fCliente = new Cliente(0, this.txtDni.getText() + this.txtLetraDni.getText().charAt(0), 
                this.txtNombre.getText(),this.txtPrimerApellido.getText(), this.txtSegundoApellido.getText(),
                direccion, this.chkHabitual.isSelected());
        this.acciones.establecer(fCliente);
        this.cliente = fCliente;
    }
    
    private void establecerFormulario(){
        this.cliente = this.acciones.obtener();
        this.txtIdCliente.setText(String.valueOf(this.cliente.getId()));
        this.txtDni.setText(this.cliente.getDni().getNumeros().toString());
        this.txtLetraDni.setText(String.valueOf(this.cliente.getDni().getLetra()));
        this.txtCP.setText(String.valueOf(this.cliente.getDireccion().getCodigoPostal()));
        this.txtLocalidad.setText(this.cliente.getDireccion().getLocalidad());
        this.txtNombre.setText(this.cliente.getNombre());
        this.txtNumero.setText(String.valueOf(this.cliente.getDireccion().getNumeroCasa()));
        this.txtPiso.setText(String.valueOf(this.cliente.getDireccion().getNumeroPiso()));
        this.txtPuerta.setText(String.valueOf(this.cliente.getDireccion().getNumeroPuerta()));
        this.txtPais.setText(this.cliente.getDireccion().getPais());
        this.txtPrimerApellido.setText(this.cliente.getPrimerApellido());
        this.txtSegundoApellido.setText(this.cliente.getSegundoApellido());
        this.txtProvincia.setText(this.cliente.getDireccion().getProvincia());
        this.cmbTipoDeVia.setSelectedItem(this.cliente.getDireccion().getTipoVia());
        this.txtNombreDeVia.setText(this.cliente.getDireccion().getNombreVia());
        this.chkHabitual.setSelected(this.cliente.isHabitual());
    }
    
    private void vaciarFormulario(){
        this.txtIdCliente.setText("");
        this.txtDni.setText("");
        this.txtLetraDni.setText("");
        this.txtCP.setText("");
        this.txtLocalidad.setText("");
        this.txtNombre.setText("");
        this.txtNumero.setText("");
        this.txtPiso.setText("");
        this.txtPuerta.setText("");
        this.txtPais.setText("");
        this.txtPrimerApellido.setText("");
        this.txtSegundoApellido.setText("");
        this.txtProvincia.setText("");
        this.txtNombreDeVia.setText("");
    }
    
    private boolean noEsVacioNombre(){
        if( this.txtNombre.getText().isEmpty() ||
            this.txtPrimerApellido.getText().isEmpty() ||
            this.txtSegundoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre y los apellidos son obligatorio"
                    + "", "Atención",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean esNumero(){
        try {
            darFormatoNumeros();
            Integer.parseInt(txtNumero.getText());
            Integer.parseInt(txtPiso.getText());
            Integer.parseInt(txtPuerta.getText());
            Integer.parseInt(txtCP.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El número de casa, piso o puerta debe ser un número"
                    + "", "Atención",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
   
    private boolean noEsDNIVacio(){  
        if (this.txtDni.getText().isEmpty() || this.txtLetraDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo DNI es obligatorio", "Atención",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void darFormatoNumeros(){
        if (this.txtCP.getText().isEmpty()) {
            this.txtCP.setText("00000");
        }
        if (this.txtNumero.getText().isEmpty()){
            this.txtNumero.setText("0");
        }
        if (this.txtPiso.getText().isEmpty()){
            this.txtPiso.setText("0");
        }
        if (this.txtPuerta.getText().isEmpty()){
            this.txtPuerta.setText("0");
        }
    }
    
}