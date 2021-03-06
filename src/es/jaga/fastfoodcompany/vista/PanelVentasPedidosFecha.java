package es.jaga.fastfoodcompany.vista;

import es.jaga.fastfoodcompany.controlador.AccionDetalleVenta;
import es.jaga.fastfoodcompany.controlador.AccionVentas;
import es.jaga.fastfoodcompany.modelo.entidades.DetalleVenta;
import es.jaga.fastfoodcompany.modelo.entidades.Venta;
import es.jaga.fastfoodcompany.principal.FFCJFrame;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe del panel de pedidos por fecha.
 * @author Jose Antonio González Alcántara
 */
public class PanelVentasPedidosFecha extends javax.swing.JPanel {

    private final FFCJFrame frame;
    private static final String[] NOMBRE_COLUMNAS_TABLA_VENTAS = {"Id del cliente", "Numero de venta","Total venta","Fecha de la venta"};
    private static final String[] NOMBRE_COLUMNAS_TABLA_DETALLES = {"Id Producto", "Numero de venta","Cantidad","Precio venta"};
    private DefaultTableModel tablaVentas;
    private DefaultTableModel tablaDetalleVentas;
    private Venta venta;
    private DetalleVenta detalleVenta;
    private List listaVentas;
    private AccionVentas acciones;
    private AccionDetalleVenta accionesDetalle;
    private final DateFormat formatoFecha =  new SimpleDateFormat("dd/MM/yyyy");
    
    /**
     * Creates new form PanelVentasPedidosFecha
     * @param frame
     */
    public PanelVentasPedidosFecha(FFCJFrame frame) {
        initComponents();
        this.frame = frame;
        this.tablaVentas = new DefaultTableModel(NOMBRE_COLUMNAS_TABLA_VENTAS,0);
        this.tablaDetalleVentas = new DefaultTableModel(NOMBRE_COLUMNAS_TABLA_DETALLES,0);
        this.listaVentas = new ArrayList();
        this.acciones = new AccionVentas();
        this.accionesDetalle = new AccionDetalleVenta();
        this.actualizarTablaVentas(formatoFecha.format(new Date()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlOeste = new javax.swing.JPanel();
        scrVentas = new javax.swing.JScrollPane();
        tblVentas = new javax.swing.JTable();
        pnlSuperior = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        lblFormatoFecha = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        pnlEste = new javax.swing.JPanel();
        scrTicket = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos por fecha"));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.BorderLayout(5, 5));

        pnlOeste.setPreferredSize(new java.awt.Dimension(395, 590));

        tblVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVentasMouseClicked(evt);
            }
        });
        scrVentas.setViewportView(tblVentas);

        javax.swing.GroupLayout pnlOesteLayout = new javax.swing.GroupLayout(pnlOeste);
        pnlOeste.setLayout(pnlOesteLayout);
        pnlOesteLayout.setHorizontalGroup(
            pnlOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        pnlOesteLayout.setVerticalGroup(
            pnlOesteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        add(pnlOeste, java.awt.BorderLayout.WEST);

        lblFecha.setText("Introduce la fecha del pedido:");

        lblFormatoFecha.setText("dd/MM/yyyy");

        btnBuscar.setText("Buscar ventas ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFormatoFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap())
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha)
                    .addComponent(lblFormatoFecha)
                    .addComponent(btnBuscar)))
        );

        add(pnlSuperior, java.awt.BorderLayout.NORTH);

        pnlEste.setPreferredSize(new java.awt.Dimension(395, 590));

        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTickets.setPreferredSize(new java.awt.Dimension(390, 590));
        scrTicket.setViewportView(tblTickets);

        javax.swing.GroupLayout pnlEsteLayout = new javax.swing.GroupLayout(pnlEste);
        pnlEste.setLayout(pnlEsteLayout);
        pnlEsteLayout.setHorizontalGroup(
            pnlEsteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEsteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scrTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlEsteLayout.setVerticalGroup(
            pnlEsteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        add(pnlEste, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String fecha = this.txtFecha.getText();
        if (formatoFechaCorrecta(fecha)) {
            actualizarTablaVentas(fecha);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVentasMouseClicked
        int fila = this.tblVentas.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
        } else {
          int numeroDeVenta = (int) tblVentas.getValueAt(fila, 1);
          actualizarTablaTicket(numeroDeVenta); 
        }
    }//GEN-LAST:event_tblVentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFormatoFecha;
    private javax.swing.JPanel pnlEste;
    private javax.swing.JPanel pnlOeste;
    private javax.swing.JPanel pnlSuperior;
    private javax.swing.JScrollPane scrTicket;
    private javax.swing.JScrollPane scrVentas;
    private javax.swing.JTable tblTickets;
    private javax.swing.JTable tblVentas;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
    
    private void actualizarTablaVentas(String fecha){
        int i = this.tablaVentas.getRowCount();
        while (i >= 1) {
            i--;
            this.tablaVentas.removeRow(i);
        }
        this.listaVentas = this.acciones.obtenerVentasFecha(fecha);
        if (this.listaVentas == null) {
            this.listaVentas = new ArrayList();
        }
        Iterator<Venta> iteratorClientes = this.listaVentas.iterator();
        while (iteratorClientes.hasNext()) {
            this.venta =  iteratorClientes.next();
            Vector filaTabla = new Vector(NOMBRE_COLUMNAS_TABLA_VENTAS.length);
            filaTabla.add(this.venta.getCliente());
            filaTabla.add(this.venta.getNumeroDeVenta());
            filaTabla.add(this.venta.getTotal());
            filaTabla.add(this.venta.getFecha());
            this.tablaVentas.addRow(filaTabla);
            this.tblVentas.setModel(this.tablaVentas);
            this.scrVentas.setViewportView(this.tblVentas);
        }   
    }
    
    private void actualizarTablaTicket(int numeroDeVenta){
        int i = this.tablaDetalleVentas.getRowCount();
        while (i >= 1) {
            i--;
            this.tablaDetalleVentas.removeRow(i);
        }
        this.listaVentas = this.accionesDetalle.obtenerDetallesVenta(numeroDeVenta);
        if (this.listaVentas == null) {
            this.listaVentas = new ArrayList();
        }
        Iterator<DetalleVenta> iteratorClientes = this.listaVentas.iterator();
        while (iteratorClientes.hasNext()) {
            this.detalleVenta =  iteratorClientes.next();
            Vector filaTabla = new Vector(NOMBRE_COLUMNAS_TABLA_DETALLES.length);
            filaTabla.add(this.detalleVenta.getIdProducto());
            filaTabla.add(this.detalleVenta.getNumeroDeVenta());
            filaTabla.add(this.detalleVenta.getCantidad());
            filaTabla.add(this.detalleVenta.getPrecioVenta());
            this.tablaDetalleVentas.addRow(filaTabla);
            this.tblTickets.setModel(this.tablaDetalleVentas);
            this.scrTicket.setViewportView(this.tblTickets);
        }   
    }
    
    private boolean formatoFechaCorrecta(String fecha){
        try {
            if (!fecha.isEmpty()) {
                formatoFecha.setLenient(false);
                formatoFecha.parse(fecha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lafecha: " + fecha + "no es correcta", "Atención",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
}
