/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.Arreglo4Tributo;
import Atxy2k.CustomTextField.RestrictedTextField;
import Clases.CuartaCategoria;

import Clases.Fecha;

import Clases.Registro;
import Clases.Tributo;
import Clases.Usuario;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author bryleo
 */
public class Cua_Categor extends javax.swing.JInternalFrame {
Arreglo4Tributo a=new Arreglo4Tributo();
    /**
     * Creates new form Cua_Categor
     */
    public Cua_Categor() {
        initComponents();
        ValoresIniciales();
        MostrarValores();
        Limitadores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        gbtnServicio = new javax.swing.ButtonGroup();
        gbtnInciso = new javax.swing.ButtonGroup();
        gbtRetencion = new javax.swing.ButtonGroup();
        PanelMostrar4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbTipoMoneda = new javax.swing.JLabel();
        lbvuelto = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbMedio = new javax.swing.JLabel();
        lbMonto = new javax.swing.JLabel();
        lbImpuesto = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lbnumeroempresa = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbtipodocumento = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lbRetencion = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbInciso = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        dataEmision1 = new com.toedter.calendar.JDateChooser();
        jPanel15 = new javax.swing.JPanel();
        lbDni1 = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbEdad1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ScrollResec = new javax.swing.JScrollPane();
        PanelResección4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbDni = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        dataEmision = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbB = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbRetencionSi = new javax.swing.JRadioButton();
        rbRetenciónNo = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        cbDnirRuc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDNIRUC = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHonorarios = new javax.swing.JTextField();
        cbMoneda = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cbTipoPago = new javax.swing.JComboBox<>();
        lbReten = new javax.swing.JLabel();
        lbReten1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CUARTA CATEGORÍA");
        setVisible(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("HONORARIO"));
        jPanel10.setLayout(null);

        jLabel13.setText("Devolución:");
        jPanel10.add(jLabel13);
        jLabel13.setBounds(20, 160, 100, 14);

        jLabel17.setText("Medio de Pago:");
        jPanel10.add(jLabel17);
        jLabel17.setBounds(10, 30, 90, 14);

        lbTipoMoneda.setText("N");
        jPanel10.add(lbTipoMoneda);
        lbTipoMoneda.setBounds(110, 70, 110, 20);

        lbvuelto.setText("0000");
        jPanel10.add(lbvuelto);
        lbvuelto.setBounds(130, 160, 60, 20);

        jLabel14.setText("Tipo de Moneda:");
        jPanel10.add(jLabel14);
        jLabel14.setBounds(10, 70, 100, 14);

        jLabel15.setText("Monto:");
        jPanel10.add(jLabel15);
        jLabel15.setBounds(20, 100, 70, 14);

        jLabel16.setText("Impuesto:");
        jPanel10.add(jLabel16);
        jLabel16.setBounds(20, 130, 100, 14);

        lbMedio.setText("N");
        jPanel10.add(lbMedio);
        lbMedio.setBounds(110, 30, 110, 20);

        lbMonto.setText("0000");
        jPanel10.add(lbMonto);
        lbMonto.setBounds(130, 100, 60, 20);

        lbImpuesto.setText("0000");
        jPanel10.add(lbImpuesto);
        lbImpuesto.setBounds(130, 130, 70, 20);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("EMPRESA"));
        jPanel11.setLayout(null);

        lbnumeroempresa.setText("0000000");
        jPanel11.add(lbnumeroempresa);
        lbnumeroempresa.setBounds(180, 30, 50, 14);

        jLabel24.setText("Tipo de Documento:");
        jPanel11.add(jLabel24);
        jLabel24.setBounds(20, 30, 120, 14);

