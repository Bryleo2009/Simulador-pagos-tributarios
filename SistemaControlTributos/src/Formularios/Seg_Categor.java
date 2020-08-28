/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.Arreglo2Tributo;
import Atxy2k.CustomTextField.RestrictedTextField;
import Clases.Fecha;
import Clases.Registro;
import Clases.SegundaCategoria;
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
public class Seg_Categor extends javax.swing.JInternalFrame {
    Arreglo2Tributo a=new Arreglo2Tributo();
    /**
     * Creates new form Seg_Categor
     */
    public Seg_Categor() {
        initComponents();
        
        ValoresIniciales();
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

        gbtnVenta = new javax.swing.ButtonGroup();
        PanelReseccion2 = new javax.swing.JScrollPane();
        PanelR = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbReten = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtRentaExtranjera = new javax.swing.JTextField();
        txtPerdidaC = new javax.swing.JTextField();
        txtCostoC = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lbDni = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        dataEmision = new com.toedter.calendar.JDateChooser();
        PanelMostrar2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbRentaN = new javax.swing.JLabel();
        lbPerdidaC = new javax.swing.JLabel();
        lbCostoC = new javax.swing.JLabel();
        lbIngresoN = new javax.swing.JLabel();
        lbRentaExtranjera = new javax.swing.JLabel();
        lbImpuesto = new javax.swing.JLabel();
        lbRentaB = new javax.swing.JLabel();
        lbRentaNI = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbDni1 = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbEdad1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        dataEmision1 = new com.toedter.calendar.JDateChooser();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("SEGUNDA CATEGORÍA");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PanelR.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS TRIBUTARIOS"));
        jPanel2.setLayout(null);

        lbReten.setBorder(javax.swing.BorderFactory.createTitledBorder("IMPUESTO"));
        jPanel2.add(lbReten);
        lbReten.setBounds(20, 240, 280, 70);

        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(70, 330, 71, 23);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar);
        btnGuardar.setBounds(180, 330, 77, 23);

        txtRentaExtranjera.setBorder(javax.swing.BorderFactory.createTitledBorder("Renta Neta de fuente extranjera:"));
        jPanel2.add(txtRentaExtranjera);
        txtRentaExtranjera.setBounds(20, 170, 300, 60);

        txtPerdidaC.setBorder(javax.swing.BorderFactory.createTitledBorder("Pérdida de Capital:"));
        jPanel2.add(txtPerdidaC);
        txtPerdidaC.setBounds(170, 90, 150, 60);

        txtCostoC.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Computable:"));
        jPanel2.add(txtCostoC);
        txtCostoC.setBounds(20, 90, 140, 60);

        txtIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Neto:"));
        jPanel2.add(txtIngreso);
        txtIngreso.setBounds(20, 20, 300, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 329;
        gridBagConstraints.ipady = 389;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 11, 0);
        PanelR.add(jPanel2, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));
        jPanel5.setLayout(null);

        lbDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));
        jPanel5.add(lbDni);
        lbDni.setBounds(10, 170, 200, 60);

        lbNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel5.add(lbNombre);
        lbNombre.setBounds(10, 30, 200, 60);

        lbEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));
        jPanel5.add(lbEdad);
        lbEdad.setBounds(10, 100, 200, 60);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 249;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 17);
        PanelR.add(jPanel5, gridBagConstraints);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL REGISTRO"));
        jPanel6.setLayout(null);

        dataEmision.setEnabled(false);
        jPanel6.add(dataEmision);
        dataEmision.setBounds(20, 30, 190, 20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.ipady = 89;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 10, 0, 17);
        PanelR.add(jPanel6, gridBagConstraints);

        PanelReseccion2.setViewportView(PanelR);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 230;
        gridBagConstraints.ipady = 484;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(PanelReseccion2, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS TRIBUTARIOS"));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbRentaN.setBorder(javax.swing.BorderFactory.createTitledBorder("Renta neta:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 18, 0, 15);
        jPanel1.add(lbRentaN, gridBagConstraints);

        lbPerdidaC.setBorder(javax.swing.BorderFactory.createTitledBorder("Pérdida de Capital:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 128;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 15);
        jPanel1.add(lbPerdidaC, gridBagConstraints);

        lbCostoC.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Computable:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 118;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        jPanel1.add(lbCostoC, gridBagConstraints);

        lbIngresoN.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso Neto: "));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 266;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 15, 0, 15);
        jPanel1.add(lbIngresoN, gridBagConstraints);

        lbRentaExtranjera.setBorder(javax.swing.BorderFactory.createTitledBorder("Renta Neta de fuente extranjera:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 266;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 15);
        jPanel1.add(lbRentaExtranjera, gridBagConstraints);

        lbImpuesto.setBorder(javax.swing.BorderFactory.createTitledBorder("Impuesto:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 266;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 14, 15);
        jPanel1.add(lbImpuesto, gridBagConstraints);

        lbRentaB.setBorder(javax.swing.BorderFactory.createTitledBorder("Renta bruta:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 123;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 0);
        jPanel1.add(lbRentaB, gridBagConstraints);

        lbRentaNI.setBorder(javax.swing.BorderFactory.createTitledBorder("Renta neta imponible:"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 266;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 15, 0, 15);
        jPanel1.add(lbRentaNI, gridBagConstraints);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PERSONALES"));

        lbDni1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dni"));

        lbNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        lbEdad1.setBorder(javax.swing.BorderFactory.createTitledBorder("Edad"));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));

        dataEmision1.setEnabled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dataEmision1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(dataEmision1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMostrar2Layout = new javax.swing.GroupLayout(PanelMostrar2);
        PanelMostrar2.setLayout(PanelMostrar2Layout);
        PanelMostrar2Layout.setHorizontalGroup(
            PanelMostrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelMostrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelMostrar2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelMostrar2Layout.setVerticalGroup(
            PanelMostrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMostrar2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(PanelMostrar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelMostrar2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        getContentPane().add(PanelMostrar2, gridBagConstraints);

        setBounds(0, 0, 848, 625);
    }// </editor-fold>//GEN-END:initComponents
    void Limitadores(){
        LimitadorNum(txtIngreso,20);
        LimitadorNum(txtCostoC,20);
        LimitadorNum(txtPerdidaC,20);
        LimitadorNum(txtRentaExtranjera,20);
    }
    Date calendario=new Date();
    void LimitadorNum(JTextField objeto,int limite) //limita los caracteres y su tamañao de los txt
    {
        RestrictedTextField obj = new RestrictedTextField (objeto); //elemento al cual voy a limitar
        obj.setLimit(limite);
         obj.setAcceptCharacters(".0123456789");//limita los caracteres a numeros y el punto para el ingreso de datos decimales
        obj.setOnlyCustomCharacters(true);
    }
    
    void ValoresIniciales()
    {
        PanelMostrar2.setVisible(false);
        PanelReseccion2.setVisible(true);
        btnGuardar.setVisible(false);
        //calendario;
        dataEmision.setDate(calendario);
        lbNombre.setText(Registro.unregistro.getUsuario().getNombre());
        lbEdad.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
        lbDni.setText(Registro.unregistro.getUsuario().getDNI());
    }
    void Mostrarvalores()
    {
       lbNombre1.setText(Registro.unregistro.getUsuario().getNombre());
       lbEdad1.setText(String.valueOf(Registro.unregistro.getUsuario().getEdad()));
       lbDni1.setText(Registro.unregistro.getUsuario().getDNI());
       dataEmision1.setDate(calendario);
    }
    
    
    double obtenerIngreso()
    {
        return Double.valueOf(txtIngreso.getText());
    }
    
    double obtenerCosto()
    {
        return Double.valueOf(txtCostoC.getText());
    }
    double obtenerPerdida()
    {
        return Double.valueOf(txtPerdidaC.getText());
    }
    double obtenerRenta()
    {
        return Double.valueOf(txtRentaExtranjera.getText());
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
    String Validar(){
        if(txtIngreso.getText().equals("")){
            return "Ingreso(Vacio)";
        }else if(obtenerIngreso()<10000){
            return "Ingreso(Debe ser 10000 o más)";
        }else if(txtCostoC.getText().equals("")){
            return "Costo Computable(Vacio)";
        }else if(txtPerdidaC.getText().equals("")){
            return "Pérdida de Capital(Vacio)";
        }else if(txtRentaExtranjera.getText().equals("")){
            return "Renta Neta Extranjera (Vacio)";
        }else{
            return "";
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(Validar().equals("")){
            SegundaCategoria unacategoria = new SegundaCategoria(obtenerIngreso(),obtenerCosto(),obtenerPerdida(),obtenerRenta());
            lbReten.setText(String.valueOf(unacategoria.getImpuestoAnual()));
            btnGuardar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(Validar().equals("")){
            SegundaCategoria categoria2 = new SegundaCategoria(obtenerIngreso(), obtenerCosto(), obtenerPerdida(), obtenerRenta());
            if(categoria2.getImpuestoAnual()==Double.parseDouble(lbReten.getText())){
                Mostrarvalores();
                Usuario unUsuario = new Usuario(Registro.unregistro.getUsuario().getNombre(), Registro.unregistro.getUsuario().getDNI());
                Fecha unaFechaEmi = new Fecha(ObtenerDia(), ObtenerMes(), ObtenerAnio());
                Tributo x = new Tributo(unUsuario, unaFechaEmi);
                x.setContribuyente(unUsuario);
                x.setFechaEmision(unaFechaEmi);
                x.setCategoria2(categoria2);
                a.adicionar(x);
                a.grabar();

                lbIngresoN.setText(String.valueOf(x.getCategoria2().getIngresoNeto()));
                lbCostoC.setText(String.valueOf(x.getCategoria2().getCostoComputable()));
                lbPerdidaC.setText(String.valueOf(x.getCategoria2().getPerdida()));
                lbRentaExtranjera.setText(String.valueOf(x.getCategoria2().getRentaNetaExtranjera()));
                lbRentaB.setText(String.valueOf(x.getCategoria2().getRentaBruta()));
                lbRentaN.setText(String.valueOf(x.getCategoria2().getRentaNeta()));
                lbRentaNI.setText(String.valueOf(x.getCategoria2().getRentaNetaImponible()));
                lbImpuesto.setText(String.valueOf(x.getCategoria2().getImpuestoAnual()));

                PanelMostrar2.setVisible(true);
                PanelReseccion2.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"Ha modificado los valores ingresados");
            }
        }else{
            JOptionPane.showMessageDialog(null,"El error esta en "+Validar());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrar2;
    private javax.swing.JPanel PanelR;
    private javax.swing.JScrollPane PanelReseccion2;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dataEmision;
    private com.toedter.calendar.JDateChooser dataEmision1;
    private javax.swing.ButtonGroup gbtnVenta;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbCostoC;
    private javax.swing.JLabel lbDni;
    private javax.swing.JLabel lbDni1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbEdad1;
    private javax.swing.JLabel lbImpuesto;
    private javax.swing.JLabel lbIngresoN;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JLabel lbPerdidaC;
    private javax.swing.JLabel lbRentaB;
    private javax.swing.JLabel lbRentaExtranjera;
    private javax.swing.JLabel lbRentaN;
    private javax.swing.JLabel lbRentaNI;
    private javax.swing.JLabel lbReten;
    private javax.swing.JTextField txtCostoC;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtPerdidaC;
    private javax.swing.JTextField txtRentaExtranjera;
    // End of variables declaration//GEN-END:variables
}
