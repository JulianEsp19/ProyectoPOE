
package Forms;

import Clases.Agregar;
import Clases.Ingresos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AgregarInventario extends javax.swing.JInternalFrame {

    private String FechaIngreso1;
    private String Almacen1;
    private String FechaDe_R_OP1;
    private String FechaSalidaCliente1;
    private String ProgramadaCheckList1;
    private String R_OP1;
    private String OrdenCompra1;
    private String OrdenCompraProvedor1;
    private String Modelo1;
    private String TipoEntregar1;
    private String ClaveIdentificador1;
    private String R_OP21;
    private String Clave1;
    private String Provedor1;
    private String Cliente1;
    private int NumPedidoProvedor1;
    private int ClaveProducto1;
    private int Tarimas1;
    private int PiezaporBulto1;
    private int  TotalBultos1;
    private int TotalPiezas1;
    private int PiezasRequendas1;
    private int Paletizado1;
    private int CamaPorPaletA11;
    private int CamaPorPaletA21;
    private int EstibasPorPalet1;
    private int TotalPiezasFinal1;
    private float Alto1;
    private float Ancho1;
    private float Largo1;
    private float CalibreFlauta1;
    private float Medidas1;
    
    public AgregarInventario() {
        initComponents();
    }
 
    public void obtenerdatos(){
    
        FechaIngreso1 = FechaIngreso.getText();
Almacen1 = Almacen.getText();
FechaDe_R_OP1 = FechaDe_R_OP.getText();
FechaSalidaCliente1 = FechaSalidaCliente.getText();
ProgramadaCheckList1 = ProgramadaCheckList.getText();
R_OP1 = R_OP.getText();
OrdenCompra1 = OrdenCompra.getText();
OrdenCompraProvedor1 = OrdenCompraProvedor.getText();
Modelo1 = Modelo.getText();
TipoEntregar1 = TipoEntregar.getText();
ClaveIdentificador1 = ClaveIdentificador.getText();
R_OP21 = R_OP2.getText();
Clave1 = Clave.getText();
Provedor1 = Provedor.getText();
Cliente1 = Cliente.getText();
NumPedidoProvedor1 = Integer.parseInt(NumPedidoProvedor.getText());
ClaveProducto1 = Integer.parseInt(ClaveProducto.getText());
Tarimas1 = Integer.parseInt(Tarimas.getText());
PiezaporBulto1 = Integer.parseInt(PzPorBulto.getText());
TotalBultos1 = Integer.parseInt(TotalBultos.getText());
TotalPiezas1 = Integer.parseInt(TotalPiezas.getText());
PiezasRequendas1 = Integer.parseInt(PiezasRequendas.getText());
Paletizado1 = Integer.parseInt(Paletizado.getText());
CamaPorPaletA11 = Integer.parseInt(CamaPorPaletA1.getText());
CamaPorPaletA21 = Integer.parseInt(CamaPorPaletA2.getText());
EstibasPorPalet1 = Integer.parseInt(EstibasPorPalet.getText());
TotalPiezasFinal1 = Integer.parseInt(TotalPiezasFinal.getText());
Alto1 = Float.parseFloat(Alto.getText());
Ancho1 = Float.parseFloat(Ancho.getText());
Largo1 = Float.parseFloat(Largo.getText());
CalibreFlauta1 = Float.parseFloat(CalibreFlauta.getText());
Medidas1 = Float.parseFloat(Medidas.getText());

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
        FechaIngreso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Almacen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaDe_R_OP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FechaSalidaCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProgramadaCheckList = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NumPedidoProvedor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        R_OP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        OrdenCompra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        OrdenCompraProvedor = new javax.swing.JTextField();
        Alto = new javax.swing.JTextField();
        Ancho = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Largo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        R_OP2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Clave = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Provedor = new javax.swing.JTextField();
        Cliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        CalibreFlauta = new javax.swing.JTextField();
        Tarimas = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        PzPorBulto = new javax.swing.JLabel();
        Medidas = new javax.swing.JTextField();
        PiezasPorBulto = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ClaveProducto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TipoEntregar = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ClaveIdentificador = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        PiezasRequendas = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        Paletizado = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        CamaPorPaletA1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        EstibasPorPalet = new javax.swing.JTextField();
        CamaPorPaletA2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        TotalPiezasFinal = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        TotalBultos = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        TotalPiezas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setTitle("Agregar");

        jLabel1.setText("Fecha de ingreso");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Almacen");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Fecha de R_OP");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Fecha salida del cliente");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Checklist programado");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Numero de pedido provedor");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("R_OP");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Orden de compra");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Orden de compra (provedor)");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Alto");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Ancho");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Largo");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Largo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LargoActionPerformed(evt);
            }
        });

        jLabel13.setText("R_OP2");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Clave");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Provedor");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Cliente");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setText("Tarimas");
        jLabel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Provedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvedorActionPerformed(evt);
            }
        });

        jLabel18.setText("Calibre de flauta");
        jLabel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Medidas");
        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PzPorBulto.setText("Piezas por bulto");
        PzPorBulto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        PiezasPorBulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiezasPorBultoActionPerformed(evt);
            }
        });

        jLabel21.setText("Clave del producto");
        jLabel21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Modelo");
        jLabel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setText("Tipo a entregar");
        jLabel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel24.setText("Clave de identificador");
        jLabel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel25.setText("Piezas requendas");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setText("Paletizado");
        jLabel26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel27.setText("Cama por palet A1");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setText("Estibas por palet");
        jLabel28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel29.setText("Cama por palet A2");
        jLabel29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel30.setText("Total de piezas");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel34.setText("Total de bultos");
        jLabel34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel35.setText("Total de piezas");
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Largo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Alto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FechaIngreso)
                        .addComponent(Almacen)
                        .addComponent(FechaDe_R_OP, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(FechaSalidaCliente)
                        .addComponent(ProgramadaCheckList)
                        .addComponent(NumPedidoProvedor)
                        .addComponent(R_OP)
                        .addComponent(OrdenCompra)
                        .addComponent(OrdenCompraProvedor)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(PzPorBulto)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PiezasPorBulto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tarimas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CalibreFlauta)
                        .addComponent(Medidas)
                        .addComponent(ClaveProducto)
                        .addComponent(Modelo)
                        .addComponent(TipoEntregar)
                        .addComponent(ClaveIdentificador)
                        .addComponent(R_OP2)
                        .addComponent(Clave)
                        .addComponent(Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TotalBultos, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(TotalPiezas)
                            .addComponent(PiezasRequendas)
                            .addComponent(Paletizado)
                            .addComponent(CamaPorPaletA1)
                            .addComponent(CamaPorPaletA2)
                            .addComponent(EstibasPorPalet)
                            .addComponent(TotalPiezasFinal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Almacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(FechaDe_R_OP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(FechaSalidaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ProgramadaCheckList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NumPedidoProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(R_OP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(OrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(OrdenCompraProvedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Alto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(Largo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(CalibreFlauta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(Medidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(ClaveProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(TipoEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(ClaveIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(R_OP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Provedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(Tarimas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PzPorBulto)
                            .addComponent(PiezasPorBulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(TotalBultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(TotalPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(PiezasRequendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(Paletizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(CamaPorPaletA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(CamaPorPaletA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(EstibasPorPalet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(TotalPiezasFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LargoActionPerformed

    private void PiezasPorBultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiezasPorBultoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PiezasPorBultoActionPerformed

    private void ProvedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvedorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        obtenerdatos();
        Ingresos ingresos = new Ingresos(FechaIngreso1, Almacen1 
,FechaDe_R_OP1 
,FechaSalidaCliente1  
,ProgramadaCheckList1 
,R_OP1 
,OrdenCompra1 
,OrdenCompraProvedor1 
,Modelo1 
,TipoEntregar1 
,ClaveIdentificador1 
,R_OP21 
,Clave1 
,Provedor1 
,Cliente1 
,NumPedidoProvedor1 
,ClaveProducto1 
,Tarimas1 
,PiezaporBulto1 
,TotalBultos1  
,TotalPiezas1 
,PiezasRequendas1 
,Paletizado1 
,CamaPorPaletA11  
,CamaPorPaletA21 
,EstibasPorPalet1  
,TotalPiezasFinal1 
,Alto1 
,Ancho1 
,Largo1 
,CalibreFlauta1 
,Medidas1 );
        Agregar agregar = new Agregar();
            try {
                agregar.agregarIngresos(ingresos);
            } catch (SQLException ex) {
                Logger.getLogger(AgregarInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Almacen;
    private javax.swing.JTextField Alto;
    private javax.swing.JTextField Ancho;
    private javax.swing.JTextField CalibreFlauta;
    private javax.swing.JTextField CamaPorPaletA1;
    private javax.swing.JTextField CamaPorPaletA2;
    private javax.swing.JTextField Clave;
    private javax.swing.JTextField ClaveIdentificador;
    private javax.swing.JTextField ClaveProducto;
    private javax.swing.JTextField Cliente;
    private javax.swing.JTextField EstibasPorPalet;
    private javax.swing.JTextField FechaDe_R_OP;
    private javax.swing.JTextField FechaIngreso;
    private javax.swing.JTextField FechaSalidaCliente;
    private javax.swing.JTextField Largo;
    private javax.swing.JTextField Medidas;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField NumPedidoProvedor;
    private javax.swing.JTextField OrdenCompra;
    private javax.swing.JTextField OrdenCompraProvedor;
    private javax.swing.JTextField Paletizado;
    private javax.swing.JTextField PiezasPorBulto;
    private javax.swing.JTextField PiezasRequendas;
    private javax.swing.JTextField ProgramadaCheckList;
    private javax.swing.JTextField Provedor;
    private javax.swing.JLabel PzPorBulto;
    private javax.swing.JTextField R_OP;
    private javax.swing.JTextField R_OP2;
    private javax.swing.JTextField Tarimas;
    private javax.swing.JTextField TipoEntregar;
    private javax.swing.JTextField TotalBultos;
    private javax.swing.JTextField TotalPiezas;
    private javax.swing.JTextField TotalPiezasFinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