        lbtipodocumento.setText("NNN");
        jPanel11.add(lbtipodocumento);
        lbtipodocumento.setBounds(140, 30, 30, 14);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("RENTA"));
        jPanel12.setLayout(null);

        lbRetencion.setText("N");
        jPanel12.add(lbRetencion);
        lbRetencion.setBounds(150, 50, 20, 20);

        jLabel27.setText("Retención:");
        jPanel12.add(jLabel27);
        jLabel27.setBounds(60, 50, 70, 14);

        jLabel28.setText("Tipo de Renta:");
        jPanel12.add(jLabel28);
        jLabel28.setBounds(40, 20, 90, 20);

        lbInciso.setText("N");
        jPanel12.add(lbInciso);
        lbInciso.setBounds(150, 20, 20, 20);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));
        jPanel14.setLayout(null);

        dataEmision1.setEnabled(false);
        jPanel14.add(dataEmision1);
        dataEmision1.setBounds(40, 40, 190, 20);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));
        jPanel15.setLayout(null);

        lbDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));
        jPanel15.add(lbDni1);
        lbDni1.setBounds(10, 170, 200, 60);

        lbNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel15.add(lbNombre1);
        lbNombre1.setBounds(10, 30, 200, 60);

        lbEdad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel15.add(lbEdad1);
        lbEdad1.setBounds(10, 100, 200, 60);

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMostrar4Layout = new javax.swing.GroupLayout(PanelMostrar4);
        PanelMostrar4.setLayout(PanelMostrar4Layout);
        PanelMostrar4Layout.setHorizontalGroup(
            PanelMostrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelMostrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(PanelMostrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelMostrar4Layout.setVerticalGroup(
            PanelMostrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelMostrar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMostrar4Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMostrar4Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 0, 0, 0);
        getContentPane().add(PanelMostrar4, gridBagConstraints);

        PanelResección4.setLayout(new java.awt.GridBagLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));
        jPanel8.setLayout(null);

        lbDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));
        jPanel8.add(lbDni);
        lbDni.setBounds(10, 170, 200, 60);

        lbNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel8.add(lbNombre);
        lbNombre.setBounds(10, 30, 200, 60);

        lbEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel8.add(lbEdad);
        lbEdad.setBounds(10, 100, 200, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 249;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 6, 0, 9);
        PanelResección4.add(jPanel8, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL REGISTRO"));
        jPanel9.setLayout(null);

        dataEmision.setEnabled(false);
        jPanel9.add(dataEmision);
        dataEmision.setBounds(20, 30, 190, 20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 6, 0, 9);
        PanelResección4.add(jPanel9, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS TRIBUTARIOS"));
        jPanel1.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("De la Renta"));
        jPanel4.setLayout(null);

        jLabel1.setText("Tipo de Renta");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 20, 90, 20);

        gbtnInciso.add(rbB);
        rbB.setText("Inciso B:");
        jPanel4.add(rbB);
        rbB.setBounds(10, 140, 90, 23);

        gbtnInciso.add(rbA);
        rbA.setText("Inciso A: ");
        jPanel4.add(rbA);
        rbA.setBounds(10, 50, 90, 30);

        jLabel4.setText("El ejercicio individual, de cualquier profesión, arte");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(40, 80, 290, 14);

        jLabel5.setText(", oficio o actividades no incluidas expresamente en la");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(40, 100, 254, 14);

        jLabel6.setText(" tercera categoría");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(40, 120, 110, 14);

        jLabel7.setText("El desempeño de funciones de director de empresas");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(40, 170, 310, 14);

        jLabel8.setText(", síndico, mandatario, gestor de negocios, albacea ");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(40, 190, 310, 14);

        jLabel9.setText("y actividades similares");
        jPanel4.add(jLabel9);
        jLabel9.setBounds(40, 210, 140, 14);

        jLabel10.setText("Desea aplicar retención del Impuesto a la Renta:");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(10, 240, 280, 14);

        gbtRetencion.add(rbRetencionSi);
        rbRetencionSi.setText("Si");
        jPanel4.add(rbRetencionSi);
        rbRetencionSi.setBounds(20, 260, 50, 23);

        gbtRetencion.add(rbRetenciónNo);
        rbRetenciónNo.setText("No");
        jPanel4.add(rbRetenciónNo);
        rbRetenciónNo.setBounds(90, 260, 50, 23);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 110, 380, 300);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("De la empresa"));
        jPanel5.setLayout(null);

        cbDnirRuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "RUC" }));
        cbDnirRuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDnirRucItemStateChanged(evt);
            }
        });
        cbDnirRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDnirRucActionPerformed(evt);
            }
        });
        jPanel5.add(cbDnirRuc);
        cbDnirRuc.setBounds(140, 30, 65, 20);

        jLabel2.setText("Tipo de Documento:");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(20, 30, 120, 14);
        jPanel5.add(txtDNIRUC);
        txtDNIRUC.setBounds(210, 30, 150, 20);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 30, 380, 70);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Del Honorario"));
        jPanel6.setLayout(null);

        jLabel3.setText("Tipo de Moneda:");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(20, 70, 100, 14);

        txtHonorarios.setBorder(javax.swing.BorderFactory.createTitledBorder("MONTO DE HONORARIOS"));
        jPanel6.add(txtHonorarios);
        txtHonorarios.setBounds(20, 100, 240, 70);

        cbMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar", "Sol", "Libra", "Euro" }));
        jPanel6.add(cbMoneda);
        cbMoneda.setBounds(210, 70, 150, 20);

        jLabel12.setText("Medio de Pago:");
        jPanel6.add(jLabel12);
        jLabel12.setBounds(20, 30, 90, 14);

        cbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giro", "Transferencia Bancaria", "Cheque", "Efectivo", "Orden de Pago", "Tarjeta de crédito", "Tarjeta de débito" }));
        jPanel6.add(cbTipoPago);
        cbTipoPago.setBounds(210, 30, 150, 20);

        lbReten.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Recibido"));
        jPanel6.add(lbReten);
        lbReten.setBounds(140, 170, 120, 60);

        lbReten1.setBorder(javax.swing.BorderFactory.createTitledBorder("Impuesto"));
        jPanel6.add(lbReten1);
        lbReten1.setBounds(20, 170, 120, 60);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel6.add(btnGuardar);
        btnGuardar.setBounds(270, 150, 77, 23);

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);
        jButton2.setBounds(270, 100, 71, 23);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(410, 100, 380, 250);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 799;
        gridBagConstraints.ipady = 419;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 0, 0);
        PanelResección4.add(jPanel1, gridBagConstraints);

        ScrollResec.setViewportView(PanelResección4);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 76;
        gridBagConstraints.ipady = 430;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(ScrollResec, gridBagConstraints);

        setBounds(0, 0, 849, 472);
    }// </editor-fold>//GEN-END:initComponents

    Date calendario=new Date();
    void ValoresIniciales()
    {
        //calendario;
        dataEmision.setDate(calendario);
        cbDnirRuc.setSelectedIndex(-1);
        cbMoneda.setSelectedIndex(-1);
        cbTipoPago.setSelectedIndex(-1);
        btnGuardar.setVisible(false);
        PanelResección4.setVisible(true);
        PanelMostrar4.setVisible(false);
        ScrollResec.setVisible(true);
        lbNombre.setText(Registro.unregistro.getUsuario().getNombre());
        lbEdad.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
        lbDni.setText(Registro.unregistro.getUsuario().getDNI());
    }
    void LimitadorDouble(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite);
         obj.setAcceptCharacters(".0123456789");//limita los caracteres a numeros y el punto para el ingreso de datos decimales
        obj.setOnlyCustomCharacters(true);
    }
    void LimitadorNum(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite); //limite de caracteres
        
        obj.setOnlyNums(true);//para que solo acepte números    
    }
    void Limitadores(){
        LimitadorDouble(txtHonorarios,20);
        LimitadorNum(txtDNIRUC,11);
    }
    
    String obtenertipodoc(){
        if(cbDnirRuc.getSelectedIndex()==0) return "DNI";
        else return "RUC";
    }
    String obtenerInciso()
    {
        if(rbA.isSelected()) return "A";
        else return "B";
    }
    String obtenerReten()
    {
        if(rbRetencionSi.isSelected()) return "Si";
        else return "No";
    }
    String obtenerMedio()
    {
      return String.valueOf(cbTipoPago.getSelectedItem());
    }
    String obtenermoneda()
    {
        return String.valueOf(cbMoneda.getSelectedItem());
    }
    String obtenerNumeroEmpresa()
    {
        return txtDNIRUC.getText();
    }
    void MostrarValores()
    {
        dataEmision1.setDate(calendario);
        lbNombre1.setText(Registro.unregistro.getUsuario().getNombre());
        lbEdad1.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
        lbDni1.setText(Registro.unregistro.getUsuario().getDNI());
    }
    String Validar(){
        if(obtenerNumeroEmpresa().equals("")){
            return "Tipo de Documento (Vacio)";
        }else if(cbDnirRuc.getSelectedIndex()==-1){
            return "Tipo de Documento (No seleccionado)";
        }else if(cbTipoPago.getSelectedIndex()==-1){
            return "Tipo de Pago (No seleccionado)";
        }else if(cbMoneda.getSelectedIndex()==-1){
            return "Tipo de Moneda (No seleccionado)";
        }else if(!rbA.isSelected()&&!rbB.isSelected()){
            return "Inciso (No seleccionado)";
        }else if(!rbRetencionSi.isSelected()&&!rbRetenciónNo.isSelected()){
            return "Pregunta Aplicar retención (No respondida)";
        }else if(txtHonorarios.getText().equals("")){
            return "Monto de Honorarios (Vacio)";
        }else{
            return "";
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(Validar().equals("")){
        CuartaCategoria unacategoria = new CuartaCategoria(ObtenerMonto());
        if(rbRetenciónNo.isSelected()||ObtenerMonto()<1500){
            unacategoria.setImpuesto(0);
        }else{
            unacategoria.CalculoImpuesto();
        }
        lbtipodocumento.setText(obtenertipodoc());
        lbnumeroempresa.setText(obtenerNumeroEmpresa());
        lbInciso.setText(obtenerInciso());
        lbRetencion.setText(obtenerReten());
        lbMedio.setText(obtenerMedio());
        lbTipoMoneda.setText(obtenermoneda());
        lbMonto.setText(String.valueOf(ObtenerMonto()));
        lbImpuesto.setText(String.valueOf(unacategoria.getImpuesto()));
        lbvuelto.setText(String.valueOf(unacategoria.getMontoDeHonorarios()-unacategoria.getImpuesto()));
        
        lbReten1.setText(String.valueOf(unacategoria.getImpuesto()));
        lbReten.setText(String.valueOf(unacategoria.getMontoDeHonorarios()-unacategoria.getImpuesto()));
        btnGuardar.setVisible(true);
        }else{
              JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(Validar().equals("")){
            if(lbMonto.getText().equals(String.valueOf(ObtenerMonto()))){
                
                MostrarValores();
               CuartaCategoria categoria4 = new CuartaCategoria(ObtenerMonto());
                if(rbRetenciónNo.isSelected()||ObtenerMonto()<1500){
                   categoria4.setImpuesto(0);
               }else{
                   categoria4.CalculoImpuesto();
               }
               Usuario unUsuario = new Usuario(Registro.unregistro.getUsuario().getNombre(), Registro.unregistro.getUsuario().getDNI());
               Fecha unaFechaEmi = new Fecha(ObtenerDia(), ObtenerMes(), ObtenerAnio());
               Tributo x = new Tributo(unUsuario, unaFechaEmi);
               x.setContribuyente(unUsuario);
               x.setFechaEmision(unaFechaEmi);
               x.setCategoria4(categoria4);
               a.adicionar(x);
               a.grabar();


               PanelMostrar4.setVisible(true);
               PanelResección4.setVisible(false);
               ScrollResec.setVisible(false);
          }else{
            JOptionPane.showMessageDialog(null,"Ha modificado el valor de Honorarios");
          }
        }else{
            JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbDnirRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDnirRucActionPerformed
        
    }//GEN-LAST:event_cbDnirRucActionPerformed

    private void cbDnirRucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDnirRucItemStateChanged

    }//GEN-LAST:event_cbDnirRucItemStateChanged
    
    public double ObtenerMonto()
    {
        return Double.parseDouble(txtHonorarios.getText());
    }
    int ObtenerDia()
    {
        return dataEmision.getCalendar().get(Calendar.DAY_OF_MONTH);
    }  
    int ObtenerMes()
    {
        return dataEmision.getCalendar().get(Calendar.MONTH)+1;
    } 
    int ObtenerAnio()
    {
        return dataEmision.getCalendar().get(Calendar.YEAR);
    } 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrar4;
    private javax.swing.JPanel PanelResección4;
    private javax.swing.JScrollPane ScrollResec;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbDnirRuc;
    private javax.swing.JComboBox<String> cbMoneda;
    private javax.swing.JComboBox<String> cbTipoPago;
    private com.toedter.calendar.JDateChooser dataEmision;
    private com.toedter.calendar.JDateChooser dataEmision1;
    private javax.swing.ButtonGroup gbtRetencion;
    private javax.swing.ButtonGroup gbtnInciso;
    private javax.swing.ButtonGroup gbtnServicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbDni1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbEdad1;
    private javax.swing.JLabel lbImpuesto;
    private javax.swing.JLabel lbInciso;
    private javax.swing.JLabel lbMedio;
    private javax.swing.JLabel lbMonto;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbReten;
    private javax.swing.JLabel lbReten1;
    private javax.swing.JLabel lbRetencion;
    private javax.swing.JLabel lbTipoMoneda;
    private javax.swing.JLabel lbnumeroempresa;
    private javax.swing.JLabel lbtipodocumento;
    private javax.swing.JLabel lbvuelto;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbRetencionSi;
    private javax.swing.JRadioButton rbRetenciónNo;
    private javax.swing.JTextField txtDNIRUC;
    private javax.swing.JTextField txtHonorarios;
    // End of variables declaration//GEN-END:variables
}
